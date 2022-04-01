// 개념있는 JAVA
// Chapter 7(Section 01)
// 세 정숫값의 최댓값을 구하기(메소드 이용)

import java.util.Scanner;

class Max3Method {

    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a : ");  int a = stdIn.nextInt();
        System.out.print("정수 b : ");  int b = stdIn.nextInt();
        System.out.print("정수 c : ");  int c = stdIn.nextInt();

        System.out.println("최댓값은 " + max(a, b, c) + "입니다.");
    }
}