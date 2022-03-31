// 개념있는 JAVA
// Chapter 5(Section 02)
// 두 정숫값의 평균값을 실수로 계산하기(합계를 2.0으로 나누기)

import java.util.Scanner;

class Average2 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값 x와 y의 평균값을 계산합니다.");
        System.out.print("x의 값 : "); int x = stdIn.nextInt();
        System.out.print("y의 값 : "); int y = stdIn.nextInt();

        double ave = (x + y) / 2.0;
        System.out.println("x와 y의 평균값은 " + ave + "입니다.");
    }
}