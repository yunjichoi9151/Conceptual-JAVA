// 개념있는 JAVA
// Chapter 14(Section 02)
// ===== DVD 플레이어 ===== //

class DVDPlayer implements ExPlayer {

    public void play() {
        System.out.println("DVD 재생시작!");
    }

    public void stop() {
        System.out.println("DVD 재생종료!");
    }

    public void slow() {
        System.out.println("DVD 슬로재생시작!");
    }
}