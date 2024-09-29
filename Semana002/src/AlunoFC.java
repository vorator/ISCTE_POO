import static java.lang.System.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoFC {

	private String nome;
	private int numero;
	
	public AlunoFC(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	
	public static  ArrayList<AlunoFC> readAlunos(String path) {
		ArrayList<AlunoFC> alunos = new ArrayList<>();
		try {
			Scanner s = new Scanner(new File(path));
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] tokens = line.split(" ",2);
				 if (tokens.length < 2) {
		                System.out.println("Formato inválido: " + line); // Mensagem se o formato estiver incorreto
		                continue; // Pula para a próxima linha
		         }
				int numero = Integer.parseInt(tokens[0]);
				String nome = tokens [1];
				AlunoFC a = new AlunoFC(nome, numero);
	            alunos.add(a); // Adiciona o aluno à lista
			}
			s.close();

			} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		return alunos;
	}
	

	
	@Override
	public String toString() {
		return numero + ": " + nome;
	}	
}	

	
	
	
	
	

