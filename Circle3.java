// 개념있는 JAVA
// Chapter 11(Section 01)
// 원의 면적을 계산하기(System.in과 System.out을 static import)

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.System.in;
import static java.lang.System.out;

class Circle3 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        out.println("원의 면적을 계산합니다.");
        out.print("반지름 : ");
        double r = stdIn.nextDouble();
        out.println("면적은 " + (PI * r * r) + "입니다.");
    }
}
