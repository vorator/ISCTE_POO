package _6_3;

public class Teste {

	public static void main(String[] args){
		
		
		// teste a)
		Interval test = new Interval(0, 10);				System.out.println(test.toString());
		Interval nat = Interval.naturals(10);				System.out.println(nat.toString());
		Interval index = Interval.ArrayIndexes(new int[5]);	System.out.println(index.toString());
		Interval empty = Interval.empty();					System.out.println(empty.toString());	
	
		// teste b) 
		//for(Integer t1 : test){
		//	
		//}
		
		
		// test c)
		IntervalC testC = new IntervalC(0, 10);
		Interval t2 = new Interval(5, 7);
		for (Integer i : testC) {
		    System.out.println(i);
		}
	
		
	
	
	}
}
