package Administrator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

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

import Client.Client_MainScreen;

public class AdministratorLogin extends JFrame {

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
					AdministratorLogin frame = new AdministratorLogin();
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
	public AdministratorLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdministratorLogin.class.getResource("/images/privacy.png")));
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
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new LineBorder(Color.BLACK, 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox DarkTheme = new JCheckBox("DARK");
		DarkTheme.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		DarkTheme.setBackground(Color.WHITE);
		DarkTheme.setBounds(0, 290, 67, 25);
		contentPane.add(DarkTheme);
		
		JLabel lblKey = new JLabel("PASSWORD");
		lblKey.setBounds(93, 134, 204, 25);
		contentPane.add(lblKey);
		lblKey.setForeground(Color.BLACK);
		lblKey.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblKey.setHorizontalAlignment(SwingConstants.CENTER);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(93, 170, 204, 25);
		contentPane.add(passwordField);
		passwordField.setBorder(new LineBorder(Color.BLACK, 1, true));
		
		JLabel lblNoTemConta = new JLabel("N\u00E3o possui conta?");
		lblNoTemConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoTemConta.setBounds(269, 243, 89, 14);
		contentPane.add(lblNoTemConta);
		lblNoTemConta.setForeground(Color.BLUE);
		
		JButton btnCliqueAqui = new JButton("");
		btnCliqueAqui.setBounds(288, 270, 89, 33);
		btnCliqueAqui.setIcon(new ImageIcon(Client_MainScreen.class.getResource("/images/clicking.png")));
		contentPane.add(btnCliqueAqui);
		btnCliqueAqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					AdministratorRegistrator frame = new AdministratorRegistrator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(93, 62, 204, 25);
		contentPane.add(lblLogin);
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		
		txtFLogin = new JTextField();
		txtFLogin.setBounds(93, 98, 204, 25);
		contentPane.add(txtFLogin);
		txtFLogin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtFLogin.setBackground(Color.WHITE);
		txtFLogin.setColumns(10);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(151, 226, 89, 23);
		contentPane.add(btnEntrar);
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
					contentPane.setBackground(SystemColor.menu);
					lblLogin.setForeground(Color.BLACK);
					lblKey.setForeground(Color.BLACK);
				}
				
			}
		});
		
		
		
	
		
	}
}
