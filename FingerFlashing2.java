// 개념있는 JAVA
// Chapter 3(Section 02)
// 입력된 값에 따라서 가위바위보의 손을 표시(예1: if문)

import java.util.Scanner;

class FingerFlashing2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("손을 선택하시오 (0 - 가위 / 1 - 바위 / 2 - 보) : ");
        int hand = stdIn.nextInt();
        
        switch (hand) {
            case 0: System.out.println("가위"); break;
            case 1: System.out.println("바위"); break;
            case 2: System.out.println("보"); break;
        }
    }
}