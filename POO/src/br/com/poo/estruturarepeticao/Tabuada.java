package br.com.poo.estruturarepeticao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tabuada extends JFrame {
	
	static String dados = "";

	public static void main(String[] args) {
		
	
//Gerando um objeto de janela baseado na classe JFrame. Abaixo um processo de instância
		 
		JFrame janela = new JFrame();
		
		//Tamanho em largura e altura
		janela.setSize(500, 400);
		
		//Posicionar a janela no centro da tela
		janela.setLocationRelativeTo(null);
		
		//Aplicar um título a janela que será criada
		janela.setTitle("Tabuada");
		
		//Comando para fechar e retirar a janela da memória 
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Vamos definir o layout como null. Isso nos ajuda a posicionar os componentes livremente
		janela.getContentPane().setLayout(null);
				
		//Vamos adicionar um componente de texto a nossa janela este componente será um rótulo (label -> JLabel)
		JLabel lblNumero = new JLabel ("Digite um número para a tabuada:");
		
		// Para posicionar a label najanela criada será necessário utilizar as configuações de posição x, y e altura
		lblNumero.setBounds(10,10,250,30);
		
		//Vamos adicionar a label(lblNumero) a tela janela
		janela.add(lblNumero);
		
		//Vamos adicionar um novo componente chamad JTextArea para apresentar os resultados da tabuada
		JTextArea txtResultado = new JTextArea();
		
		//Vamos posicionar e definir a largura e altura da caixa
		txtResultado.setBounds(10,40,463,300);
		
		//Adicionar a caixa de texto a janela 
		janela.add(txtResultado);
		
		/*
		Para o usuário inserir um número para a tabuada, iremos adicionar um novo componente 
		chamado JTextField (Campo de texto)
		*/
		JTextField txtNumero = new JTextField();
		
		txtNumero.setBounds(210,5,30,30);
		janela.add(txtNumero);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(250,5,223,30);
		janela.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(int i= 1; i <= 10 ; i++) {
					
					dados += txtNumero.getText() + 
							"x " + i + " = " +
							Integer.parseInt(txtNumero.getText()) * i+"\n";

				}
				
				
				txtResultado.setText(dados);
				txtNumero.setText("");
				dados = ""; //Limpar a variável dados
				
			}
		});
		
		//Comando para mostrar a janela
		janela.setVisible(true);
		
		
    }
}
