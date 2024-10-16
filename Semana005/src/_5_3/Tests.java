package _5_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import Exemplo_5_3.Pessoa;

import static java.lang.System.out;

public class Tests {
	public static void main (String args[]){


		//// testes 3.2	 Não consegui inverter para decrescente

		//SortedAlunoArray sortedArray = new SortedAlunoArray (new Descending());
		ArrayList<Aluno> alunosL = new ArrayList<Aluno>();
		alunosL.add(new Aluno(4, "Ana", 2021, 1982));
		alunosL.add(new Aluno(3, "Lais", 2021, 1982));
		alunosL.add(new Aluno(2, "Bruno", 2021, 1982));
		alunosL.add(new Aluno(1, "Jonas", 2021, 1982));

		// 5_3 
		// Ordenar com expressão lambda por número 
		alunosL.sort( (a1, a2) -> a1.getNumero() - a2.getNumero() );
		show(alunosL);
		
		//Ordenar com expressão lambda por nome;
//		Collections.sort(alunosL, (a1, a2) -> a1.compareTo(a2));
		show(alunosL);
	}


	static void show(List<Aluno> lista) {
		for (Aluno p : lista)
			System.out.println(p);
	}
}
