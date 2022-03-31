// 개념있는 JAVA
// Chapter 6(Section 01)
// 구성요소 형이 int형인 배열(구성요소 수는 5 : new를 이용해서 본체를 생성)

class IntArray1 {
    
    public static void main(String[] args) {
        int[] a = new int[5];

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        System.out.println("a[" + 0 + "] = " + a[0]);
        System.out.println("a[" + 1 + "] = " + a[1]);
        System.out.println("a[" + 2 + "] = " + a[2]);
        System.out.println("a[" + 3 + "] = " + a[3]);
        System.out.println("a[" + 4 + "] = " + a[4]);
    }
}