package ru.dmitrochenko.tracker.model

import ru.dmitrochenko.tracker.model.abstact.NamedObject
import ru.dmitrochenko.tracker.model.abstact.FiniteTimeline
import java.time.LocalDateTime

class Workout(private val workoutTemplate: WorkoutTemplate) : NamedObject(), FiniteTimeline {
    override var startTime: LocalDateTime = LocalDateTime.MIN
    override var finishTime: LocalDateTime = LocalDateTime.MAX
    private val exercises = ArrayList<WorkoutExercise>()

    private var currentExercise: WorkoutExercise

    init {
        this.exercises.addAll(workoutTemplate.exercises)
        this.currentExercise = exercises.first()
    }

    fun startWorkout() {
        if (exercises.isEmpty() && isStarted()) return
        start()
    }

    fun startCurrentExercise() {
        currentExercise.start()
    }

    fun finishCurrentExercise() {
        currentExercise.finish()
        currentExercise = getNextExercise()
    }

    private fun getNextExercise(): WorkoutExercise {
        val indexOf = currentExercise.order
        if (indexOf < exercises.size - 2) {
            return exercises[indexOf + 1]
        }
        return currentExercise
    }

    fun finishWorkOut() {
        if (isStarted()) {
            finish()
        } else {
            return
        }
    }
}