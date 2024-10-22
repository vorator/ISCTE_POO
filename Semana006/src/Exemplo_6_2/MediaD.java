package Exemplo_6_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import _6_3.IntervalC;

public class MediaD {

	public static void main (String[] args){
		// ArrayList
		ArrayList<Integer> aL = new ArrayList<>();
		aL.add(11);
		aL.add(22);
		aL.add(33);
		aL.add(44);
		System.out.println("Media do ArrayList: " + average(aL));

		// LinkedList
		LinkedList<Integer> lL = new LinkedList<>();
		lL.add(111);
		lL.add(222);
		lL.add(333);
		lL.add(444);
		System.out.println("Media do LinkedList: " + average(lL));	

		IntervalC interval = new IntervalC(1, 5);
		System.out.println("Média Interval: " + average(interval));

	}

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



