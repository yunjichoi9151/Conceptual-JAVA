// 개념있는 JAVA
// Chapter 14(Section 01)
// ===== CD 플레이어 ===== //

public class CDPlayer implements Player {

    public void play() {
        System.out.println("□ CD 재생시작!");
    }

    public void stop() {
        System.out.println("□ CD 재생종료!");
    }

    public void cleaning() {
        System.out.println("□ 헤드를 청소했습니다.");
    }
}