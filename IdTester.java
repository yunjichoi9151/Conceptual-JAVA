// 개념있는 JAVA
// Chapter 10(Section 01)
// 일련번호 클래스

class Id {
    static int counter = 0;
    
    private int id;

    public Id() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }
}

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 식별번호 : " + a.getId());
        System.out.println("b의 식별번호 : " + b.getId());

        System.out.println("Id.counter = " + Id.counter);
        System.out.println("a.counter  = " +  a.counter);
        System.out.println("b.counter  = " +  b.counter);
    }
}
