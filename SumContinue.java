// 개념있는 JAVA
// Chapter 4(Section 05)
// 입력한 정수의 덧셈(음수는 계산하지 않는다)

import java.util.Scanner;

class SumContinue {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수의 덧셈을 계산합니다.");
        System.out.print("덧셈할 개수는? : ");
        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("정수 : ");
            int t = stdIn.nextInt();
            if (t < 0) {
                System.out.println("음수는 계산하지 않습니다.");
                continue;
            }
            sum += t;
        }
        System.out.print("합계는 " + sum + "입니다.");
    }
}
