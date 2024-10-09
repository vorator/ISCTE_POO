package _4_1;

public class Circulo extends Figura{

	private int raio;
	
	public Circulo (int x, int y, int raio){
		super(x, y);
		this.raio = raio;
	}
	
	@Override
	public double getPerimetro(){
		return 2.0 * Math.PI * raio;
	}
	
	@Override
	public double getArea(){
		return Math.PI * raio * raio;
	}
	
	@Override
	public String toString(){
		return "| Area: " + getArea() + " | Perimetro: " + getPerimetro() + ")";
	}
}
