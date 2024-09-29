import static java.lang.System.out;
import java.util.*;

public class Base {

	public static void main (String[] args){

		// 1.1

		for(int i = 0; i < args.length; i++){
			out.println(i + ": " + args[i]);

			if (isInteger(args[i])){
				out.println("---: represents an integer (" + makeInt(args[i]) + ")");
			}
		}
	}	

	public static boolean isInteger(String s){
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) < '0' || s.charAt(i) > '9')
				return false;
		}
		return true;
	}

	public static int makeInt(String s){
		int number = 0;

		for (int i = 0; i < s.length(); i++){
			number*= 10;
			number+= (s.charAt(i) - '0');
		}

		return number;
	}
	
	public static int charToInt(char c){
		return c - '0';
	}
}