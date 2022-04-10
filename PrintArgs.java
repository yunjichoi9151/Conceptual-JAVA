// 개념있는 JAVA
// Chapter 15(Section 03)
// 커맨드라인 인수를 표시한다.

class PrintArgs {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "] = " + args[i]);
    }
}