package br.com.poo.estruturarray;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Padaria extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoProduto;
	private JTextField txtCodigoBarras;
	private JTextField txtDescricao;
	private JTextField txtValorUnitario;
	private JTextField txtQuantidade;
	private JTextField txtTotalItem;
	private JTextField txtSubtotal;
	private JTextArea txtNota;
	private String cabecalho;
	private int item;
	private double valorPagar;
	private JLabel lblValorPagar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Padaria frame = new Padaria();
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
	public Padaria() {
		
		valorPagar = 0.0;
		item = 1;
		
		cabecalho = "\t\t\t\t PADARIA DO CHEFE"+
					"\n\t\t\t                         AV. TUIUTI, 1230 - TATUAPÉ"+
					"\n\t\t\t                 CEP: 03081-003 - SÃO PAULO - SP"+
					"\n\t\t\t                         CNPJ: 01.010.101/0001-01"+
					"\n\t\t\t                             IE: 123.456789.0001"+
					"\n\t\t\t                              IM: 9.876.543/001-0"+
					"\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
					"\n\t\t\t\t    CUPOM FISCAL"+
					"\n   ITEM\tCÓDIGO\tDESCRIÇÃO\t\t\t\tQTD.\tVL.UNIT.\tVL.TOTAL"+
					"\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"
					;
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Padaria.class.getResource("/br/com/poo/images/75108121.png")));
		
		String [][] produtos = {
				
				{"2023","Pão Francês","13.00","17032023"},
				{"2024","Pão de Leite", "15.00","14032024"},
				{"2025","Torta de Frango","50.00","17032025"},
				{"2026","Leite Integral A","5.00","17032026"},
				{"2027","Manteiga","5.00","17032027"},
				{"2028","Bolo","20.00","17032027"},
				{"2029","Bauru","12.00", "17032027"},
				{"2030","Suco Laranja", "7.00", "17032023"}
				
		};
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlEsquerdo = new JPanel();
		pnlEsquerdo.setForeground(new Color(0, 0, 0));
		pnlEsquerdo.setBackground(new Color(255, 149, 43));
		pnlEsquerdo.setBounds(0, 0, 800, 700);
		contentPane.add(pnlEsquerdo);
		pnlEsquerdo.setLayout(null);
		
		JLabel lblLogo = new JLabel("New label");
		
		lblLogo.setBounds(0, 0, 800, 337);
		
		/*Para ajustar a imagem ao tamanho da Label, foi necessário aplicar o comando new ImageIcon para definir a scala no elemento get.Image.
		 O tamanho da imagem foi de ajustado para largura da lael(lbl.getWidth) e altura da label (lbl.getHeight) e para finalizar, foi 
		 alterado a forma de fechamento da imagem quando a tela fecha, foi setado o valor para suavização (image.SCALE_SMOOTH)
		 */
		
		lblLogo.setIcon(new ImageIcon(new ImageIcon(Padaria.class.getResource("/br/com/poo/images/maxresdefault.jpg"))
				.getImage().getScaledInstance(lblLogo.getWidth(), 
						lblLogo.getHeight(), Image.SCALE_SMOOTH)));
		
		pnlEsquerdo.add(lblLogo);
		
		JLabel lblCodigoProduto = new JLabel("Código do Produto: ");
		lblCodigoProduto.setForeground(new Color(149, 0, 0));
		lblCodigoProduto.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCodigoProduto.setBounds(10, 330, 206, 50);
		pnlEsquerdo.add(lblCodigoProduto);
		
		JLabel lblCodigoBarras = new JLabel("Código de Barras: ");
		lblCodigoBarras.setForeground(new Color(149, 0, 0));
		lblCodigoBarras.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCodigoBarras.setBounds(568, 330, 206, 50);
		pnlEsquerdo.add(lblCodigoBarras);
		
		txtCodigoProduto = new JTextField();
		txtCodigoProduto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				for(int linha = 0; linha <produtos.length ; linha++) {
					
					for(int coluna = 0; coluna < produtos[0].length; coluna++) {
						if(txtCodigoProduto.getText().equals(produtos[linha][0])) {
							txtCodigoBarras.setText(produtos[linha][3]);
							txtDescricao.setText(produtos[linha][1]);
							txtValorUnitario.setText(produtos[linha][2]);
							break;
						}
					}
				}
			}
		});
		txtCodigoProduto.setForeground(new Color(149, 0, 0));
		txtCodigoProduto.setBackground(new Color(255, 149, 43));
		txtCodigoProduto.setBounds(10, 370, 193, 30);
		pnlEsquerdo.add(txtCodigoProduto);
		txtCodigoProduto.setColumns(10);
		txtCodigoProduto.setBorder(null);
		
		
		txtCodigoBarras = new JTextField();
		txtCodigoBarras.setForeground(new Color(149, 0, 0));
		txtCodigoBarras.setColumns(10);
		txtCodigoBarras.setBackground(new Color(255, 149, 43));
		txtCodigoBarras.setBounds(568, 370, 181, 30);
		pnlEsquerdo.add(txtCodigoBarras);
		txtCodigoBarras.setBorder(null);
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(149, 0, 0));
		separator.setBounds(10, 410, 780, 7);
		pnlEsquerdo.add(separator);
		
		JLabel lblDescricao = new JLabel("Descrição: ");
		lblDescricao.setForeground(new Color(149, 0, 0));
		lblDescricao.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDescricao.setBounds(10, 406, 206, 50);
		pnlEsquerdo.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setForeground(new Color(149, 0, 0));
		txtDescricao.setColumns(10);
		txtDescricao.setBackground(new Color(255, 149, 43));
		txtDescricao.setBounds(10, 448, 780, 30);
		pnlEsquerdo.add(txtDescricao);
		txtDescricao.setBorder(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(149, 0, 0));
		separator_1.setBounds(10, 491, 780, 7);
		pnlEsquerdo.add(separator_1);
		
		JLabel lblValorUnitario = new JLabel("Valor Unitário: ");
		lblValorUnitario.setForeground(new Color(149, 0, 0));
		lblValorUnitario.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblValorUnitario.setBounds(10, 485, 206, 50);
		pnlEsquerdo.add(lblValorUnitario);
		
		txtValorUnitario = new JTextField();
		txtValorUnitario.setForeground(new Color(149, 0, 0));
		txtValorUnitario.setColumns(10);
		txtValorUnitario.setBackground(new Color(255, 149, 43));
		txtValorUnitario.setBounds(10, 524, 193, 30);
		pnlEsquerdo.add(txtValorUnitario);
		txtValorUnitario.setBorder(null);
		
		JLabel lblQuantidade = new JLabel("Quantidade: ");
		lblQuantidade.addFocusListener(new FocusAdapter() {

		});
		lblQuantidade.setForeground(new Color(149, 0, 0));
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuantidade.setBounds(277, 485, 206, 50);
		pnlEsquerdo.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				txtTotalItem.setText(""+
			Double.parseDouble(txtQuantidade.getText())*
			Double.parseDouble(txtValorUnitario.getText())
			);
				txtSubtotal.setText("R$"+
			Double.parseDouble(txtQuantidade.getText())*
			Double.parseDouble(txtValorUnitario.getText())
			);
				
			}
		});
		txtQuantidade.setForeground(new Color(149, 0, 0));
		txtQuantidade.setColumns(10);
		txtQuantidade.setBackground(new Color(255, 149, 43));
		txtQuantidade.setBounds(277, 524, 193, 30);
		pnlEsquerdo.add(txtQuantidade);
		txtQuantidade.setBorder(null);
		
		
		
		JLabel lblTotalItem = new JLabel("Total Item: ");
		lblTotalItem.setForeground(new Color(149, 0, 0));
		lblTotalItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalItem.setBounds(568, 485, 206, 50);
		pnlEsquerdo.add(lblTotalItem);
		
		txtTotalItem = new JTextField();
		txtTotalItem.addFocusListener(new FocusAdapter() {

		});
		txtTotalItem.setForeground(new Color(149, 0, 0));
		txtTotalItem.setColumns(10);
		txtTotalItem.setBackground(new Color(255, 149, 43));
		txtTotalItem.setBounds(568, 524, 193, 30);
		pnlEsquerdo.add(txtTotalItem);
		txtTotalItem.setBorder(null);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(new Color(149, 0, 0));
		separator_1_1.setBounds(10, 565, 780, 7);
		pnlEsquerdo.add(separator_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(149, 0, 0));
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(235, 509, 2, 45);
		pnlEsquerdo.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBackground(new Color(149, 0, 0));
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setBounds(520, 509, 2, 45);
		pnlEsquerdo.add(separator_2_1);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBackground(new Color(149, 0, 0));
		separator_2_2.setOrientation(SwingConstants.VERTICAL);
		separator_2_2.setBounds(384, 342, 2, 63);
		pnlEsquerdo.add(separator_2_2);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setForeground(new Color(149, 0, 0));
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSubtotal.setBounds(10, 565, 206, 50);
		pnlEsquerdo.add(lblSubtotal);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtSubtotal.setForeground(new Color(149, 0, 0));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBackground(new Color(255, 149, 43));
		txtSubtotal.setBounds(10, 618, 193, 71);
		pnlEsquerdo.add(txtSubtotal);
		txtSubtotal.setBorder(null);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cabecalho+="\n    "+item+"\t"+txtCodigoProduto.getText()+
				"\t"+txtDescricao.getText()+
				"\t\t\t\t   "+txtQuantidade.getText()+
				"\t"+txtValorUnitario.getText()+
				"\t"+txtTotalItem.getText();
				
				txtNota.setText(cabecalho);
				item++;
				
				valorPagar += Double.parseDouble(txtTotalItem.getText());
				lblValorPagar.setText("R$ "+valorPagar);
				
			}
		});
		btnIncluir.setBounds(615, 609, 175, 80);
		pnlEsquerdo.add(btnIncluir);
		
		JPanel pnlDireito = new JPanel();
		pnlDireito.setBackground(new Color(255, 255, 255));
		pnlDireito.setBounds(805, 0, 780, 700);
		contentPane.add(pnlDireito);
		pnlDireito.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 780, 700);
		pnlDireito.add(scrollPane);
		
		txtNota = new JTextArea();
		scrollPane.setViewportView(txtNota);
		txtNota.setText(cabecalho);
		
		JPanel pnlBase = new JPanel();
		pnlBase.setBounds(0, 705, 1584, 155);
		contentPane.add(pnlBase);
		pnlBase.setLayout(null);
		
		JLabel lblvalor = new JLabel("Valor a Pagar:");
		lblvalor.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblvalor.setBounds(868, 38, 279, 89);
		pnlBase.add(lblvalor);
		
		lblValorPagar = new JLabel("New label");
		lblValorPagar.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblValorPagar.setBounds(1157, 24, 338, 103);
		pnlBase.add(lblValorPagar);
		lblValorPagar.setText("R$ "+valorPagar);
		
	}
}
