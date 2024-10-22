package _6_3;

import java.util.Iterator;

public class Interval {
	
	// atributos
	private final int min;
	private final int max;
	
	// contrutor
	public Interval (int min, int max){
		this.min = min;
		this.max = max;
	}
	
	
	
	private class IntervalIterator implements Iterator<Integer>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
