package _6_5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//import Exemplo_6_2.Pessoa;

public class GenericFilter {

	public static void main(String[] args) {
		
		// TESTE com STRING
		List<String> strings = List.of("apple", "banana", "cherry");
		Iterable<String> longStrings = select(strings, s -> s.length() > 6);

		// TESTE com INT
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		Iterable<Integer> evenNumbers = select(numbers, n -> n % 2 == 0);

		// Imprimir resultados
		longStrings.forEach(System.out::println);
		evenNumbers.forEach(System.out::println);
	}


	// função
	public static <T> Iterable<T> select(Iterable<T> iterable, Predicate<T> pred) {
		List<T> result = new ArrayList<>();
		for (T element : iterable) {
			if (pred.test(element)) {
				result.add(element);
			}
		}
		return result;
	}
}

/*
Explicação da Implementação:
- Parâmetro de Tipo Genérico T: O uso de <T> indica que a função select é genérica e pode 
    trabalhar com qualquer tipo.

- Iteração e Filtragem: A lógica da iteração e filtragem permanece a mesma, mas agora o tipo do 
    elemento é representado por T.

- Listagem dos Resultados: A lista de resultados também é genérica, utilizando o tipo T.


Vantagens da Versão Genérica:
- Reusabilidade: A função pode ser utilizada com qualquer tipo de objeto, tornando-a mais versátil.

- Tipo Segurança: O compilador garante que o predicado seja aplicado a elementos do tipo correto.

- Expressividade: O uso de genéricos torna o código mais conciso e legível.


Conclusão:
- A versão genérica da função select é uma ferramenta poderosa para filtrar coleções de qualquer 
  tipo de objeto em Java. Ao utilizar genéricos e interfaces funcionais, conseguimos criar código 
  mais flexível, reutilizável e expressivo.


*/