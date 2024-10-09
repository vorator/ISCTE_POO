package _4_3;

import java.util.*;

public class Empresa {

	private List<Funcionario> empregados;

    public Empresa() {
        empregados = new ArrayList<>();
    }

    public void addEmpregado(Funcionario empregado) {
        empregados.add(empregado);
    }

    public double calcularSalarioTotal() {
        double salarioTotal = 0;
        for (Funcionario empregado : empregados) {
            salarioTotal += empregado.getSalario();
        }
        return salarioTotal;
    }

}
