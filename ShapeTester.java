// 개념있는 JAVA
// Chapter 13(Section 01)
// 도형 클래스 [제1판]의 이용 예

class ShapeTester {

    public static void main(String[] args) {

        Shape[] a = new Shape[2];
        a[0] = new Point();
        a[1] = new Rectangle(4, 3);

        for (Shape s : a) {
            s.draw();
            System.out.println();
        }
    }
}