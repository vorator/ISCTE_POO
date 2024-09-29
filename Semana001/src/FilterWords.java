import java.util.Scanner;
import static java.lang.System.out;

public class FilterWords {

	private static String[] filter;
	
	public static void main(String[] filteredWords){
		filter = filteredWords;
		Scanner sc = new Scanner(System.in);
		
		String[] words = sc.nextLine().split(" ");
		
		for (int i = 0; i < words.length; i++){
			if (isFilteredWord(words[i]))
					out.print(words[i] + " ");
			
			out.println("");
		}
	}
	
	private static boolean isFilteredWord(String w){
		for (int i = 0; i < filter.length; i++) {
			if(filter[i].equals(w))
				return true;
		}
		return false;
	}
}
