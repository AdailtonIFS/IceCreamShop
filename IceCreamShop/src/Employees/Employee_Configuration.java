package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Employee_Configuration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Employee_Configuration.class.getResource("/images/gear.png")));
		
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
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(25, 141, 549, 139);
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
		
		list.setBounds(10, 10, 529, 119);
		panel.add(list);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblCPF.setHorizontalAlignment(SwingConstants.CENTER);
		lblCPF.setBounds(25, 304, 180, 20);
		contentPane.add(lblCPF);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBorder(new LineBorder(Color.BLACK));
		formattedTextField.setBounds(25, 335, 178, 22);
		contentPane.add(formattedTextField);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setBounds(213, 335, 178, 16);
		contentPane.add(lblTelefone);
		
		JFormattedTextField txtPhone = new JFormattedTextField();
		txtPhone.setBorder(new LineBorder(Color.BLACK));
		txtPhone.setBounds(209, 362, 178, 22);
		contentPane.add(txtPhone);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:\r\n");
		lblDataDeNascimento.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataDeNascimento.setBounds(394, 304, 180, 16);
		contentPane.add(lblDataDeNascimento);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(Color.BLACK));
		textField_1.setBounds(394, 335, 178, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblGnero.setHorizontalAlignment(SwingConstants.CENTER);
		lblGnero.setBounds(396, 368, 178, 16);
		contentPane.add(lblGnero);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(Color.BLACK));
		textField_2.setColumns(10);
		textField_2.setBounds(394, 395, 180, 22);
		contentPane.add(textField_2);
		
		JLabel lblLogradouro = new JLabel("Endere\u00E7o");
		lblLogradouro.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblLogradouro.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogradouro.setBounds(25, 368, 178, 16);
		contentPane.add(lblLogradouro);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(Color.BLACK));
		textField_3.setColumns(10);
		textField_3.setBounds(25, 395, 178, 22);
		contentPane.add(textField_3);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblCep.setHorizontalAlignment(SwingConstants.CENTER);
		lblCep.setBounds(209, 401, 181, 16);
		contentPane.add(lblCep);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBorder(new LineBorder(Color.BLACK));
		formattedTextField_2.setBounds(209, 428, 178, 22);
		contentPane.add(formattedTextField_2);
		
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
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio");
		lblSalrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalrio.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblSalrio.setBounds(27, 428, 178, 20);
		contentPane.add(lblSalrio);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(Color.BLACK));
		textField.setBounds(25, 459, 178, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblCargo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCargo.setBounds(209, 461, 178, 25);
		contentPane.add(lblCargo);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(Color.BLACK));
		textField_4.setBounds(209, 492, 178, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblTipo.setBounds(394, 428, 180, 18);
		contentPane.add(lblTipo);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(Color.BLACK));
		textField_5.setBounds(394, 459, 178, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel btnCadastrar = new JPanel();
		btnCadastrar.setBorder(new LineBorder(Color.BLACK));
		btnCadastrar.setBackground(Color.GRAY);
		btnCadastrar.setBounds(465, 535, 119, 27);
		contentPane.add(btnCadastrar);
		btnCadastrar.setLayout(null);
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setBounds(0, 0, 119, 27);
		btnCadastrar.add(lblCadastrar);
		lblCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Employee_Registration frame = new Employee_Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCadastrar.setForeground(Color.GRAY);
				btnCadastrar.setBackground(Color.WHITE);
				lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCadastrar.setForeground(Color.WHITE);
				btnCadastrar.setBackground(Color.GRAY);
				lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
			}
		});
		lblCadastrar.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel btnExcluir = new JPanel();
		btnExcluir.setBorder(new LineBorder(Color.BLACK));
		btnExcluir.setBounds(12, 535, 119, 27);
		btnExcluir.setBackground(new Color(220, 80, 53));
		contentPane.add(btnExcluir);
		btnExcluir.setLayout(null);
		
		JLabel lblExcluir = new JLabel("Excluir");
		lblExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExcluir.setForeground(new Color(220,80,53));
				btnExcluir.setBackground(Color.white);
				lblExcluir.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblExcluir.setForeground(Color.WHITE);
				btnExcluir.setBackground(new Color(220,80,53));
				lblExcluir.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
			}
		});
		lblExcluir.setForeground(Color.WHITE);
		lblExcluir.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		lblExcluir.setHorizontalAlignment(SwingConstants.CENTER);
		lblExcluir.setBounds(0, 0, 119, 27);
		btnExcluir.add(lblExcluir);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			dispose();
				
			}
			@SuppressWarnings("deprecation")
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(HAND_CURSOR);
			}
			@SuppressWarnings("deprecation")
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(DEFAULT_CURSOR);
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(Employee_Configuration.class.getResource("/images/hand.png")));
		label_1.setBounds(508, 102, 37, 35);
		contentPane.add(label_1);
	}
}
