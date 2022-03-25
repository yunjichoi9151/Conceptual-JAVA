// 개념있는 JAVA
// Chapter 2(Section 02)
// 이름을 입력하면 인사를 한다(next() 이용)

import java.util.Scanner;

class HelloNext {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("이름은 : ");
        String s = stdIn.next();

        System.out.println("안녕하세요 " + s + "씨!");
    }
}
