// 개념있는 JAVA
// Chapter 16(Section 01)
// 배열의 요소에 값을 입력하고 순서를 반전한다 (버그 포함 : reverse에서 예외 포착)

import java.util.Scanner;

class ReverseArray3 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        try {
            for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(1);
        }
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