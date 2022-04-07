package pet;
// 개념있는 JAVA
// Chapter 12(Section 02)
// instanceof 연산자의 이용 예

class PetInstanceOf {
    
    public static void main(String[] args) {
        Pet[] a = {
            new Pet("Kurt", "아이"),
            new RobotPet("R2D2", "루크"),
            new Pet("마이클", "영진"),
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] ");
            if (a[i] instanceof RobotPet)
                ((RobotPet)a[i]).work(0);
            else
                a[i].introduce();
        }
    }
}

