// 개념있는 JAVA
// Chapter 3(Section 01)
// 두 값을 오름차순으로 정렬

import java.util.Scanner;

class Sort2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("변수 a : ");
        int a = stdIn.nextInt();
        
        System.out.print("정수 b : ");
        int b = stdIn.nextInt();
        
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("ab가 되도록 정렬 했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
    }
}