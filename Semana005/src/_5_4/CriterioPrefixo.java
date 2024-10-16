package _5_4;
public class CriterioPrefixo implements CriterioDeSelecao<String> {
    private String prefixo;

    public CriterioPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    @Override
    public boolean cumpreOCriterio(String elemento) {
        return elemento.startsWith(prefixo);
    }
}
