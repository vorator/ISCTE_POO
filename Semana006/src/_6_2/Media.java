package _6_2;

public class Media {
	// função que recebe um objeto iterável de Integers
	public static double average (Iterable<Integer> iterable){

		int count = 0;
		int sum = 0;
		// por cada int no objeto iterável "iterable", soma ao anterior em sum e incrementa count
		for (int number : iterable) {
			count++;
			sum += number;
		}
		return (double)sum/count; // devolve a média como double
	}
}