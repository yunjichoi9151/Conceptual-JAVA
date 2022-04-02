// 개념있는 JAVA
// Chapter 7(Section 03)
// 두 배열이 같은지 다른지를 판정

import java.util.Scanner;

class ArrayEqual {
    
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("배열 a의 요수 수 : ");
        int na = stdIn.nextInt();
        int[] a = new int[na];

        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("배열 b의 요수 수 : ");
        int nb = stdIn.nextInt();
        int[] b = new int[nb];

        for (int i = 0; i < nb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }

        System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "다릅니다."));
    }
}