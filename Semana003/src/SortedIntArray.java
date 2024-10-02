import java.util.ArrayList;
import static java.lang.System.out;

public class SortedIntArray {


	// atributos
	private ArrayList<Integer> array;
	private SortingPolicy policy;


	// construtor
	public SortedIntArray(SortingPolicy policy){
		this.array = new ArrayList<Integer>();
		this.policy = policy;
	}


	// obter o tamanho
	public int size(){
		return array.size();
	}


	// adicionar elemento
	public void add(int element) {
		int i = 0;
		// Encontra a posição correta para inserir o elemento de acordo com a política
		while (i < array.size() && !policy.isBefore(element, array.get(i))) {
			i++;
		}
		array.add(i, element);  // Adiciona o elemento na posição correta
	}


	// obter element
	public int get (int index){
		return array.get(index);	
	}


	// definir elemento
	public void set (int index, int value){
		array.set(index, value);
	}


	// imprimir todo o array
	public void print(){
		for (Integer a : array)
			out.println(a);
	}

	// ordenar segundo uma política
	public void sort (){
		for (int i = 0; i <= array.size()-1; i++){
			for (int j = 1; j <= array.size()-1; j++){
				if (policy.isBefore(array.get(j), array.get(j-1))){
					int aux = array.get(j-1);
					array.set(j-1, array.get(j));
					array.set(j, aux);
				}
			}
		} 
	}

}
