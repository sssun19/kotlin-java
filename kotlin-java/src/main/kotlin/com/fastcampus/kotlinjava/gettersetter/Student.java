package com.fastcampus.kotlinjava.gettersetter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {

    public String name;
    public LocalDate birthDate;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
