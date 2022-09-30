package br.com.folhadepagamento;

public class FProdutividade extends Funcionario{
    double valor;
    int producao;

    public FProdutividade(int matricula, String nome, double salario, double calcularProventos, double valor, int producao) {
        super(matricula, nome, salario, calcularProventos);
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }
    public double calcularProventos(){
    double valorAdd = producao * valor;
    double valorProd = getSalario()+valorAdd;
    return valorProd;
    }
}
