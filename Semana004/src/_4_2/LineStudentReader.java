package _4_2;

public class LineStudentReader extends GenericTextFileReader<Student> {
    
	
	@Override
    protected Student createObjectFromLine(String line) {  
        String[] parts = line.split(",");
        int numero = Integer.parseInt(parts[0]);
        String nome = parts[1];
        return new Student(nome, numero);
    }
}
