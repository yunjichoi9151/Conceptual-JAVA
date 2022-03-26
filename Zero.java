// 개념있는 JAVA
// Chapter 3(Section 01)
// 입력한 정숫값은 0인가 아닌가?

import java.util.Scanner;

class Zero {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        if (!(n != 0))
            System.out.println("이 값은 0입니다.");
        else
            System.out.println("이 값은 0이 아닙니다.");
    }
}
