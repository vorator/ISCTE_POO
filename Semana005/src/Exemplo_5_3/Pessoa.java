package Exemplo_5_3;

import java.util.Comparator;

public class Pessoa {

	private String nome;
	private int peso;
	private int altura;
	
	public Pessoa(String nome, int peso, int altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public int getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}
	@Override
	public String toString() {
		return nome + " - " + peso + " Kg - " + altura + " cm";
	}

	// classe aninhada static com acesso dentro do pacote
	static class ComparadorDePeso implements Comparator<Pessoa>{

		@Override
		public int compare(Pessoa o1, Pessoa o2) {		
			return o1.getPeso() - o2.getPeso();
		}
	}
	
	// Classe interna (sem static) - no caso de um comparador nao fazia sentido
	// estar aqui, dado que seria necessaria um objeto ativo de Pessoa para se poder 
	// instanciar o comparador. 
	// E criar uma pessoa para se poder ordenar pessoas seria algo muito esquisito e 
	// altamente questionavel...	
}
