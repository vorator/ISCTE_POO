package _6_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntervalC implements Iterable<Integer>{

// PONTO 6.3c	
	
	// atributos
	private final int min;
	private final int max;

	// contrutor intervalo dois inteiros
	public IntervalC (int min, int max){
		this.min = min;
		this.max = max;
		if (min == 0 && max == 0) {
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
		return min > max;
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
	public static IntervalC empty(){
		return new IntervalC(0,0);
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
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return current++; 
        }
    }

    public Iterator<Integer> iterator() {
        return new IntervalIterator();
    }
}

