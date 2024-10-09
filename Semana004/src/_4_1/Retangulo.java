package _4_1;

public class Retangulo extends Figura {
	
	private int comprimento;
	private int altura;
	
	public Retangulo(int x, int y, int comprimento, int altura){
		super(x, y);
		this.comprimento = comprimento;
		this.altura = altura;
	}
	
	@Override
	public double getPerimetro(){
		return 2.0 * comprimento + 2.0 * altura;
	}
	
	@Override
	public double getArea(){
		return comprimento * altura;
	}
	
	@Override
	public String toString(){
		return "| Area: " + getArea() + " | Perimetro: " + getPerimetro() + ")";
	}
	
}
