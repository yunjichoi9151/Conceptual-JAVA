// 개념있는 JAVA
// Chapter 9(Section 02)
// 자동차 클래스 [제2판]의 이용 예(예2)

class CarTester2_2 {

    public static void main(String[] args) {
        Car_2 myCar = new Car_2("마이카", 1885, 1490, 5220, 90.0, new Day_3(2000, 11, 18));

        myCar.putSpec_2();
        System.out.println("구입일 : " + myCar.getPurchaseDay().toString());
    }
}