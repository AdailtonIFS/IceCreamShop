package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Class.Objetos;
import Client.Client_Configuration;
import IceCream.IceCreamRegistration;
import IceCreamShop.LoginUser;
import IceCreamShop.SalesScreen;

import javax.swing.JSeparator;

public class Employee_MainScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnClientes;
	private JMenu mnSorvetes;
	private JMenu mnSair;
	/**
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_MainScreen frame = new Employee_MainScreen();
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
	public Employee_MainScreen() {
		
				// ====================================================================
				setTitle("ICE CREAM SHOP");
				
				setForeground(new Color(153, 255, 0));
				setIconImage(Toolkit.getDefaultToolkit().getImage(Employee_MainScreen.class.getResource("/images/ice-cream-shop.png")));
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 600, 600);
				setLocationRelativeTo(null);
				setUndecorated(true);

				
				this.addComponentListener(new ComponentAdapter() {
					
					public void componentMoved(ComponentEvent e) {
	
					setEnabled(false);

					setEnabled(true);
				}
			});
				
				
				contentPane = new JPanel();
				contentPane.setBackground(new Color(153, 255, 204));
				contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				setContentPane(contentPane);
				contentPane.setLayout(null);
			
				
				menuBar = new JMenuBar();
				menuBar.setBackground(Color.BLACK);
				menuBar.setBorder(new LineBorder(Color.WHITE, 2));
				menuBar.setBounds(0, 0, 600, 46);
				contentPane.add(menuBar);
				
				mnClientes = new JMenu("CLIENTES");
				mnClientes.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
				mnClientes.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
				mnClientes.setForeground(Color.WHITE);
				mnClientes.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/client.png")));
				menuBar.add(mnClientes);
				
				mnClientes.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						

						try {
							Client_Configuration frame = new Client_Configuration();
							frame.setVisible(true);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				});
				
				mnSorvetes = new JMenu("SORVETES");
				mnSorvetes.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						try {
							IceCreamRegistration frame = new IceCreamRegistration();
							frame.setVisible(true);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				});
				mnSorvetes.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
				mnSorvetes.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
				mnSorvetes.setForeground(Color.WHITE);
				mnSorvetes.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/ice-cream.png")));
				menuBar.add(mnSorvetes);
				
				mnSair = new JMenu("SAIR");
				mnSair.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/cancel.png")));
				mnSair.setForeground(Color.WHITE);
				mnSair.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
				menuBar.add(mnSair);
				mnSair.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					dispose();
					try {
						LoginUser frame = new LoginUser();
						frame.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					}
				});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(191, 256, 238, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(191, 374, 233, 2);
		contentPane.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(212, 269, 201, 94);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VENDA");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					SalesScreen frame = new SalesScreen();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/coins.png")));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 201, 94);
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label.setBackground(new Color(255, 204, 102));
		label.setBounds(0, 0, 600, 565);
		label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete01.jpg")));
		contentPane.add(label);
		
		Objetos.slides(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new LineBorder(Color.WHITE));
		panel.setBounds(0, 565, 600, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSystemDevelopedBy = new JLabel("\u00A9Developed by ");
		lblSystemDevelopedBy.setBounds(0, 0, 182, 32);
		panel.add(lblSystemDevelopedBy);
		lblSystemDevelopedBy.setBackground(new Color(210, 180, 140));
		lblSystemDevelopedBy.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblSystemDevelopedBy.setForeground(Color.WHITE);
		lblSystemDevelopedBy.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Runtime.getRuntime().exec("cmd.exe /C start chrome.exe https://www.instagram.com/_ada.ilton/");
					
				} catch (IOException e) {
					
					JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão com a internet");

				}
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/instagram.png")));
		label_1.setBounds(192, 0, 44, 32);
		panel.add(label_1);
		
		JLabel lbladailton = new JLabel("@_ada.ilton   &");
		lbladailton.setForeground(Color.WHITE);
		lbladailton.setBounds(234, -1, 155, 32);
		panel.add(lbladailton);
		lbladailton.setHorizontalAlignment(SwingConstants.CENTER);
		lbladailton.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					Runtime.getRuntime().exec("cmd.exe /C start chrome.exe https://www.instagram.com/__bru.no/");
				} catch (IOException e1) {
					
					JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão com a internet");
				}

			}
		});
		label_2.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/instagram.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(401, 0, 44, 32);
		panel.add(label_2);
		
		JLabel lblbruno = new JLabel("@__bruno");
		lblbruno.setForeground(Color.WHITE);
		lblbruno.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblbruno.setBounds(445, -1, 155, 33);
		panel.add(lblbruno);

	}
}