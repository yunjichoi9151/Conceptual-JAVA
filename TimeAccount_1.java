// 개념있는 JAVA
// Chapter 12(Section 01)
// 정기예금 은행계좌 클래스 [제1판]

class TimeAccount_1 extends Account_2 {
    
    private long timeBalance;

    TimeAccount_1(String name, String no, long balance, long timeBalance) {
        super(name, no, balance);
        this.timeBalance = timeBalance;
    }

    long getTimeBalance() {
        return timeBalance;
    }

    void cancel() {
        deposit(timeBalance);
        timeBalance = 0;
    }
}