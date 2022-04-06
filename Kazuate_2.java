// 개념있는 JAVA
// Chapter 11(Section 01)
// 숫자 맞히기 게임(0~99를 맞히기)

import java.util.*;

class Kazuate_2 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(100);

        System.out.println("숫자 맞히기 게임 시작!!");
        System.out.println("0~99 사이의 수를 맞혀주세요.");

        int x;
        do {
            System.out.print("몇 일까요? : ");
            x = stdIn.nextInt();

            if (x > no)
                System.out.println("더 작은 수입니다.");
            else if (x < no)
                System.out.println("더 큰 수입니다.");
        } while ( x != no);

        System.out.println("정답입니다.");
    }
}
