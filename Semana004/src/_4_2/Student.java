package _4_2;
import static java.lang.System.out;

public class Student {

	private String nome;
	private int numero;
	
	public Student(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return numero + ": " + nome;
	}
}
