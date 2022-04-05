// 개념있는 JAVA
// Chapter 9(Section 01)
// 날짜 클래스 Day [제1판]의 배열(예2)

import java.util.Scanner;

class DayArray {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};

        System.out.print("날짜는 몇 개? : ");
        int n = stdIn.nextInt();

        Day[] a = new Day[n];

        for (int i = 0; i < a.length; i++)
            a[i] = new Day(2017, 10, 15);
        
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = "
                                + a[i].getYear()  + "년 "
                                + a[i].getMonth() + "월 "
                                + a[i].getDate()  + "일("
                                + wd[a[i].dayOfWeek()] + ")");
    }
}