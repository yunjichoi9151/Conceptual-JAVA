// 개념있는 JAVA
// Chapter 16(Section 01)
// 두 정숫값을 입력하면 사칙연산을 실행한 후 결과를 표시

import java.util.Scanner;
import java.util.InputMismatchException;

class ExceptionSample {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("x와 y의 사칙연산을 합니다.");

        while (true) {
            try {
                System.out.print("x의 값 : ");  int x = stdIn.nextInt();
                System.out.print("y의 값 : ");  int y = stdIn.nextInt();

                System.out.println("x + y = " + (x + y));
                System.out.println("x - y = " + (x - y));
                System.out.println("x * y = " + (x * y));
                System.out.println("x / y = " + (x / y));
                System.out.println("x % y = " + (x % y));
            } catch (InputMismatchException e) {
                System.out.println("입력 오류 발생." + e);
                String s = stdIn.next();
                System.out.println(s + "는 무시했습니다.");
            } catch (ArithmeticException e) {
                System.out.println("산술 오류 발생." + e);
                System.out.println("오류가 나지 않는 수치를 입력해 주세요.");
            } finally {
                System.out.println("--------------------");
                System.out.print("한 번 더? (1...예/0...아니오) : ");
                int retry = stdIn.nextInt();
                if (retry == 0) break;
                System.out.println("--------------------");
            }
        }
    }
}