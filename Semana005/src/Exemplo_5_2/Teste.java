package Exemplo_5_2;

public class Teste {

	public static void main(String[] args) {
		
		Point p1 = new Point(3,7);
		Point p2 = new Point(3,1);
		
		Point p3 = p1.sum(4, 5);
		Point p4 = p2.scale(3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}
}
