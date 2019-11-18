package Administrator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Class.Objetos;
import Employees.Employee_Configuration;
import Employees.Employee_Registration;
import IceCreamShop.HelpScreen;
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
	 * @throws SQLException 
	 */
	public AdministratorMainScreen() throws SQLException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
		
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.BLACK);
		menuBar.setBorder(new LineBorder(Color.WHITE));
		menuBar.setBounds(0, 0, 600, 37);
		contentPane.add(menuBar);
		
		JMenu mnFuncionrios = new JMenu("FUNCION\u00C1RIOS ");
		mnFuncionrios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Employee_Configuration frame = new Employee_Configuration();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
	
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
		mnFuncionrios.setForeground(Color.WHITE);
		mnFuncionrios.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		mnFuncionrios.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/employee.png")));
		mnFuncionrios.setBorder(new LineBorder(Color.WHITE));
		menuBar.add(mnFuncionrios);
		
	
		
		JMenu mnAdministradores = new JMenu("ADMINISTRADORES ");
		mnAdministradores.addMouseListener(new MouseAdapter() {
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
		mnAdministradores.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		mnAdministradores.setForeground(Color.WHITE);
		mnAdministradores.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/man.png")));
		mnAdministradores.setBorder(new LineBorder(Color.WHITE));
		menuBar.add(mnAdministradores);
		
		JMenu mnAjuda = new JMenu("AJUDA ");
		mnAjuda.setForeground(Color.WHITE);
		mnAjuda.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		mnAjuda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					HelpScreen frame = new HelpScreen();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
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
		mnAjuda.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/question.png")));
		mnAjuda.setBorder(new LineBorder(Color.WHITE));
		menuBar.add(mnAjuda);
		
		JMenu mnSair = new JMenu("SAIR");
		mnSair.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/cancel.png")));
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				try {
					LoginUser frame = new LoginUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
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
		mnSair.setForeground(Color.WHITE);
		mnSair.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		menuBar.add(mnSair);
		
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		@SuppressWarnings("unused")
		String finalDate = formatador.format(data);
		
		ArrayList<Object> valores = new ArrayList<Object>();
		valores.addAll(DataBase.Functions.buscarDadosFuncionario("employee"));
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label.setBackground(new Color(255, 204, 102));
		label.setBounds(0, 0, 600, 563);
		label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/imagesAdministrator/sorvete01.jpg")));
		contentPane.add(label);
		
		/*
		 * 
		 * Efeito de apresentação de slides
		 */
		Objetos.slides(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(0, 563, 600, 37);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("@_ada.ilton   &");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(229, 0, 141, 37);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u00A9Developed by ");
		label_2.setBounds(0, 0, 182, 37);
		panel.add(label_2);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		label_2.setBackground(new Color(210, 180, 140));
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Runtime.getRuntime().exec("cmd.exe /C start chrome.exe https://www.instagram.com/_ada.ilton/");
					
				} catch (IOException e1) {
					
					JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão com a internet");

				}
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
		label_3.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/instagram.png")));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(183, 0, 44, 37);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Runtime.getRuntime().exec("cmd.exe /C start chrome.exe https://www.instagram.com/__bru.no/");
					
				} catch (IOException e1) {
					
					JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão com a internet");

				}
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
		label_4.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/instagram.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(380, 0, 44, 37);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("@__bruno");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		label_5.setBounds(423, 0, 177, 37);
		panel.add(label_5);
		
		
		
	}
}
