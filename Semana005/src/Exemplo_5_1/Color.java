package Exemplo_5_1;

public class Color {

	// public int r;  // Errado!
	// public int g;
	// public int b;
		
	//	private final int r;  // Correto!
	//	private final int g;
	//	private final int b;

	// Alternativa de implementacao correta para poupar variaveis, que nao quebraria o codigo dos clientes
	// caso a classe estivesse bem desenhada originalmente
	private final int value; 
	
	public Color(int r, int g, int b) {
		checkColorComponents(r,g,b);
//		this.r = r;
//		this.g = g;
//		this.b = b;
		value = encode(r,g,b);
	}
	
	private Color(int value) { // construtor encapsulado
		this.value = value;
	}

	private int encode(int r, int g, int b) { // metodo encapsulado
		return r<<16 | g<<8 | b;
	}
	
	private void checkColorComponents(int r, int g, int b) { // metodo encapsulado
		if (r<0 || r>255 || g<0 || g>255 || b<0 || b>255)
			throw new IllegalArgumentException();
	}
	
	// O acesso aos atributos deve sempre ser feito atraves de metodos inspetores 
	// (ou modificadores, quando se pretende alterar valores dos atributos) 
	public int getR() {	
		// return r;
		return (value >> 16) & 0xFF;
	}
	
	public int getG() {	
		// return g;
		return (value >> 8) & 0xFF;
	}
	
	public int getB() {	
		// return b;
		return value & 0xFF;
	}
	
	public Color copy() { // 
		// return new Color(r,g,b);
		return new Color(value);
	}
	
	@Override 
	public String toString() {
		// return "("+r+","+g+","+b+")";
		return "("+getR()+","+getG()+","+getB()+")";
	}
	
	
	
}
