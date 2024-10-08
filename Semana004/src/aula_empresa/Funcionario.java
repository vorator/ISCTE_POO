package aula_empresa;

public class Funcionario {
	private String name;
	private int id;
	private static final double SALARIO_BASE = 800.0;
	
	public Funcionario(String nome, int identificacao){
		this.name = nome;
		this.id = identificacao;
	}
	
	public String getNome(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	
	public double salario(){
		return SALARIO_BASE;
	}

	@Override
	public String toString() {
		return "Funcionario -> nome=" + name + ", ID=" + id;
	}
}
