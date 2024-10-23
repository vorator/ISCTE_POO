package _6_6;

import java.util.Iterator;

public class GenericClass {

	public class ArrayIterator<T> implements Iterator<T> {
		
		// atributos
		private T[] array;
		private int posicaoAtual;

		// construtor
		public ArrayIterator(T[] array) {
			this.array = array;
			this.posicaoAtual = 0;
		}

		@Override
		public boolean hasNext() {
			return posicaoAtual < array.length;
		}

		@Override
		public T next() {
//			if (!hasNext()) {
//				throw new IndexOutOfBoundsException();
//			}
			return array[posicaoAtual++];
		}
	}


	public static void main(String[] args) {
		
		// TESTE com INT
		Integer[] integerArray = {1, 2, 3, 4, 5};
		GenericClass.ArrayIterator<Integer> integerIterator = new GenericClass().new ArrayIterator<>(integerArray);
		while (integerIterator.hasNext()) {
			System.out.println(integerIterator.next());
		}
		
		System.out.println();
		
		
		// TESTE com INT
		String[] stringArray = {"apple", "banana", "orange", "grape"};
		GenericClass.ArrayIterator<String> stringIterator = new GenericClass().new ArrayIterator<>(stringArray);
		while (stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
	}
}

/*

Explicação:
- Genericidade: O uso de <T> torna a classe genérica, permitindo que ela trabalhe com qualquer tipo de objeto.


Atributos:
- array: Armazena o vetor de objetos que será iterado.
- currentIndex: Mantém o índice do próximo elemento a ser retornado.
- Construtor: Inicializa os atributos com o vetor fornecido e seta o índice inicial para 0.
- hasNext(): Retorna true se ainda houver elementos a serem iterados, ou seja, se o índice atual for menor que o tamanho do vetor.
- next(): Retorna o próximo elemento do vetor e incrementa o índice. Se não houver mais elementos, lança uma IndexOutOfBoundsException.


Características:
- Flexibilidade: Pode ser utilizado com qualquer tipo de vetor de objetos.
- Simplicidade: Implementa a interface Iterator de forma clara e concisa.
- Eficiência: A iteração é feita diretamente sobre o vetor, sem criar cópias.
- Tratamento de Erros: Lança IndexOutOfBoundsException quando se tenta acessar um elemento além do final do vetor.


Considerações Adicionais:
- Remoção: A interface Iterator define o método remove(), que não é implementado nesta classe. Se a remoção de elementos durante a iteração for necessária, essa funcionalidade pode ser adicionada.
- Fail-Fast Iterator: Esta implementação é um fail-fast iterator, o que significa que se o conteúdo do vetor for modificado durante a iteração, uma ConcurrentModificationException pode ser lançada.


Outras Interfaces: 
- A classe poderia implementar outras interfaces como Iterable para permitir o uso de estruturas como for-each.


Conclusão:
- A classe ArrayIterator fornece uma maneira eficiente e flexível de iterar sobre vetores de objetos em Java. Sua implementação genérica permite que ela seja utilizada com diversos tipos de dados, tornando-a uma ferramenta útil em diversas situações.

 */
