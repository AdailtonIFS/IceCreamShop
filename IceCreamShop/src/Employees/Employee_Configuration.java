package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Employee_Configuration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFNome;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Configuration frame = new Employee_Configuration();
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
	public Employee_Configuration() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 27, 243, 472);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//ArrayList de valores do meu banco
		ArrayList<Object> valores = new ArrayList<Object>();
		
		
		List list = new List();
		list.setBounds(10, 10, 223, 454);
		panel.add(list);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(278, 30, 119, 16);
		contentPane.add(lblNome);
		
		txtFNome = new JTextField();
		txtFNome.setBounds(409, 27, 161, 22);
		contentPane.add(txtFNome);
		txtFNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCPF.setBounds(278, 62, 119, 16);
		contentPane.add(lblCPF);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(409, 59, 161, 22);
		contentPane.add(formattedTextField);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(278, 91, 119, 16);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(278, 120, 119, 16);
		contentPane.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(409, 88, 161, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Employee_Registration frame = new Employee_Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnCadastrar.setBounds(92, 515, 97, 25);
		contentPane.add(btnCadastrar);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(409, 117, 161, 22);
		contentPane.add(formattedTextField_1);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:\r\n");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataDeNascimento.setBounds(278, 155, 119, 16);
		contentPane.add(lblDataDeNascimento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(409, 152, 161, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGnero.setBounds(278, 184, 119, 16);
		contentPane.add(lblGnero);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(409, 181, 161, 22);
		contentPane.add(textField_2);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setBounds(278, 219, 119, 16);
		contentPane.add(lblTipo);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(409, 216, 161, 22);
		contentPane.add(comboBox);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogradouro.setBounds(278, 248, 119, 16);
		contentPane.add(lblLogradouro);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(409, 245, 161, 22);
		contentPane.add(textField_3);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setBounds(278, 277, 119, 16);
		contentPane.add(lblBairro);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(409, 274, 161, 22);
		contentPane.add(textField_4);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setBounds(278, 306, 119, 16);
		contentPane.add(lblCep);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(409, 303, 161, 22);
		contentPane.add(formattedTextField_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(409, 338, 161, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNmero.setBounds(278, 341, 119, 16);
		contentPane.add(lblNmero);
		
		JButton btnDemitir = new JButton("DEMITIR");
		btnDemitir.setBounds(430, 515, 97, 25);
		contentPane.add(btnDemitir);
	}
}
