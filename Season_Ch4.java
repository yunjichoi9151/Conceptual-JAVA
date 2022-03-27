// 개념있는 JAVA
// Chapter 4(Section 01)
// 입력한 월의 계절을 표시

import java.util.Scanner;

class Season_Ch4 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int retry;
        do {
            System.out.print("계절을 표시합니다.\n몇 월입니까? : ");
            int month = stdIn.nextInt();
    
            if (month >= 3 && month <= 5)
                System.out.println("이것은 봄입니다.");
            else if (month >= 6 && month <= 8)
                System.out.println("이것은 여름입니다.");
            else if (month >= 9 && month <= 11)
                System.out.println("이것은 가을입니다.");
            else if (month == 12 || month == 1 || month ==2)
                System.out.println("이것은 겨울입니다.");
            
            System.out.print("다시 한번? 1 · · · Yes/0 · · · No : ");
            retry = stdIn.nextInt();
        } while (retry == 1);

    }
}
