// 개념있는 JAVA
// Chapter 5(Section 02)
// 0.0에서 1.0까지 0.001단위로 증가시키고 합계를 표시(반복을 int로 표시)

class FloatSum2 {
    
    public static void main(String[] args) {
        float sum = 0.0F;

        for (int i = 0; i <= 1000; i++) {
            float x = (float)i / 1000;
            System.out.println("x = " + x);
            sum += x;
        }
        System.out.println("sum = " + sum);
    }
}