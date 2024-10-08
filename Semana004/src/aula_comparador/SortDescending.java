package aula_comparador;

public class SortDescending extends Sorter {

	@Override
	public boolean isBefore(int a, int b){
		return a > b;
	}
}
