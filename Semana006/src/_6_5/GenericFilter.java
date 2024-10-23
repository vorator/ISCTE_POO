package _6_5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//import Exemplo_6_2.Pessoa;

public class GenericFilter {

	public static void main(String[] args) {
		
		// TESTE com STRING
//		List<String> strings = List.of("livro", "dado", "caneta");
//		Iterable<String> stringsLongas = select(strings, s -> s.length() > 6);
//		stringsLongas.forEach(p -> System.out.println(p));

		
		// TESTE com INT
//		List<Integer> num = List.of(1, 2, 3, 4, 5);
//		Iterable<Integer> numPares = select(num, n -> n % 2 == 0);
//		numPares.forEach(p -> System.out.println(p));
	}


	// Função genérica (String substituídos por <T>)
	public static <T> Iterable<T> select(Iterable<T> iterable, Predicate<T> pred) {
		List<T> resultado = new ArrayList<>();
		for (T s : iterable) {
			if (pred.test(s)) {
				resultado.add(s);
			}
		}
		return resultado;
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