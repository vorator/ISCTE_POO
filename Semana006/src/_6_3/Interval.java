package _6_3;

import java.util.Iterator;

public class Interval {

// PONTO 6.3a
	
	// atributos
	private final Integer min;
	private final Integer max;

	// contrutor intervalo vazio considerando que o par 0,0 é um intervalo vazio 
	public Interval(){
		this.min = null;
		this.max = null;
		System.out.print("Intervalo vazio -> ");
	}
	

	// contrutor intervalo dois inteiros
	public Interval (Integer min, Integer max){
		this.min = min;
		this.max = max;
		if (min == null && max == null) {
			System.out.print("Intervalo vazio -> ");
		}
	}

	// auxiliares
	// calcula o tamanho do intervalo
	private int size() {
		return isEmpty() ? 0 : max - min + 1; // se true, retorna zero, senão maximo menos o mínimo + 1
	}
	
	// verifica se está vazio
	private boolean isEmpty() {
		return min == null && max == null;
	}

	// criar intervalo dado o máximo
	public static Interval naturals (int max){ // naturais começam no 1, invoca o construtor com 1 e número dado
		return new Interval(1, max);
	}

	// criar intervalo dado um array
	public static Interval ArrayIndexes(int[] i){ // começa o 0, invoca o construtor com 0 e tamanho do vetor - 1 (index do array)
		return new Interval(0, i.length - 1);
	}

	// criar intervalo vazio
	public static Interval empty(){ // cria um intervalo vazio
		return new Interval();
	}

	@Override
	public String toString() {
		return "Interval [" + min + " , " + max + "]";
	}

// PONTO 6.3b
	// Classe interna
	private class IntervalIterator implements Iterator<Integer> {
        
		private int current;

        public IntervalIterator() { // começa a iterar no minimo
            current = min;
        }

        @Override
        public boolean hasNext() {	// true enquanto o atual é menor ou igual que o máximo
            return current <= max;
        }

        @Override
        public Integer next() {
            return current++; 		// incrementa o atual
        }
    }
	
	// método para instanciar um objeto iterador de Integers
    public Iterator<Integer> iterator() {
        return new IntervalIterator();
    }
}