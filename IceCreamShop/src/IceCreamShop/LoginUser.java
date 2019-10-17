package IceCreamShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Administrator.AdministratorMainScreen;
import Client.Client_Registration;
import Employees.Employee_MainScreen;

public class LoginUser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser frame = new LoginUser();
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
	public LoginUser() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginUser.class.getResource("/images/privacy.png")));
		setBackground(Color.BLACK);
		setTitle("MAIN SCREEN\r\n");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		//bloquearFrame
			this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new LineBorder(Color.BLACK, 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox DarkTheme = new JCheckBox("DARK");
		DarkTheme.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		DarkTheme.setBackground(Color.WHITE);
		DarkTheme.setBounds(8, 243, 67, 25);
		contentPane.add(DarkTheme);
		
		JLabel lblKey = new JLabel("PASSWORD");
		lblKey.setBounds(110, 140, 204, 25);
		contentPane.add(lblKey);
		lblKey.setForeground(Color.BLACK);
		lblKey.setFont(new Font("Cambria Math", Font.BOLD, 17));
		lblKey.setHorizontalAlignment(SwingConstants.CENTER);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 170, 204, 25);
		contentPane.add(passwordField);
		passwordField.setBorder(new LineBorder(Color.BLACK, 1, true));
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(110, 62, 204, 25);
		contentPane.add(lblLogin);
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Cambria Math", Font.BOLD, 17));
		
		txtFLogin = new JTextField();
		txtFLogin.setBounds(110, 98, 204, 25);
		contentPane.add(txtFLogin);
		txtFLogin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtFLogin.setBackground(Color.WHITE);
		txtFLogin.setColumns(10);
		
		JPanel pnCima = new JPanel();
		pnCima.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnCima.setBounds(0, 0, 394, 38);
		pnCima.setBackground(new Color(255, 222, 173));
		pnCima.setLayout(null);
		contentPane.add(pnCima);
		
		JPanel pnBaixo = new JPanel();
		pnBaixo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnBaixo.setBounds(0, 281, 394, 40);
		pnBaixo.setBackground(new Color(255, 222, 173));
		pnBaixo.setLayout(null);
		contentPane.add(pnBaixo);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			

			}
		});
		label.setBounds(32, 0, 34, 40);
		pnBaixo.add(label);
		label.setIcon(new ImageIcon(Client_Registration.class.getResource("/images/back.png")));		
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(151, 226, 89, 23);
		contentPane.add(btnEntrar);
		
		JLabel lblChave = new JLabel("");
		lblChave.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblChave.setBounds(80, 93, 30, 34);
		lblChave.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/key.png")));
		contentPane.add(lblChave);
		
		JLabel lblCadeado = new JLabel("");
		lblCadeado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblCadeado.setBounds(80, 166, 30,34);
		lblCadeado.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/lock.png")));	
		contentPane.add(lblCadeado);
		
		JLabel lblWallpaper = new JLabel("");
		lblWallpaper.setBounds(0, 36, 394, 247);
		contentPane.add(lblWallpaper);
		lblWallpaper.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/wallpaper.jpg")));
		
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				if(txtFLogin.getText().equalsIgnoreCase("admin") && passwordField.getText().equalsIgnoreCase("admin")) {
				
					try {
						AdministratorMainScreen frame = new AdministratorMainScreen();
						frame.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					dispose();
					
				}
					else
						if(txtFLogin.getText().equalsIgnoreCase("employee") && passwordField.getText().equalsIgnoreCase("employee")) {
							try {
								Employee_MainScreen frame = new Employee_MainScreen();
								frame.setVisible(true);

							} catch (Exception e1) {
								e1.printStackTrace();
							}
							
							dispose();
						}
				
				
				else {
					JOptionPane.showMessageDialog(null, "USUARIO OU SENHA INVÁLIDO","AVISO",2);
				}
				
			}
		});
		
		DarkTheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DarkTheme.isSelected()) {
					contentPane.setBackground(Color.BLACK);
					lblLogin.setForeground(SystemColor.menu);
					lblKey.setForeground(SystemColor.menu);
	
				}
				else {
					contentPane.setBackground(new Color(153, 204, 255));
					lblLogin.setForeground(Color.BLACK);
					lblKey.setForeground(Color.BLACK);
				}
				
			}
		});
		
		
		
	
		
	}
}
