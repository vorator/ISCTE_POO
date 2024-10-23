package _6_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//import Exemplo_6_2.Pessoa;

public class StringFilter {

	public static void main (String[] args){

		// TESTE com STRING
		List<String> lista = List.of("a", "", "b", "");		         // cria uma lista de Strings com 4 elementos
		Iterable<String> nVazia = select(lista, s -> !s.isEmpty());  // invoca a função select, passando a lista e predicado 
																	 //"não vazio", atribui o resultado a objeto iterável
		// Imprimir resultados
		nVazia.forEach(p -> System.out.println(p));
	}

	
	// função que devolve uma lista iteravel de Strings, passando um objeto iterável e um predicado
	public static Iterable<String> select(Iterable<String> iterable, Predicate<String> pred) {
		List<String> resultado = new ArrayList<>();  	// para guardar os elementos do predicado
		for (String s : iterable) { 				    // itera pela lista
			if (pred.test(s)) {						    // testa o pedicado em "s" devolve true/false
				resultado.add(s);						// adiciona à lista de True
			}
		}
		return resultado;								// retorna a lista iterável de Strings filtradas pelo predicado
	}
}

/* */