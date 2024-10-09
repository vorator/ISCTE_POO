package Aula;
import java.util.*;

import static java.lang.System.out;

public class Tests {
	public static void main (String args[]){


		// testes 3.1  Não consegui fazer correr o sort logo na inserção == sítio certo


		//		// podemos definir com "new Descending()" class
		//		SortedIntArray sortedArray = new SortedIntArray (new Descending());
		//		
		//		sortedArray.add(1);
		//		sortedArray.add(4);
		//		sortedArray.add(2);
		//		sortedArray.add(8);
		//		
		//		sortedArray.print();
		//		out.println("-----------------------------");
		//		sortedArray.sort();
		//		
		//		sortedArray.print();


		//		//// testes 3.2	 Não consegui inverter para decrescente
		//
		//		//SortedAlunoArray sortedArray = new SortedAlunoArray (new Descending());
		//		ArrayList<Aluno> alunosL = new ArrayList<Aluno>();
		//		alunosL.add(new Aluno(4, "Ana", 2021, 1982));
		//		alunosL.add(new Aluno(3, "Lais", 2021, 1982));
		//		alunosL.add(new Aluno(2, "Bruno", 2021, 1982));
		//		alunosL.add(new Aluno(1, "Jonas", 2021, 1982));
		//		
		//		// comparar por número
		//		out.println("- - - ORDENADOS POR NUMERO - - -");
		//		alunosL.sort(new ComparingNumeroCrescente());
		//		for (Aluno a : alunosL)
		//			out.println(a);
		//		
		//		// compara por nome
		//		out.println("- - - ORDENADOS POR NOME - - -");
		//		alunosL.sort(new ComparingNomeCrescente());
		//		for (Aluno a : alunosL)
		//			out.println(a);
		//				
		//		// compara por ano nascimento (desc)
		//		// desempata por ano matricula (desc)
		//		// desempata por Nome
		//		out.println("- - - ORDENADOS POR NASCIMENTO(D), MATRICULA(D) e NOME - - -");
		//		alunosL.sort(new ComparingBirthD_EnrolD_Name());
		//		for (Aluno a : alunosL)
		//			out.println(a);


		// 		//testes 3.3
		//		// Lista de palavras para filtrar
		//		List<String> palavras = Arrays.asList("carro", "casa", "cachorro", "o", "so", "caneta");
		//
		//	    // Filtrar palavras que começam com o prefixo "ca"
		//	    CriterioDeSelecao<String> criterioPrefixo = new CriterioPrefixo("ca");
		//	    List<String> palavrasComPrefixo = FilterUtil.filterWords(palavras, criterioPrefixo);
		//	    System.out.println("Palavras que começam com 'ca': " + palavrasComPrefixo);  // [carro, casa, cachorro, caneta]
		//
		//	    // Filtrar palavras com tamanho menor que 3
		//	    CriterioDeSelecao<String> criterioTamanho = new CriterioTamanhoMenorQue(3);
		//	    List<String> palavrasMenorQue3 = FilterUtil.filterWords(palavras, criterioTamanho);
		//	    System.out.println("Palavras com menos de 3 caracteres: " + palavrasMenorQue3);  // []


		// 		//testes 3.4
		//		List<String> palavras = Arrays.asList("carro", "casa", "cachorro", "o", "so", "caneta");
		//		out.println(SeparatedBy.separate(palavras,","));
	}
}
