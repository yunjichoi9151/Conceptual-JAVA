// 개념있는 JAVA
// Chapter 3(Section 01)
// 입력한 정숫값이 양수이면 홀수인지 짝수인지를 판정해서 표시

import java.util.Scanner;

class EvenOdd {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        if (n > 0)
            if (n % 2 == 0)
                System.out.println("이 값은 짝수입니다.");
            else
                System.out.println("이 값은 홀수입니다.");
        else
            System.out.println("양수가 아닌 값을 입력했습니다.");
    }
}
