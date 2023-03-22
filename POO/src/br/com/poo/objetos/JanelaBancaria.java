package br.com.poo.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaBancaria extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaBancaria frame = new JanelaBancaria();
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
	public JanelaBancaria() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaBancaria.class.getResource("/br/com/poo/images/4439740banco.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 151);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 233, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPoupanca = new JButton("Poupança");
		btnPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JanelaPoupanca jp = new JanelaPoupanca();
				jp.setVisible(true);
			}
		});
		btnPoupanca.setForeground(new Color(255, 255, 255));
		btnPoupanca.setBackground(new Color(0, 58, 117));
		btnPoupanca.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPoupanca.setBounds(10, 56, 123, 45);
		contentPane.add(btnPoupanca);
		
		JButton btnCorrente = new JButton("Corrente");
		btnCorrente.setForeground(new Color(255, 255, 255));
		btnCorrente.setBackground(new Color(0, 58, 117));
		btnCorrente.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCorrente.setBounds(198, 56, 129, 45);
		contentPane.add(btnCorrente);
		
		JLabel lblNewLabel = new JLabel("BANCO BLUE'S");
		lblNewLabel.setForeground(new Color(0, 58, 117));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(95, 11, 166, 21);
		contentPane.add(lblNewLabel);
	}
}
