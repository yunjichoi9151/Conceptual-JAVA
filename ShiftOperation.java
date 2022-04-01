// 개념있는 JAVA
// Chapter 7(Section 02)
// int형의 값을 좌우로 시프트한 값을 표시

import java.util.Scanner;

class ShiftOperation {
    
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 : ");               int x = stdIn.nextInt();
        System.out.print("시프트 할 비트 수 : ");  int n = stdIn.nextInt();

        System.out.print(  "정수    = ");  printBits(x);
        System.out.print("\nx <<  n = ");  printBits(x << n);
        System.out.print("\nx >>  n = ");  printBits(x >> n);
        System.out.print("\nx >>> n = ");  printBits(x >>> n);
    }
}
