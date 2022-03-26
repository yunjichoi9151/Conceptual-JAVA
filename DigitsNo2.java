// 개념있는 JAVA
// Chapter 3(Section 01)
// 입력한 정숫값의 자릿수(2자릿수 이상인지 아닌지)를 판단

import java.util.Scanner;

class DigitsNo2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        if (n <= -10 || n >= 10)
            System.out.println("2자릿수 이상입니다.");
        else
            System.out.println("2자릿수 미만입니다.");
    }
}
