package _5_2;

// Exerc. 5.2 - codigo base

public class Teste {

	public static void main(String[] args) {
				
		Time t0 = new Time(45,30);
		Time t1 = new Time("30:45");
		Time t2 = new Time(0,1);

//		System.out.println(t0.getMinutes());
//		System.out.println(t0.getSeconds());
//		System.out.println(t0.getTotalSeconds());
		
		System.out.println("t0: " + t0);  						// 45:30
		System.out.println("t1: " + t1);						// 30:45
		System.out.println("t0+t1: " + t0.add(t1));				// 76:15
		System.out.println("t1-t0: " + t0.sub(t1));				// 14:45
		System.out.println("t1>t0?: " + t1.isGreaterThan(t0));  // false
		System.out.println("t1<t0?: " + t1.isLessThan(t0));	    // true
	}		
}
