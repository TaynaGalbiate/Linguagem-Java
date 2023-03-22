package br.com.poo.objetos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JButton btnSoma;
	private JButton btnMenos;
	private JButton btnMultiplicacao;
	private JButton btnDivisao;
	private JButton btnBotao9;
	private JButton btnBotao8;
	private JButton btnBotao7;
	private JButton btnBotao6;
	private JButton btnBotao5;
	private JButton btnBotao4;
	private JButton btnBotao3;
	private JButton btnBotao2;
	private JButton btnBotao1;
	private JButton btnBotao0;
	private JButton btnBotaoIgual;
	private JButton btnBotaoApagar;
	private String resultado;
	private JTextField txtresultado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		
		resultado = "0";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblresultado = new JLabel("");
		lblresultado.setForeground(new Color(255, 255, 255));
		lblresultado.setBackground(new Color(255, 255, 255));
		lblresultado.setBounds(10, 11, 228, 89);
		contentPane.add(lblresultado);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setBackground(new Color(255, 255, 255));
		btnSoma.setForeground(new Color(255, 0, 0));
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSoma.setBounds(10, 111, 50, 44);
		contentPane.add(btnSoma);
		
		JButton btnMenos = new JButton("-");
		btnMenos.setForeground(new Color(255, 0, 0));
		btnMenos.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMenos.setBounds(70, 111, 50, 44);
		contentPane.add(btnMenos);
		
		JButton btnMultiplicacao = new JButton("X");
		btnMultiplicacao.setForeground(new Color(255, 0, 0));
		btnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiplicacao.setBounds(130, 111, 50, 44);
		contentPane.add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setForeground(new Color(255, 0, 0));
		btnDivisao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivisao.setBounds(190, 111, 50, 44);
		contentPane.add(btnDivisao);
		
		JButton btnBotao9 = new JButton("9");
		btnBotao9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao9.setBounds(130, 182, 50, 44);
		contentPane.add(btnBotao9);
		
		JButton btnBotao8 = new JButton("8");
		btnBotao8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao8.setBounds(70, 182, 50, 44);
		contentPane.add(btnBotao8);
		
		JButton btnBotao7 = new JButton("7");
		btnBotao7.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBotao7.setBounds(10, 183, 50, 44);
		contentPane.add(btnBotao7);
		
		JButton btnBotao6 = new JButton("6");
		btnBotao6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao6.setBounds(130, 237, 50, 44);
		contentPane.add(btnBotao6);
		
		JButton btnBotao5 = new JButton("5");
		btnBotao5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao5.setBounds(70, 237, 50, 44);
		contentPane.add(btnBotao5);
		
		JButton btnBotao4 = new JButton("4");
		btnBotao4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao4.setBounds(10, 238, 50, 44);
		contentPane.add(btnBotao4);
		
		JButton btnBotao3 = new JButton("3");
		btnBotao3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao3.setBounds(130, 292, 50, 44);
		contentPane.add(btnBotao3);
		
		JButton btnBotao2 = new JButton("2");
		btnBotao2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao2.setBounds(70, 292, 50, 44);
		contentPane.add(btnBotao2);
		
		JButton btnBotao1 = new JButton("1");
		btnBotao1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao1.setBounds(10, 293, 50, 44);
		contentPane.add(btnBotao1);
		btnBotao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtresultado.getText().equals("0")) {
					resultado = "1";
					txtresultado.setText(resultado);
				}
				else {
					resultado +="1";
					txtresultado.setText(resultado);
					
				}
			}
		}
	
	);
	
		
		
		
		JButton btnBotao0 = new JButton("0");
		btnBotao0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBotao0.setBounds(190, 182, 50, 44);
		contentPane.add(btnBotao0);
		
		JButton btnBotaoIgual = new JButton("=");
		btnBotaoIgual.setForeground(new Color(255, 0, 0));
		btnBotaoIgual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBotaoIgual.setBounds(190, 237, 50, 44);
		contentPane.add(btnBotaoIgual);
		
		JButton btnBotaoApagar = new JButton("AC");
		btnBotaoApagar.setForeground(new Color(255, 0, 0));
		btnBotaoApagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBotaoApagar.setBounds(190, 292, 50, 44);
		contentPane.add(btnBotaoApagar);
	}
}
