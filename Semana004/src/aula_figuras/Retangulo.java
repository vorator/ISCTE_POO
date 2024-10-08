package aula_figuras;

public class Retangulo extends Figura {
	
	private int comprimento;
	private int altura;
	
	public Retangulo(int x, int y, int comprimento, int altura){
		super(x, y);
		this.comprimento = comprimento;
		this.altura = altura;
	}
	
	@Override
	public double perimetro(){
		return 2.0 * comprimento + 2.0 * comprimento;
	}
	
	@Override
	public double area(){
		return comprimento * altura;
	}
	
}
