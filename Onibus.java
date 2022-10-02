package br.com.Exemplo3;

public final class Onibus extends Veiculo{
	private String placa;
	private int ano;
	private int assentos=0;
	public Onibus(String placa, int ano, String placa2, int ano2, int assentos) {
		super(placa, ano);
		placa = placa2;
		ano = ano2;
		this.assentos = assentos;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public void exibirDados() {
		return;
		
	}
	
	
	

}
