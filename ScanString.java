// 개념있는 JAVA
// Chapter 15(Section 02)
// 문자열을 1문자씩 스캔해서 표시

import java.util.Scanner;

class ScanString {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열 s : ");
        String s = stdIn.next();

        for (int i = 0; i < s.length(); i++)
            System.out.println("s[" + i + "] = " + s.charAt(i));
    }
}