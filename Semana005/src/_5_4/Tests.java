package _5_4;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Tests {
	public static void main (String args[]){



		//testes 5_4
		// Lista de palavras para filtrar
		List<String> palavras = Arrays.asList("carro", "casa", "cachorro", "o", "so", "caneta");
		
		// filtrar por prefixo
		List<String> prefixoCA = palavras.stream().filter(p -> p.startsWith("ca")).collect(Collectors.toList());
		System.out.println("Palavras que começam com 'ca': " + prefixoCA);
		
		// filtrar por tamanho
		List<String> palavrasMenorQue3 = palavras.stream().filter(p -> p.length() < 3).collect(Collectors.toList());
		System.out.println("Palavras com menos de 3 caracteres: " + palavrasMenorQue3);
		
	}
}
