// 개념있는 JAVA
// Chapter 10(Section 01)
// 은행계좌 클래스 [제3판]

public class Account_Ch10 {

    private static int counter = 0;

    private String name;
    private String no;
    private long balance;
    private int id;

    public Account_Ch10(String n, String num, long z) {
        name = n;
        no = num;
        balance = z;
        id = ++counter;
    }
    
    public String getName_Ch10() {
        return name;
    }

    public String getNo_Ch10() {
        return no;
    }

    public long getBalance_Ch10() {
        return balance;
    }

    public int getId_Ch10() {
        return id;
    }

    public void deposit_Ch10(long k) {
        balance += k;
    }

    public void withdraw_Ch10(long k) {
        balance -= k;
    }
}