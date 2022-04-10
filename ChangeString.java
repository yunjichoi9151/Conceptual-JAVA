// 개념있는 JAVA
// Chapter 15(Section 02)
// 문자열이 참조할 곳을 변경

class ChangeString {

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "XYZ";

        s1 = "XYZ";
        System.out.println("문자열 s1 = " + s1);
        System.out.println("문자열 s2 = " + s2);
        System.out.println("s1과 s2는 같은 문자열 리터럴을 참조" + ((s1 == s2) ? "하고 있다." : "하지 않는다."));
    }
}