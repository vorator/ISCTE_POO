package aula_comparador;

public abstract class Sorter {
	
	public void sort (int[] v){
		
		for (int i = 0; i < v.length; i++){
			for (int j = 1; j < v.length-i; j++){
				if(isBefore(v[j], v[j-1])){
					int temp = v[j-1];
					v[j-1] = v[j];
					v[j] = temp;
				}
			}
		}
	}
	
	public abstract boolean isBefore(int a, int b);
	
}
