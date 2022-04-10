// 개념있는 JAVA
// Chapter 15(Section 02)
// 문자열 비교

import java.util.Scanner;

class CompareString {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열 s1 : ");  String s1 = stdIn.next();
        System.out.print("문자열 s2 : ");  String s2 = stdIn.next();

        if (s1 == s2)
            System.out.println("s1 == s2 입니다.");
        else
            System.out.println("s1 != s2 입니다.");

        if (s1.equals(s2))
            System.out.println("s1과 s2의 내용은 같다.");
        else
            System.out.println("s1과 s2의 내용은 다르다.");
    }
}