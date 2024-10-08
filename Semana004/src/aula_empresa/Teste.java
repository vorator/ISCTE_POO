package aula_empresa;
import java.util.List;
import java.util.ArrayList;

public class Teste {
	
	public static void main (String[] args){
		List<Funcionario> staff = new ArrayList<>();
		
		staff.add(new Funcionario("Maria", 1));
		staff.add(new Funcionario("Rui", 2));
		staff.add(new Funcionario("Luis", 3));
		staff.add(new Diretor("Lais", 4, "Cyberseguranca"));
		
		for (Funcionario f : staff)
			System.out.println(f);
	}
}
