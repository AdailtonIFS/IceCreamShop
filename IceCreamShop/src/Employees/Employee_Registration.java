package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JSpinField;

public class Employee_Registration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JPanel pnDadosPessoais;
	private JLabel lblDadosPessoais;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JLabel lblDataNascimento;
	private JLabel lblGnero;
	private JTextField txtLogradouror;
	private JTextField txtBairro;
	private JTextField txtCep;
	private JTextField txtNmero;

	/**
	 * Launch the application.
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
	 */
	@SuppressWarnings("unchecked")
	public Employee_Registration() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setLocationRelativeTo(null); // centralizarFrame
		setResizable(false); // bloquearMaximizar
		
//		//bloquearFrame
//			this.addComponentListener(new ComponentAdapter() {
//
//				public void componentMoved(ComponentEvent e) {
//
//				setEnabled(false);
//
//				setEnabled(true);
//				}
//		});
			
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel pnEspecial = new JPanel();
		pnEspecial.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnEspecial.setBounds(63, 35, 468, 453);
		pnEspecial.setBackground(new Color(255, 250, 250));
		contentPane.add(pnEspecial);
		pnEspecial.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(37, 48, 182, 25);
		pnEspecial.add(txtNome);
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNome.setText("Nome:");
		txtNome.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtNome.setForeground(new Color(128, 128, 128));
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCpf.setText("CPF");
		txtCpf.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtCpf.setForeground(new Color(128, 128, 128));
		txtCpf.setBounds(257, 48, 182, 25);
		pnEspecial.add(txtCpf);
		txtCpf.setColumns(10);
		
		pnDadosPessoais = new JPanel();
		pnDadosPessoais.setBorder(new LineBorder(Color.BLACK, 1, true));
		pnDadosPessoais.setBounds(0, 0, 468, 25);
		pnEspecial.add(pnDadosPessoais);
		pnDadosPessoais.setLayout(null);
		
		lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosPessoais.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDadosPessoais.setBounds(0, 0, 468, 25);
		pnDadosPessoais.add(lblDadosPessoais);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtEmail.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtEmail.setForeground(new Color(128, 128, 128));
		txtEmail.setBounds(37, 82, 182, 25);
		pnEspecial.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtTelefone.setText("Telefone");
		txtTelefone.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		txtTelefone.setBounds(257, 82, 182, 25);
		txtTelefone.setForeground(new Color(128, 128, 128));
		txtTelefone.setColumns(10);
		pnEspecial.add(txtTelefone);
		
		lblDataNascimento = new JLabel("Data de Nascimento");
		lblDataNascimento.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblDataNascimento.setBounds(37, 120, 187, 16);
		pnEspecial.add(lblDataNascimento);
		
		JSpinField spinField = new JSpinField();
		spinField.getSpinner().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		spinField.setMaximum(31);
		spinField.setMinimum(1);
		spinField.setBorder(new LineBorder(Color.BLACK, 1, true));
		spinField.setBounds(37, 149, 130, 25);
		pnEspecial.add(spinField);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.getComboBox().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		monthChooser.setBorder(new LineBorder(Color.BLACK, 1, true));
		monthChooser.setBounds(183, 149, 116, 25);
		pnEspecial.add(monthChooser);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.getSpinner().setFont(new Font("Segoe UI", Font.PLAIN, 13));
		yearChooser.setBorder(new LineBorder(Color.BLACK, 1, true));
		yearChooser.setStartYear(2019);
		yearChooser.setMaximum(2019);
		yearChooser.setBounds(309, 149, 130, 25);
		pnEspecial.add(yearChooser);
		
		lblGnero = new JLabel("G\u00EAnero");
		lblGnero.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblGnero.setBounds(36, 182, 87, 16);
		pnEspecial.add(lblGnero);
		
		JRadioButton rdbtnMasculino = new JRadioButton("MASCULINO");
		rdbtnMasculino.setBorder(new LineBorder(Color.BLACK, 1, true));
		rdbtnMasculino.setBounds(37, 205, 127, 25);
		pnEspecial.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("FEMININO");
		rdbtnFeminino.setBounds(187, 205, 106, 25);
		pnEspecial.add(rdbtnFeminino);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("PERSONALIZADO");
		rdbtnNewRadioButton.setBounds(312, 205, 127, 25);
		pnEspecial.add(rdbtnNewRadioButton);
		
		JPanel pnEndereco = new JPanel();
		pnEndereco.setBorder(new LineBorder(Color.BLACK, 1, true));
		pnEndereco.setBounds(0, 297, 471, 25);
		pnEspecial.add(pnEndereco);
		pnEndereco.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Endere\u00E7o");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 471, 25);
		pnEndereco.add(lblNewLabel);
		
		txtLogradouror = new JTextField();
		txtLogradouror.setText("Logradouro");
		txtLogradouror.setHorizontalAlignment(SwingConstants.LEFT);
		txtLogradouror.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtLogradouror.setColumns(10);
		txtLogradouror.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtLogradouror.setForeground(new Color(128, 128, 128));
		txtLogradouror.setBounds(42, 343, 182, 25);
		pnEspecial.add(txtLogradouror);
		
		txtBairro = new JTextField();
		txtBairro.setText("Bairro");
		txtBairro.setHorizontalAlignment(SwingConstants.LEFT);
		txtBairro.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtBairro.setColumns(10);
		txtBairro.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtBairro.setForeground(new Color(128, 128, 128));
		txtBairro.setBounds(257, 343, 182, 25);
		pnEspecial.add(txtBairro);
		
		txtCep = new JTextField();
		txtCep.setText("CEP");
		txtCep.setHorizontalAlignment(SwingConstants.LEFT);
		txtCep.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCep.setColumns(10);
		txtCep.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtCep.setForeground(new Color(128, 128, 128));
		txtCep.setBounds(42, 379, 182, 25);
		pnEspecial.add(txtCep);
		
		txtNmero = new JTextField();
		txtNmero.setText("N\u00FAmero");
		txtNmero.setHorizontalAlignment(SwingConstants.LEFT);
		txtNmero.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNmero.setColumns(10);
		txtNmero.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtNmero.setForeground(new Color(128, 128, 128));
		txtNmero.setBounds(257, 379, 182, 25);
		pnEspecial.add(txtNmero);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		comboBox.setBounds(37, 241, 130, 27);
		pnEspecial.add(comboBox);
		comboBox.addItem("Simples");
		comboBox.addItem("Composto");
		
		JButton SALVAR = new JButton("SALVAR");
		SALVAR.setBorder(new LineBorder(Color.BLACK, 1, true));
		SALVAR.setFont(new Font("Cambria Math", Font.BOLD, 16));
		SALVAR.setBounds(240, 501, 114, 41);
		contentPane.add(SALVAR);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/images/entrada.jpg")));
		label.setBounds(0, 0, 594, 565);
		contentPane.add(label);
		SALVAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
