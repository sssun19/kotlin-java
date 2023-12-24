package com.fastcampus.kotlinjava.jvmstatic;

public class JvmStaticExample {

    public static void main(String[] args) {

        String hello = HelloClass.Companion.hello();
        String hello2 = HelloClass.hello(); //JvmStatic annotation

        String hi = HiObject.INSTANCE.hi();
        String hi2 = HiObject.hi(); //JvmStatic annotation
    }
}
