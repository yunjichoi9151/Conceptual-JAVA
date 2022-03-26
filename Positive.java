// 개념있는 JAVA
// Chapter 3(Section 01)
// 입력한 정숫값은 양수인가?

import java.util.Scanner;

class Positive {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("이 값은 양수입니다.");
    }
}
