package _4_2;
import static java.lang.System.out;

import java.io.File;

public class LineStudentReader extends LineObjectReader<Student> {
    
	
	public LineStudentReader(File file) {
		super(file);
	}

	@Override
	public Student lineToObject(String line) {
		String[] parts = line.split(",");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Formato inválido para Student: " + line);
        }
        String nome = parts[0];
        int numero = Integer.parseInt(parts[1].trim());
		return new Student(nome, numero);
	}
}
