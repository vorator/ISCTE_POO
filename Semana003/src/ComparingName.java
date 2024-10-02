import java.util.Comparator;

public class ComparingName implements Comparator<Aluno> {
	
	@Override
	public int compare (Aluno a, Aluno b){
		Comparator<String> c = String.CASE_INSENSITIVE_ORDER;
		return c.compare(a.getNome(), b.getNome());
	}
}
