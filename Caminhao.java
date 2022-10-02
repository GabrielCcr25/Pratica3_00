package br.com.Exemplo3;

public final class Caminhao extends Veiculo{
	private String placa;
	private int ano; 
	private int eixos=0;
	public Caminhao(String placa, int ano, String placa2, int ano2, int eixos) {
		super(placa, ano);
		placa = placa2;
		ano = ano2;
		this.eixos = eixos;
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
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public void exibirDados() {
		return;
	}
	
	
	
	
	

}
