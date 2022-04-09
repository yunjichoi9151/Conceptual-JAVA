// 개념있는 JAVA
// Chapter 14(Section 01)
// 인터페이스 Player의 이용 예

class PlayerTester {
    
    public static void main(String[] args) {
        Player[] a = new Player[2];
        a[0] = new VideoPlayer();
        a[1] = new CDPlayer();

        for (Player p : a) {
            p.play();
            p.stop();
            System.out.println();
        }
    }
}