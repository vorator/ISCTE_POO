import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

public class ListFiles {
	public static List<String> listarArquivos(String diretorio) {
		File folder = new File(diretorio);
		File[] listOfFiles = folder.listFiles();
		List<String> arquivos = new ArrayList<>();
		
		out.println(listOfFiles.length);
		
		if (listOfFiles != null) {
			
			out.println("entrou aqui");
			
			for (File file : listOfFiles) {
				if (file.isFile()) {
					arquivos.add(file.getAbsolutePath());
				}
			}
		}
		for (String s : arquivos)
			out.println(s);	
		return arquivos;
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Uso: java ListFiles <diretorio>");
			return;
		}

		String diretorio = args[0];
		List<String> arquivos = listarArquivos(diretorio);

		for (String arquivo : arquivos) {
			System.out.println(arquivo);
		}
	}

}
