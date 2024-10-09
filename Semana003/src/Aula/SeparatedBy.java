package Aula;
import java.util.*;
import static java.lang.System.out;

public class SeparatedBy {
	
	public static String separate(List<String> l , String separador){
		String resultado = new String();
		for(String a : l) {
			
			resultado= resultado.concat(a);
			if(a != l.getLast() ) {
			resultado = resultado.concat(separador);
			}
		
		}
		return resultado;
	}

}
