package ru.dmitrochenko.tracker.model.abstact

interface PeriodicTimeLine {
    val periods: MutableList<Period>

    fun startPeriod() {
        val period = Period()
        period.start()
        periods.add(period)
    }

    fun finishPeriod() {
        periods.last().finish()
    }

    fun getLastPeriod() = periods.last()

    fun getPeriod(position:Int): Period?  {
        if (periods.isEmpty() || position <0 || position > periods.size - 1) return null
        return periods[position]
    }

    fun hasStartedPeriod() : Boolean {
        return !getLastPeriod().isFinished()
    }
}