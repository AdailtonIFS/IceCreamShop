package Employees;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Client.Client_MainScreen;
import IceCreamShop.HelpScreen;
import IceCreamShop.SalesScreen;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
		
		

		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		String finalDate = formatador.format(data);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JButton btnClients = new JButton("CLIENTES");
		btnClients.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnClients.setFont(new Font("Cambria Math", Font.BOLD, 16));
		btnClients.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/man.png")));
		btnClients.setBounds(21, 158, 151, 65);
		contentPane.add(btnClients);
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					Client_MainScreen frame = new Client_MainScreen();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(182, 151, 1, 88);
		contentPane.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(362, 158, 1, 88);
		contentPane.add(separator_2);
		
		JButton btnIceCream = new JButton("SORVETES");
		btnIceCream.setBorder(new LineBorder(Color.BLACK, 1, true));
		btnIceCream.setFont(new Font("Cambria Math", Font.BOLD, 16));
		btnIceCream.setBounds(373, 158, 151, 65);
		btnIceCream.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/ice-cream.png")));
		contentPane.add(btnIceCream);
		
		JButton btnSales = new JButton("VENDA");
		btnSales.setFont(new Font("Cambria Math", Font.BOLD, 16));
		btnSales.setBorder(new LineBorder(Color.BLACK, 1, true));
		btnSales.setBounds(201, 158, 151, 65);
		btnSales.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/goods.png")));
		contentPane.add(btnSales);
		
				JLabel lblSystemDevelopedBy = new JLabel("\u00A9Developed by @ada.ilton and @_bru.no");
				lblSystemDevelopedBy.setBounds(0, 314, 543, 36);
				contentPane.add(lblSystemDevelopedBy);
				lblSystemDevelopedBy.setBackground(new Color(210, 180, 140));
				lblSystemDevelopedBy.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
				lblSystemDevelopedBy.setForeground(Color.BLACK);
				lblSystemDevelopedBy.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label.setBackground(new Color(255, 204, 102));
		label.setBounds(0, 31, 543, 319);
		label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/images/wallt.jpg")));
		contentPane.add(label);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		menuBar.setBounds(0, 0, 543, 28);
		contentPane.add(menuBar);
		
		JMenu mnAjuda = new JMenu("AJUDA");
		menuBar.add(mnAjuda);
		
		
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					SalesScreen frame = new SalesScreen();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

	}
}