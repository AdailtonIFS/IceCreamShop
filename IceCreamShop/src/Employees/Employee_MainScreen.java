package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Client.Client_Configuration;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employee_MainScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setResizable(false);
			
		this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
		
		


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label.setBackground(new Color(255, 204, 102));
		label.setBounds(0, 40, 594, 497);
		label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete01.jpg")));
		contentPane.add(label);
		
		Thread th = new Thread(new Runnable() { //cria uma thread
	        public void run() {
	            while(true) { //roda indefinidamente
	                try {
	                    
	                    for(int i = 0; i<12; i++) {
	                    	Thread.sleep(1000); //espera 1,1 segundo para fazer a nova evolução
	                    	if(i == 2) {
	                		label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete02.jpg")));
	                    	}
	                    	else 
	                    		if(i == 4) {
		                		label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete03.jpg")));
	                		}
	                    		else
	                    			if(i == 6) {
	    		                		label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete04.jpg")));

	                    			}
	                    			else
	                    				if(i == 8) {
	                    					label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete05.jpg")));
	                    				}
	                    				else
	                    					if(i == 10) {
		                    					label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete01.jpg")));	
	                    					}
	                    	
	                    }//Fim do for
	                   
	                } catch(InterruptedException ex){
	                	ex.printStackTrace();
	                }
	            }
	        }
	    }); th.start();

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		menuBar.setBounds(0, 0, 594, 46);
		contentPane.add(menuBar);
		
		JMenu mnClientes = new JMenu("CLIENTES");
		mnClientes.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/client.png")));
		menuBar.add(mnClientes);
		
		JMenuItem mntmConfigurar = new JMenuItem("CONFIGURAR");
		mntmConfigurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Client_Configuration frame = new Client_Configuration();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		mntmConfigurar.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/gear.png")));
		mnClientes.add(mntmConfigurar);
		
		JMenu mnSorvetes = new JMenu("SORVETES");
		mnSorvetes.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/ice-cream.png")));
		menuBar.add(mnSorvetes);
		
		JMenuItem mntmConfigurar_1 = new JMenuItem("CONFIGURAR");
		mntmConfigurar_1.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/gear.png")));
		mnSorvetes.add(mntmConfigurar_1);
		
		JMenu mnAjuda = new JMenu("AJUDA");
		mnAjuda.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/question.png")));
		menuBar.add(mnAjuda);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 536, 594, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSystemDevelopedBy = new JLabel("\u00A9Developed by ");
		lblSystemDevelopedBy.setBounds(0, 0, 182, 32);
		panel.add(lblSystemDevelopedBy);
		lblSystemDevelopedBy.setBackground(new Color(210, 180, 140));
		lblSystemDevelopedBy.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblSystemDevelopedBy.setForeground(Color.BLACK);
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

//				https://www.instagram.com/_ada.ilton/
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/instagram.png")));
		label_1.setBounds(192, 0, 44, 32);
		panel.add(label_1);
		
		JLabel lbladailton = new JLabel("@_ada.ilton   &");
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
		label_2.setBounds(399, 0, 44, 32);
		panel.add(label_2);
		
		JLabel lblbruno = new JLabel("@__bruno");
		lblbruno.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblbruno.setBounds(439, 0, 155, 32);
		panel.add(lblbruno);

	}
}