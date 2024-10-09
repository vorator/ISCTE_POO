package _4_2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import aula_figuras.Circulo;
import static java.lang.System.out;

public class teste {

	public static void main (String[] args) {
	    
	        LineStudentReader studentReader = new LineStudentReader();
	        List<Student> students = studentReader.readAllLines("estudantes.txt");

	        //LineCircleReader circleReader = new LineCircleReader();
	        //List<Circulo> circles = circleReader.readAllLines("circles.txt");

	        // ... use as listas de objetos
	        	        
	        for (Student s : students)
	        	out.println(s);
	        	
	    }
	}
	

