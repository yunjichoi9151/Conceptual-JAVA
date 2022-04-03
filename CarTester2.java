// 개념있는 JAVA
// Chapter 8(Section 02)
// 자동차 클래스 [제1판]의 이용 예(예2 : 대화식으로 자동차를 이동)

import java.util.Scanner;

class CarTester2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("자동차의 데이터를 입력하시오.");
        System.out.print("이름은 : ");    String name = stdIn.next();
        System.out.print("차 너비는 : "); int width = stdIn.nextInt();
        System.out.print("차 높이는 : "); int height = stdIn.nextInt();
        System.out.print("차 길이는 : "); int length = stdIn.nextInt();
        System.out.print("연료량은? : "); double fuel = stdIn.nextDouble();

        Car myCar = new Car(name, width, height, length, fuel);

        while (true) {
            System.out.println("현재 위치 (" + myCar.getX() + ", " + myCar.getY() + ") · 남은 연료 " + myCar.getFuel());
            System.out.print("이동합니까? [0 · · · No/1 · · · Yes] : ");
            if (stdIn.nextInt() == 0) break;

            System.out.print("X방향의 이동거리 : ");
            double dx = stdIn.nextDouble();
            System.out.print("Y방향의 이동거리 : ");
            double dy = stdIn.nextDouble();

            if (!myCar.move(dx, dy))
                System.out.println("연료가 부족합니다!");
        }
    }
}