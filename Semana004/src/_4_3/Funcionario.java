package _4_3;

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


	public double getSalario(){
		return SALARIO_BASE;
	}

	public void setObjetivo(boolean b){};

	public void setLucro(double lucro){};

	public double getLucro(){
		return 0.0;
	}

	@Override
	public String toString() {
		return "Funcionario -> nome=" + name + ", ID=" + id;
	}
}
