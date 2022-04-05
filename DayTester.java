// 개념있는 JAVA
// Chapter 9(Section 01)
// 날짜 클래스 Day [제1판] 이용 예(예1 : 날짜를 표시)

import java.util.Scanner;

class DayTester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};

        System.out.println("생일을 양력으로 입력하시오.");
        System.out.print("년 : ");  int y = stdIn.nextInt();
        System.out.print("월 : ");  int m = stdIn.nextInt();
        System.out.print("일 : ");  int d = stdIn.nextInt();

        Day birthday = new Day(y, m, d);

        System.out.println("당신의 생일 " + birthday.getYear()  + "년 "
                                          + birthday.getMonth() + "월 "
                                          + birthday.getDate()  + "일은 "
                                          + wd[birthday.dayOfWeek()] + "요일입니다.");
    }
}