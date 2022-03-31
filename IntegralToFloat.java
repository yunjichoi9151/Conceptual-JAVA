// 개념있는 JAVA
// Chapter 5(Section 02)
// 정수형에서 부동소수점형으로의 변환(정밀도를 잃어버린 예)

class IntegralToFloat {
    
    public static void main(String[] args) {
        int  a = 123456789;
        long b = 1234567890123456789L;

        System.out.println("        a = " +        a);
        System.out.println("(float) a = " + (float)a);

        System.out.println("        b = " +        b);
        System.out.println("(double)b = " + (double)b);
    }
}