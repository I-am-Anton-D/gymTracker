package ru.dmitrochenko.tracker.model

import ru.dmitrochenko.tracker.model.abstact.FiniteTimeline
import ru.dmitrochenko.tracker.model.abstact.Ordered
import java.time.LocalDateTime

class Approach : FiniteTimeline, Ordered {
    override var startTime: LocalDateTime = LocalDateTime.MIN
    override var finishTime: LocalDateTime = LocalDateTime.MAX

    override var order = Int.MAX_VALUE

    val id: Int? = null
    var weight: Double = 0.0
    var repeats: Int = 0
}