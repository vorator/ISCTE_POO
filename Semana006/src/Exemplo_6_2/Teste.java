package Exemplo_6_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Teste {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();		
		pessoas.add(new Pessoa("Ana", 60, 165));
		pessoas.add(new Pessoa("Tomas", 70, 165));
		pessoas.add(new Pessoa("Rita", 50, 160));
		pessoas.add(new Pessoa("Bruno", 80, 180));
		pessoas.add(new Pessoa("Joana", 55, 160));
		pessoas.add(new Pessoa("Guilherme", 75, 170));
		pessoas.add(new Pessoa("Vitor", 80, 185));
		pessoas.add(new Pessoa("Pedro", 70, 170));
		pessoas.add(new Pessoa("Vasco", 50, 175));
		
			
		// selecionar todas as pessoas com peso superior a 65 Kg	
		List<Pessoa> selecao = select(pessoas, p -> p.getPeso() > 65);
		
		// Mostrar na consola
		selecao.forEach(p -> System.out.println(p));
			
	}
	
	// Metodo flexivel para selecionar, onde a condicao para selecionar
	// e' dada por um objeto que implementa Predicate
	static List<Pessoa> select(List<Pessoa> pessoas, Predicate<Pessoa> pred) {
		
		List<Pessoa> selecao = new ArrayList<>();
		for (Pessoa p : pessoas)
			if (pred.test(p))
				selecao.add(p);
		
		return selecao;
		
	}
}

