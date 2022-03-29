// 개념있는 JAVA
// Chapter 4(Section 05)
// 입력한 정수의 덧셈(합계가 1,000을 넘지 않는 범위에서 덧셈하기)

import java.util.Scanner;

class SumBreak2 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수의 덧셈을 계산합니다.");
        System.out.print("덧셈할 개수는? : ");
        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("정수 : ");
            int t = stdIn.nextInt();
            if (sum + t > 1000) {
                System.out.println("합계가 1,000을 넘었습니다.");
                System.out.println("마지막 수치는 무시합니다.");
                break;
            }
            sum += t;
        }
        System.out.print("합계는 " + sum + "입니다.");
    }
}
