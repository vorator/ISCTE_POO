package aula_empresa;

public class Gerente extends Funcionario {
	
	public Gerente(String name, int id){
		super(name, id);
	}
	
	@Override
	public double salario(){
		return super.salario() * 1.5;
	}
}
