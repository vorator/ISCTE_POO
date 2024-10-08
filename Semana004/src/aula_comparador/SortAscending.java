package aula_comparador;

public class SortAscending extends Sorter {
	
	@Override
	public boolean isBefore(int a, int b){
		return a < b;
	}
}
