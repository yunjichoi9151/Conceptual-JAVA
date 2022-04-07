// 개념있는 JAVA
// Chapter 12(Section 02)
// 애완동물 클래스의 이용 예(메소드의 인수로 다형성을 검증)

class PetTester2 {

    static void intro(Pet p) {
        p.introduce();
    }
    
    public static void main(String[] args) {
        Pet[] a = {
            new Pet("Kurt", "아이"),
            new RobotPet("R2D2", "루크"),
            new Pet("마이클", "영진"),
        };

        for (Pet p : a) {
            intro(p);
            System.out.println();
        }
    }
}

