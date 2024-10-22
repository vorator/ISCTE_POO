package _6_5;

import java.util.function.Predicate;

public class GenericFilter {

	public static void main (String[] args){

		// TESTE

		//List<String> list = ...; //{"a","","b",""}

		//Iterable<String> nonEmpty = select(list, s -> !is.isEmpty());
	}


	// função
	static <T >Iterable<T> select(Iterable<T> it, Predicate<T> pred){

		// TODO

		return it;
	}

}
