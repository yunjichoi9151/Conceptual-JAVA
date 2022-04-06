// 개념있는 JAVA
// Chapter 11(Section 02)
// 식별번호 클래스 (패키지에 포함해서 구현)

package id;

import java.util.Random;

public class RandId_2 {

    private static int counter_2;

    private int id_2;

    static {
        Random rand = new Random();
        counter_2 = rand.nextInt(10) * 100;
    }

    public RandId_2() {
        id_2 = ++counter_2;
    }

    public int getId_2() {
        return id_2;
    }
}