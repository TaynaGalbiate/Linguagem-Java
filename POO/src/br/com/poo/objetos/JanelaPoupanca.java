package br.com.poo.objetos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class JanelaPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField textnumeroBanco;
	private JTextField textAgencia;
	private JTextField textConta;
	private JTextField textTitular;
	private JTextField textSaldo;
	private JTextField textRendimentos;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public JanelaPoupanca() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaPoupanca.class.getResource("/br/com/poo/images/4439740banco.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 657, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 233, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnverificarSaldo = new JButton("Verificar Saldo");
		btnverificarSaldo.setForeground(new Color(255, 255, 255));
		btnverificarSaldo.setBackground(new Color(0, 58, 117));
		btnverificarSaldo.setBounds(170, 265, 130, 32);
		contentPane.add(btnverificarSaldo);
		btnverificarSaldo.setEnabled(false);
		
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.setForeground(new Color(255, 255, 255));
		btnDepositar.setBackground(new Color(0, 58, 117));
		btnDepositar.setBounds(10, 222, 130, 75);
		contentPane.add(btnDepositar);
		btnDepositar.setEnabled(false);
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.setForeground(new Color(255, 255, 255));
		btnSacar.setBackground(new Color(0, 58, 117));
		btnSacar.setBounds(170, 222, 130, 32);
		contentPane.add(btnSacar);
		btnSacar.setEnabled(false);
		
		textnumeroBanco = new JTextField();
		textnumeroBanco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textnumeroBanco.getText().equals("")|| textnumeroBanco.getText().trim().equals(""));
				JOptionPane.showMessageDialog(null, "Campo obrigatório!");
				textnumeroBanco.requestFocus();
			}
		});
		textnumeroBanco.setBounds(126, 51, 148, 30);
		contentPane.add(textnumeroBanco);
		textnumeroBanco.setColumns(10);
		
		JLabel lblnumeroBanco = new JLabel("Número do banco:");
		lblnumeroBanco.setBounds(10, 46, 106, 40);
		contentPane.add(lblnumeroBanco);
		
		JLabel lblAgencia = new JLabel("Agência:");
		lblAgencia.setBounds(293, 46, 49, 40);
		contentPane.add(lblAgencia);
		
		textAgencia = new JTextField();
		textAgencia.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textAgencia.getText().equals("")|| textAgencia.getText().trim().equals(""));
				JOptionPane.showMessageDialog(null, "Campo obrigatório!");
				textnumeroBanco.requestFocus();
			}
		});
		textAgencia.setColumns(10);
		textAgencia.setBounds(352, 51, 86, 30);
		contentPane.add(textAgencia);
		
		JLabel lblConta = new JLabel("Conta:");
		lblConta.setBounds(448, 50, 43, 32);
		contentPane.add(lblConta);
		
		textConta = new JTextField();
		textConta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textConta.getText().equals("")|| textConta.getText().trim().equals(""));
				JOptionPane.showMessageDialog(null, "Campo obrigatório!");
				textnumeroBanco.requestFocus();
			}
		});
		textConta.setColumns(10);
		textConta.setBounds(493, 51, 140, 30);
		contentPane.add(textConta);
		
		JLabel lblTitular = new JLabel("Titular:");
		lblTitular.setBounds(10, 97, 43, 40);
		contentPane.add(lblTitular);
		
		textTitular = new JTextField();
		textTitular.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textTitular.getText().equals("")|| textTitular.getText().trim().equals(""));
				JOptionPane.showMessageDialog(null, "Campo obrigatório!");
				textnumeroBanco.requestFocus();
			}
		});
		textTitular.setBounds(56, 102, 577, 30);
		contentPane.add(textTitular);
		textTitular.setColumns(10);
		
		JLabel lblSaldo = new JLabel("Saldo Inicial:");
		lblSaldo.setBounds(11, 148, 79, 32);
		contentPane.add(lblSaldo);
		
		textSaldo = new JTextField();
		textSaldo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textSaldo.getText().equals("")|| textSaldo.getText().trim().equals(""));
				JOptionPane.showMessageDialog(null, "Campo obrigatório!");
				textnumeroBanco.requestFocus();
			}
		});
		textSaldo.setColumns(10);
		textSaldo.setBounds(100, 149, 117, 30);
		contentPane.add(textSaldo);
		
		JLabel lblRendimentos = new JLabel("Rendimentos:");
		lblRendimentos.setBounds(326, 148, 79, 32);
		contentPane.add(lblRendimentos);
		
		textRendimentos = new JTextField();
		textRendimentos.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textRendimentos.getText().equals("")|| textRendimentos.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo obrigatório!");
				textnumeroBanco.requestFocus();
				}
				btnverificarSaldo.setText("Abrir Conta");
				btnverificarSaldo.setEnabled(true);
			}
			
			
		});
		textRendimentos.setColumns(10);
		textRendimentos.setBounds(415, 149, 130, 30);
		contentPane.add(textRendimentos);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtValor.setText("Valor:");
		txtValor.setBounds(467, 216, 166, 81);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("BANCO BLUE'S");
		lblNewLabel.setForeground(new Color(0, 58, 117));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(255, 11, 150, 23);
		contentPane.add(lblNewLabel);
	}
}
