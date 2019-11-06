package Employees;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Employee_Registration_LoginandPass extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	public static String login;
	public static String Senha;
	public static Boolean b = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Registration_LoginandPass frame = new Employee_Registration_LoginandPass();
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
	public Employee_Registration_LoginandPass() {
		
		
		this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
			}
		});
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(34, 35, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(34, 13, 150, 14);
		contentPane.add(lblLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(34, 95, 150, 20);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(34, 68, 150, 14);
		contentPane.add(lblPassword);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if(!textField.getText().isEmpty() && !passwordField.getText().isEmpty()) {

				login = textField.getText();
				Senha = new String(passwordField.getPassword());
				
				Employee_Registration.valores.add(login);
				Employee_Registration.valores.add(Senha);
				for (int i = 0; i < Employee_Registration.valores.size(); i++) {
					System.out.println(Employee_Registration.valores.get(i));
				}
				String tabela = "employee";
				try {
					DataBase.Functions.register(tabela, Employee_Registration.valores);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso", "AVISO", 1);

				// Caso o usuario preencha tudo corretamente
				dispose();
			
				b = true;
				}else {
					JOptionPane.showMessageDialog(null,"Preencha os dados corretamente", "AVISO",2);
				}
				
			}
		});
		btnSalvar.setBounds(64, 134, 89, 23);
		contentPane.add(btnSalvar);
	}
}
