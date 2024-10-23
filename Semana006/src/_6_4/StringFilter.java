package _6_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//import Exemplo_6_2.Pessoa;

public class StringFilter {

	public static void main (String[] args){

		// TESTE com STRING
		List<String> list = List.of("a", "", "b", "");
		Iterable<String> notEmpty = select(list, s -> !s.isEmpty());
		
		
		
		
		
		// Imprimir resultados
		notEmpty.forEach(System.out::println);
	}

	// função
	public static Iterable<String> select(Iterable<String> iterable, Predicate<String> pred) {
		List<String> result = new ArrayList<>();
		for (String s : iterable) {
			if (pred.test(s)) {
				result.add(s);
			}
		}
		return result;
	}
}

/*
Explicação:
- Criação da Lista: 
   Uma nova lista result é criada para armazenar os elementos que satisfazem o predicado.

- Iteração e Filtragem:
   A função itera sobre cada elemento s do iterável fornecido.
   Para cada elemento, o predicado pred é aplicado. Se pred.test(s) retornar true, o elemento é 
   adicionado à lista result.

- Retorno: A função retorna a lista result contendo os elementos filtrados.
   
   
Pontos-chave:
- Funcionalidade: A função implementa o padrão de design "filter" de forma clara e concisa.

- Flexibilidade: O uso de Predicate permite aplicar diferentes critérios de filtragem sem 
  modificar a função select.
  
- Eficiência: A complexidade da função é linear em relação ao tamanho do iterável de entrada.


Em resumo:
A função select fornece uma maneira flexível e eficiente de filtrar coleções de strings com base em critérios 
personalizados. É uma ferramenta útil para diversas tarefas de processamento de dados.

*/