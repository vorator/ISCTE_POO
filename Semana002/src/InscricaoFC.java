
public class InscricaoFC {

	public static final int NA=-1;

	private int nota = NA;
	private AlunoFC aluno;

	public InscricaoFC(AlunoFC aluno) {
		this.aluno = aluno;
	}

	public int getNota() {
		return nota;
	}

	public AlunoFC getAluno() {
		return aluno;
	}

	public boolean temNota() {
		return nota != NA;		
	}

	public void setNota(int nota) {
		if (nota < 0 || nota > 20)
			throw new IllegalArgumentException();

		this.nota = nota;
	}


	@Override
	public String toString() {

		if (temNota())
			return aluno + " - " + nota + " valores"; 

		return aluno + " - ainda não tem nota";
	}

}










