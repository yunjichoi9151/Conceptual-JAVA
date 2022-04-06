package id;
// 개념있는 JAVA
// Chapter 11(Section 02)
// 식별번호 클래스 RandId의 이용 예

import id.RandId_2;

public class RandIdTester_2 {
    public static void main(String[] args) {
        RandId_2 a_2 = new RandId_2();
        RandId_2 b_2 = new RandId_2();
        RandId_2 c_2 = new RandId_2();

        System.out.println("a의 식별번호 : " + a_2.getId_2());
        System.out.println("b의 식별번호 : " + b_2.getId_2());
        System.out.println("c의 식별번호 : " + c_2.getId_2());
    }
}