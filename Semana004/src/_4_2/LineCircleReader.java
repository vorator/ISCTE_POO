package _4_2;

import aula_figuras.Circulo;

public class LineCircleReader extends GenericTextFileReader<Circulo> {
    
	@Override
    protected Circulo createObjectFromLine(String line) {
        double raio = Double.parseDouble(line);
        return new Circulo(1,1,(int)raio);
    }
}
