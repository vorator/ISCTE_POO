package _6_3;

import java.util.Iterator;

public class IntervalC implements Iterable<Integer>{

// PONTO 6.3c	
	
	// atributos
	private final Integer min;
	private final Integer max;

	// contrutor intervalo vazio
	public IntervalC(){
		this.min = null;
		this.max = null;
		System.out.print("Intervalo vazio -> ");
	}
	
	// contrutor intervalo dois inteiros
	public IntervalC (Integer min, Integer max){
		this.min = min;
		this.max = max;
		if (min == null && max == null) {
			System.out.print("Intervalo vazio -> ");
		}
	}

	// auxiliares
	// calcula o tamanho do intervalo
	private int size() {
		return isEmpty() ? 0 : max - min + 1;
	}
	// verifica se está vazio
	private boolean isEmpty() {
		return min == null && max == null;
	}

	// criar intervalo dado o máximo
	public static IntervalC naturals (int max){
		return new IntervalC(1, max);
	}

	// criar intervalo dado um array
	public static IntervalC ArrayIndexes(int[] i){
		return new IntervalC(0, i.length - 1);
	}

	// criar intervalo vazio
	public static IntervalC empty(){ // cria um intervalo vazio
		return new IntervalC();
	}

	@Override
	public String toString() {
		return "Interval [" + min + " , " + max + "]";
	}


	private class IntervalIterator implements Iterator<Integer> {
        private int current;

        public IntervalIterator() {
            current = min;
        }

        @Override
        public boolean hasNext() {
            return current <= max;
        }

        @Override
        public Integer next() {
            return current++; 
        }
    }

    public Iterator<Integer> iterator() {
        return new IntervalIterator();
    }
}