package br.com.folhadepagamento;

public class FComissionado extends Funcionario{
    double percentual;
    double vendas;

    public FComissionado(int matricula, String nome, double salario, double calcularProventos, double percentual, double vendas) {
        super(matricula, nome, salario, calcularProventos);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    public double calcularProventos(){
        double valorPercentual = getSalario() * (percentual/100);
        double valorPercentVendas = valorPercentual * vendas;
        double valorProventos = getSalario()+valorPercentVendas;
        return valorProventos;
    }
}
