// 개념있는 JAVA
// Chapter 2(Section 02)
// 0~9 중에서 행운의 숫자를 난수로 생성해서 표시

import java.util.Random;

class LuckyNo {
    
    public static void main(String[] args) {
        Random rand = new Random();

        int lucky = rand.nextInt(10);

        System.out.println("오늘의 행운의 숫자는 " + lucky + "입니다.");
    }
}
