// 개념있는 JAVA
// Chapter 5(Section 02)
// 0.0에서 1.0까지 0.001단위로 증가시키고 합계를 표시(반복을 float로 제어)

class FloatSum1 {
    
    public static void main(String[] args) {
        float sum = 0.0F;

        for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
            System.out.println("x = " + x);
            sum += x;
        }
        System.out.println("sum = " + sum);
    }
}