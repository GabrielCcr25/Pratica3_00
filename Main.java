package br.com.Exemplo3;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) throws NumberFormatException {
		 String placa;
		 int ano, assentos, eixos;
		
		JOptionPane.showMessageDialog(null,"Dados do veiculo: "+"\n"+ "\n"+"Placa: ZAB-4613\nAno: 2008","Mensagem ",JOptionPane.DEFAULT_OPTION );

		placa = JOptionPane.showInputDialog("Informe a placa do onibus: ");
		ano = 	Integer.parseInt((String)JOptionPane.showInputDialog("Entre com o ano do ônibus: "));
		assentos = Integer.parseInt((String)JOptionPane.showInputDialog("Entre com o número de assentos do ônibus: "));
		
		
		JOptionPane.showMessageDialog(null,"Dados do onibus: "+"\n"+"\n"+ "\nPlaca: "+ placa + "\nAno: " + ano + "\nNumeros de assentos: "+assentos,"Mensagem",JOptionPane.DEFAULT_OPTION);
		
		placa = JOptionPane.showInputDialog("Informe a placa do caminhao: ");
		ano = 	Integer.parseInt((String)JOptionPane.showInputDialog("Entre com o ano do caminhao: "));
		eixos = Integer.parseInt((String)JOptionPane.showInputDialog("Entre com o número de eixos do caminhão: "));
		
		JOptionPane.showMessageDialog(null,"Dados do onibus: "+"\n"+"\n"+ "\nPlaca: "+ placa + "\nAno: " + ano,"Mensagem",JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "\nNumeros de eixos: "+eixos,"Mensagem",JOptionPane.DEFAULT_OPTION);
		

	}

}
