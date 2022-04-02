// 개념있는 JAVA
// Chapter 7(Section 04)
// 두 값의 최댓값과 세 값의 최댓값을 구하는 메소드(다중정의)

import java.util.Scanner;

class Max {

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("x의 값 : ");  int x = stdIn.nextInt();
        System.out.print("y의 값 : ");  int y = stdIn.nextInt();
        System.out.print("z의 값 : ");  int z = stdIn.nextInt();

        System.out.println("x, y의 최댓값은 " + max(x, y) + "입니다.");

        System.out.println("x, y, z의 최댓값은 " + max(x, y, z) + "입니다.");
    }
}
