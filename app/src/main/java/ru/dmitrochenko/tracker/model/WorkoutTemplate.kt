package ru.dmitrochenko.tracker.model

import ru.dmitrochenko.tracker.model.abstact.NamedObject

class WorkoutTemplate(val exercises: List<WorkoutExercise> ): NamedObject()

