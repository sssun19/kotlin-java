package com.fastcampus.kotlinjava.gettersetter

import java.time.LocalDate

class Student {

    @JvmField
    var name: String? = null

    var birthDate: LocalDate? = null
    val age: Int = 10

    var grade: String? = null
        private set //외부에서 setter 생성 불가

    fun changeGrade(grade: String) {
        this.grade = grade
    }
}