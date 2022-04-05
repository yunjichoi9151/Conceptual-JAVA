// 개념있는 JAVA
// Chapter 9(Section 01)
// 날짜 클래스 Day [제1판] 이용 예(예2 : 클래스형 변수의 대입)

import java.util.Scanner;

class DayAssign {

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
        
        Day xDay = birthday;

        xDay.set(2100, 12, 31);

        System.out.println("birthday = " + birthday.getYear()  + "년 "
                                         + birthday.getMonth() + "월 "
                                         + birthday.getDate()  + "일 ("
                                         + wd[birthday.dayOfWeek()] + ") ");

        System.out.println("xDay     = " + xDay.getYear()  + "년 "
                                         + xDay.getMonth() + "월 "
                                         + xDay.getDate()  + "일 ("
                                         + wd[xDay.dayOfWeek()] + ") ");
    }
}