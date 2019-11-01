package IceCreamShop;

import java.awt.Color;
import java.awt.Cursor;
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

import javax.swing.ImageIcon;
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
import Client.Client_Registration;
import Employees.Employee_MainScreen;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;

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
		
		Font dropthegame1 = null;
		
		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("AquateScript_PERSONAL_USE_ONLY.ttf")).deriveFont(25f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		
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
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(95, 158, 160));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(102, 47, 271, 282);
		panel.setBackground(new Color(245, 245, 245));
		contentPane.add(panel);
		panel.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(65, 184, 140, 20);
		panel.add(passwordField);
		passwordField.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		txtFLogin = new JTextField();
		txtFLogin.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtFLogin.setBounds(65, 120, 140, 20);
		txtFLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFLogin.setForeground(new Color(128, 128, 128));
		txtFLogin.setColumns(10);
		panel.add(txtFLogin);
		
		JLabel lblLog = new JLabel("ENTRAR");
		lblLog.setForeground(UIManager.getColor("Button.darkShadow"));
		lblLog.setBackground(UIManager.getColor("Button.darkShadow"));
		lblLog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
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
			@SuppressWarnings("deprecation")
			@Override
			public void mouseEntered(MouseEvent e) {

				setCursor(Cursor.HAND_CURSOR);
			}
		
			
			@SuppressWarnings("deprecation")
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.DEFAULT_CURSOR);

			}
		});
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnEntrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnEntrar.setBounds(83, 230, 105, 27);
		panel.add(btnEntrar);
		lblLog.setHorizontalAlignment(SwingConstants.CENTER);
		lblLog.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		lblLog.setBounds(88, 230, 10, 10);
		lblLog.setIcon(null);
		panel.add(lblLog);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel.setBounds(65, 161, 62, 18);
		panel.add(lblNewLabel);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblUsurio.setBounds(65, 99, 62, 18);
		panel.add(lblUsurio);
		
		JLabel lbBorda = new JLabel("");
		lbBorda.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lbBorda.setBounds(22, 67, 228, 204);
		panel.add(lbBorda);
		
		JLabel lblTitle = new JLabel("Ice Cream Shop");
		lblTitle.setForeground(new Color(95, 158, 160));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(55, 24, 150, 32);
		lblTitle.setFont(dropthegame1);
		panel.add(lblTitle);
		
		JLabel lblWallpaper = new JLabel("");
		lblWallpaper.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblWallpaper.setBounds(0, 0, 476, 376);
		lblWallpaper.setIcon(new ImageIcon(LoginUser.class.getResource("/images/entrada.jpg")));
		contentPane.add(lblWallpaper);
		
		
		
	
		
	}
}
