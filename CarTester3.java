// 개념있는 JAVA
// Chapter 9(Section 02)
// 자동차 클래스 [제2판]의 이용 예(예3)

import java.util.Scanner;

class CarTester3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("자동차의 데이터를 입력하시오.");
        System.out.print("이름은 : ");    String name = stdIn.next();
        System.out.print("차 너비는 : "); int width = stdIn.nextInt();
        System.out.print("차 높이는 : "); int height = stdIn.nextInt();
        System.out.print("차 길이는 : "); int length = stdIn.nextInt();
        System.out.print("연료량은? : "); double fuel = stdIn.nextDouble();
        System.out.print("구입연도 : ");  int y = stdIn.nextInt();
        System.out.print("구입월 : ");    int m = stdIn.nextInt();
        System.out.print("구입일 : ");    int d = stdIn.nextInt();

        Car_2 car2 = new Car_2(name, width, height, length, fuel, new Day_3(y, m, d));

        car2.putSpec_2();
        System.out.println("구입일 : " + car2.getPurchaseDay());
    }
}