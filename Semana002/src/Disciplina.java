import java.util.ArrayList;
import static java.lang.System.out;

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

	public Disciplina(String nome, int capacidade, ArrayList alunos) {
		this.nome = nome;
		this.sigla = sigla;
		this.capacidade = capacidade;
	}

	//	private String getSigla (String s){
	//		ArraysList 
	//		String[] tokens = s.split (" ");
	//		for (int i = 0; i < tokens.length;i++){
	//			
	//		}
	//	}

	public void atribuirNota (int numeroAluno, int notaAtribuida){
		Inscricao i = null;
		for (Inscricao a : inscricoes){
			if (a.getAluno().getNumero() == numeroAluno)
				a.setNota(notaAtribuida);
		} 
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
		Inscricao i = null;
		for (Inscricao a : inscricoes){
			if (a.getAluno().getNumero() == numeroAluno)
				i = a;
		}
		inscricoes.remove(i);
	}

	public void printDisciplina(){
		out.println(nome + " " + sigla + " " + capacidade );
		for (Inscricao d : inscricoes)
			System.out.println(d);
	}

	public void average(){
		int num = 0;
		int sum = 0;
		for (Inscricao d : inscricoes){
			if(d.temNota())
				sum+= d.getNota();
			num++;
		}
		if (num != 0)
			out.println("A média é: " + sum/num);
		else
			out.println("Não há notas");
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

	@Override
	public String toString() {

		String aux = nome + " (" + sigla + ") - cap: " + capacidade + "\n";

		for (Inscricao insc : inscricoes)
			aux += insc + "\n";

		return aux;
	}






}
