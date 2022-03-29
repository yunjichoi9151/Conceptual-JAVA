// 개념있는 JAVA
// Chapter 4(Section 06)
// 정숫값과 실숫값을 입력해서 표시

import java.util.Scanner;

class DecimalFloat {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x : ");
        int x = stdIn.nextInt();

        System.out.print("실수 y : ");
        double y = stdIn.nextDouble();

        System.out.printf("x =%3d  y =%6.2f\n", x, y);
    }
}
