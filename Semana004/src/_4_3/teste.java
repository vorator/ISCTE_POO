package _4_3;
import java.util.*;
import static java.lang.System.out;

public class teste {
	public static void main (String[] args){
		
		Empresa sap = new Empresa();
		
		Funcionario a1 = new Funcionario("Luis", 1);
		Funcionario a2 = new Funcionario("Lais", 2);
		Funcionario a3 = new Gerente("Francisco", 3);
		Funcionario a4 = new Diretor("Eric", 4);
		
		sap.addEmpregado(a1);
		sap.addEmpregado(a2);
		sap.addEmpregado(a3);
		sap.addEmpregado(a4);
		
		out.println("Salario de um funcionario: " + a1.getSalario());
		
		a3.setObjetivo(true);
		out.println("Salario de um gerente com bonus: " + a3.getSalario());
		
		a4.setLucro(100000.0);
		out.println("Salario de um diretor com " + a4.getLucro() + " euros de lucro: " + a4.getSalario());
		
		out.println("Salario total a pagar pela empresa: " + sap.calcularSalarioTotal());
		
	}
}
