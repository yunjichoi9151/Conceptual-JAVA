// 개념있는 JAVA
// Chapter 3(Section 01)
// 입력한 정숫값의 자릿수(0, 1자릿수, 2자릿수 이상)를 판단

import java.util.Scanner;

class DigitsNo1 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        if (n == 0)
            System.out.println("0입니다.");
        else if (n >= -9 && n <= 9)
            System.out.println("1자릿수입니다.");
        else
            System.out.println("2자릿수 이상입니다.");
    }
}
