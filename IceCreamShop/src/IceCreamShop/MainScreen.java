package IceCreamShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.IOException;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Administrator.AdministratorLogin;
import Client.Client_MainScreen;
import javax.swing.JSeparator;

public class MainScreen extends JFrame {

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
					MainScreen frame = new MainScreen();
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
	public MainScreen() {

		Font dropthegame1 = null;

		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("REIS.ttf")).deriveFont(72f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("REIS.ttf")));
		} catch (IOException | FontFormatException e) {

		}

		// ====================================================================
		setTitle("ICE CREAM SHOP");
		setForeground(Color.GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainScreen.class.getResource("/images/homepage.png")));
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
		setBounds(100, 100, 700, 650);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Developer.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Developer.setBackground(new Color(255, 228, 181));
		Developer.setBounds(0, 568, 553, 47);
		contentPane.add(Developer);
		Developer.setLayout(null);
		
				JLabel lblSystemDevelopedBy = new JLabel("System Developed by Adailton Moura da Silva and Bruno Silva Albuquerque");
				lblSystemDevelopedBy.setBounds(0, 0, 551, 47);
				Developer.add(lblSystemDevelopedBy);
				lblSystemDevelopedBy.setForeground(new Color(0, 0, 0));
				lblSystemDevelopedBy.setFont(new Font("SansSerif", Font.BOLD, 15));
				lblSystemDevelopedBy.setHorizontalAlignment(SwingConstants.CENTER);
		
				JPanel panel = new JPanel();
				panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel.setBounds(2, 168, 691, 253);
				panel.setLayout(null);
				contentPane.add(panel);
				
						JPanel pnName = new JPanel();
						pnName.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
						pnName.setBounds(20, 10, 323, 231);
						panel.add(pnName);
						pnName.setLayout(null);
						
								List listaSabores = new List();
								listaSabores.setBounds(10, 10, 303, 211);
								pnName.add(listaSabores);
								listaSabores.setFont(new Font("Tahoma", Font.PLAIN, 11));
								
										JPanel pnPrecos = new JPanel();
										pnPrecos.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
										pnPrecos.setBounds(353, 10, 323, 231);
										panel.add(pnPrecos);
										pnPrecos.setLayout(null);
										
												List listaPrecos = new List();
												listaPrecos.setBounds(10, 10, 303, 211);
												pnPrecos.add(listaPrecos);
												listaPrecos.setFont(new Font("Tahoma", Font.PLAIN, 11));
												listaPrecos.add("R$17,75");
												listaPrecos.setEnabled(false);
												listaSabores.add("CHOCOLATE");
												listaSabores.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														try {
															SalesScreen frame = new SalesScreen();
															frame.setVisible(true);
														} catch (Exception e1) {
															e1.printStackTrace();
														}
													}
												});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(255, 222, 173));
		panel_2.setBounds(550, 592, 143, 23);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbHour = new JLabel("");
		lbHour.setHorizontalAlignment(SwingConstants.CENTER);
		lbHour.setFont(new Font("Cambria Math", Font.BOLD, 16));
		lbHour.setBounds(0, 0, 141, 22);
		panel_2.add(lbHour);

		Data = new JTextField();
		Data.setForeground(new Color(0, 0, 0));
		Data.setBounds(550, 568, 143, 24);
		contentPane.add(Data);
		Data.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Data.setHorizontalAlignment(SwingConstants.CENTER);
		Data.setBackground(new Color(255, 228, 181));
		Data.setEditable(false);
		Data.setFont(new Font("Cambria Math", Font.BOLD, 16));
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
		btnClients.setIcon(new ImageIcon(MainScreen.class.getResource("/images/man.png")));
		btnClients.setBounds(511, 479, 151, 65);
		contentPane.add(btnClients);
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		btnLogout.setIcon(new ImageIcon(MainScreen.class.getResource("/images/turn-on.png")));
		btnLogout.setBounds(32, 479, 151, 65);
		contentPane.add(btnLogout);

		JPanel panelSabores = new JPanel();
		panelSabores.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSabores.setBounds(1, 125, 345, 42);
		contentPane.add(panelSabores);
		panelSabores.setLayout(null);

		JLabel lblPreco = new JLabel("SABORES");
		lblPreco.setFont(new Font("Cambria Math", Font.BOLD, 15));
		lblPreco.setBounds(0, 0, 345, 42);
		panelSabores.add(lblPreco);
		lblPreco.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panelCardapio = new JPanel();
		panelCardapio.setBackground(new Color(255, 222, 173));
		panelCardapio.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCardapio.setBounds(0, 35, 694, 88);
		contentPane.add(panelCardapio);
		panelCardapio.setLayout(null);

		JLabel lblCardpio = new JLabel("CARDAPIO");
		lblCardpio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCardpio.setBounds(0, 0, 694, 88);
		lblCardpio.setFont(dropthegame1);
		panelCardapio.add(lblCardpio);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 694, 36);
		contentPane.add(menuBar);
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		JMenu mnAjuda = new JMenu("AJUDA");
		mnAjuda.setFont(new Font("Cambria Math", Font.BOLD, 15));
		mnAjuda.setIcon(new ImageIcon(MainScreen.class.getResource("/images/help_question_16768 (1).png")));
		menuBar.add(mnAjuda);

		JMenuItem mntmExibirAjuda = new JMenuItem("EXIBIR AJUDA");
		mntmExibirAjuda.setFont(new Font("Cambria Math", Font.BOLD, 15));
		mnAjuda.add(mntmExibirAjuda);

		JMenuItem mntmSobreOIce = new JMenuItem("SOBRE O ICE CREAM SHOP");
		mntmSobreOIce.setFont(new Font("Cambria Math", Font.BOLD, 15));
		mnAjuda.add(mntmSobreOIce);

		JPanel panelValor = new JPanel();
		panelValor.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelValor.setBounds(348, 125, 345, 42);
		contentPane.add(panelValor);
		panelValor.setLayout(null);

		JLabel lblValor = new JLabel("VALOR");
		lblValor.setFont(new Font("Cambria Math", Font.BOLD, 15));
		lblValor.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblValor.setBounds(0, 0, 345, 42);
		panelValor.add(lblValor);
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnAdministrar = new JButton("ADMINISTRADOR");
		btnAdministrar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAdministrar.setFont(new Font("Cambria Math", Font.BOLD, 16));
		btnAdministrar.setIcon(new ImageIcon(MainScreen.class.getResource("/images/team.png")));
		btnAdministrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					dispose();
					AdministratorLogin frame = new AdministratorLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnAdministrar.setBounds(244, 479, 209, 65);
		contentPane.add(btnAdministrar);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(235, 555, 227, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(216, 448, 1, 101);
		contentPane.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(480, 448, 1, 101);
		contentPane.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(21, 555, 172, 2);
		contentPane.add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(499, 555, 172, 2);
		contentPane.add(separator_4);
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
				dispose();
			}
		});

	}
}