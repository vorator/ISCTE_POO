package Aula;
import java.util.ArrayList;
import static java.lang.System.out;

public class SortedAlunoArray {
	
	
	// atributos
	private ArrayList<Aluno> array;
	private SortingPolicy policy;
	
	
	// construtor
	public SortedAlunoArray(SortingPolicy policy){
		this.array = new ArrayList<Aluno>();
		this.policy = policy;
	}
	
	
	// obter o tamanho
	public int size(){
		return array.size();
	}
	
	
	// adicionar elemento
	public void add (Aluno element){
	//	if (array.size() == 0)
			array.add(element);
	//	else
	//		sort(array, this.policy);
	}
	
	
//	// obter elemento
//	public int get (Aluno a){
//		return array(a.getNumero());	
//	}
//	
//	
//	// definir elemento
//	public void set (int index, int value){
//		array.set(index, value);
//	}
//	
//	
//	// imprimir todo o array
//	public void print(){
//		for (Integer a : array)
//			out.println(a);
//	}
//	
//	// ordenar segundo uma política
//	public void sort (){
//		for (int i = 0; i <= array.size()-1; i++){
//			for (int j = 1; j <= array.size()-1; j++){
//				if (policy.isBefore(array.get(j), array.get(j-1))){
//					int aux = array.get(j-1);
//					array.set(j-1, array.get(j));
//					array.set(j, aux);
//				}
//			}
//		} 
//	}
	
}
