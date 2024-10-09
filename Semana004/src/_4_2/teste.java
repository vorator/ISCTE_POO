package _4_2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import aula_figuras.Circulo;
import static java.lang.System.out;

public class teste {

	public static void main (String[] args) {

		File f = new File("estudantes.txt");
		LineStudentReader lsr = new LineStudentReader(f);
		lsr.read();
		lsr.print();

		
		File c = new File("circulos.txt");
		LineCircleReader lcr = new LineCircleReader(c);
		lcr.read();
		lcr.print();
		
	}
}


