package br.com.projetoescola.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import br.com.projetoescola.dao.CRUDCurso;
import br.com.projetoescola.domain.Curso;

public class GerenciarCurso extends JFrame {

	private JPanel contentPane;
	private JTable table;

	MaskFormatter di;
	MaskFormatter dt;
	MaskFormatter hi;
	MaskFormatter ht;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarCurso frame = new GerenciarCurso();
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
	public GerenciarCurso() {
		try {
		setTitle("Cursos");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java\\tayna\\POO\\src\\br\\com\\poo\\images\\caderno.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 631);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 431, 901, 150);
		contentPane.add(scrollPane);
		
		String [] cabecalho = {
				"Id Curso",
				"Título do Curso",
				"Descrição do Curso",
				"Data de Início",
				"Data de Término",
				"Horário de Início",
				"Horário de Término"
				
		};
		
		CRUDCurso cc = new CRUDCurso();
		
		Object [][] dados = new Object[cc.listar().size()][7];
		
		for(int i = 0; i < dados.length; i++) {
			dados[i][0] = cc.listar().get(i).getIdCurso();
			dados[i][1] = cc.listar().get(i).getTitulo();
			dados[i][2] = cc.listar().get(i).getDescricao();
			dados[i][3] = cc.listar().get(i).getDatainicio();
			dados[i][4] = cc.listar().get(i).getDatatermino();
			dados[i][5] = cc.listar().get(i).getHorarioinicio();
			dados[i][6] = cc.listar().get(i).getHorariotermino();
		}
		
		DefaultTableModel model = new DefaultTableModel(dados, cabecalho);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		JLabel lblTitulo = new JLabel("Título:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(10, 159, 46, 28);
		contentPane.add(lblTitulo);
		
		JTextPane textTitulo = new JTextPane();
		textTitulo.setBackground(new Color(238, 238, 238));
		textTitulo.setBounds(62, 159, 279, 28);
		contentPane.add(textTitulo);
		
		JTextArea textDescricao = new JTextArea();
		textDescricao.setBackground(new Color(238, 238, 238));
		textDescricao.setBounds(108, 208, 770, 86);
		contentPane.add(textDescricao);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDescricao.setBounds(10, 213, 88, 81);
		contentPane.add(lblDescricao);
		
		JLabel lblDataInicio = new JLabel("Data Início:");
		lblDataInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataInicio.setBounds(368, 164, 80, 19);
		contentPane.add(lblDataInicio);
		
		di = new MaskFormatter("##-##-####");
		di.setPlaceholderCharacter('_');
		
		JFormattedTextField textDataInicio = new JFormattedTextField(di);
		textDataInicio.setBackground(new Color(238, 238, 238));
		textDataInicio.setBounds(458, 159, 117, 28);
		contentPane.add(textDataInicio);
		
		JLabel lblDataTermino = new JLabel("Data Término:");
		lblDataTermino.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataTermino.setBounds(644, 164, 100, 19);
		contentPane.add(lblDataTermino);
		
		dt= new MaskFormatter("##-##-####");
		dt.setPlaceholderCharacter('_');
		
		JFormattedTextField textDataTermino = new JFormattedTextField(dt);
		textDataTermino.setBackground(new Color(238, 238, 238));
		textDataTermino.setBounds(749, 159, 129, 28);
		contentPane.add(textDataTermino);
		
		
		JLabel lblHorarioInicio = new JLabel("Horário Início: ");
		lblHorarioInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHorarioInicio.setBounds(10, 315, 111, 34);
		contentPane.add(lblHorarioInicio);
		
		JLabel lblHorarioTermino = new JLabel("Horário Término: ");
		lblHorarioTermino.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHorarioTermino.setBounds(319, 315, 129, 34);
		contentPane.add(lblHorarioTermino);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.setForeground(new Color(255, 255, 255));
		btnConsultar.setBackground(new Color(1, 54, 194));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.setBounds(507, 375, 117, 45);
		contentPane.add(btnConsultar);
		
		JButton btnAtualizarCurso = new JButton("ATUALIZAR CURSO");
		btnAtualizarCurso.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtualizarCurso.setForeground(new Color(255, 255, 255));
		btnAtualizarCurso.setBackground(new Color(1, 54, 194));
		btnAtualizarCurso.setBounds(273, 375, 163, 45);
		contentPane.add(btnAtualizarCurso);
		
		JButton btnDeletarCurso = new JButton("DELETAR CURSO");
		btnDeletarCurso.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDeletarCurso.setForeground(new Color(255, 255, 255));
		btnDeletarCurso.setBackground(new Color(1, 54, 194));
		btnDeletarCurso.setBounds(695, 375, 139, 45);
		contentPane.add(btnDeletarCurso);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.setBackground(new Color(1, 54, 194));
		
		btnCadastrar.setBounds(91, 375, 123, 45);
		contentPane.add(btnCadastrar);
		
		hi= new MaskFormatter("##h##min");
		hi.setPlaceholderCharacter('_');
		
		JFormattedTextField textHorarioInicio = new JFormattedTextField(hi);
		textHorarioInicio.setBackground(new Color(238, 238, 238));
		textHorarioInicio.setBounds(124, 320, 100, 28);
		contentPane.add(textHorarioInicio);
		
		ht= new MaskFormatter("##h##min");
		ht.setPlaceholderCharacter('_');
		
		JFormattedTextField textHorarioTermino = new JFormattedTextField(ht);
		textHorarioTermino.setBackground(new Color(238, 238, 238));
		textHorarioTermino.setBounds(458, 320, 100, 28);
		contentPane.add(textHorarioTermino);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\Java\\tayna\\POO\\src\\br\\com\\poo\\images\\objbj.png"));
		lblNewLabel_4.setBounds(91, 0, 770, 130);
		contentPane.add(lblNewLabel_4);
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Curso cadCurso = new Curso ();
				if(textTitulo.getText().trim().equals("")
					|| textDescricao.getText().trim().equals("")	
					|| textDataInicio.getText().trim().equals("")	
					|| textDataTermino.getText().trim().equals("")	
					|| textHorarioInicio.getText().trim().equals("")	
					|| textHorarioTermino.getText().trim().equals("")
						
						) {
					JOptionPane.showMessageDialog(null,  "Preencha todos os campos!", "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
					
				else {
					cadCurso.setTitulo(textTitulo.getText());
					cadCurso.setDescricao(textDescricao.getText());
					cadCurso.setDatainicio(Date.valueOf(textDataInicio.getText()));
					cadCurso.setDatatermino(Date.valueOf(textDataInicio.getText()));
					cadCurso.setHorarioinicio(textHorarioInicio.getText());
					cadCurso.setHorariotermino(textHorarioTermino.getText());
					
					JOptionPane.showMessageDialog(null,  cc.gravar(cadCurso));
				
				}
			}
		});
	}
	
	catch(Exception e) {
		e.printStackTrace();

	}
}

}