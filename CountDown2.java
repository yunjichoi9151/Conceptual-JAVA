// 개념있는 JAVA
// Chapter 4(Section 02)
// 양의 정숫값을 0까지 카운트 다운(예1)

import java.util.Scanner;

class CountDown2 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("카운트 다운을 합니다.");
        int x;
        do {
            System.out.print("양의 정숫값 : ");
            x = stdIn.nextInt();
        } while (x <= 0);

        while (x >= 0) {
            System.out.println(x--);
        }
    }
}
