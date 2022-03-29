// 개념있는 JAVA
// Chapter 4(Section 03)
// 입력한 개수만큼 *를 표시

import java.util.Scanner;

class OddNo {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        for (int i = 1; i < n; i += 2)
            System.out.println(i);
    }
}
