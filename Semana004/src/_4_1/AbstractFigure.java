package _4_1;

public abstract class AbstractFigure {

	private int x;
	private int y;
	
	public AbstractFigure(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public abstract double getPerimetro();
	
	public abstract double getArea();
	
}
