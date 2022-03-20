package ru.dmitrochenko.tracker.model.abstact

import java.time.LocalDateTime

interface FiniteTimeline {
    var startTime: LocalDateTime
    var finishTime: LocalDateTime

    fun isStarted() = startTime != LocalDateTime.MIN
    fun isFinished() = finishTime != LocalDateTime.MAX
    fun start() {
        startTime = LocalDateTime.now()
    }
    fun finish() {
        finishTime = LocalDateTime.now()
    }
}