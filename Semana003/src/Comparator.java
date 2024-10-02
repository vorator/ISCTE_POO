
public interface Comparator<T> {
	int comparing(T fisrt, T second);
}

// negativo	 quando primeiro elemento é anterior ao segundo;
// zero		 quando os dois elementos são equivalentes;
// positivo	 quando o segundo elemento é anterior ao primeiro.