// 개념있는 JAVA
// Chapter 4(Section 02)
// 식의 평가순서가 좌->우인 것을 확인

class EvaluationOrder {
    
    public static void main(String[] args) {
        int a = 3;
        int x = (a++) * (2 + a);
        System.out.println("a = " + a);
        System.out.println("x = " + x);
    }
}
