package _4_1;
import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

public class Canvas<Canvas>{


	// Atributos
	private List<Figura> figuras;


	// Construtores
	public Canvas(){
		this.figuras = new ArrayList<Figura>();
	}

	public Canvas(int size){
		this.figuras = new ArrayList<Figura>(size);
	}

	public Figura get(int p){
		return figuras.get(p);
	}
	
	// Adicionar figura
	public void add(Figura f){
		figuras.add(f);
	}


	// Remover figura com base no número
	public void removeByPosition(int n){
		figuras.remove(n);
	}

	// Remover a última figura
	public void removeLast(){
		figuras.remove(figuras.size()-1);
	}


	// Analisar a figura com maior area
	public int findBiggestArea(){
		int position = 0;
		double size = 0;

		if (figuras.isEmpty()){
			out.println("Nao existem figuras na lista!"); return position;
			
		} else{
			for (int i = 0; i <= figuras.size()-1; i++){
				if (figuras.get(i).getArea() > size){
					size = figuras.get(i).getArea();
					position = i;
				}
			}
		}
		//out.println("A maior area e de: " + size);
		return position;
	}


	// Remover a figura com maior area
	public void removeBiggestArea(){
		int position = findBiggestArea();
		figuras.remove(position);
		out.println("A figura na posição " + position + " foi eliminada");
	}


	// Saber o total das areas - SEM CERTEZA SE É SUPOSTO SER ASSIM
	public double findTotalArea(){
		double size = 0;
		if (figuras.size() < 0){
			out.println("Não existem figuras na lista!"); return size;
			
		} else{
			for (int i = 0; i <= figuras.size()-1; i++){
				size = size + figuras.get(i).getArea();
			}
		}
		out.println("O total das areas e : " + size);
		return size;
	}
	
}
