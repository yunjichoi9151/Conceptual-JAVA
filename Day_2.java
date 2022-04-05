// 개념있는 JAVA
// Chapter 9(Section 01)
// 날짜 클래스 Day [제2판]

public class Day_2 {
    private int year;
    private int month;
    private int date;

    public Day_2( )                              { set_2(1, 1, 1); }
    public Day_2(int year)                       { set_2(year, 1, 1); }
    public Day_2(int year, int month)            { set_2(year, month, 1); }
    public Day_2(int year, int month, int date)  { set_2(year, month, date); }
    public Day_2(Day_2 d2)                       { set_2(d2.year, d2.month, d2.date); }

    public int getYear_2()  { return year; }
    public int getMonth_2() { return month; }
    public int getDate_2()  { return date; }

    public void setYear_2(int year)   { this.year  = year; }
    public void setMonth_2(int month) { this.month = month; }
    public void setDate_2(int date)   { this.date  = date; }

    public void set_2(int year, int month, int date) {
        this.year  = year;
        this.month = month;
        this.date  = date;
    }

    public int dayOfWeek_2() {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    public boolean equalTo(Day_2 d2) {
        return year == d2.year && month == d2.month && date == d2.date;
    }

    public String toString() {
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek_2()]);
    }

}