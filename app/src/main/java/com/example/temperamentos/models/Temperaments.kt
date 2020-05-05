package com.example.temperamentos.models

class Temperaments(q: Questions) {
    var question = q

    var sanguine = setOf(1, 4, 5)
    var choleric = setOf(1, 2)
    var phlegmatic = setOf(3, 5)
    var melancholic = setOf(2, 3)

    fun isSanguine(): Boolean {
        if (sanguine.contains(question.id))return true
        return false
    }
    fun isMelancholic(): Boolean {
        if (melancholic.contains(question.id))return true
        return false
    }
    fun isPhlegmatic(): Boolean {
        if (phlegmatic.contains(question.id))return true
        return false
    }
    fun isCholeric(): Boolean {
        if (choleric.contains(question.id))return true
        return false
    }
}