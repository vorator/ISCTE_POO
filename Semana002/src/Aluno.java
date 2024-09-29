import static java.lang.System.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

	private String nome;
	private int numero;
	
	public Aluno(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	public static ArrayList<Aluno> readAlunos(String path){
		ArrayList<Aluno> alunos = new ArrayList<>();

		try{
			Scanner s = new Scanner(new File(path));

			while (s.hasNextLine()){
				String line = s.nextLine();
				String[] tokens = line.split (" ", 2 );
				int numero = Integer.parseInt(tokens[0]);
				String nome = tokens[1];
				Aluno a = new Aluno (nome, numero);
			}
			s.close();

		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		return alunos;
	}
	
	@Override
	public String toString() {
		return numero + ": " + nome;
	}
	
	
	
	
}
