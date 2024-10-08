package aula_comparador;

public class Teste {
	public static void main(String[] args ){
		int[] v = {13,2,57,3,6,90,5,8,10};
		
		System.out.println("---- Nao ordenado ----");
		showVector(v);
		
		System.out.println("---- Ordem crescente ----");
		Sorter sortA = new SortAscending();
		sortA.sort(v);
		showVector(v);
		
		System.out.println("---- Ordem decrescente ----");
		Sorter sortD = new SortDescending();
		sortD.sort(v);
		showVector(v);
		
	}
	
	static void showVector(int[] v){
		
		for (int number : v)
			System.out.print(" - " + number + " -");
		
		System.out.println();
		System.out.println();
	}
	
}
