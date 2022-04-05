// 개념있는 JAVA
// Chapter 9(Section 01)
// 날짜 클래스 Day [제3판]

public class Day_3 {
    private int year = 1;
    private int month = 1;
    private int date = 1;

    public Day_3( )                              { }
    public Day_3(int year)                       { this.year = year; }
    public Day_3(int year, int month)            { this(year); this.month = month; }
    public Day_3(int year, int month, int date)  { this(year, month); this.date = date; }
    public Day_3(Day_3 d3)                       { this(d3.year, d3.month, d3.date); }

    public int getYear_3()  { return year; }
    public int getMonth_3() { return month; }
    public int getDate_3()  { return date; }

    public void setYear_3(int year)   { this.year  = year; }
    public void setMonth_3(int month) { this.month = month; }
    public void setDate_3(int date)   { this.date  = date; }

    public void set_3(int year, int month, int date) {
        this.year  = year;
        this.month = month;
        this.date  = date;
    }

    public int dayOfWeek_3() {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    public boolean equalTo(Day_3 d3) {
        return year == d3.year && month == d3.month && date == d3.date;
    }

    public String toString() {
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek_3()]);
    }

}