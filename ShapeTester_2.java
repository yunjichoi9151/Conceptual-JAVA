// 개념있는 JAVA
// Chapter 13(Section 02)
// 도형 클래스 [제2판] 이용 예제

class ShapeTester_2 {

	public static void main(String[ ] args) {
		Shape_2[] p = new Shape_2[4];

		p[0] = new Point_2();			
		p[1] = new HorzLine(5);			
		p[2] = new VirtLine(3);			
		p[3] = new Rectangle_2(4, 3);	

		for (Shape_2 s : p) {
			s.print( );
			System.out.println( );
		}
	}
}
