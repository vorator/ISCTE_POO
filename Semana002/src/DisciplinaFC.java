import static java.lang.System.out;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DisciplinaFC {

	private String nome;
	private String sigla;
	private int capacidade;

	private ArrayList<Inscricao> inscricoes = new ArrayList<>();

	public DisciplinaFC(String pathStudents, String pathDisciplina) {
		this.capacidade = getCapcidadeFile(pathDisciplina);
		this.nome = getDisciplinaName(pathDisciplina);
		this.sigla = getSigla(this.nome);
		inscreverVarios(Aluno.readAlunos(pathStudents));
	}

	
	public DisciplinaFC(String nome, ArrayList<Aluno> alunos, int capacidade) {
		this.nome = nome;
		this.sigla = getSigla(nome);
		this.capacidade = capacidade;
		inscreverVarios(alunos);
	}


	public DisciplinaFC(String nome, String sigla, int capacidade) {
		this.nome = nome;
		this.sigla = sigla;
		this.capacidade = capacidade;
	}

	private String getDisciplinaName() {
		return this.nome;
	}

	private int getDisciplinaCapacidade() {
		return this.capacidade;
	}

	public void inscrever(Aluno aluno) {

		if (inscricoes.size() < capacidade) {
			Inscricao insc = new Inscricao(aluno);
			inscricoes.add(insc);	
		}
		else
			System.err.println("O aluno " + aluno + " já não tem espaço em " + sigla + "...");
	}

	public void desinscrever(int numeroAluno){
		Inscricao inscricaoEncontrada = null;
		for (Inscricao a : inscricoes) 
			if (a.getAluno().getNumero() == numeroAluno) 		
				inscricaoEncontrada = a;

		inscricoes.remove(inscricaoEncontrada);

	}

	public void printDisciplina(){
		out.println(nome + " " + sigla + " " + capacidade);
		for (Inscricao d: inscricoes) System.out.println(d);
	}



	public void getAverage() {
		int i = 0;
		int sum = 0;
		for (Inscricao a : inscricoes) {
			if(a.temNota()){
				i++;
				sum += a.getNota();
			}
		}
		if(i !=0)
			out.println("A média é: " + sum/i);
		else
			out.println("Não existem notas");
	}

	public void bestGrades() {
		int best = 0;
		for (Inscricao a : inscricoes) {
			if(a.temNota())
				if(best < a.getNota())
					best = a.getNota();
		}
		for (Inscricao a : inscricoes) {
			if(a.getNota()== best)
				out.println(a);
		}
	}

	public void darNota(int numeroAluno , int nota) {	

		Inscricao inscricaoEncontrada = null;
		for (Inscricao a : inscricoes) {
			if ((a.getAluno().getNumero()) == numeroAluno){		
				a.setNota(nota);
				inscricaoEncontrada = a;  // testar SEM !!!
				break;
			}

		}

		if (inscricaoEncontrada == null) {
			System.out.println("Aluno com número " + numeroAluno + " não encontrado.");
		}
	}

	public boolean temNota(int numeroAluno) {
		for (Inscricao a : inscricoes) {
			if (a.getAluno().getNumero() == numeroAluno) 		

				return a.temNota();;
		}

		return false;		  
	}

	public int getNota(int numeroAluno) {
		for (Inscricao inscricao : inscricoes) {
			// Verifica se o número do aluno corresponde ao número procurado
			if (inscricao.getAluno().getNumero() == numeroAluno) {
				// Retorna a nota do aluno (pode ser NA se não tiver nota)
				return inscricao.getNota();
			}
		}
		// Se o aluno não for encontrado, retorna NA (ou outro valor de erro)
		return -1;
	}

	// 2.3
	private String getSigla(String s) {

		//divide as partes com espaco
		String[] tokens = s.split(" ");
		String sigla = new String();
		for(String palavra : tokens) {
			if(!palavra.isEmpty() && palavra.length() > 4)
				sigla = sigla.concat(String.valueOf(palavra.charAt(0)));

		}

		return sigla.toUpperCase();
	}

	public void inscreverVarios(ArrayList<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			inscrever(aluno);  // Usando a função já existente para inscrever cada aluno
		}
	}

	public void writeNotaToFile() {
		try {
			PrintWriter writer = new PrintWriter(new File("teste.txt"));
			writer.println(getDisciplinaName());
			writer.println(getDisciplinaCapacidade());
			for(Inscricao a : inscricoes) {

				writer.println(a.getAluno().getNumero() + " " + (a.getNota() == -1 ? "NA" : a.getNota()));
			}	
			writer.close();
		}
		catch(FileNotFoundException e){
			System.err.println("problema a escrever o ficheiro");
		}

	}

	public static String getDisciplinaName(String path) {
		String nome= new String();
		try {
			Scanner s = new Scanner(new File(path));
			if (s.hasNextLine()) {
				nome = s.nextLine(); // Armazena o nome da disciplina

			}
			s.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		return nome;
	}

	public static int getCapcidadeFile(String path) {
		int capacidade1 = -1;
		try {
			Scanner s = new Scanner(new File(path));
			s.nextLine();
			if (s.hasNextLine()) {
				String linhaCapacidade = s.nextLine(); // Armazena o nome da disciplina
				capacidade1 = Integer.parseInt(linhaCapacidade);

			}
			s.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

		return capacidade1;
	}

	public static int getNotasFile(String path) {
		int capacidade1 = -1;
		try {
			Scanner s = new Scanner(new File(path));
			s.nextLine();
			if (s.hasNextLine()) {
				String linhaCapacidade = s.nextLine(); // Armazena o nome da disciplina
				capacidade1 = Integer.parseInt(linhaCapacidade);

			}
			s.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return capacidade1;
	}

	@Override
	public String toString() {

		String aux = nome + " (" + sigla + ") - cap: " + capacidade + "\n";

		for (Inscricao insc : inscricoes)
			aux += insc + "\n";

		return aux;
	}







}
