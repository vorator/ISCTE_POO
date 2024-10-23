package _6_6;

import java.util.Iterator;

public class GenericClass {

	public class ArrayIterator<T> implements Iterator<T> {
		
		// atributos
		private T[] array;			// vetor de objetos genéricos
		private int posicaoAtual;	// posição no vetor

		// construtor
		public ArrayIterator(T[] array) {	// constroi a estrutura 
			this.array = array;
			this.posicaoAtual = 0;
		}

		@Override
		public boolean hasNext() {
			return posicaoAtual < array.length;
		}

		@Override
		public T next() {
			return array[posicaoAtual++];
		}
	}


	public static void main(String[] args) {
		
		// TESTE com INT
		Integer[] integerArray = {1, 2, 3, 4, 5};
		ArrayIterator<Integer> integerIterator = new GenericClass().new ArrayIterator<>(integerArray);
		while (integerIterator.hasNext()) {
			System.out.println(integerIterator.next());
		}
		
		System.out.println();
		
		
		// TESTE com INT
		String[] stringArray = {"maça", "banana", "laranja", "uvas"};
		ArrayIterator<String> stringIterator = new GenericClass().new ArrayIterator<>(stringArray);
		while (stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
	}
}

/* */
