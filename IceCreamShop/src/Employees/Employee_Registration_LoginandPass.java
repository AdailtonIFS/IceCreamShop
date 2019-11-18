package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

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
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLACK, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(45, 77, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(10, 46, 107, 20);
		contentPane.add(lblLogin);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {

					
					passwordField.setBorder(new LineBorder(new Color(26,115, 232), 1, true));
			}
			@Override
			public void focusLost(FocusEvent e) {
				passwordField.setBorder(new LineBorder(new Color(0, 0, 0), 2));

			}
		});
		passwordField.setBounds(45, 137, 150, 20);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(10, 112, 139, 20);
		contentPane.add(lblPassword);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(75, 182, 89, 23);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(HAND_CURSOR);
				panel.setBackground(Color.WHITE);
				lblNewLabel.setForeground(Color.GRAY);
				
			}
			@SuppressWarnings("deprecation")
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(DEFAULT_CURSOR);
				panel.setBackground(Color.GRAY);
				lblNewLabel.setForeground(Color.WHITE);
			}
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
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
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
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
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 89, 23);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Employee_Registration_LoginandPass.class.getResource("/images/open.png")));
		label.setBounds(201, 11, 29, 31);
		contentPane.add(label);
	}
}
