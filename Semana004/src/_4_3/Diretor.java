package _4_3;

public class Diretor extends Funcionario{
	
	private String departamento;
	private double lucroRegiao;
	
	public Diretor(String name, int id){
		super(name, id);
		this.lucroRegiao = 0.0;
	}
	
	@Override
	public void setLucro(double lucro){
		this.lucroRegiao = lucro;
	}
	
	@Override
	public double getLucro(){
		return this.lucroRegiao;
	}
	
	@Override
	public double getSalario(){
		return (super.getSalario() * 2) + (lucroRegiao * 0.01);
	}
	
	public String toString(){
		return super.toString() + ", Departamento=" + departamento;
	}
}
