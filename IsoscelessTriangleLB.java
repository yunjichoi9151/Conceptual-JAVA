// 개념있는 JAVA
// Chapter 7(Section 01)
// 좌하변이 직각인 직각삼각형을 표시

import java.util.Scanner;

class IsoscelesTriangleLB {
    
    static void putStars(int n) {
        while (n-- > 0)
            System.out.print('*');
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("좌하변이 직각인 삼각형을 표시합니다.");
        System.out.print("몇 단 : ");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            putStars(i);
            System.out.println();
        }
    }
}
