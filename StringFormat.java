// 개념있는 JAVA
// Chapter 15(Section 02)
// String.format 메소드를 이용한 문자열 작성

import java.util.Scanner;

class StringFormat1 {

    public static void main(String[] args) {
        String s1 = String.format("%5d",   123);
        String s2 = String.format("%9.3f", 123.45);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}