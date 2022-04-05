// 개념있는 JAVA
// Chapter 10(Section 02)
// 날짜 클래스 Day [제4판]

public class Day_4 {
    private int year = 1;
    private int month = 1;
    private int date = 1;

    public static boolean isLeap(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    public Day_4( )                              { }
    public Day_4(int year)                       { this.year = year; }
    public Day_4(int year, int month)            { this(year); this.month = month; }
    public Day_4(int year, int month, int date)  { this(year, month); this.date = date; }
    public Day_4(Day_4 d4)                       { this(d4.year, d4.month, d4.date); }

    public int getYear_4()  { return year; }
    public int getMonth_4() { return month; }
    public int getDate_4()  { return date; }

    public void setYear_4(int year)   { this.year  = year; }
    public void setMonth_4(int month) { this.month = month; }
    public void setDate_4(int date)   { this.date  = date; }

    public void set_4(int year, int month, int date) {
        this.year  = year;
        this.month = month;
        this.date  = date;
    }

    public boolean isLeap() { return isLeap(year); }

    public int dayOfWeek_4() {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    public boolean equalTo(Day_4 d4) {
        return year == d4.year && month == d4.month && date == d4.date;
    }

    public String toString() {
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek_4()]);
    }

}