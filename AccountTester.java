// 개념있는 JAVA
// Chapter 8(Section 01)
// 은행계좌 클래스 [제1판]과 이것을 테스트하는 클래스

class Account {
    String name;
    String no;
    long balance;
}

class AccountTester {

    public static void main(String[] args) {
        Account chulsoo = new Account();
        Account younghee = new Account();

        chulsoo.name     = "철수";
        chulsoo.no       = "123456";
        chulsoo.balance  = 1000;

        younghee.name    = "영희";
        younghee.no      = "654321";
        younghee.balance = 200;

        chulsoo.balance -= 200;
        younghee.balance += 100;

        System.out.println("■ 철수의 계좌");
        System.out.println("    계좌명의 : " + chulsoo.name);
        System.out.println("    계좌번호 : " + chulsoo.no);
        System.out.println("    예금잔고 : " + chulsoo.balance);

        System.out.println("■ 영희의 계좌");
        System.out.println("    계좌명의 : " + younghee.name);
        System.out.println("    계좌번호 : " + younghee.no);
        System.out.println("    예금잔고 : " + younghee.balance);
    }
}