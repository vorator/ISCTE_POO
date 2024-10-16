package _4_4;
import java.util.List;
import java.util.ArrayList;

public class teste {
	public static void main (String[] args){
		
		Cliente c1 = new Cliente(1,"Ana");
		Cliente c2 = new Cliente(1,"Bruno");
		Cliente c3 = new Cliente(1,"Carla");
		Cliente c4 = new Cliente(1,"Daniel");
		Cliente c5 = new Cliente(1,"Eva");
		Cliente c6 = new Cliente(1,"Fabio");
		Cliente c7 = new Cliente(1,"Gilda");
		Cliente c8 = new Cliente(1,"Hugo");
		Cliente c9 = new Cliente(1,"Ines");
		Cliente c10 = new Cliente(1,"Joao");
		Cliente c11 = new Cliente(1,"Kamala");
		Cliente c12 = new Cliente(1,"Luis");
		Cliente c13 = new Cliente(1,"Maria");
		Cliente c14 = new Cliente(1,"Nuno");
		
//		System.out.println(c1.toString());
		c1.fazerCompra(c1, 1, 200);
		c4.fazerCompra(c4, 1, 1200);
//		c1 = Cliente.checkIfVIP(c1);
//		c2 = Cliente.checkIfVIP(c2);
//		System.out.println(c1.toString());
		
		ArrayList<Cliente> list = new ArrayList<Cliente>();
		list.add(c1); list.add(c2); list.add(c3); list.add(c4); list.add(c5); list.add(c6); list.add(c7);
		list.add(c8); list.add(c9); list.add(c10); list.add(c11); list.add(c12); list.add(c13); list.add(c14);
		
		List<ClienteVIP> listVIP = new ArrayList<ClienteVIP>();
		
		listVIP = Cliente.getVIPList(list);
		
		for (ClienteVIP c : listVIP)
			System.out.println(c.toString());
		System.out.println("");
		
//		for (Cliente c : list)
//			System.out.println(c.toString());
		
		
	}

}
