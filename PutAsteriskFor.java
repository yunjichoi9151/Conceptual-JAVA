// 개념있는 JAVA
// Chapter 4(Section 03)
// 입력한 개수만큼 *를 표시

import java.util.Scanner;

class PutAsteriskFor {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("몇 개의 *를 표시합니까? : ");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print('*');
        System.out.println();
    }
}
