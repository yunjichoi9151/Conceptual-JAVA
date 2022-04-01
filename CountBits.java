// 개념있는 JAVA
// Chapter 7(Section 02)
// int형 정수 내의 1인 비트 수를 카운트

import java.util.Scanner;

class CountBits {
    
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }

    static int countBits(int x) {
        int bits = 0;
        while (x != 0) {
            if ((x & 1) == 1) bits++;
            x >>>= 1;
        }
        return bits;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 : ");
        int x = stdIn.nextInt();

        System.out.print("비트 구성 = ");
        printBits(x);
        System.out.println("\n1인 비트 수 = " + countBits(x));
    }
}
