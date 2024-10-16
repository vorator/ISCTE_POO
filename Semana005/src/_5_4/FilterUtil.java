package _5_4;
import java.util.*;

public class FilterUtil {
	
	 public static List<String> filterWords(List<String> list, CriterioDeSelecao<String> criterio) {
	        List<String> filtered = new ArrayList<>();
	        for (String word : list) {
	            if (criterio.cumpreOCriterio(word)) {
	                filtered.add(word);
	            }
	        }
	        return filtered;
	    }

}
