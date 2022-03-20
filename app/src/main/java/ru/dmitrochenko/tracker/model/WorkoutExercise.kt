package ru.dmitrochenko.tracker.model

import ru.dmitrochenko.tracker.model.abstact.*
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList

class WorkoutExercise(private val exercise: Exercise) : NamedObject(), FiniteTimeline, Ordered {
    override var startTime: LocalDateTime = LocalDateTime.MIN
    override var finishTime: LocalDateTime = LocalDateTime.MAX
    override var order: Int = 0

    private val approaches = ArrayList<Approach>()

    fun appendApproach(approach: Approach) {
        approaches.add(approach)
    }

    fun removeApproach(approach: Approach) {
        approaches.remove(approach)
    }

}