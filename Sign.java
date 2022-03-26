// 개념있는 JAVA
// Chapter 3(Section 01)
// 입력한 정숫값의 부호(양/음/0)을 판정해서 표시

import java.util.Scanner;

class Sign {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("이 값은 양수입니다.");
        else if (n < 0)
            System.out.println("이 값은 음수입니다.");
        else
            System.out.println("이 값은 0입니다.");
    }
}
