package _4_2;
import java.io.File;
import aula_figuras.Circulo;

public class LineCircleReader extends LineObjectReader<Circulo> {

    public LineCircleReader(File file) {
        super(file);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Circulo lineToObject(String line) {
         String[] parts = line.split(",");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Formato inválido para Circle: " + line);
            }
            int x = Integer.parseInt(parts[0].trim());
            int y = Integer.parseInt(parts[1].trim());
            double raio = Double.parseDouble(parts[2].trim());
            return new Circulo(x, y, raio);
        }


}
