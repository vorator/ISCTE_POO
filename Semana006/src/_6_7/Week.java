package _6_7;

import java.util.Iterator;

public class Week implements Iterable<String> {
    
	// array de String com valores imutáveis
	private static final String[] DAYS_OF_WEEK = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
    
	// atributo
	private final WeekDayIterator iterator ;

	// construtor
    public Week() {
        this.iterator = new WeekDayIterator();
    }

    
    public Iterator<String> iterator() { 
        return iterator;					// O método retorna o iterador para permitir o uso do for-each loop
    }

    private class WeekDayIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < DAYS_OF_WEEK.length;
        }

        @Override
        public String next() {
            return DAYS_OF_WEEK[index++];
        }
    }
}

/* */