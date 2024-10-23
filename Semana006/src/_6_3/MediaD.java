package _6_3;

import java.util.Iterator;

public class MediaD {

	public static double average (Iterable<Integer> iterable){

		int count = 0;
		int sum = 0;
		
		Iterator<Integer> iterator = iterable.iterator();
		
		while (iterator.hasNext()) {
			sum += iterator.next();
			count++;
		}
		return (double)sum/count;
	}
}