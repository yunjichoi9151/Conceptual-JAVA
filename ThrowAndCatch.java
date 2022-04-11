// 개념있는 JAVA
// Chapter 16(Section 02)
// 예외 처리를 이해하기 위한 예제

import java.util.Scanner;

class ThrowAndCatch {

    static void check(int sw) throws Exception {
        switch (sw) {
            case 1: throw new Exception("검사 예외 발생!!");
            case 2: throw new RuntimeException("비검사 예외 발생!!");
        }
    }

    static void test(int sw) throws Exception {
        check(sw);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("sw : ");
        int sw = stdIn.nextInt();

        try {
            test(sw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}