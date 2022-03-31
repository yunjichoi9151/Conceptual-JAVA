// 개념있는 JAVA
// Chapter 6(Section 01)
// 배열 변수의 값을 표시

class PrintArray {
    
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("a = " + a);
        a = null;
        System.out.println("a = " + a);
    }
}