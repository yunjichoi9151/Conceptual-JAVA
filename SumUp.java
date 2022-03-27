// 개념있는 JAVA
// Chapter 4(Section 02)
// 1부터 n까지의 합을 계산하기

import java.util.Scanner;

class SumUp {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 계산합니다. ");
        int n;
        do {
            System.out.print("n의 값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
