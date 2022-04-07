package pet;
// 개념있는 JAVA
// Chapter 12(Section 02)
// 애완동물 클래스의 이용 예(다형성의 검증)

class PetTester1 {
    
    public static void main(String[] args) {
        Pet kurt = new Pet("Kurt", "아이");
        kurt.introduce();
        System.out.println();

        RobotPet r2d2 = new RobotPet("R2D2", "루크");
        r2d2.introduce();
        System.out.println();

        Pet p = r2d2;
        p.introduce();
    }
}

