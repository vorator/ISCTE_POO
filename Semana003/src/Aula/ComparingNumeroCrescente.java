package Aula;
import java.util.Comparator;

public class ComparingNumeroCrescente implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a, Aluno b) {
		return a.getNumero() - b.getNumero();
	}
}
