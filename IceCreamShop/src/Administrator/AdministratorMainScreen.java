package Administrator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import IceCreamShop.LoginUser;

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
	 */
	public AdministratorMainScreen() {
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
		
		JButton btnNewButton = new JButton("FUNCION\u00C1RIOS");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 13));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/employee.png")));
		btnNewButton.setBounds(29, 26, 135, 70);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CONTA");
		btnNewButton_1.setFont(new Font("Cambria Math", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_1.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/settings.png")));
		btnNewButton_1.setBounds(206, 26, 135, 70);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("      SAIR");
		btnNewButton_2.setFont(new Font("Cambria Math", Font.BOLD, 13));
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_2.addActionListener(new ActionListener() {
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
		btnNewButton_2.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/turn-on.png")));
		btnNewButton_2.setBounds(380, 26, 135, 70);
		panel.add(btnNewButton_2);
		
		
		
		
	}
}
