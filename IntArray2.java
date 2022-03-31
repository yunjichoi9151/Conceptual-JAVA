// 개념있는 JAVA
// Chapter 6(Section 01)
// 배열의 각 요소에 1, 2, 3, 4, 5를 대입해서 표시

class IntArray2 {
    
    public static void main(String[] args) {
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++)
            a[i] = i + 1;
        
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}