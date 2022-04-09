// 개념있는 JAVA
// Chapter 14(Section 01)
// 클래스 PortablePlayer의 이용 예

class PortablePlayerTester {

    public static void main(String[] args) {
        PortablePlayer a = new PortablePlayer();
        a.play();
        a.stop();
        a.changeSkin(Skinnable.LEOPARD);
    }
}