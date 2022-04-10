// 개념있는 JAVA
// Chapter 15(Section 03)
// 커맨드라인 인수로 입력된 모든 수치를 더해서 표시

class SumOfArgs {

    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 0; i < args.length; i++)
            sum += Double.parseDouble(args[i]);
        System.out.println("합계는 " + sum + "입니다.");
    }
}