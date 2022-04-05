// 개념있는 JAVA
// Chapter 9(Section 01)
// 오늘의 날짜를 표시

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

class Today {
    
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n", today.get(YEAR),
                                                                  today.get(MONTH) + 1,
                                                                  today.get(DATE));
    }
}