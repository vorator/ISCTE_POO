package _5_4;
public class CriterioTamanhoMenorQue implements CriterioDeSelecao<String> {
    private int tamanhoMaximo;

    public CriterioTamanhoMenorQue(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    @Override
    public boolean cumpreOCriterio(String elemento) {
        return elemento.length() < tamanhoMaximo;
    }
}
