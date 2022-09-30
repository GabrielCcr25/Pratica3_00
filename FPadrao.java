package br.com.folhadepagamento;

public class FPadrao extends Funcionario{
    public FPadrao(int matricula, String nome, double salario, double calcularProventos) {
        super(matricula, nome, salario, calcularProventos);
    }

    @Override
    public double calcularProventos() {
        return getSalario();
    }

}
