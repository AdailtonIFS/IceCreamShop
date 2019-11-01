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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Client.Client_MainScreen;
import IceCreamShop.HelpScreen;
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
		
		
		Developer.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Developer.setBackground(Color.WHITE);
		Developer.setBounds(0, 323, 411, 48);
		contentPane.add(Developer);
		Developer.setLayout(null);
		
				JLabel lblSystemDevelopedBy = new JLabel("Developed by Adailton Moura da Silva and Bruno Silva Albuquerque");
				lblSystemDevelopedBy.setBackground(new Color(210, 180, 140));
				lblSystemDevelopedBy.setFont(new Font("Cambria Math", Font.BOLD, 11));
				lblSystemDevelopedBy.setBounds(0, 0, 411, 48);
				Developer.add(lblSystemDevelopedBy);
				lblSystemDevelopedBy.setForeground(new Color(0, 0, 0));
				lblSystemDevelopedBy.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(410, 346, 133, 25);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbHour = new JLabel("");
		lbHour.setBackground(Color.WHITE);
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
		Data.setBackground(Color.WHITE);
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
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		label_1.setBounds(0, 0, 543, 37);
		contentPane.add(label_1);
		
		JLabel lblAjuda = new JLabel("AJUDA");
		lblAjuda.addMouseListener(new MouseAdapter() {
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
				setCursor(Cursor.HAND_CURSOR);
			}
			@SuppressWarnings("deprecation")
			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.DEFAULT_CURSOR);
			}
		});
		lblAjuda.setForeground(Color.WHITE);
		lblAjuda.setBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(0, 0, 0)));
		lblAjuda.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		lblAjuda.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjuda.setBounds(0, 0, 133, 37);
		contentPane.add(lblAjuda);
		
		JLabel lblSair = new JLabel("SAIR");
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblSair.setForeground(Color.WHITE);
		lblSair.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		lblSair.setHorizontalAlignment(SwingConstants.CENTER);
		lblSair.setBounds(134, 0, 100, 37);
		contentPane.add(lblSair);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(255, 204, 102));
		label.setBounds(0, 0, 543, 323);
		label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/images/wallt.jpg")));
		contentPane.add(label);
		
		
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