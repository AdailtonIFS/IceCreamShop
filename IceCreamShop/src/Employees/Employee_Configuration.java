package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
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
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

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
	 * @throws SQLException 
	 */
	public Employee_Configuration() throws SQLException {
		
		Font dropthegame1 = null;
		
		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("AquateScript_PERSONAL_USE_ONLY.ttf")).deriveFont(50f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		
		this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
			}
		});
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 120, 243, 379);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//ArrayList de valores do meu banco
		String tabela = "employee";
		ArrayList<Object> valores = new ArrayList<Object>();
		try {
			valores.add(DataBase.Functions.buscarDadosFuncionario(tabela));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		List list = new List();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		list.setBounds(10, 10, 223, 359);
		panel.add(list);



		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(292, 169, 119, 16);
		contentPane.add(lblNome);
		
		txtFNome = new JTextField();
		txtFNome.setBounds(423, 166, 161, 22);
		contentPane.add(txtFNome);
		txtFNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCPF.setBounds(292, 201, 119, 16);
		contentPane.add(lblCPF);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(423, 198, 161, 22);
		contentPane.add(formattedTextField);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(292, 230, 119, 16);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(292, 259, 119, 16);
		contentPane.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(423, 227, 161, 22);
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
		formattedTextField_1.setBounds(423, 256, 161, 22);
		contentPane.add(formattedTextField_1);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:\r\n");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDataDeNascimento.setBounds(292, 294, 119, 16);
		contentPane.add(lblDataDeNascimento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(423, 291, 161, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGnero.setBounds(292, 323, 119, 16);
		contentPane.add(lblGnero);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(423, 320, 161, 22);
		contentPane.add(textField_2);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setBounds(292, 358, 119, 16);
		contentPane.add(lblTipo);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(423, 355, 161, 22);
		contentPane.add(comboBox);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogradouro.setBounds(292, 387, 119, 16);
		contentPane.add(lblLogradouro);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(423, 384, 161, 22);
		contentPane.add(textField_3);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setBounds(292, 416, 119, 16);
		contentPane.add(lblBairro);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(423, 413, 161, 22);
		contentPane.add(textField_4);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setBounds(292, 445, 119, 16);
		contentPane.add(lblCep);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(423, 442, 161, 22);
		contentPane.add(formattedTextField_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(423, 477, 161, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNmero.setBounds(292, 480, 119, 16);
		contentPane.add(lblNmero);
		
		JButton btnDemitir = new JButton("DEMITIR");
		btnDemitir.setBounds(430, 515, 97, 25);
		contentPane.add(btnDemitir);
		
		JPanel panelCima = new JPanel();
		panelCima.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCima.setBounds(0, 0, 594, 98);
		panelCima.setBackground(new Color(28, 189, 127));
		contentPane.add(panelCima);
		panelCima.setLayout(null);
		
		JLabel label = new JLabel("Ice Cream Shop");
		label.setBounds(0, 0, 594, 98);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(dropthegame1);
		panelCima.add(label);
	}
}
