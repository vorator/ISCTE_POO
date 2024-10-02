package aula_drawable;

public class Square implements Drawable{
	private int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Desenhar um quadrado de lado " + side);
		
	}
	
	
}
