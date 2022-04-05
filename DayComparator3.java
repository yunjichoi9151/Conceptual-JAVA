// 개념있는 JAVA
// Chapter 9(Section 01)
// 날짜 클래스 Day [제1판] 이용 예(예5 : 두 날짜를 비교 3)

import java.util.Scanner;

class DayComparator3 {

    static boolean compDay(Day d1, Day d2) {
        return d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getDate() == d2.getDate();
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int y, m, d;
        System.out.println("날짜 1을 입력하시오.");
        System.out.print("년 : ");  y = stdIn.nextInt();
        System.out.print("월 : ");  m = stdIn.nextInt();
        System.out.print("일 : ");  d = stdIn.nextInt();
        Day day1 = new Day(y, m, d);

        System.out.println("날짜 2를 입력하시오.");
        System.out.print("년 : ");  y = stdIn.nextInt();
        System.out.print("월 : ");  m = stdIn.nextInt();
        System.out.print("일 : ");  d = stdIn.nextInt();
        Day day2 = new Day(y, m, d);

        if (compDay(day1, day2))
            System.out.println("같습니다.");
        else
            System.out.println("다릅니다.");
    }
}