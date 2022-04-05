// 개념있는 JAVA
// Chapter 10(Section 03)
// 식별번호 클래스 (예2 : 시작번호를 난수로 결정)

import java.util.Random;

class RandId {
    private static int counter;

    private int id;

    static {
        Random rand = new Random();
        counter = rand.nextInt(10) * 100;
    }

    public RandId() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }
}

public class RandIdTester {
    public static void main(String[] args) {
        RandId a = new RandId();
        RandId b = new RandId();
        RandId c = new RandId();

        System.out.println("a의 식별번호 : " + a.getId());
        System.out.println("b의 식별번호 : " + b.getId());
        System.out.println("c의 식별번호 : " + c.getId());
    }
}