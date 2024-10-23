package _6_3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Teste {

	public static void main(String[] args){


		// teste 6.3a
		Interval test = new Interval(0, 10);				System.out.println(test.toString());
		Interval nat = Interval.naturals(10);				System.out.println(nat.toString());
		Interval index = Interval.ArrayIndexes(new int[5]);	System.out.println(index.toString());
		Interval empty = Interval.empty();					System.out.println(empty.toString());	


		// teste 6.3c)
		IntervalC testC = new IntervalC(0, 10);
		Interval t2 = new Interval(5, 7);
		for (Integer i : testC) {
			System.out.println(i);
		}


		// teste 6.4d
		// ArrayList
		ArrayList<Integer> aL = new ArrayList<>();
		aL.add(11);
		aL.add(22);
		aL.add(33);
		aL.add(44);
		System.out.println("Media do ArrayList: " + MediaD.average(aL));

		// LinkedList
		LinkedList<Integer> lL = new LinkedList<>();
		lL.add(111);
		lL.add(222);
		lL.add(333);
		lL.add(444);
		System.out.println("Media do LinkedList: " + MediaD.average(lL));	

		IntervalC interval = new IntervalC(1, 5);
		System.out.println("Média Interval: " + MediaD.average(interval));

	}
}
