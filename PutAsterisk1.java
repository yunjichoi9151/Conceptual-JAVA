// 개념있는 JAVA
// Chapter 4(Section 02)
// 입력한 개수만큼 *를 표시(예1)

import java.util.Scanner;

class PutAsterisk1 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("몇 개의 *를 표시합니까? : ");
        int n = stdIn.nextInt();

        int i = 0;
        while (i < n) {
            System.out.print('*');
            i++;
        }
        System.out.println();
    }
}
