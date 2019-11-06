package IceCreamShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Administrator.AdministratorMainScreen;
import Employees.Employee_MainScreen;
import javax.swing.ImageIcon;

public class LoginUser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFLogin;
	private JPasswordField passwordField;
	public static int posicao;
	public static String cpf;

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
		
		Font dropthegame1 = null;
		
		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("AquateScript_PERSONAL_USE_ONLY.ttf")).deriveFont(50f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginUser.class.getResource("/images/privacy.png")));
		setBackground(Color.WHITE);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 454, 401);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
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
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(0, 75, 454, 326);
		panel.setBackground(new Color(245, 245, 245));
		contentPane.add(panel);
		panel.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				passwordField.setBorder(new LineBorder(new Color(26,115, 232), 1, true));
			}
			@Override
			public void focusLost(FocusEvent e) {
				passwordField.setBorder(new LineBorder(new Color(0, 0, 0), 2));

			}
		});
		passwordField.setBounds(85, 142, 284, 27);
		panel.add(passwordField);
		passwordField.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		txtFLogin = new JTextField();
		txtFLogin.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtFLogin.setBounds(85, 71, 284, 27);
		txtFLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFLogin.setForeground(new Color(128, 128, 128));
		txtFLogin.setColumns(10);
		panel.add(txtFLogin);
		txtFLogin.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtFLogin.setBorder(new LineBorder(new Color(26,115, 232), 1, true));
				txtFLogin.setForeground(Color.BLACK);
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtFLogin.setBorder(new LineBorder(Color.BLACK, 2, true));
			}
		});
		
		JPanel btnLogin = new JPanel();
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnLogin.setBounds(85, 199, 284, 31);
		panel.add(btnLogin);
		btnLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(0, 0, 284, 31);
		lblLogin.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		btnLogin.add(lblLogin);
		lblLogin.setBackground(Color.WHITE);
		
		lblLogin.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnLogin.setBackground(Color.WHITE);
				lblLogin.setForeground(Color.GRAY);
				lblLogin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
				setCursor(HAND_CURSOR);
			}
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Object> valores = new ArrayList<>();
				
				String senha = new String( passwordField.getPassword());
				String tabela = "employee";
				try {
					valores.addAll(DataBase.Functions.validarLogin(tabela, txtFLogin.getText(), senha));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		
			
				if(!txtFLogin.getText().isEmpty() && !passwordField.getText().isEmpty()) {
				if(valores.size() >0) {
					cpf = (String) valores.get(2);
					if(valores.get(0).equals("Administrador") && valores.get(1).equals("A")) {
						dispose();
						try {
							AdministratorMainScreen frame = new AdministratorMainScreen();
							frame.setVisible(true);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					
					else
						if(!valores.get(0).equals("Administrador") && !valores.get(0).equals("Gerente")  && valores.get(1).equals("A")) {
							dispose();
							try {
								Employee_MainScreen frame = new Employee_MainScreen();
								frame.setVisible(true);

							} catch (Exception e1) {
								e1.printStackTrace();
							}	
						}
					
				}
					else {
							JOptionPane.showMessageDialog(null, "Credenciais Inválidas", "Aviso",2);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos","",2);
				}
				
			}
			
			@SuppressWarnings("deprecation")
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogin.setBackground(Color.GRAY);
				lblLogin.setForeground(Color.WHITE);
				lblLogin.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
				setCursor(DEFAULT_CURSOR);
			}
			
		});
	
		
	
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblNewLabel.setBounds(57, 111, 312, 32);
		panel.add(lblNewLabel);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblUsurio.setBounds(57, 40, 312, 27);
		panel.add(lblUsurio);
		
		JPanel btnSair = new JPanel();
		btnSair.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSair.setBackground(new Color(220,80,53));
		btnSair.setBounds(85, 251, 284, 32);
		panel.add(btnSair);
		btnSair.setLayout(null);
		
		JLabel lblSair = new JLabel("SAIR");
		lblSair.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSair.setForeground(new Color(220,80,53));
				btnSair.setBackground(Color.WHITE);
				lblSair.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
				setCursor(HAND_CURSOR);
			}
			@SuppressWarnings("deprecation")
			@Override
			public void mouseExited(MouseEvent e) {
				lblSair.setForeground(Color.WHITE);
				btnSair.setBackground(new Color(220,80,53));
				lblSair.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
				setCursor(DEFAULT_CURSOR);

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblSair.setForeground(Color.WHITE);
		lblSair.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblSair.setHorizontalAlignment(SwingConstants.CENTER);
		lblSair.setBounds(0, 0, 284, 29);
		btnSair.add(lblSair);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginUser.class.getResource("/images/locked.png")));
		label.setBounds(401, 25, 24, 31);
		panel.add(label);
		
		JLabel lbBorda = new JLabel("");
		lbBorda.setBounds(17, 13, 419, 300);
		panel.add(lbBorda);
		lbBorda.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panelCima = new JPanel();
		panelCima.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCima.setBackground(new Color(28, 189, 127));
		panelCima.setBounds(0, 0, 454, 76);
		contentPane.add(panelCima);
		panelCima.setLayout(null);
		
		JLabel lblTitle = new JLabel("Ice Cream Shop");
		lblTitle.setBounds(0, 0, 454, 76);
		panelCima.add(lblTitle);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(dropthegame1);
		
		
		
	
		
	}
}
