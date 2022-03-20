package ru.dmitrochenko.tracker.model

import ru.dmitrochenko.tracker.model.abstact.NamedObject

class Exercise(): NamedObject() {
    val defaultApproachList: List<Approach>? = null
    val group: String = ""
}

