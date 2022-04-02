// 개념있는 JAVA
// Chapter 7(Section 03)
// 모든 요소가 인덱스와 같은 값을 갖는 배열의 생성

import java.util.Scanner;

class GenIdxArray {
    
    static int[] idxArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = i;
        return a;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("요수 수는 : ");
        int n = stdIn.nextInt();
        int[] x = idxArray(n);

        for (int i = 0; i < n; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}