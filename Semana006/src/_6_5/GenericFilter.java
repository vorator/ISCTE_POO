package _6_5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//import Exemplo_6_2.Pessoa;

public class GenericFilter {

	public static void main(String[] args) {

		// TESTE com STRING
		List<String> strings = List.of("livro", "dado", "caneta");
		Iterable<String> stringsLongas = select(strings, s -> s.length() > 5);
		stringsLongas.forEach(p -> System.out.println(p));


//		// TESTE com INT
//		List<Integer> num = List.of(1, 2, 3, 4, 5); 			   //adiciona multipos valores à lista
//		Iterable<Integer> numPares = select(num, n -> n % 2 == 0); // invoca a função select passando uma estrutura
//		numPares.forEach(p -> System.out.println(p));			   // e um predicado (números pares)
	}


	// Função genérica (String substituídos por <T>)
	public static <T> Iterable<T> select(Iterable<T> iterable, Predicate<T> pred) {
		List<T> resultado = new ArrayList<>();
		for (T s : iterable) {
			if (pred.test(s)) {		// testa o predicado
				resultado.add(s);	// adicona à nova lista se true 
			}
		}
		return resultado;
	}
}

/* */