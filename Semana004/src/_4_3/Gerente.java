package _4_3;

public class Gerente extends Funcionario {
	
	private boolean objetivoYN;
	private static final double BONUS_OBJETIVO = 200.0;
	
	public Gerente(String name, int id){
		super(name, id);
		objetivoYN = false;
	}
	
	
	@Override
	public void setObjetivo(boolean b){
		this.objetivoYN = b;
	}
	
	
	@Override
	public double getSalario(){
		if (objetivoYN == true)
			return super.getSalario() + BONUS_OBJETIVO;
		else
			return super.getSalario();
	}
}
