package Exemplo_5_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<>();		
		lista.add(new Pessoa("Ana", 60, 165));
		lista.add(new Pessoa("Rita", 50, 160));
		lista.add(new Pessoa("Joana", 55, 160));
		lista.add(new Pessoa("Bruno", 80, 180));
		lista.add(new Pessoa("Tomas", 70, 165));
		lista.add(new Pessoa("Guilherme", 75, 170));
		lista.add(new Pessoa("Vitor", 80, 185));
		lista.add(new Pessoa("Pedro", 70, 170));
		lista.add(new Pessoa("Vasco", 50, 175));
		
		// =========================================
		System.out.println("\n=== Lista ordenada por peso (com classe aninhada static na classe Pessoa) ===");
		
		lista.sort(new Pessoa.ComparadorDePeso());
		
		show(lista);
		
		// =========================================
		System.out.println("\n=== Lista ordenada por nome (com classe anonima) ===");
		
		lista.sort(new Comparator<Pessoa>() { 
			public int compare(Pessoa o1, Pessoa o2) {
				Comparator<String> c = String.CASE_INSENSITIVE_ORDER;
				return c.compare(o1.getNome(), o2.getNome());
		}});

		show(lista);
		
		// =========================================
		System.out.println("\n=== Lista ordenada por altura (com expressao lambda) ===");
		
		lista.sort( (p1, p2) -> p1.getAltura() - p2.getAltura() );
		
		show(lista);

	}
	
	static void show(List<Pessoa> lista) {
		for (Pessoa p : lista)
			System.out.println(p);
		
	}
}
