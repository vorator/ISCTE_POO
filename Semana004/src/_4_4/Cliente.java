package _4_4;
import java.util.*;
import java.util.List;

public class Cliente {

	/*
	Crie uma classe-base Cliente que tem nome, ID e valor médio de compras.

	Crie a classe derivada ClienteVIP que extende a classe Cliente, mas guarda também o desconto associado.

	Os clientes passam a ser clientes VIP quando têm um valor médio de compras acima de um limiar (uma constante
	da classe VIP).

	Ambas as classes têm um função valorAPagarcomDesconto() que, na classe base devolve o mesmo valor que entrou,
	na calsse ClienteVIP devolve o valor depois de aplicado o desconto.

	Crie uma função que dada uma lista de clientes devolva uma outra lista só com clientes VIP (List<ClienteVIP>)
	com todos os que passaram o limiar de valor médio de compras, com um desconto de 10% associado a cada um deles

	 Todos os clientes que passam a VIP devem ser retirados da lista original.

	 */

	// atributos
	private int id;
	private String nome;
	private int numeroCompras;
	private double valorCompras;
	//private double valorMedio;

	// construtor
	public Cliente (int id, String nome){
		this.id = id;
		this.nome = nome;
	}

	public static Cliente checkIfVIP(Cliente c){
		if ((c.valorCompras/c.numeroCompras) > ClienteVIP.BASEVIP){
			c = new ClienteVIP(c.getId(), c.getNome());
			System.out.println("O cliente " + c.getId() + " tornou-se VIP");
		}
		return c;
	}

	private ClienteVIP checkListIfVIP(List<Cliente> c){
		for (Cliente clt : c )
			if ((valorCompras/numeroCompras) > ClienteVIP.BASEVIP){
				return new ClienteVIP(clt.getId(), clt.getNome());
			}
		return null;
	}

	public void fazerCompra(Cliente c, int qtd, double valor){
		this.numeroCompras += qtd;
		this.valorCompras += valor;
		//System.out.println("A compra foi executada com o valor de : " + valor);
		//checkIfVIP(c);
	}

	public static List getVIPList(List<Cliente> listC){
		List<ClienteVIP> temp = new ArrayList<ClienteVIP>(); 

		for (Cliente c : listC){
			if ((c.getValorCompras()/c.getNumeroCompras()) > ClienteVIP.BASEVIP){
				temp.add(new ClienteVIP(c.id, c.nome));
				temp.remove(c);
			}
		}
		return temp;
	}

	private double valorAPagarcomDesconto(double v){
		return v;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroCompras() {
		return numeroCompras;
	}

	public void setNumeroCompras(int numeroCompras) {
		this.numeroCompras = numeroCompras;
	}

	public double getValorCompras() {
		return valorCompras;
	}

	public void setValorCompras(double valorCompras) {
		this.valorCompras = valorCompras;
	}

	@Override
	public String toString() {
		return "Cliente :" + id + " / " + nome + " / " + numeroCompras + " / " 
	+ valorCompras;
	}
}
