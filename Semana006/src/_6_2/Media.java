package _6_2;

public class Media {

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