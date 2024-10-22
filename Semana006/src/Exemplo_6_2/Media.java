package Exemplo_6_2;

import java.util.ArrayList;
import java.util.LinkedList;

import _6_3.Interval;

public class Media {

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
	
	
	}

	public static double average (Iterable<Integer> iterable){

		int count = 0;
		int sum = 0;
		for (int number : iterable) {
			count++;
			sum += number;
		}

		return (double)sum/count;
	}
}

