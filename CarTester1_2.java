// 개념있는 JAVA
// Chapter 9(Section 02)
// 자동차 클래스 [제2판]의 이용 예(예1)

class CarTester1_2 {

    public static void main(String[] args) {
        Day_3 d = new Day_3(2010, 10,15);
        Car_2 myCar = new Car_2("마이카", 1885, 1490, 5220, 90.0, d);

        Day_3 p = myCar.getPurchaseDay();
        System.out.println("마이카의 구입일 : " + p);

        p.set_3(1999, 12, 31);

        Day_3 q = myCar.getPurchaseDay();
        System.out.println("마이카의 구입일 : " + q);
    }
}