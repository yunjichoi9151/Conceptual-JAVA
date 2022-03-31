// 개념있는 JAVA
// Chapter 6(Section 01)
// 배열의 각 요소를 1, 2, 3, 4, 5로 초기화해서 표시

class IntArrayInit {
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}