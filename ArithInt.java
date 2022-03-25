// 개념있는 JAVA
// Chapter 2(Section 02)
// 두 정숫값을 입력하면 사칙연산을 실행한 후 결과를 표시

import java.util.Scanner;

class ArithInt {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("x와 y의 사칙연산을 합니다.");

        System.out.print("x의 값 : ");
        int x = stdIn.nextInt();

        System.out.print("y의 값 : ");
        int y = stdIn.nextInt();
        
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }    
}
