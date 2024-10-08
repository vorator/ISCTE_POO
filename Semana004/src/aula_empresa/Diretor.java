package aula_empresa;

public class Diretor extends Funcionario{
	
	private String departamento;
	
	public Diretor(String name, int id, String depart){
		super(name, id);
		this.departamento = depart;
	}
	
	@Override
	public double salario(){
		return super.salario() * 3;
	}
	
	public String toString(){
		return super.toString() + ", Departamento=" + departamento;
	}
}
