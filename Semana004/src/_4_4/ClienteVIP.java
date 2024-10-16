package _4_4;

public class ClienteVIP extends Cliente{

	public static final double BASEVIP = 100.0;
	
	private double desconto;

	public ClienteVIP(int id, String nome) {
		super(id, nome);
		this.desconto = 0.1;
	}
	
	private double valorAPagarcomDesconto(double v){
		return (1 - desconto) * v;
	}
	
	@Override
	public String toString() {
		return "Cliente :" + getId() + " / " + getNome() + " / " + getNumeroCompras() + " / " 
				+ getValorCompras() + " / " + desconto * 100 + "%";
	}
	
}
