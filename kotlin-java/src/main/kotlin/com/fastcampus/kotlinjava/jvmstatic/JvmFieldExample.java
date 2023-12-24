package com.fastcampus.kotlinjava.jvmstatic;

public class JvmFieldExample {

    public static void main(String[] args) {

//        JvmFieldClass.Companion.getId();
        int id = JvmFieldClass.id; // @JvmField annotation

//        JvmFieldObject.INSTANCE.getName();
        String name = JvmFieldObject.name; // @JvmField annotation

        int code = JvmFieldClass.CODE; // const 상수는 바로 접근 가능
        String familyName = JvmFieldObject.FAMILY_NAME;
    }
}
