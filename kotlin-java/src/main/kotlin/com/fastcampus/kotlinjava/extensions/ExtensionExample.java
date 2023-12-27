package com.fastcampus.kotlinjava.extensions;

public class ExtensionExample {

    public static void main(String[] args) {

//        "ABCD".first();
//        "ABCD".addFirst('Z');

        char first = MyExtensionsKt.first("ABCD");
        String addFirst = MyExtensionsKt.addFirst("ABCD", 'Z');

        System.out.println(first);
        System.out.println(addFirst);

    }
}
