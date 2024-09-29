import java.io.File;
import static java.lang.System.out;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteFC {


	public static void main(String[] args) {

		 ArrayList<Aluno> alunoso = Aluno.readAlunos("D:\\franc\\OneDrive\\Ambiente de Trabalho\\Poo\\Estudantes.txt");
	      
	        
		 ArrayList<Aluno> alunos = new ArrayList<>();
	        alunos.add(new Aluno("João", 1));
	        alunos.add(new Aluno("Maria", 2));
	        alunos.add(new Aluno("Carlos", 3));
	        Aluno a1 = new Aluno("Zé", 111);
	       
	    Disciplina d1 = new Disciplina("D:\\franc\\OneDrive\\Ambiente de Trabalho\\Poo\\Estudantes.txt", "C:\\Users\\franc\\eclipse-workspace\\Semana002\\teste.txt");
	        
			
			d1.printDisciplina();
		
//		Aluno a2 = new Aluno("Ana", 222);
//		Aluno a3 = new Aluno("Rui", 333);
//		Aluno a4 = new Aluno("Inês", 444);
//		Disciplina poo = new Disciplina("Programacao Orientada para Objetos", "POO", 4);
//		
//		poo.inscrever(a1);
//		poo.inscrever(a2);
//		poo.inscrever(a3);
//		poo.inscrever(a4);
//		System.out.println(poo);
//		poo.desinscrever(111);
//		System.out.println(poo);
//		Disciplina bd = new Disciplina("Bases de Dados", "BD", 4);
//		bd.inscrever(a4);
//		bd.inscrever(a1);
//		System.out.println(bd);
	
	}
}






