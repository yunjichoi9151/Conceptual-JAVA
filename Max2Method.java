// 개념있는 JAVA
// Chapter 7(Section 01)
// 두 정숫값의 최댓값을 구하기(메소드 이용)

import java.util.Scanner;

class Max2Method {

    static int max2(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a : ");  int a = stdIn.nextInt();
        System.out.print("정수 b : ");  int b = stdIn.nextInt();

        System.out.println("최댓값은 " + max2(a, b) + "입니다.");
    }
}