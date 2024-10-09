package _4_1;

public class Figura extends AbstractFigure{

	private int x;
	private int y;
	
	public Figura (int x, int y){
		super(x, y);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	//public double getPerimetro(){};
	
	//public double getArea();
	
	@Override
	public String toString(){
		return "Position: (" + x + "," + y + ")";
	}

	@Override
	public double getPerimetro() {
		return 0;
	}

	@Override
	public double getArea() {
		return 0;
	}
}
