package _4_2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class GenericTextFileReader<T> {
	
	protected abstract T createObjectFromLine(String line);

	public List<T> readAllLines(String filename) {
		List<T> objects = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(filename))) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();

				objects.add(createObjectFromLine(line));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objects;
	}
}

