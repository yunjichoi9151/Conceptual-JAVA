// 개념있는 JAVA
// Chapter 12(Section 01)
// 정기예금 은행계좌 클래스 [시험판]

class TimeAccount {
    private String name;
    private String no;
    private long balance;
    private long timeBalance;

    TimeAccount(String n, String num, long z, long timeBalance) {
        name = n;
        no = num;
        balance = z;
        this.timeBalance = timeBalance;
    }

    String getName() {
        return name;
    }

    String getNo() {
        return no;
    }

    long getBalance() {
        return balance;
    }

    long getTimeBalance() {
        return timeBalance;
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }

    void cancel() {
        balance += timeBalance;
        timeBalance = 0;
    }
}