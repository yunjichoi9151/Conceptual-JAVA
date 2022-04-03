// 개념있는 JAVA
// Chapter 8(Section 01)
// 은행계좌 클래스 [제2판]과 이것을 테스트하는 클래스

class Account_2 {
    private String name;
    private String no;
    private long balance;

    Account_2(String n, String num, long z) {
        name = n;
        no = num;
        balance = z;
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

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }
}

class AccountTester_2 {

    public static void main(String[] args) {
        Account_2 chulsoo = new Account_2("철수", "123456", 1000);
        Account_2 younghee = new Account_2("영희", "654321", 200);

        chulsoo.withdraw(200);
        younghee.deposit(100);

        System.out.println("■ 철수의 계좌");
        System.out.println("    계좌명의 : " + chulsoo.getName());
        System.out.println("    계좌번호 : " + chulsoo.getNo());
        System.out.println("    예금잔고 : " + chulsoo.getBalance());

        System.out.println("■ 영희의 계좌");
        System.out.println("    계좌명의 : " + younghee.getName());
        System.out.println("    계좌번호 : " + younghee.getNo());
        System.out.println("    예금잔고 : " + younghee.getBalance());
    }
}