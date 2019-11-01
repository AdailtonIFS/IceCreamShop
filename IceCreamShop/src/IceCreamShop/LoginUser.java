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
import java.sql.SQLException;
import java.util.ArrayList;

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
import javax.swing.border.MatteBorder;

public class LoginUser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFLogin;
	private JPasswordField passwordField;
	public static int posicao;

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
		setBackground(Color.WHITE);
		setTitle("MAIN SCREEN\r\n");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 482, 405);
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
		
		JPanel pnCima = new JPanel();
		pnCima.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnCima.setBounds(0, 0, 475, 38);
		pnCima.setBackground(Color.WHITE);
		pnCima.setLayout(null);
		contentPane.add(pnCima);
		
		JPanel pnBaixo = new JPanel();
		pnBaixo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnBaixo.setBounds(0, 334, 475, 40);
		pnBaixo.setBackground(Color.WHITE);
		pnBaixo.setLayout(null);
		contentPane.add(pnBaixo);
		
		JLabel label = new JLabel("");
		label.setBounds(32, 0, 34, 40);
		label.setIcon(new ImageIcon(Client_Registration.class.getResource("/images/back.png")));	
		pnBaixo.add(label);	
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(52, 61, 225, 230);
		panel.setBackground(new Color(0, 191, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEntrar.setForeground(Color.BLACK);
		btnEntrar.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 12));
		btnEntrar.setBounds(66, 180, 89, 23);
		panel.add(btnEntrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(65, 135, 140, 20);
		panel.add(passwordField);
		passwordField.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblCadeado = new JLabel("");
		lblCadeado.setBounds(25, 129, 30, 34);
		panel.add(lblCadeado);
		lblCadeado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCadeado.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/lock.png")));
		
		JLabel lblChave = new JLabel("");
		lblChave.setBounds(25, 84, 30, 34);
		panel.add(lblChave);
		lblChave.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblChave.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/key.png")));
		
		txtFLogin = new JTextField();
		txtFLogin.setText("Login");
		txtFLogin.setBounds(65, 91, 140, 20);
		panel.add(txtFLogin);
		txtFLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFLogin.setBackground(Color.WHITE);
		txtFLogin.setColumns(10);
		
		JLabel lblLogin = new JLabel("SIGN IN");
		lblLogin.setBackground(Color.WHITE);
		lblLogin.setBounds(48, 11, 140, 34);
		panel.add(lblLogin);
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Segoe UI Black", Font.BOLD, 27));
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(Color.WHITE);
		label_1.setForeground(Color.WHITE);
		label_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 255, 255)));
		label_1.setBounds(48, 40, 140, 14);
		panel.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setBounds(10, 65, 206, 154);
		panel.add(lblNewLabel);
				
				btnEntrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						ArrayList<String> valores = new ArrayList<>();
						boolean l = false;
						boolean p = false;
						
						try {
						
							valores.addAll(DataBase.Functions.searchEmployeeAdvanced("employeeAdvanced"));
							
							String senha = new String(passwordField.getPassword());
							
						for(int i = 0; i < valores.size();i++) {
						System.out.println(valores.get(i));
						}
							
							for(int i = 9; i < valores.size();i++) {
									
							if(valores.get(i).equals(senha)) {
								p = true;
								break;
							}	
								i+=9;
							}
							
							
							for(int i = 8; i < valores.size();i++) {
				
							if(valores.get(i).equals(txtFLogin.getText())) {
							System.out.println("ACHOU");
							l = true;	
							posicao = i;
							break;
							
							}
			
							i+=9;
							}
							
							if(l == true && p == true ) {
								dispose();
								try {
									AdministratorMainScreen frame = new AdministratorMainScreen();
									frame.setVisible(true);
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								
							}
							else{
								JOptionPane.showMessageDialog(null, "Usuário ou Senha incorreto","Aviso",2);
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				});
		
		JLabel lblWallpaper = new JLabel("");
		lblWallpaper.setBounds(0, 36, 475, 300);
		lblWallpaper.setIcon(new ImageIcon(LoginUser.class.getResource("/images/entrada.jpg")));
		contentPane.add(lblWallpaper);
		
		
		
	
		
	}
}
