package Administrator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import IceCreamShop.LoginUser;
import javax.swing.JLabel;

public class AdministratorMainScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorMainScreen frame = new AdministratorMainScreen();
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
	public AdministratorMainScreen() throws SQLException {
		setTitle("TELA PRINCIPAL");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		
			this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(new Color(255, 222, 173));
		panel.setBounds(0, 247, 544, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEmployee = new JButton("FUNCION\u00C1RIOS");
		btnEmployee.setFont(new Font("Cambria Math", Font.BOLD, 13));
		btnEmployee.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEmployee.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/employee.png")));
		btnEmployee.setBounds(29, 26, 135, 70);
		panel.add(btnEmployee);
		
		JButton btnAccount = new JButton("CONTA");
		btnAccount.setFont(new Font("Cambria Math", Font.BOLD, 13));
		btnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnAccount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAccount.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/settings.png")));
		btnAccount.setBounds(206, 26, 135, 70);
		panel.add(btnAccount);
		
		JButton btnExit = new JButton("      SAIR");
		btnExit.setFont(new Font("Cambria Math", Font.BOLD, 13));
		btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LoginUser frame = new LoginUser();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnExit.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/turn-on.png")));
		btnExit.setBounds(380, 26, 135, 70);
		panel.add(btnExit);
		
		ArrayList<String> valores = new ArrayList<String>();
		valores.addAll(DataBase.Functions.searchEmployeeAdvanced("employeeAdvanced"));
		
		JLabel lblBemVindo = new JLabel("Bem vindo:   "+valores.get(IceCreamShop.LoginUser.posicao-8));
		lblBemVindo.setFont(new Font("Cambria Math", Font.BOLD, 13));
		lblBemVindo.setBounds(41, 13, 311, 16);
		contentPane.add(lblBemVindo);
		
		
		
		
	}
}
