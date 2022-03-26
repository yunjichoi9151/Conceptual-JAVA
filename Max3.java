// 개념있는 JAVA
// Chapter 3(Section 01)
// 세 정숫값의 최댓값을 구하기

import java.util.Scanner;

class Max3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a : ");  int a = stdIn.nextInt();
        System.out.print("정수 b : ");  int b = stdIn.nextInt();
        System.out.print("정수 c : ");  int c = stdIn.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
