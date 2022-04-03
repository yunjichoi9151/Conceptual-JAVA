// 개념있는 JAVA
// Chapter 8(Section 01)
// 두 사람의 은행계좌 데이터를 취급하는 프로그램

class Accounts {

    public static void main(String[] args) {
        String chulsooAccountName     = "철수";
        String chulsooAccountNo       = "123456";
        long   chulsooAccountBalance  = 1000;

        String youngheeAccountName    = "영희";
        String youngheeAccountNo      = "654321";
        long   youngheeAccountBalance = 200;

        chulsooAccountBalance -= 200;
        youngheeAccountBalance += 100;

        System.out.println("■ 철수의 계좌");
        System.out.println("    계좌명의 : " + chulsooAccountName);
        System.out.println("    계좌번호 : " + chulsooAccountNo);
        System.out.println("    예금잔고 : " + chulsooAccountBalance);

        System.out.println("■ 영희의 계좌");
        System.out.println("    계좌명의 : " + youngheeAccountName);
        System.out.println("    계좌번호 : " + youngheeAccountNo);
        System.out.println("    예금잔고 : " + youngheeAccountBalance);
    }
}