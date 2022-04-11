// 개념있는 JAVA
// Chapter 16(Section 02)
// 한 자릿수 (0~9) 덧셈

import java.util.Scanner;

class RangeError extends RuntimeException {
    RangeError(int n) { super("범위를 넘은 값 : " + n); }
}

class ParameterRangeError extends RangeError {
    ParameterRangeError(int n) { super(n); }
}

class ResultRangeError extends RangeError {
    ResultRangeError(int n) { super(n); }
}

public class RangeErrorTester {

    static boolean isValid(int n) {
        return n >= 0 && n <= 9;
    }

    static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
        if (!isValid(a)) throw new ParameterRangeError(a);
        if (!isValid(b)) throw new ParameterRangeError(b);
        int result = a + b;
        if (!isValid(result)) throw new ResultRangeError(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a : ");  int a = stdIn.nextInt();
        System.out.print("정수 b : ");  int b = stdIn.nextInt();

        try {
            System.out.println("두 값의 합은 " + add(a, b) + "입니다.");
        } catch (ParameterRangeError e) {
            System.out.println("더하는 숫자가 범위를 넘었습니다.\n" + e.getMessage());
        } catch (ResultRangeError e) {
            System.out.println("계산 결과가 범위를 넘었습니다.\n" + e.toString());
        }
    }
}
