package ru.dmitrochenko.tracker.model.abstact

import java.time.LocalDateTime

class Period : FiniteTimeline {
    override var startTime: LocalDateTime = LocalDateTime.MIN
    override var finishTime: LocalDateTime =  LocalDateTime.MAX
}