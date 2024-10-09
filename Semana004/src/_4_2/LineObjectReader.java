package _4_2;

import java.io.File;
import java.util.*;
import static java.lang.System.out;

public abstract class LineObjectReader<T> {

	private File file;
	private String s;
	List<T> list = new ArrayList<T>();
	
	public LineObjectReader(File file){
		this.file = file;
		//this.s = "";
	}
	
	public List<T> read(){ //throws FileNotFoundException
		
		//List<T> list = new ArrayList<T>();
		
		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				T line = lineToObject(scanner.nextLine());
				list.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	public void print(){
		for (T l : list){
			out.println(l);
			}
		}
	
	public abstract T lineToObject (String line);
}
