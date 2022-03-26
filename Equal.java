// 개념있는 JAVA
// Chapter 3(Section 01)
// 입력한 두 정숫값은 같은가?

import java.util.Scanner;

class Equal {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a : ");  int a = stdIn.nextInt();
        System.out.print("정수 b : ");  int b = stdIn.nextInt();

        if (a == b)
            System.out.println("두 값은 같습니다.");
        else
            System.out.println("두 값은 다릅니다.");
    }
}
