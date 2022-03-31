// 개념있는 JAVA
// Chapter 6(Section 01)
// 배열의 대입(틀림)

class AssignArray {
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 5, 4, 3, 2, 1, 0};

        System.out.print("a = ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        System.out.print("b = ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        b = a;

        a[0] = 10;

        System.out.println("a에 b를 대입했습니다.");
        System.out.print("a = ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        System.out.print("b = ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();
    }
}