// 개념있는 JAVA
// Chapter 16(Section 01)
// --- 배열 요소 a[idx1]와 a[idx2]를 교환 (예외를 포착해서 강제종료) ---//

import java.util.Scanner;

class ReverseArray2 {

    static void swap(int[] a, int idx1, int idx2) {
        try {
            int t = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = t;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("메소드 swap에서 잘못된 첨자가 발견됐습니다");
            System.out.println("프로그램을 종료합니다.");
            System.exit(1);
        }
    }
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i);
    }
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("요수 수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("요소의 순서를 반전했습니다.");
        for (int i = 0; i < num; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}