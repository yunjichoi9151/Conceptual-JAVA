// 개념있는 JAVA
// Chapter 7(Section 01)
// 식별자의 유효범위를 확인하기

class Scope {

    static int x = 700;
    
    static void printX() {
        System.out.println("x = " + x);
    }
    public static void main(String[] args) {
        System.out.println("x = " + x);

        int x = 800;
        
        System.out.println("x = " + x);

        System.out.println("Scope.x = " + Scope.x);

        printX();
    }
}
