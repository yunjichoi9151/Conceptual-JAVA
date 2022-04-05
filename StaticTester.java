// 개념있는 JAVA
// Chapter 10(Section 02)
// 클래스/인스턴스 필드와 클래스/인스턴스 메소드

class Static {
    private static int s;
    private int a;

    public static void m1() { }
    public        void f1() { }

    public static void m2(int x) {
        s = x;
        m1();
    }

    public void f2(int x) {
        s = x;
        a = x;
        m1();
        f1();
        System.out.println("s = " + x + "  a = " + a);
    }
}

public class StaticTester {
    public static void main(String[] args) {
        Static c1 = new Static();
        Static c2 = new Static();

        Static.m2(5);
        c1.f2(10);
        c2.f2(20);
    }
}