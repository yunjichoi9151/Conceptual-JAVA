// 개념있는 JAVA
// Chapter 3(Section 01)
// 입력한 월의 계절을 표시

import java.util.Scanner;

class Season {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("계절을 표시합니다.\n몇 월입니까? : ");
        int month = stdIn.nextInt();

        if (month >= 3 && month <= 5)
            System.out.println("계절은 봄입니다.");
        else if (month >= 6 && month <= 8)
            System.out.println("계절은 여름입니다.");
        else if (month >= 9 && month <= 11)
            System.out.println("계절은 가을입니다.");
        else if (month == 12 || month == 1 || month ==2)
            System.out.println("계절은 겨울입니다.");
    }
}
