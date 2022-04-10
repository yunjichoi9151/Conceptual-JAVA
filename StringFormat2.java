// 개념있는 JAVA
// Chapter 15(Section 02)
// String.format 메소드를 이용한 서식 문자열 작성

class StringFormat2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.printf(String.format("%%%dd\n", i), 5);
        }
    }
}