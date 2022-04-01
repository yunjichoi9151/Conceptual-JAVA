// 개념있는 JAVA
// Chapter 7(Section 02)
// int형 정수의 비트단위의 논리곱, 논리합, 배타적 논리합, 보수를 표시

import java.util.Scanner;

class BitwiseOperation {
    
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수를 입력해 주십시오.");
        System.out.print("a : ");  int a = stdIn.nextInt();
        System.out.print("b : ");  int b = stdIn.nextInt();

        System.out.print(  "a     = ");  printBits(a);
        System.out.print("\nb     = ");  printBits(b);
        System.out.print("\na & b = ");  printBits(a & b);
        System.out.print("\na | b = ");  printBits(a | b);
        System.out.print("\na ^ b = ");  printBits(a ^ b);
        System.out.print("\n~a    = ");  printBits(~a);
        System.out.print("\n~b    = ");  printBits(~b);
    }
}
