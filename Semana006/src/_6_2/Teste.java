package _6_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Teste {

	public static void main (String[] args){

		// ArrayList
		ArrayList<Integer> aL = new ArrayList<>();
		aL.add(11);
		aL.add(22);
		aL.add(33);
		aL.add(44);
		System.out.println("Media do ArrayList: " + Media.average(aL));

		// LinkedList
		LinkedList<Integer> lL = new LinkedList<>();
		lL.add(111);
		lL.add(222);
		lL.add(333);
		lL.add(444);
		System.out.println("Media do LinkedList: " + Media.average(lL));	
	}
}