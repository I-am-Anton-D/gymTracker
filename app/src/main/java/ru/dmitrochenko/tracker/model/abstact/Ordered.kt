package ru.dmitrochenko.tracker.model.abstact

interface Ordered : Comparable<Ordered> {
    var order: Int

    override fun compareTo(other: Ordered): Int {
        return this.order.compareTo(other.order)
    }
}