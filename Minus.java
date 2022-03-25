// 개념있는 JAVA
// Chapter 2(Section 02)
// 정숫값을 입력하면 부호를 반전시킨 값을 표시

import java.util.Scanner;

class Minus {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int a = stdIn.nextInt();      // a에 정숫값을 입력

        int b = -a;                   // a의 부호를 반전시킨 값으로 b를 초기화
        System.out.println(a + "의 기호를 반전시킨 값은 " + b + "입니다.");
    }
}
