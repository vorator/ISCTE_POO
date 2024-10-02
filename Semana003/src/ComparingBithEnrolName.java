import java.util.Comparator;

public class ComparingBithEnrolName implements Comparator<Aluno> {

	@Override
	public int compare (Aluno a, Aluno b){

		if(a.getAnoNascimento() == b.getAnoNascimento()){

			if(a.getAnoMatricula() == b.getAnoMatricula()){

				Comparator<String> c = String.CASE_INSENSITIVE_ORDER;
				return c.compare(a.getNome(), b.getNome());
			}
			return a.getAnoMatricula()- b.getAnoMatricula();
		}
		return a.getAnoNascimento()- b.getAnoNascimento();
	}
}
