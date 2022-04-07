// 개념있는 JAVA
// Chapter 12(Section 01)
// 상위 클래스와 하위 클래스(디폴트 생성자의 역할을 확인)

class A {
    private int a;

    A() { a = 50; }

    int getA() { return a; }
}

class B extends A {
    // 생성자가 정의되어 있지 않다(디폴트 생성자가 생성된다)
}

public class DefaultConstructor {

    public static void main(String[] args) {
        B x = new B();

        System.out.println("x.getA() = " + x.getA());
    }
    
}
