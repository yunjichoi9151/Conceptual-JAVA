// 개념있는 JAVA
// Chapter 3(Section 01)
// 두 정숫값을 입력하면 값이 작은 쪽을 표시(예1:if문)

import java.util.Scanner;

class Min2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a : ");  int a = stdIn.nextInt();
        System.out.print("정수 b : ");  int b = stdIn.nextInt();

        int min;
        if (a < b)
            min = a;
        else
            min = b;

        System.out.println("값이 작은 쪽은 " + min + "입니다.");
    }
}
