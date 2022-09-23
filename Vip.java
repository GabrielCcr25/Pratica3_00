package br.com.carnaval;

public class Vip extends Ingresso{
    private double valorAdicional;
    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional=valorAdicional;
    }
    public double getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(double valorIngresso) {
        this.valorAdicional = valorAdicional;
    }

    public String imprimeIngresso(){
        return "Ingresso VIP: "+ (getValorIngresso()+getValorAdicional());
    }

}
