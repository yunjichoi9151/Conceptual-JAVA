// 개념있는 JAVA
// Chapter 9(Section 02)
// 자동차 클래스 [제1판]

public class Car_2 {
    private String name;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double fuel;
    private Day_3 purchaseDay;

    public Car_2(String name, int width, int height, int length, double fuel, Day_3 purchaseDay) {
        this.name = name;        this.width = width;      this.height = height;
        this.length = length;    this.fuel = fuel;
        x = y = 0.0;
        this.purchaseDay = new Day_3(purchaseDay);
    }

    public double getX_2() { return x; }
    public double getY_2() { return y; }
    public double getFuel_2() { return fuel; }
    public Day_3 getPurchaseDay() {
        return new Day_3(purchaseDay);
    }

    public void putSpec_2() {
        System.out.println("이름 : " + name);
        System.out.println("차 너비 : " + width + "mm");
        System.out.println("차 높이 : " + height + "mm");
        System.out.println("차 길이 : " + length + "mm");
    }

    public boolean move_2(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);

        if (dist > fuel)
            return false;
        else {
            fuel -= dist;
            x += dx;
            y += dy;
            return true;
        }
    }
}