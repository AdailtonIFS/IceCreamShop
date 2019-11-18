package Employees;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JDateChooser;

import Class.Employee;
import Class.Person;

public class Employee_Registration extends JFrame {

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
	private JTextField txtFSalario;
	private JTextField txtBairro;
	private JTextField txtNmero;
	private JTextField txtFCargo;
	public static ArrayList<Object> valores = new ArrayList<Object>();

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
					Employee_Registration frame = new Employee_Registration();
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

	public Employee_Registration() throws ParseException {
		
		Font dropthegame1 = null;
		
		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("AquateScript_PERSONAL_USE_ONLY.ttf")).deriveFont(50f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			
		}

		setIconImage(Toolkit.getDefaultToolkit().getImage(Employee_Registration.class.getResource("/images/internet.png")));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		
		ftmTelefone = new MaskFormatter("(##)#####-####");
		ftmCPF = new MaskFormatter("###.###.###-##");
		ftmCEP = new MaskFormatter("#####-###");

		Employee Em = new Employee();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		setLocationRelativeTo(null); // centralizarFrame
		setResizable(false); // bloquearMaximizar
		setUndecorated(true);

//		 bloquearFrame
		 this.addComponentListener(new ComponentAdapter() {
		
		 public void componentMoved(ComponentEvent e) {
		
		 setEnabled(false);
		
		 setEnabled(true);
		 	}
		 });

		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new LineBorder(Color.BLACK, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel pnEspecial = new JPanel();
		pnEspecial.setBackground(new Color(255, 250, 250));
		pnEspecial.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnEspecial.setBounds(0, 81, 600, 569);
		contentPane.add(pnEspecial);
		pnEspecial.setLayout(null);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(0, 180, 600, 25);
		pnEspecial.add(lblDataDeNascimento);
		lblDataDeNascimento.setForeground(Color.BLACK);
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataDeNascimento.setFont(new Font("Segoe UI", Font.BOLD, 17));

		JLabel lblGnero = new JLabel("G\u00EAnero");
		lblGnero.setBounds(0, 253, 600, 25);
		pnEspecial.add(lblGnero);
		lblGnero.setHorizontalAlignment(SwingConstants.CENTER);
		lblGnero.setForeground(Color.BLACK);
		lblGnero.setFont(new Font("Segoe UI", Font.BOLD, 17));

		JRadioButton rdbtnPersonalizado = new JRadioButton("PERSONALIZADO");
		rdbtnPersonalizado.setBorder(new LineBorder(new Color(0, 0, 0)));
		rdbtnPersonalizado.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPersonalizado.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnPersonalizado.setBounds(39, 337, 210, 25);
		pnEspecial.add(rdbtnPersonalizado);

		JRadioButton rdbtnMasculino = new JRadioButton("MASCULINO");
		rdbtnMasculino.setBorder(new LineBorder(new Color(0, 0, 0)));
		rdbtnMasculino.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnMasculino.setBounds(39, 291, 210, 25);
		pnEspecial.add(rdbtnMasculino);
		rdbtnMasculino.setHorizontalAlignment(SwingConstants.CENTER);

		JRadioButton rdbtnFeminino = new JRadioButton("FEMININO");
		rdbtnFeminino.setBorder(new LineBorder(new Color(0, 0, 0)));
		rdbtnFeminino.setFont(new Font("Dialog", Font.PLAIN, 13));
		rdbtnFeminino.setBounds(342, 291, 210, 25);
		pnEspecial.add(rdbtnFeminino);
		rdbtnFeminino.setHorizontalAlignment(SwingConstants.CENTER);

		JTextField txtGnero = new JTextField();
		txtGnero.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		txtGnero.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {

				if (txtGnero.isEditable() == true) {
					if (txtGnero.getText().equalsIgnoreCase("Gênero")) {

						txtGnero.setText("");
						txtGnero.setForeground(Color.black);
						txtGnero.setBorder(new LineBorder(new Color(26,115, 232), 2, true));

					}

				}
			}// fimAcao

			@Override
			public void focusLost(FocusEvent e) {
				if (txtGnero.getText().isEmpty()) {

					txtGnero.setText("Gênero");
					txtGnero.setForeground(new Color(128, 128, 128));

				}
				txtGnero.setBorder(new LineBorder(Color.BLACK, 2, true));

			}// fimAcao
		});

		txtGnero.setEditable(false);
		txtGnero.setText("G\u00EAnero");
		txtGnero.setForeground(new Color(128, 128, 128));
		txtGnero.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtGnero.setBounds(342, 335, 210, 25);
		pnEspecial.add(txtGnero);
		txtGnero.setColumns(10);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(215, 120, 24, 25);
		pnEspecial.add(label_1);

		// ------------------------------------------------------------------------------------------------------------
		// ==================================__Campo_Nome__===================================
		txtFNome = new JTextField();
		txtFNome.setBounds(43, 50, 210, 25);
		txtFNome.setForeground(new Color(128, 128, 128));
		txtFNome.setText("Nome");
		txtFNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtFNome.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		txtFNome.setColumns(10);
		pnEspecial.add(txtFNome);
		// =================================__ACÃO__NO__txtField===============================
		txtFNome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {

				if (txtFNome.getText().equalsIgnoreCase("Nome")) {

					txtFNome.setText("");
					txtFNome.setForeground(Color.black);

				}
				txtFNome.setBorder(new LineBorder(new Color(26,115, 232), 2, true));

			}// fimAcao

			@Override
			public void focusLost(FocusEvent e) {
				if (txtFNome.getText().isEmpty()) {

					txtFNome.setText("Nome");
					txtFNome.setForeground(new Color(128, 128, 128));

				}
				txtFNome.setBorder(new LineBorder(Color.BLACK, 2, true));

			}// fimAcao
		});
		// =====================================__FIM__======================================
		// ------------------------------------------------------------------------------------------------------------

		// -------------------------------------------------------------------------------------------------------------
		// ==================================__Campo_CPF__===================================
		JFormattedTextField txtFCPF = new JFormattedTextField();
		txtFCPF.setBounds(342, 50, 210, 25);
		txtFCPF.setForeground(new Color(128, 128, 128));
		txtFCPF.setText("CPF");
		txtFCPF.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtFCPF.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pnEspecial.add(txtFCPF);
		// =================================__Ação__no__CampoCPF==============================

		txtFCPF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {

				txtFCPF.setForeground(Color.BLACK);
				txtFCPF.setText("");
				ftmCPF.install(txtFCPF);
				txtFCPF.setBorder(new LineBorder(new Color(26,115, 232), 2, true));

			}// fimAcao

			@Override
			public void focusLost(FocusEvent e) {

				if (txtFCPF.getText().trim().length() < 14) {
					ftmCPF.uninstall();
					txtFCPF.setForeground(new Color(128, 128, 128));
					txtFCPF.setText("CPF");
				}
				txtFCPF.setBorder(new LineBorder(Color.BLACK, 2, true));

			}// fimAcao
		});

		// =====================================__FIM__========================================
		// ---------------------------------------------------------------------------------------------------------------

		// ---------------------------------------------------------------------------------------------------------------
		// ==================================__Campo_Email__===================================
		txtFSalario = new JTextField();
		txtFSalario.setBounds(43, 88, 210, 25);
		txtFSalario.setForeground(new Color(128, 128, 128));
		txtFSalario.setText("Sal\u00E1rio");
		txtFSalario.setHorizontalAlignment(SwingConstants.LEFT);
		txtFSalario.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtFSalario.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		txtFSalario.setColumns(10);
		pnEspecial.add(txtFSalario);
		// =================================__Ação__no__CampoEmail==============================
		txtFSalario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {

				if (txtFSalario.getText().equalsIgnoreCase("Salário")) {
					txtFSalario.setText("");
					txtFSalario.setForeground(Color.BLACK);
				}
				txtFSalario.setBorder(new LineBorder(new Color(26,115, 232), 2, true));


			}// fimAcao

			@Override
			public void focusLost(FocusEvent e) {

				if (txtFSalario.getText().isEmpty()) {
					txtFSalario.setText("Salário");
					txtFSalario.setForeground(new Color(128, 128, 128));
					
				}
				txtFSalario.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

			}// fimAcao
		});

		// =====================================__FIM__========================================
		// ----------------------------------------------------------------------------------------------------------------

		// ----------------------------------------------------------------------------------------------------------------
		// ==================================__Campo_Telefone__===================================
		JFormattedTextField txtFTelefone = new JFormattedTextField();// CAMPO
		txtFTelefone.setBounds(342, 88, 210, 25);
		txtFTelefone.setForeground(new Color(128, 128, 128));
		txtFTelefone.setText("Telefone");
		txtFTelefone.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtFTelefone.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnEspecial.add(txtFTelefone);
		// =================================__Ação__no__CampoTelefone=============================

		txtFTelefone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {

				txtFTelefone.setForeground(Color.BLACK);
				txtFTelefone.setText("");
				ftmTelefone.install(txtFTelefone);
				txtFTelefone.setBorder(new LineBorder(new Color(26,115, 232), 2, true));

			}// fimAcao

			@Override
			public void focusLost(FocusEvent e) {

				if (txtFTelefone.getText().trim().length() < 14) {

					ftmTelefone.uninstall();
					txtFTelefone.setForeground(new Color(128, 128, 128));
					txtFTelefone.setText("Telefone");

				}
				txtFTelefone.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

			}// fimAcao
		});
		// =====================================__FIM__========================================
		// ----------------------------------------------------------------------------------------------------------------

		// ----------------------------------------------------------------------------------------------------------------
		// ==================================__Campo_Endereco__===================================
		txtFEndereco = new JTextField();
		txtFEndereco.setBounds(43, 472, 210, 25);
		txtFEndereco.setForeground(new Color(128, 128, 128));
		txtFEndereco.setText("Logradouro");
		txtFEndereco.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtFEndereco.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		txtFEndereco.setColumns(10);
		pnEspecial.add(txtFEndereco);
		// =================================__Ação__no__CampoEndereco=============================

		txtFEndereco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtFEndereco.getText().equalsIgnoreCase("Logradouro")) {

					txtFEndereco.setText("");
					txtFEndereco.setForeground(Color.BLACK);
				}
				txtFEndereco.setBorder(new LineBorder(new Color(26,115, 232), 2, true));

			}// fimAcao

			@Override
			public void focusLost(FocusEvent e) {

				if (txtFEndereco.getText().isEmpty()) {

					txtFEndereco.setForeground(new Color(128, 128, 128));
					txtFEndereco.setText("Logradouro");

				}
				txtFEndereco.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

			}// fimAcao
		});

		// =====================================__FIM__========================================
		// ----------------------------------------------------------------------------------------------------------------

		// ----------------------------------------------------------------------------------------------------------------
		// ==================================__Campo_Bairro__===================================
		txtBairro = new JTextField();
		txtBairro.setBounds(342, 472, 210, 25);
		txtBairro.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		txtBairro.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtBairro.setForeground(new Color(128, 128, 128));
		txtBairro.setText("Bairro");
		txtBairro.setColumns(10);
		pnEspecial.add(txtBairro);
		// =================================__Ação__no__CampoBairro=============================
		txtBairro.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtBairro.getText().equalsIgnoreCase("Bairro")) {

					txtBairro.setText("");
					txtBairro.setForeground(Color.BLACK);
				}
				txtBairro.setBorder(new LineBorder(new Color(26,115, 232), 2, true));


			}// fimAcao

			@Override
			public void focusLost(FocusEvent e) {

				if (txtBairro.getText().isEmpty()) {

					txtBairro.setForeground(new Color(128, 128, 128));
					txtBairro.setText("Bairro");

				}
				txtBairro.setBorder(new LineBorder(Color.BLACK, 2, true));

			}// fimAcao
		});

		// =====================================__FIM__========================================
		// ----------------------------------------------------------------------------------------------------------------

		// ----------------------------------------------------------------------------------------------------------------
		// ==================================__Campo_CEP__===================================

		JFormattedTextField txtFCep = new JFormattedTextField();
		txtFCep.setColumns(10);
		txtFCep.setBounds(43, 434, 210, 25);
		txtFCep.setForeground(new Color(128, 128, 128));
		txtFCep.setText("CEP");
		txtFCep.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtFCep.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pnEspecial.add(txtFCep);

		// =================================__Ação__no__CampoCEP=============================
		txtFCep.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {

				txtFCep.setForeground(Color.BLACK);
				txtFCep.setText("");
				ftmCEP.install(txtFCep);
				txtFCep.setBorder(new LineBorder(new Color(26,115, 232), 2, true));

			}// fimAcao

			@Override
			public void focusLost(FocusEvent e) {

				if (txtFCep.getText().trim().length() < 9) {
					ftmCEP.uninstall();
					txtFCep.setForeground(new Color(128, 128, 128));
					txtFCep.setText("CEP");

				}
				txtFCep.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

			}// fimAcao
		});
		// =====================================__FIM__========================================
		// ----------------------------------------------------------------------------------------------------------------

		// ----------------------------------------------------------------------------------------------------------------
		// ==================================__Campo_Numero__===================================

		txtNmero = new JTextField();
		txtNmero.setBounds(283, 473, 33, 36);
		pnEspecial.add(txtNmero);
		txtNmero.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		txtNmero.setForeground(new Color(128, 128, 128));
		txtNmero.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNmero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNmero.setText("n\u00B0");
		txtNmero.setColumns(10);

		// =================================__Ação__no__CampoNumero=============================

		txtNmero.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {

				if (txtNmero.getText().equalsIgnoreCase("n°")) {

					txtNmero.setText("");
					txtNmero.setForeground(Color.BLACK);
				}
				txtNmero.setBorder(new LineBorder(new Color(26,115, 232), 2, true));

			}// fimAcao

			@Override
			public void focusLost(FocusEvent e) {

				if (txtNmero.getText().isEmpty()) {

					txtNmero.setForeground(new Color(128, 128, 128));
					txtNmero.setText("n°");

				}
				txtNmero.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

			}// fimAcao
		});

		JPanel pnDadosPessoais = new JPanel();
		pnDadosPessoais.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnDadosPessoais.setBounds(0, 0, 600, 25);
		pnDadosPessoais.setLayout(null);
		pnEspecial.add(pnDadosPessoais);

		JLabel lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setBounds(0, 0, 600, 25);
		pnDadosPessoais.add(lblDadosPessoais);
		lblDadosPessoais.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblDadosPessoais.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosPessoais.setForeground(Color.BLACK);
		lblDadosPessoais.setFont(new Font("Segoe UI Black", Font.BOLD, 17));

		JPanel pnEndereco = new JPanel();
		pnEndereco.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnEndereco.setBounds(0, 375, 600, 24);
		pnEspecial.add(pnEndereco);
		pnEndereco.setLayout(null);

		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setBounds(0, 0, 600, 24);
		pnEndereco.add(lblEndereco);
		lblEndereco.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco.setForeground(Color.BLACK);
		lblEndereco.setFont(new Font("Segoe UI Black", Font.BOLD, 17));

		JDateChooser DateN = new JDateChooser();
		DateN.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		DateN.setBounds(197, 218, 206, 22);
		pnEspecial.add(DateN);

		JLabel lblNoSeiMeu = new JLabel("N\u00E3o sei o meu cep?");
		lblNoSeiMeu.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoSeiMeu.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNoSeiMeu.setForeground(new Color(84, 134, 210));
		lblNoSeiMeu.setBounds(342, 434, 210, 25);
		pnEspecial.add(lblNoSeiMeu);

		lblNoSeiMeu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Runtime.getRuntime()
							.exec("cmd.exe /C start chrome.exe http://www.buscacep.correios.com.br/sistemas/buscacep/");
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Não foi possível conectar a internet");
				}
			}

			@SuppressWarnings("deprecation")
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(HAND_CURSOR);
			}
		});

		// Jseparator's
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(299, 38, 1, 115);
		pnEspecial.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(299, 280, 1, 82);
		pnEspecial.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(270, 411, 1, 92);
		pnEspecial.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setBounds(328, 411, 1, 92);
		pnEspecial.add(separator_3);

		// fechar

		txtFCargo = new JTextField();
		txtFCargo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtFCargo.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtFCargo.setText("Cargo");
		txtFCargo.setBounds(43, 126, 210, 25);
		txtFCargo.setForeground(new Color(128, 128, 128));
		txtFCargo.setColumns(10);
		pnEspecial.add(txtFCargo);

		txtFCargo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {

				if (txtFCargo.getText().equalsIgnoreCase("Cargo")) {

					txtFCargo.setText("");
					txtFCargo.setForeground(Color.BLACK);

				}
				txtFCargo.setBorder(new LineBorder(new Color(26,115, 232), 2, true));

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtFCargo.getText().isEmpty()) {

					txtFCargo.setForeground(new Color(128, 128, 128));
					txtFCargo.setText("Cargo");

				}
				txtFCargo.setBorder(new LineBorder(Color.BLACK,2,true));

			}
		});

		JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setBounds(455, 128, 45, 25);
		pnEspecial.add(rdbtnA);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("B");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			rdbtnA.setSelected(false);
			}
		});
		rdbtnA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				rdbtnNewRadioButton.setSelected(false);
			}
		});
		
		
		
		
		
		rdbtnNewRadioButton.setBounds(507, 128, 45, 25);
		pnEspecial.add(rdbtnNewRadioButton);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblTipo.setBounds(342, 128, 210, 25);
		pnEspecial.add(lblTipo);
				
				JPanel btnSalvar = new JPanel();
				btnSalvar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				btnSalvar.setBackground(Color.GRAY);
				btnSalvar.setBounds(455, 531, 136, 31);
				pnEspecial.add(btnSalvar);
				btnSalvar.setLayout(null);
				
				JLabel lblCadastrar = new JLabel("Cadastrar");
				lblCadastrar.setToolTipText("Cadastrar o Cliente");
				lblCadastrar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String cp = txtFCPF.getText().replace(".", "");
						String cpf = cp.replace("-", "");
					
						
						boolean b = false;
						
						
						try {
							b = DataBase.Functions.cadastroSistema("employee", txtFCPF.getText());
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						if(b == false){
						
						
						if (Person.isCPF(cpf) == true && !txtFNome.getText().equalsIgnoreCase("Nome") && !txtFCPF.getText().equalsIgnoreCase("CPF")
								&& !txtFCargo.getText().equalsIgnoreCase("Cargo")
								&& (rdbtnA.isSelected() == true || rdbtnNewRadioButton.isSelected() == true)
								&& !txtFTelefone.getText().equalsIgnoreCase("Telefone")
								&& !txtFEndereco.getText().equalsIgnoreCase("Logradouro")
								&& !txtNmero.getText().equalsIgnoreCase("Número")
								&& !txtBairro.getText().equalsIgnoreCase("Bairro") && !txtFCep.getText().equalsIgnoreCase("CEP")
								&& DateN.getDate() != null && !txtFSalario.getText().equalsIgnoreCase("Salário")) {
		
							// gettando the irformations for user
		
							Em.setName(txtFNome.getText());
							valores.add(Em.getName());
							Em.setCPF(txtFCPF.getText());
							valores.add(Em.getCPF());
							Em.setPhone(txtFTelefone.getText());
							valores.add(Em.getPhone());
							String endereco = String.format("%s n° %s, %s ", txtFEndereco.getText(), txtNmero.getText(),
									txtBairro.getText());
							Em.setAdress(endereco);
							valores.add(Em.getAdress());
							Em.setCEP(txtFCep.getText());
							valores.add(Em.getCEP());
		
							SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
							String result = out.format(DateN.getDate());
		
							Em.setDataNascimento(result);
							valores.add(Em.getDataNascimento());
		
							Em.setSalar(Double.parseDouble(txtFSalario.getText()));
							valores.add(Em.getSalar());
		
							Em.setOffice(txtFCargo.getText());
							valores.add(Em.getOffice());
							
							
							// gettando the sex
		
							if (rdbtnMasculino.isSelected() == true) {
								Em.setSex(rdbtnMasculino.getText());
								valores.add(Em.getSex());
							} else if (rdbtnFeminino.isSelected() == true) {
								Em.setSex(rdbtnFeminino.getText());
								valores.add(Em.getSex());
		
							} else if (rdbtnPersonalizado.isSelected() == true
									&& !txtGnero.getText().equalsIgnoreCase("Gênero")) {
								Em.setSex(txtGnero.getText());
								valores.add(Em.getSex());
		
							}
		
							// end gettar sex
		
							
							
							
							if (rdbtnA.isSelected() == true) {
								Em.setType(rdbtnA.getText());
								valores.add(Em.getType());
								try {
									Employee_Registration_LoginandPass frame = new Employee_Registration_LoginandPass();
									frame.setVisible(true);
								} catch (Exception e1) {
									e1.printStackTrace();
								}
							} else if (rdbtnNewRadioButton.isSelected() == true) {
								Em.setType(rdbtnNewRadioButton.getText());
								valores.add(Em.getType());
							}
		
							// end get the information
						
		
							for (int i = 0; i < valores.size(); i++) {
								System.out.println(valores.get(i));
								}
							}
						
		
						else {
		
							JOptionPane.showMessageDialog(null, "Preencha todos os dados corretamente", "AVISO", 2);
		
							// Caso o usuario deixe algo sem preencher
		
						}
						}else {
							JOptionPane.showMessageDialog(null, "Funcionário já cadastrado", "AVISO", 2);
	
						}
						
						
					}
					@SuppressWarnings("deprecation")
					@Override
					public void mouseEntered(MouseEvent e) {
						btnSalvar.setBackground(Color.WHITE);
						lblCadastrar.setForeground(Color.GRAY);
						lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
						setCursor(HAND_CURSOR);
						
					}
					@SuppressWarnings("deprecation")
					@Override
					public void mouseExited(MouseEvent e) {
						btnSalvar.setBackground(Color.GRAY);
						lblCadastrar.setForeground(Color.WHITE);
						lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
						setCursor(DEFAULT_CURSOR);
					}
				});
				lblCadastrar.setForeground(Color.WHITE);
				lblCadastrar.setHorizontalAlignment(SwingConstants.CENTER);
				lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
				lblCadastrar.setBounds(0, 0, 136, 31);
				btnSalvar.add(lblCadastrar);
				
				JPanel btnVoltar = new JPanel();
				btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				btnVoltar.setBounds(8, 531, 136, 31);
				btnVoltar.setBackground(new Color(220,80,53));
				pnEspecial.add(btnVoltar);
				btnVoltar.setLayout(null);
				
				JLabel lblVoltar = new JLabel("Voltar");
				lblVoltar.setForeground(Color.WHITE);
				lblVoltar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
				lblVoltar.setHorizontalAlignment(SwingConstants.CENTER);
				lblVoltar.setToolTipText("Voltar as configurações");
				lblVoltar.setBounds(0, 0, 136, 31);
				btnVoltar.add(lblVoltar);
				
				lblVoltar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
					@SuppressWarnings("deprecation")
					@Override
					public void mouseEntered(MouseEvent e) {
						lblVoltar.setForeground(new Color(220,80,53));
						btnVoltar.setBackground(Color.WHITE);
						lblVoltar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
						setCursor(HAND_CURSOR);
					}
					@SuppressWarnings("deprecation")
					@Override
					public void mouseExited(MouseEvent e) {
						lblVoltar.setForeground(Color.WHITE);
						btnVoltar.setBackground(new Color(220,80,53));
						lblVoltar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
						setCursor(DEFAULT_CURSOR);

					}
				});
				
				JPanel panel = new JPanel();
				panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.setOpaque(false);
				panel.setBounds(283, 423, 33, 36);
				pnEspecial.add(panel);
				panel.setLayout(null);
				
				JLabel label = new JLabel("");
				label.setToolTipText("Buscar Endere\u00E7o");
				label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {

						if (txtFCep.getText().trim().length() < 9) {

							JOptionPane.showMessageDialog(null, "Informe o seu CEP", "AVISO", 2);

						} else {

							String cep = txtFCep.getText().replaceAll("-", "");
							Person p = new Person();

							try {
								if (!p.Consultbairro(cep).equals(cep) && !p.ConsultEndereco(cep).equals(cep)) {
									txtBairro.setForeground(Color.BLACK);
									txtFEndereco.setForeground(Color.BLACK);
									txtBairro.setText(p.Consultbairro(cep));
									txtFEndereco.setText(p.ConsultEndereco(cep));

								} else {
									JOptionPane.showMessageDialog(null, "Cep inválido", "Aviso", 2);
								}
							} catch (HeadlessException | IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

						} // Se o cep não for válido
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						label.setBorder(new LineBorder(new Color(26,115, 232), 2, true));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
					}
				});
				label.setBounds(0, 0, 33, 36);
				label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/images/search.png")));
				panel.add(label);

		rdbtnMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnMasculino.isSelected()) {

					rdbtnFeminino.setSelected(false);
					rdbtnPersonalizado.setSelected(false);

					txtGnero.setEditable(false);
					txtGnero.setText("Gênero");
					txtGnero.setForeground(new Color(128, 128, 128));
					txtGnero.setBorder(new LineBorder(Color.BLACK, 1, true));

				}

			}
		});

		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				rdbtnMasculino.setSelected(false);
				rdbtnPersonalizado.setSelected(false);

				txtGnero.setEditable(false);
				txtGnero.setText("Gênero");
				txtGnero.setForeground(new Color(128, 128, 128));
				txtGnero.setBorder(new LineBorder(Color.BLACK, 1, true));

			}
		});

		rdbtnPersonalizado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMasculino.setSelected(false);
				rdbtnFeminino.setSelected(false);
				txtGnero.setEditable(true);

			}
		});
		
		JPanel panelCima = new JPanel();
		panelCima.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCima.setBounds(0, 0, 600, 81);
		panelCima.setBackground(new Color(28, 189, 127));

		contentPane.add(panelCima);
		panelCima.setLayout(null);
		
		JLabel label_2 = new JLabel("Ice Cream Shop");
		label_2.setBounds(0, 0, 600, 81);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(dropthegame1);
		panelCima.add(label_2);

	} // fecharClass
} // Fechar Frame