// 개념있는 JAVA
// Chapter 4(Section 06)
// 구구단을 표시(System.out.printf을 이용)

class MultiTablePrintf {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();
        }        
    }
}
