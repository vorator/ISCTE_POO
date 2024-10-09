package _4_2;

import java.io.*;
import java.util.*;

public class x_LineObjectReader {
	
	private ArrayList<String> array;
	private File file;
	
	public x_LineObjectReader(File f){
		this.array = new ArrayList<String>();
		this.file = f;
		
	}
	
	public ArrayList<String> LineReader(File f){
		ArrayList<String> al = new ArrayList<String>();
		try {
			Scanner s = new Scanner(f);
			if (s.hasNextLine()) {
				String a = new String (s.nextLine());
				al.add(a);
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return al;
	}

	@Override
	public String toString() {
		return "LineObjectReader [array=" + array + "]";
	}	
	
	
}