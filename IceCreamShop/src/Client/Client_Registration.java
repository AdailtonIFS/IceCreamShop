package Client;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JSpinField;


public class Client_Registration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtFNome;
	private MaskFormatter ftmTelefone;// ATRIBUTO FORMATADOR PARA TELEFONE     
	private MaskFormatter ftmCPF;// ATRIBUTO FORMATADOR PARA CPF
	private MaskFormatter ftmCEP;// ATRIBUTO FORMATADOR PARA CEP
	private JTextField txtFEndereco;
	private JTextField txtFEmail;
	private JTextField txtBairro;
	private JTextField txtNmero;

	/*
	 * Modificar a tela, as cores o tamanho, jradiobutton,jcombobox e etc...
	 * 
	 * 
	 * /** Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client_Registration frame = new Client_Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */

	public Client_Registration() throws ParseException {

		Font dropthegame1 = null;

		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")).deriveFont(82f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch (IOException | FontFormatException e) {

		}

		setIconImage(
				Toolkit.getDefaultToolkit().getImage(Client_Registration.class.getResource("/images/internet.png")));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		// =================mascarasCampos================
		ftmTelefone = new MaskFormatter("(##)#####-####");
		ftmCPF = new MaskFormatter("###.###.###-##");
		ftmCEP = new MaskFormatter("#####-###");
		// ===============================================

		// Client Cl = new Client(); //instanciarClasseClient

		setTitle("CADASTRO DE CLIENTES"); // tituloPagina
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		setLocationRelativeTo(null); // centralizarFrame
		setResizable(false); // bloquearMaximizar
		
		//bloquearFrame
			this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pnTitle = new JPanel();
		pnTitle.setForeground(new Color(255, 255, 0));
		pnTitle.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pnTitle.setBackground(new Color(255, 222, 173));
		pnTitle.setBounds(0, 0, 594, 99);
		contentPane.add(pnTitle);
		pnTitle.setLayout(null);

		JLabel lblRegistrando = new JLabel("REGISTRANDO");
		lblRegistrando.setForeground(Color.DARK_GRAY);
		lblRegistrando.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrando.setBounds(0, 0, 594, 99);
		lblRegistrando.setFont(dropthegame1);
		pnTitle.add(lblRegistrando);

		JPanel pnBaixo = new JPanel();
		pnBaixo.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pnBaixo.setBackground(new Color(255, 222, 173));
		pnBaixo.setBounds(0, 568, 594, 53);
		contentPane.add(pnBaixo);
		pnBaixo.setLayout(null);

		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();

			}
		});
		label.setBounds(32, 7, 35, 40);
		pnBaixo.add(label);
		label.setIcon(new ImageIcon(Client_Registration.class.getResource("/images/back.png")));

		LineBorder borda = new LineBorder(Color.RED, 1, true);
		LineBorder bordaNao = new LineBorder(Color.GREEN, 0, false);
		
		
		
		JButton SALVAR = new JButton("SALVAR");// CRIANDO BOTÃO SALVAR
		SALVAR.setBounds(253, 508, 114, 41);
		contentPane.add(SALVAR);
		SALVAR.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		SALVAR.setFont(new Font("Arial", Font.BOLD, 13));
		SALVAR.setForeground(Color.BLACK);// FUNDO DO BOTÃO
		SALVAR.setBackground(UIManager.getColor("Button.background"));

		JPanel pnEspecial = new JPanel();
		pnEspecial.setBackground(new Color(135, 204, 255));
		pnEspecial.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnEspecial.setBounds(67, 348, 471, 147);
		contentPane.add(pnEspecial);
		pnEspecial.setLayout(null);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(32, 8, 163, 25);
		pnEspecial.add(lblDataDeNascimento);
		lblDataDeNascimento.setForeground(Color.GRAY);
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataDeNascimento.setFont(new Font("SansSerif", Font.BOLD, 17));

		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(309, 36, 130, 25);
		pnEspecial.add(yearChooser);

		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(186, 36, 111, 25);
		pnEspecial.add(monthChooser);

		JSpinField spinField = new JSpinField();
		spinField.setMaximum(31);
		spinField.setMinimum(1);
		spinField.setValue(1);
		spinField.setBounds(42, 36, 130, 25);
		pnEspecial.add(spinField);

		JLabel lblGnero = new JLabel("G\u00EAnero");
		lblGnero.setBounds(42, 71, 163, 25);
		pnEspecial.add(lblGnero);
		lblGnero.setHorizontalAlignment(SwingConstants.LEFT);
		lblGnero.setForeground(Color.GRAY);
		lblGnero.setFont(new Font("SansSerif", Font.BOLD, 17));

		JRadioButton rdbtnPersonalizado = new JRadioButton("PERSONALIZADO");
		rdbtnPersonalizado.setBounds(297, 104, 139, 25);
		pnEspecial.add(rdbtnPersonalizado);

		JRadioButton rdbtnMasculino = new JRadioButton("MASCULINO");
		rdbtnMasculino.setBounds(42, 104, 109, 25);
		pnEspecial.add(rdbtnMasculino);
		rdbtnMasculino.setHorizontalAlignment(SwingConstants.CENTER);

		JRadioButton rdbtnFeminino = new JRadioButton("FEMININO");
		rdbtnFeminino.setBounds(172, 104, 109, 25);
		pnEspecial.add(rdbtnFeminino);
		rdbtnFeminino.setHorizontalAlignment(SwingConstants.CENTER);

		JTextField txtGnero = new JTextField();
		txtGnero.setText("G\u00EAnero");
		txtGnero.setForeground(Color.LIGHT_GRAY);
		txtGnero.setVisible(false);
		txtGnero.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtGnero.setBounds(42, 159, 182, 25);
		pnEspecial.add(txtGnero);
		txtGnero.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(42, 144, 182, 2);
		separator.setVisible(false);
		pnEspecial.add(separator);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(200, 8, 24, 25);
		label_1.setIcon(new ImageIcon(Client_Registration.class.getResource("/images/faqs.png")));
		pnEspecial.add(label_1);

		rdbtnMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnMasculino.isSelected()) {
					rdbtnFeminino.setSelected(false);
					rdbtnPersonalizado.setSelected(false);
					setBounds(100, 100, 600, 650);
					setLocationRelativeTo(null); // centralizarFrame
					setResizable(false);
					txtGnero.setVisible(false);
					separator.setVisible(false);
					pnEspecial.setBounds(67, 348, 471, 147);
					pnBaixo.setBounds(0, 562, 594, 53);
					SALVAR.setBounds(253, 508, 114, 41);

				}

			}
		});

		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				rdbtnMasculino.setSelected(false);
				rdbtnPersonalizado.setSelected(false);
				setBounds(100, 100, 600, 650);
				setLocationRelativeTo(null); // centralizarFrame
				setResizable(false);
				txtGnero.setVisible(false);
				separator.setVisible(false);
				pnEspecial.setBounds(67, 348, 471, 147);
				pnBaixo.setBounds(0, 562, 594, 53);
				SALVAR.setBounds(253, 508, 114, 41);
			}
		});

		rdbtnPersonalizado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (rdbtnPersonalizado.isSelected()) {
					rdbtnMasculino.setSelected(false);
					rdbtnFeminino.setSelected(false);

					setBounds(100, 100, 600, 700);
					setLocationRelativeTo(null); // centralizarFrame
					setResizable(false); // bloquearMaximizar

					txtGnero.setVisible(true);
					separator.setVisible(true);

					pnEspecial.setBounds(67, 348, 471, 197);
					pnBaixo.setBounds(0, 612, 594, 53);
					SALVAR.setBounds(253, 558, 113, 41);

				} else {
					setBounds(100, 100, 600, 650);
					setLocationRelativeTo(null); // centralizarFrame
					setResizable(false);
					txtGnero.setVisible(false);
					separator.setVisible(false);
					pnEspecial.setBounds(67, 348, 471, 147);
					pnBaixo.setBounds(0, 562, 594, 53);
					SALVAR.setBounds(253, 508, 114, 41);

				}
			}
		});

		JPanel pnEndereco = new JPanel();
		pnEndereco.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnEndereco.setBackground(new Color(0, 102, 250));
		pnEndereco.setForeground(Color.WHITE);
		pnEndereco.setBounds(92, 230, 430, 119);
		contentPane.add(pnEndereco);
		pnEndereco.setLayout(null);

		txtBairro = new JTextField();
		txtBairro.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtBairro.setBounds(230, 40, 182, 26);
		pnEndereco.add(txtBairro);
		txtBairro.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtBairro.setForeground(Color.LIGHT_GRAY);
		txtBairro.setText("Bairro");
		txtBairro.setColumns(10);

		txtFEndereco = new JTextField();// CAMPO DO ENDERECO
		txtFEndereco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (txtFEndereco.getText().equals("Logradouro")) {

					txtFEndereco.setText("");
					txtFEndereco.setForeground(Color.BLACK);
				}

			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (txtFEndereco.getText().isEmpty()) {
					txtFEndereco.setForeground(Color.LIGHT_GRAY);
					txtFEndereco.setText("Logradouro");
				}
			}
		});
		txtFEndereco.setBounds(25, 40, 182, 25);
		pnEndereco.add(txtFEndereco);
		txtFEndereco.setForeground(Color.LIGHT_GRAY);
		txtFEndereco.setText("Logradouro");
		txtFEndereco.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtFEndereco.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtFEndereco.setColumns(10);

		JFormattedTextField txtFCep = new JFormattedTextField();// CAMPO QUE USA
																// A MASCARA DO
																// CEP
		txtFCep.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFCep.setForeground(Color.BLACK);
				txtFCep.setText("");
				ftmCEP.install(txtFCep);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (txtFCep.getText().trim().length() < 9) {
					ftmCEP.uninstall();
					txtFCep.setForeground(Color.LIGHT_GRAY);
					txtFCep.setText("CEP");
				}
			}
		});

		txtFCep.setBounds(25, 80, 182, 25);
		pnEndereco.add(txtFCep);
		txtFCep.setForeground(Color.LIGHT_GRAY);
		txtFCep.setText("CEP");
		txtFCep.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtFCep.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		txtNmero = new JTextField();
		txtNmero.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtNmero.setBounds(230, 80, 182, 25);
		pnEndereco.add(txtNmero);
		txtNmero.setForeground(Color.LIGHT_GRAY);
		txtNmero.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtNmero.setHorizontalAlignment(SwingConstants.LEFT);
		txtNmero.setText("N\u00FAmero");
		txtNmero.setColumns(10);

		JPanel pnEnd = new JPanel();
		pnEnd.setBounds(0, 0, 430, 24);
		pnEndereco.add(pnEnd);
		pnEnd.setLayout(null);

		JLabel lblDadosPessoais = new JLabel("Endere\u00E7o");
		lblDadosPessoais.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblDadosPessoais.setBounds(0, 0, 430, 24);
		pnEnd.add(lblDadosPessoais);
		lblDadosPessoais.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadosPessoais.setForeground(Color.GRAY);
		lblDadosPessoais.setFont(new Font("SansSerif", Font.BOLD, 17));

		JPanel pnDadosPessoais = new JPanel();
		pnDadosPessoais.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnDadosPessoais.setBackground(new Color(0, 191, 255));
		pnDadosPessoais.setBounds(102, 112, 411, 119);
		contentPane.add(pnDadosPessoais);
		pnDadosPessoais.setLayout(null);
		
	

		JLabel lblW2 = new JLabel("!");
		lblW2.setVisible(false);
		lblW2.setHorizontalAlignment(SwingConstants.CENTER);
		lblW2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblW2.setForeground(Color.RED);
		lblW2.setBounds(377, 42, 20, 19);
		pnDadosPessoais.add(lblW2);

		JLabel lblW3 = new JLabel("!");
		lblW3.setVisible(false);
		lblW3.setForeground(Color.RED);
		lblW3.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblW3.setHorizontalAlignment(SwingConstants.CENTER);
		lblW3.setBounds(170, 84, 19, 20);
		pnDadosPessoais.add(lblW3);


		txtFNome = new JTextField();// CAMPO PRO USUÁRIO DIGITAR O NOME
		txtFNome.setBounds(10, 40, 182, 25);
		txtFNome.setForeground(Color.LIGHT_GRAY);
		txtFNome.setText("Nome");
		txtFNome.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtFNome.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtFNome.setColumns(10);
		pnDadosPessoais.add(txtFNome);

		
		txtFNome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				if (txtFNome.getText().isEmpty()) {
					
					txtFNome.setText("Nome");
					txtFNome.setForeground(Color.LIGHT_GRAY);
					txtFNome.setBorder(new LineBorder(Color.BLACK, 1, true));

				}
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (txtFNome.getText().equals("Nome")) {
					
					txtFNome.setText("");
					txtFNome.setForeground(Color.black);
				}
			}

		});

		txtFEmail = new JTextField();
		txtFEmail.setBounds(10, 80, 182, 25);
		pnDadosPessoais.add(txtFEmail);
		txtFEmail.setForeground(Color.LIGHT_GRAY);
		txtFEmail.setText("Email");
		txtFEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtFEmail.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtFEmail.setBorder(new LineBorder(Color.BLACK));
		txtFEmail.setColumns(10);

		txtFEmail.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (txtFEmail.getText().equals("Email")) {
					txtFEmail.setText("");
					txtFEmail.setForeground(Color.BLACK);
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (txtFEmail.getText().isEmpty()) {
					txtFEmail.setText("Email");
					txtFEmail.setForeground(Color.LIGHT_GRAY);
				}
			}
		});

		JFormattedTextField txtFTelefone = new JFormattedTextField();// CAMPO
																		// QUE
																		// USA A
																		// MASCARA
																		// DO
																		// TELEFONE
		txtFTelefone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtFTelefone.setForeground(Color.BLACK);
				txtFTelefone.setText("");
				ftmTelefone.install(txtFTelefone);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (txtFTelefone.getText().trim().length() < 14) {
					ftmTelefone.uninstall();
					txtFTelefone.setForeground(Color.LIGHT_GRAY);
					txtFTelefone.setText("Telefone");
				}
			}
		});

		txtFTelefone.setBounds(217, 80, 182, 25);
		pnDadosPessoais.add(txtFTelefone);
		txtFTelefone.setForeground(Color.LIGHT_GRAY);
		txtFTelefone.setText("Telefone");
		txtFTelefone.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtFTelefone.setBorder(new LineBorder(Color.BLACK));

		JFormattedTextField txtFCPF = new JFormattedTextField();
		txtFCPF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFCPF.setForeground(Color.BLACK);
				txtFCPF.setText("");
				ftmCPF.install(txtFCPF);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (txtFCPF.getText().trim().length() < 14) {
					ftmCPF.uninstall();
					txtFCPF.setForeground(Color.LIGHT_GRAY);
					txtFCPF.setText("CPF");
				}
			}
		});
		txtFCPF.setBounds(217, 40, 182, 25);
		pnDadosPessoais.add(txtFCPF);
		txtFCPF.setForeground(Color.LIGHT_GRAY);
		txtFCPF.setText("CPF");
		txtFCPF.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtFCPF.setBorder(new LineBorder(Color.BLACK));

		JPanel pnDpessoais = new JPanel();
		pnDpessoais.setBounds(0, 0, 411, 24);
		pnDadosPessoais.add(pnDpessoais);
		pnDpessoais.setLayout(null);

		JLabel lblDadosPessoais_1 = new JLabel("Dados Pessoais");
		lblDadosPessoais_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblDadosPessoais_1.setBounds(0, 0, 411, 24);
		lblDadosPessoais_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadosPessoais_1.setForeground(Color.GRAY);
		lblDadosPessoais_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		pnDpessoais.add(lblDadosPessoais_1);
		
				
				JLabel lblW1 = new JLabel("!");
				lblW1.setBounds(191, 41, 19, 20);
				pnDadosPessoais.add(lblW1);
				lblW1.setForeground(Color.RED);
				lblW1.setHorizontalAlignment(SwingConstants.CENTER);
				lblW1.setVisible(false);
				lblW1.setFont(new Font("SansSerif", Font.BOLD, 15));

		// AÇÃO DO BOTÃO SALVAR

		SALVAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// String cpff = txtFCPF.getText().replaceAll("\\.", "");
				// String cpfff = cpff.replaceAll("\\-", ""); // CONVERTER CPF'S
				// EM SÓ NÚMEROS
			
				
				contentPane.setComponentZOrder(lblW1, 4);

				if (txtFNome.getText().isEmpty() || txtFNome.getText().trim().equals("Nome")) {
					lblW1.setBounds(10, 40, 544, 250);
					lblW1.setVisible(true);
					lblW1.setForeground(Color.RED);
					txtFNome.setBorder(borda);

				} else {
					
					
				}

				if (txtFCPF.getText().isEmpty() || txtFCPF.getText().equals("CPF")) {
					lblW2.setVisible(true);
					lblW2.setForeground(Color.RED);
					txtFCPF.setBorder(borda);
				}
				
				if (txtFEmail.getText().isEmpty() || txtFEmail.getText().equals("Email")) {
					lblW3.setVisible(true);
					lblW3.setForeground(Color.RED);
					txtFEmail.setBorder(borda);
				}

			}
		});

		// SALVAR
	}
}
