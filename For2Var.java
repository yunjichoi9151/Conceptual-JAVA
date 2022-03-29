// 개념있는 JAVA
// Chapter 4(Section 03)
// 입력한 정숫값과 1, 2, ... 와의 차를 표시

import java.util.Scanner;

class For2Var {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        for (int i = 1, j = n - 1; i <= n; i++, j--)
            System.out.println(i + " " + j);
    }
}
