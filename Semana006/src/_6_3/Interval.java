package _6_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Interval {

// PONTO 6.3a
	
	// atributos
	private final int min;
	private final int max;

	// contrutor intervalo dois inteiros
	public Interval (int min, int max){
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
	public static Interval naturals (int max){
		return new Interval(1, max);
	}

	// criar intervalo dado um array
	public static Interval ArrayIndexes(int[] i){
		return new Interval(0, i.length - 1);
	}

	// criar intervalo vazio
	public static Interval empty(){
		return new Interval(0,0);
	}

	@Override
	public String toString() {
		return "Interval [" + min + " , " + max + "]";
	}

// PONTO 6.3b
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

