// 개념있는 JAVA
// Chapter 4(Section 04)
// 좌하변이 직각인 직각삼각형을 표시

import java.util.Scanner;

class IsoscelesTriangle {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("좌하변이 직각인 삼각형을 표시합니다.");
        System.out.print("몇 단 : ");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
