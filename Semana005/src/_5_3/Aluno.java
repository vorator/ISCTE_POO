package _5_3;
import java.util.*;
import static java.lang.System.out;

public class Aluno  {
	
	// atributos
	private int numero;
	private String nome;
	private int anoMatricula;
	private int anoNascimento;
	
	// construtor
	public Aluno (int numero, String nome, int aM, int aN){
		this.numero = numero;
		this.nome = nome;
		this.anoMatricula = aM;
		this.anoNascimento = aN;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoMatricula() {
		return anoMatricula;
	}

	public void setAnoMatricula(int anoMatricula) {
		this.anoMatricula = anoMatricula;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
		@Override
	public String toString() {
		return "Aluno [numero=" + numero + ", nome=" + nome + ", anoMatricula=" + anoMatricula + ", anoNascimento="
				+ anoNascimento + "]";
	}	
}
