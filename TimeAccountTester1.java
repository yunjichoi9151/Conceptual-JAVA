// 개념있는 JAVA
// Chapter 12(Section 01)
// is-A 관계와 인스턴스 참조(예1)

class TimeAccountTester1 {

    public static void main(String[] args) {
        Account_2 chulsoo = new Account_2("철수", "123456", 1000);
        TimeAccount_1 younghee = new TimeAccount_1("영희", "654321", 200, 500);

        Account_2 x;
        x = chulsoo;
        x = younghee;

        System.out.println("x의 예금잔고 : " + x.getBalance());

        TimeAccount_1 y;
        y = younghee;

        System.out.println("y의 예금잔고 : " + y.getBalance());
        System.out.println("y의 정기예금잔고 : " + y.getTimeBalance());
    }
}