// 개념있는 JAVA
// Chapter 2(Section 02)
// 이름을 입력하면 인사를 한다(nextLine() 이용)

import java.util.Scanner;

class HelloNextLine {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("이름은 : ");
        String s = stdIn.nextLine();

        System.out.println("안녕하세요 " + s + "씨!");
    }
}
