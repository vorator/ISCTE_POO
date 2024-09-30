import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Disciplina {

	private String nome;
	private String sigla;
	private int capacidade;

	private ArrayList<Inscricao> inscricoes = new ArrayList<>();

	public Disciplina(String nome, String sigla, int capacidade) {
		this.nome = nome;
		this.sigla = sigla;
		this.capacidade = capacidade;
	}

	// construtor para 2.3 com ArrayList
	public Disciplina(String nome, int capacidade, ArrayList<Aluno> alunos) {
		this.nome = nome;
		this.sigla = getSigla(nome);
		this.capacidade = capacidade;
		inscreverVarios(alunos);
	}
	
	// construtor para 2.3 com Ficheiro
	public Disciplina(String nome, int capacidade, String path) {
		this.nome = nome;
		this.sigla = getSigla(nome);
		this.capacidade = capacidade;
		inscreverVarios(Aluno.readAlunos(path));
	}

	// construtor para 2.5
	public Disciplina(String pathStudents, String pathDisciplina) {
		this.capacidade = getCapacidadeFile(pathDisciplina);
		this.nome = getDisciplinaName(pathDisciplina);
		this.sigla = getSigla(this.nome);
		inscreverVarios(Aluno.readAlunos(pathStudents));
	}

	private String getDisciplinaName() {
		return this.nome;
	}

	private int getDisciplinaCapacidade() {
		return this.capacidade;
	}

	// 2.1a Inscrever aluno
	public void inscrever(Aluno aluno) {

		if (inscricoes.size() < capacidade) {
			Inscricao insc = new Inscricao(aluno);
			inscricoes.add(insc);	
		}
		else
			System.err.println("O aluno " + aluno + " já não tem espaço em " + sigla + "...");
	}

	// 2.1b Desinscrever aluno
	public void desinscrever(int numeroAluno){
		Inscricao i = null;
		for (Inscricao a : inscricoes){
			if (a.getAluno().getNumero() == numeroAluno)
				i = a;
		}
		inscricoes.remove(i);
	}

	// 2.1c atribuir nota
	public void atribuirNota (int numeroAluno, int notaAtribuida){
		Inscricao i = null;
		for (Inscricao a : inscricoes){
			if (a.getAluno().getNumero() == numeroAluno){
				a.setNota(notaAtribuida);
				return;
			}
		} 
		out.println("Aluno não encontrado!");
	}

	// 2.1d saber se tem nota
	public boolean temNota(int numeroAluno) {
		for (Inscricao a : inscricoes) {
			if (a.getAluno().getNumero() == numeroAluno) 		
				return a.temNota();;
		}
		return false;		  
	}

	// 2.1e obter nota de um aluno
	public int obterNota(int numeroAluno) {
		int nota = -1;
		for (Inscricao inscricao : inscricoes) {
			// Verifica se o número do aluno corresponde ao número procurado
			if (inscricao.getAluno().getNumero() == numeroAluno) {
				// Retorna a nota do aluno (pode ser NA se não tiver nota)
				if(inscricao.getNota() != -1){
					out.println("A nota do aluno é: " + nota);
					nota = inscricao.getNota();
					return nota;
				}
				out.println("Aluno sem nota");
				return nota;
			}
		}
		out.println("Aluno não encontrado");
		return nota;
	}


	// 2.1f mostrar todos os dados
	public void printDisciplina(){
		out.println(nome + " " + sigla + " " + capacidade );
		for (Inscricao d : inscricoes)
			System.out.println(d);
	}

	// 2.1g saber a nota média
	public void getAverage(){
		int num = 0;
		int sum = 0;
		for (Inscricao d : inscricoes){
			if(d.temNota()){
				sum+= d.getNota();
				num++;
			}
		}
		if (num != 0)
			out.println("A média é: " + sum/num);
		else
			out.println("Não há notas");
	}

	// 2.1h saber o conjunto de alunos com melhor nota
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
		if (best == 0)
			out.println("Não há notas");
	}

	// 2.3a Sigla disciplina
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

	// 2.3b criação de disciplina com inscrição auto em lista
	public void inscreverVarios(ArrayList<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			inscrever(aluno);  // Usando a função já existente para inscrever cada aluno
		}
	}

	// 2.4 escrita da disciplina em ficheiro
	public void writeNotaToFile() {
		try {
			PrintWriter writer = new PrintWriter(new File("Disciplina.txt"));
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

	// 2.5 criação completa da disciplina com ficheiros
	private String getDisciplinaName(String path) {
		String nome= new String();
		int capacidade = 0;
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

	private int getCapacidadeFile(String path) {
		int capacidade1 = -1;
		try {
			Scanner s = new Scanner(new File(path));
			s.nextLine();
			if (s.hasNextLine()) {
				String linhaCapacidade = s.nextLine(); // Armazena a capacidade da disciplina
				capacidade1 = Integer.parseInt(linhaCapacidade);
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return capacidade1;
	}

	// NÃO UTILIZADO !!
	//	public static int getNotasFile(String path) {
	//		int capacidade1 = -1;
	//		try {
	//			Scanner s = new Scanner(new File(path));
	//			s.nextLine();
	//			if (s.hasNextLine()) {
	//				String linhaCapacidade = s.nextLine(); // Armazena o nome da disciplina
	//				capacidade1 = Integer.parseInt(linhaCapacidade);
	//
	//			}
	//			s.close();
	//
	//		} catch (FileNotFoundException e) {
	//			e.printStackTrace();
	//		}
	//		return capacidade1;
	//	}

	// 2.6 Listagem de ficheiros



	@Override
	public String toString() {

		String aux = nome + " (" + sigla + ") - cap: " + capacidade + "\n";

		for (Inscricao insc : inscricoes)
			aux += insc + "\n";

		return aux;
	}
}
