// 개념있는 JAVA
// Chapter 9(Section 01)
// 날짜 클래스 Day [제2판] 이용 예

import java.util.Scanner;

class DayTester_2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("day1을 입력하시오.");
        System.out.print("년 : ");  int y = stdIn.nextInt();
        System.out.print("월 : ");  int m = stdIn.nextInt();
        System.out.print("일 : ");  int d = stdIn.nextInt();

        Day_2 day1 = new Day_2(y, m, d);
        System.out.println("day1 = " + day1);

        Day_2 day2 = new Day_2(day1);
        System.out.println("day2를 day1과 같은 날짜로 만들었습니다.");
        System.out.println("day2 = " + day2);

        if (day1.equalTo(day2))
            System.out.println("day1과 day2는 같습니다.");
        else
            System.out.println("day1과 day2는 다릅니다.");

        Day_2 d1 = new Day_2();
        Day_2 d2 = new Day_2(2010);
        Day_2 d3 = new Day_2(2010, 10);
        Day_2 d4 = new Day_2(2010, 10, 15);

        System.out.println("d1  = " + d1);
        System.out.println("d2  = " + d2);
        System.out.println("d3  = " + d3);
        System.out.println("d4  = " + d4);

        Day_2[] a = new Day_2[3];
        for (int i = 0; i < a.length; i++)
            a[i] = new Day_2();
        
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}