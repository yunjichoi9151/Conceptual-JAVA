// 개념있는 JAVA
// Chapter 10(Section 01)
// 원둘레의 길이와 원의 면적을 계산하기(원주율 Math.PI를 이용)

import java.util.Scanner;

class Circle {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("반지름 : ");
        double r = stdIn.nextDouble();

        System.out.println("원둘레의 길이는 " + 2 * Math.PI * r + "입니다.");
        System.out.println("면적은 " + Math.PI * r * r + "입니다.");
    }
}
