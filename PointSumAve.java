// 개념있는 JAVA
// Chapter 6(Section 01)
// 점수를 입력하면 합계 점수와 평균 점수를 표시

import java.util.Scanner;

class PointSumAve {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int sum = 0;
        System.out.println("5명의 점수를 입력하시오.");

        System.out.print("1번 점수 : ");
        int lee = stdIn.nextInt();
        sum += lee;
        
        System.out.print("1번 점수 : ");
        int kim = stdIn.nextInt();
        sum += kim;

        System.out.print("1번 점수 : ");
        int park = stdIn.nextInt();
        sum += park;

        System.out.print("1번 점수 : ");
        int hong = stdIn.nextInt();
        sum += hong;

        System.out.print("1번 점수 : ");
        int jung = stdIn.nextInt();
        sum += jung;

        System.out.println("합계는 " + sum + "점입니다.");
        System.out.println("평균은 " + (double)sum / 5 + "점입니다.");
    }
}