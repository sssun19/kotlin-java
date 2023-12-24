package com.fastcampus.kotlinjava.exception;

import java.io.IOException;

public class JavaThrow {

    public void throwIOException() throws IOException {
        throw new IOException("체크드 익셉션인 IOException 발생");
    }

    public static void main(String[] args) {

//        JavaThrow javaThrow = new JavaThrow();
//
//        try {
//            javaThrow.throwIOException();
//        } catch(IOException e) {
//            e.printStackTrace();
//        }

        KotlinThrow kotlinThrow = new KotlinThrow();
        try {
            kotlinThrow.throwIOException(); // Kotlin->Java 에서도 컴파일 오류 발생하지 x (예외처리 강제 x)
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
