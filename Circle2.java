// 개념있는 JAVA
// Chapter 2(Section 02)
// 원주의 길이와 면적을 계산(원주율을 final 변수로 표시)

import java.util.Scanner;

class Circle2 {
    
    public static void main(String[] args) {
        final double PI = 3.1416;
        Scanner stdIn = new Scanner(System.in);

        System.out.print("반지름 : ");
        double r = stdIn.nextDouble();

        System.out.println("원주의 길이는 " + 2 * PI * r + "입니다.");
        System.out.println("면적은 " + PI * r * r + "입니다.");
    }
}
