// 개념있는 JAVA
// Chapter 15(Section 03)
// 문자열 배열(1문자씩 표시)

class StringArray2 {

    public static void main(String[] args) {
        String[] sx = {"Turbo", "NA", "DOHC"};

        for (int i = 0; i < sx.length; i++) {
            System.out.print("sx[" + i + "] = \"");
            for (int j = 0; j < sx[i].length(); j++)
                System.out.print(sx[i].charAt(j));
            System.out.println('\"');
        }
    }
}