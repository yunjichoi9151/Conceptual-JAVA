// 개념있는 JAVA
// Chapter 4(Section 05)
// 입력한 정수의 덧셈(0이 입력되면 종료)

import java.util.Scanner;

class SumBreak1 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수의 덧셈을 계산합니다.");
        System.out.print("덧셈할 개수는? : ");
        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("정수 (0이면 종료) : ");
            int t = stdIn.nextInt();
            if (t == 0) break;
            sum += t;
        }
        System.out.println("합계는 " + sum + "입니다.");
    }
}
