// 개념있는 JAVA
// Chapter 11(Section 01)
// 원의 면적을 계산하기(원주율 Math.PI를 정적 import)

import java.util.Scanner;
import static java.lang.Math.PI;

class Circle2_2 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("원의 면적을 계산합니다.");
        System.out.print("반지름 : ");
        double r = stdIn.nextDouble();
        System.out.println("면적은 " + (PI * r * r) + "입니다.");
    }
}
