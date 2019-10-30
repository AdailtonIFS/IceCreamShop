package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Client.Client_MainScreen;
import IceCreamShop.AboutScreen;
import IceCreamShop.LoginUser;
import IceCreamShop.SalesScreen;

public class Employee_MainScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Data;
	private final JPanel Developer = new JPanel();

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
		setForeground(Color.GRAY);
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
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Developer.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Developer.setBackground(new Color(255, 228, 181));
		Developer.setBounds(0, 323, 411, 48);
		contentPane.add(Developer);
		Developer.setLayout(null);
		
				JLabel lblSystemDevelopedBy = new JLabel("Developed by Adailton Moura da Silva and Bruno Silva Albuquerque");
				lblSystemDevelopedBy.setFont(new Font("Cambria Math", Font.BOLD, 11));
				lblSystemDevelopedBy.setBounds(0, 0, 411, 48);
				Developer.add(lblSystemDevelopedBy);
				lblSystemDevelopedBy.setForeground(new Color(0, 0, 0));
				lblSystemDevelopedBy.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(255, 222, 173));
		panel_2.setBounds(410, 346, 133, 25);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbHour = new JLabel("");
		lbHour.setHorizontalAlignment(SwingConstants.CENTER);
		lbHour.setFont(new Font("Cambria Math", Font.BOLD, 16));
		lbHour.setBounds(0, 0, 133, 23);
		panel_2.add(lbHour);

		Data = new JTextField();
		Data.setForeground(new Color(0, 0, 0));
		Data.setBounds(410, 323, 133, 24);
		contentPane.add(Data);
		Data.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Data.setHorizontalAlignment(SwingConstants.CENTER);
		Data.setBackground(new Color(255, 228, 181));
		Data.setEditable(false);
		Data.setFont(new Font("Cambria Math", Font.BOLD, 14));
		Data.setColumns(10);
		Data.setText(finalDate);
		
		 Thread th = new Thread(new Runnable() { //cria uma thread
		        public void run() {
		            while(true) { //roda indefinidamente
		                Date data = Calendar.getInstance().getTime();
		                DateFormat h = DateFormat.getTimeInstance();
		                lbHour.setText(h.format(data));     
		                try {
		                    Thread.sleep(1000); //espera 1 segundo para fazer a nova evolução
		                } catch(InterruptedException ex){
		                }
		            }
		        }
		    }); th.start();

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

		JButton btnLogout = new JButton("   SAIR");
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnLogout.setFont(new Font("Cambria Math", Font.BOLD, 16));
		btnLogout.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/turn-on.png")));
		btnLogout.setBounds(201, 201, 151, 65);
		contentPane.add(btnLogout);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 544, 36);
		contentPane.add(menuBar);
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		JMenu mnAjuda = new JMenu("AJUDA");
		mnAjuda.setFont(new Font("Cambria Math", Font.BOLD, 15));
		mnAjuda.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/help_question_16768 (1).png")));
		menuBar.add(mnAjuda);

		JMenuItem mntmExibirAjuda = new JMenuItem("EXIBIR AJUDA");
		mntmExibirAjuda.setFont(new Font("Cambria Math", Font.BOLD, 15));
		mnAjuda.add(mntmExibirAjuda);

		JMenuItem mntmSobreOIce = new JMenuItem("SOBRE O ICE CREAM SHOP");
		mntmSobreOIce.setFont(new Font("Cambria Math", Font.BOLD, 15));
		mnAjuda.add(mntmSobreOIce);

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
		btnSales.setBounds(201, 113, 151, 65);
		btnSales.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/images/goods.png")));
		contentPane.add(btnSales);
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
		
		
		mntmSobreOIce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AboutScreen frame = new AboutScreen();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					LoginUser frame = new LoginUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				dispose();
			}
		});

	}
}