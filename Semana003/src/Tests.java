import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.out;

public class Tests {
	public static void main (String args[]){
		
		
//// testes 3.1  Não consegui fazer correr o sort logo na inserção == sítio certo
//	
//
//		// podemos definir com "new Descending()" class
//		SortedIntArray sortedArray = new SortedIntArray (new Ascending());
//		
//		sortedArray.add(1);
//		sortedArray.add(4);
//		sortedArray.add(2);
//		sortedArray.add(8);
//		
//		sortedArray.print();
//		
//		//tests
//		//out.println(sortedArray.size());
//		//out.println(sortedArray.get(0));
//		
//		sortedArray.sort();
//		
//		sortedArray.print();
		
		
//// testes 3.2	 Não consegui inverter para decrescente
	
		//SortedAlunoArray sortedArray = new SortedAlunoArray (new Descending());
		ArrayList<Aluno> alunosL = new ArrayList<Aluno>();
		alunosL.add(new Aluno(4, "Ana", 2025, 1982));
		alunosL.add(new Aluno(3, "Lais", 2024, 1999));
		alunosL.add(new Aluno(2, "Bruno", 2023, 1987));
		alunosL.add(new Aluno(1, "Jonas", 2025, 1982));
		
		// comparar por número
		out.println("- - - ORDENADOS POR NUMERO - - -");
		alunosL.sort(new ComparingNumber());
		for (Aluno a : alunosL)
			out.println(a);
		
		// compara por nome
		out.println("- - - ORDENADOS POR NOME - - -");
		alunosL.sort(new ComparingName());
		for (Aluno a : alunosL)
			out.println(a);
		
		// compara por ano nascimento (desc)
		// desempata por ano matricula (desc)
		// desempata por Nome
		out.println("- - - ORDENADOS POR NASCIMENTO(D), MATRICULA(D) e NOME - - -");
		alunosL.sort(new ComparingBithEnrolName());
		for (Aluno a : alunosL)
			out.println(a);
	} 
	
	
	
}
