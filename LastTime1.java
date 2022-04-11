// 개념있는 JAVA
// Chapter 16(Section 02)
// 이전 기분을 표시

import java.io.*;
import java.util.Scanner;

class LastTime1 {

    static void init() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("LastTime.txt"));
            String kibun = br.readLine();
            System.out.println("이전 기분은 " + kibun + "였습니다.");
        } catch (IOException e){
            System.out.println("이 프로그램 실행은 처음이군요.");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기 실패.");
                }
            }
        }
    }

    static void term(String kibun) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("LastTime.txt");
            fw.write(kibun);
        } catch (IOException e){
            System.out.println("오류 발생!!");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e){
                    System.out.println("파일 닫기 실패.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        init();

        System.out.print("지금 기분은 : ");
        String kibun = stdIn.next();

        term(kibun);
    }
}