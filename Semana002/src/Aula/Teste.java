package Aula;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class Teste {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Zé", 111);
		Aluno a2 = new Aluno("Ana", 222);
		Aluno a3 = new Aluno("Rui", 333);
		Aluno a4 = new Aluno("Inês", 444);
		
		// teste inscrever aluno
//		Disciplina poo = new Disciplina("Programacao Orientada para Objetos", "POO", 4);
//		poo.inscrever(a1);
//		poo.inscrever(a2);
//		poo.inscrever(a3);
//		poo.inscrever(a4);
		
		// teste de inscrever aluno
//		System.out.println(poo);		
//		poo.desinscrever(111);
//		System.out.println(poo);
		
		// teste atribuir nota
//		poo.atribuirNota(111, 20);
//		poo.atribuirNota(222, 20);
//		poo.atribuirNota(333, 10);
//		poo.atribuirNota(444, 10);
//		System.out.println(poo);
		
		// teste se tem nota
//		System.out.println(poo.temNota(111));
		
		// teste obter nota
//		poo.obterNota(111);
		
		// imprimir disciplina
//		poo.printDisciplina();
	
		// saber a nota média
//		poo.getAverage();
		
		// saber os alunos com melhor nota
//		poo.bestGrades();
		
		//obter sigla da disciplina
//		out.println(poo.getSigla("Teoria Da Computação"));
		
		// criar disciplica com alunos em lista
//		ArrayList<Aluno> inscricoes = new ArrayList<>();
//		inscricoes.add(a1);
//		inscricoes.add(a2);
//		inscricoes.add(a3);
//		inscricoes.add(a4);
//		Disciplina bd = new Disciplina("Bases de Dados", 40, inscricoes);
//		bd.printDisciplina();
		
		//criar disciplina com aluno em ficheiro
//		Disciplina bd = new Disciplina("Bases de Dados", 40, "estudantes.txt");
//		bd.printDisciplina();
		
		// escrever notas para um ficheiro
//		poo.writeNotaToFile();
		
		// criar disciplina por ficheiros
//		Disciplina poo = new Disciplina("estudantes.txt", "DisciplinaSolo.txt");
//		poo.printDisciplina();
	}	
}






