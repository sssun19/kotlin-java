package com.fastcampus.kotlinjava.gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {

    public static void main(String[] args) {
        Student student = new Student();
//        student.setName("스티브");
        student.name = "steve"; //@JvmField annotation 사용했을 경우
        student.setBirthDate(LocalDate.of(1918, 7, 4));

//        System.out.println(student.getName());
        System.out.println(student.name);
        System.out.println(student.getBirthDate());

        //student.setAge();
        System.out.println(student.getAge());

        //student.setGrade();
//        System.out.println(student.getGrade());
        student.changeGrade("A");
        System.out.println(student.getGrade());

    }
}
