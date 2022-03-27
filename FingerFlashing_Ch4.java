// 개념있는 JAVA
// Chapter 4(Section 01)
// 입력한 값에 따라서 가위바위보의 손을 표시(0, 1, 2 만 입력할 수 있다)

import java.util.Scanner;

class FingerFlashing_Ch4 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int hand;

        do {
            System.out.print("손을 선택하시오 (0 ··· 가위 / 1 ··· 바위 / 2 ··· 보) : ");
            hand = stdIn.nextInt();
        } while (hand < 0 || hand > 2);    

        switch (hand) {
            case 0: System.out.println("가위");  break;
            case 1: System.out.println("바위");  break;
            case 2: System.out.println("보");    break;
        }
    }
}