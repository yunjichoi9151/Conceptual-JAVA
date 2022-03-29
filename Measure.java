// 개념있는 JAVA
// Chapter 4(Section 03)
// 입력한 정숫값의 모든 약수를 표시

import java.util.Scanner;

class Measure {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.println(i);
    }
}
