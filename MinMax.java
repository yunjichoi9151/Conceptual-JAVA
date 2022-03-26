// 개념있는 JAVA
// Chapter 3(Section 01)
// 두 정숫값의 작은 쪽 값과 큰 쪽 값을 구해서 표시

import java.util.Scanner;

class MinMax {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a : ");  int a = stdIn.nextInt();
        System.out.print("정수 b : ");  int b = stdIn.nextInt();

        int min, max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        System.out.println("값이 작은 쪽은 " + min + "입니다.");
        System.out.println("값이 큰 쪽은 " + max + "입니다.");
    }
}
