package aula_figuras;

public abstract class Figura {

	private int x;
	private int y;
	
	public Figura (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public abstract double perimetro();
	
	public abstract double area();
	
	@Override
	public String toString(){
		return "Position: (" + x + "," + y + ")";
	}
}
