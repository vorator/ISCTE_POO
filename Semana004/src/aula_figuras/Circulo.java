package aula_figuras;

public class Circulo extends Figura{

	private double raio;
	
	public Circulo (int x, int y, double raio){
		super(x, y);
		this.raio = raio;
	}
	
	@Override
	public double perimetro(){
		return 2.0 * Math.PI * raio;
	}
	
	public double area(){
		return Math.PI * raio * raio;
	}
	
	@Override
	public String toString(){
		return "Position: (" + getX() + "," + getY() + ", " + raio + ")";
	}
}
