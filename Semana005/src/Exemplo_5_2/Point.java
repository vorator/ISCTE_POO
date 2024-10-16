package Exemplo_5_2;

public class Point {
	
	// objeto imutavel - os atributos sao final
	private final int x;
	private final int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	// objetos imutaveis podem ter getters mas nao setters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	// nos objetos imutaveis, o resultado de operacoes realizadas
	// sobre os atributos e' devolvido sob a forma de um novo objeto
	public Point sum(int dx, int dy) {
		return new Point(x + dx, y + dy);
	}
	public Point scale(int scalar) {
		return new Point(x * scalar, y * scalar);
	}
	
	
	
	
	
	
	
	
	
	
}
