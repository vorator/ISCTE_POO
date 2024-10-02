import java.util.Comparator;

public class ComparingNumber implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a, Aluno b) {
		return a.getNumero() - b.getNumero();
	}
}
