package Administrator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import Employees.Employee_Registration;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdministratorMainScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel Developer = new JPanel();
	private JTextField textField;

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
		
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		@SuppressWarnings("unused")
		String finalDate = formatador.format(data);
		
		ArrayList<String> valores = new ArrayList<String>();
		valores.addAll(DataBase.Functions.searchEmployeeAdvanced("employeeAdvanced"));
		
		Developer.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Developer.setBackground(new Color(255, 228, 181));
		Developer.setBounds(0, 323, 411, 48);
		contentPane.add(Developer);
		Developer.setLayout(null);
		
		JLabel label = new JLabel("Developed by Adailton Moura da Silva and Bruno Silva Albuquerque");
		label.setBounds(0, 0, 411, 48);
		Developer.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Cambria Math", Font.BOLD, 11));
		
		List list = new List();
		list.setBounds(72, 87, 392, 156);
		contentPane.add(list);
		
		JPanel panelCima = new JPanel();
		panelCima.setBorder(new LineBorder(Color.BLACK, 1, true));
		panelCima.setBackground(new Color(255, 222, 173));
		panelCima.setBounds(0, 0, 544, 32);
		contentPane.add(panelCima);
		panelCima.setLayout(null);
		
		JLabel lblBemVindo = new JLabel("Bem vindo:   "+valores.get(IceCreamShop.LoginUser.posicao-8));
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setBounds(0, 0, 544, 32);
		panelCima.add(lblBemVindo);
		lblBemVindo.setFont(new Font("Cambria Math", Font.BOLD, 13));
		
		JButton btnAccount = new JButton("CONTA");
		btnAccount.setBounds(310, 128, 135, 70);
		contentPane.add(btnAccount);
		btnAccount.setFont(new Font("Cambria Math", Font.BOLD, 13));
		btnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnAccount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnAccount.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/settings.png")));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(255, 222, 173));
		panel.setBounds(410, 346, 133, 25);
		contentPane.add(panel);
		
		JLabel lblHour = new JLabel("");
		lblHour.setHorizontalAlignment(SwingConstants.CENTER);
		lblHour.setFont(new Font("Cambria Math", Font.BOLD, 16));
		lblHour.setBounds(0, 0, 133, 23);
		panel.add(lblHour);
		
		
		Thread th = new Thread(new Runnable() { //cria uma thread
	        public void run() {
	            while(true) { //roda indefinidamente
	                Date data = Calendar.getInstance().getTime();
	                DateFormat h = DateFormat.getTimeInstance();
	                lblHour.setText(h.format(data));     
	                try {
	                    Thread.sleep(1000); //espera 1 segundo para fazer a nova evolução
	                } catch(InterruptedException ex){
	                }
	            }
	        }
	    }); th.start();

		
		textField = new JTextField();
		textField.setText("30/10/2019");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Cambria Math", Font.BOLD, 14));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textField.setBackground(new Color(255, 228, 181));
		textField.setBounds(410, 323, 133, 24);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("Lista de Funcion\u00E1rios");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("DialogInput", Font.BOLD, 12));
		lblNewLabel.setBounds(71, 67, 393, 14);
		contentPane.add(lblNewLabel);
		
		JLabel cadastrar = new JLabel("");
		cadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Employee_Registration frame = new Employee_Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		cadastrar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		cadastrar.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/plus.png")));
		cadastrar.setBounds(437, 249, 27, 41);
		contentPane.add(cadastrar);
		
		
		
		
	}
}
