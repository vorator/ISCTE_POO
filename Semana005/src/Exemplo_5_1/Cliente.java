package Exemplo_5_1;

public class Cliente {
	
	
	public static void main(String[] args) {
	
		Color c1 = new Color(255, 255, 255);
		Color c2 = new Color(0, 255, 0);
		Color c3 = new Color(0, 0, 255);
		Color c4 = new Color(100, 120, 140);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		System.out.println("Luma c1: " + getLuminance(c1));
		System.out.println("Luma c2: " + getLuminance(c1));
		System.out.println("Luma c3: " + getLuminance(c1));
		System.out.println("Luma c4: " + getLuminance(c4));
	}
	
	public static int getLuminance(Color c) {
		
		// double luminance = 0.2126*c.r + 0.7152*c.b + 0.0722*c.b + 0.5; // Errado!
		
		double luminance = 0.2126*c.getR() + 0.7152*c.getG() + 0.0722*c.getB() + 0.5; // Correto
		
		return (int) luminance; 
	}
}
