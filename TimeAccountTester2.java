// 개념있는 JAVA
// Chapter 12(Section 01)
// is-A 관계와 인스턴스 참조(메소드의 인수로 검토)

class TimeAccountTester2 {

    static int compBalance(Account_2 a, Account_2 b) {
        if (a.getBalance() > b.getBalance())
            return 1;
        else if (a.getBalance() < b.getBalance())
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        Account_2 chulsoo = new Account_2("철수", "123456", 1000);
        TimeAccount_1 younghee = new TimeAccount_1("영희", "654321", 200, 500);

        switch (compBalance(chulsoo, younghee)) {
            case  0 : System.out.println("철수와 영희의 예금잔고는 같다.");  break;
            case  1 : System.out.println("철수 쪽 예금잔고가 많다.");  break;
            case -1 : System.out.println("영희 쪽 예금잔고가 많다.");  break;
        }
    }
}