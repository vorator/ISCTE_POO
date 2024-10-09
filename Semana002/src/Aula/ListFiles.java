package Aula;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

// 2.6a listar todos os ficheiros de um diretório
public class ListFiles {

	// lista os ficheiros
	public static List<String> listarArquivos(String diretorio) {
		String execPath = System.getProperty("user.dir");
		File folder = new File(execPath);
		File[] listOfFiles = folder.listFiles();
		List<String> arquivos = new ArrayList<>();

		if (listOfFiles != null) {
			for (File file : listOfFiles) {
				if (file.isFile()) {
					arquivos.add(file.getName());
				}
			}
		}	
		return arquivos;
	}

	// função recursiva
	public static ArrayList<File> collectFiles(File dir) {
		ArrayList<File> list = new ArrayList<>();
		collectFilesRec(dir, list);
		return list;
	}

	private static void collectFilesRec(File f, List<File> list) {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            if (files != null) {
                for (File file : files) {
                    collectFilesRec(file, list);
                }
            }
        } else {
            list.add(f);
        }
    }

	public static void main(String[] args) {
		String temp = args[0];
		if (temp.equals("-r")){
			//executa a função recursiva
			String diretorio = args[1];
			File f = new File(System.getProperty("user.dir"));
			List<File> arquivos = collectFiles(f);
			for (File arquivo : arquivos) {
				out.println(diretorio + "/" + arquivo.getAbsolutePath());
			}
		}
		else{
			String diretorio = args[0];
			List<String> arquivos = listarArquivos(diretorio);
			for (String arquivo : arquivos) {
				out.println(diretorio + "/" + arquivo);
			}

		}
	}
}
