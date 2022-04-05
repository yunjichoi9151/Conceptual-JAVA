// 개념있는 JAVA
// Chapter 10(Section 01)
// 은행계좌 클래스 [제3판]

class AccountTester_Ch10 {

    public static void main(String[] args) {
        Account_Ch10 chulsoo = new Account_Ch10("철수", "123456", 1000);
        Account_Ch10 younghee = new Account_Ch10("영희", "654321", 200);

        System.out.println("■ 철수의 계좌");
        System.out.println("    계좌명의 : " + chulsoo.getName_Ch10());
        System.out.println("    계좌번호 : " + chulsoo.getNo_Ch10());
        System.out.println("    예금잔고 : " + chulsoo.getBalance_Ch10());
        System.out.println("    식별번호 : " + chulsoo.getId_Ch10());

        System.out.println("■ 영희의 계좌");
        System.out.println("    계좌명의 : " + younghee.getName_Ch10());
        System.out.println("    계좌번호 : " + younghee.getNo_Ch10());
        System.out.println("    예금잔고 : " + younghee.getBalance_Ch10());
        System.out.println("    식별번호 : " + younghee.getId_Ch10());
    }
}