package br.com.poo.estruturaswitch;

import javax.swing.JOptionPane;

public class EstruturaSwitch2 extends JOptionPane {

	public static void main(String[] args) {
		
	JOptionPane.showMessageDialog(null,"Olá, bom dia!","Sistema",JOptionPane.INFORMATION_MESSAGE);
	String estacao = JOptionPane.showInputDialog("Digite uma estação do ano e lhe diremos os meses: ");
	String rs;
	switch(estacao) {
	case "Verão":
		rs = "Dezembro - Janeiro - Fevereiro";
		break;
	case "Outono":
		    rs = "Março - Abril - Maio";
		break;
	case "Inverno":
	    	rs = "Junho - Julho - Agosto";
	    break;
	case "Primavera":
	    	rs = "Setembro - Outubro - Novembro";
	    break;
	    default:
	    	rs = "Esta estação não existe.";
	}
    JOptionPane.showMessageDialog(null, rs, "Resposta", JOptionPane.INFORMATION_MESSAGE);
	}

}
