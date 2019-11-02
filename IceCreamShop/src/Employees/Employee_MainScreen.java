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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

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
		
		JLabel lblSystemDevelopedBy = new JLabel("\u00A9Developed by @ada.ilton and @_bru.no");
		lblSystemDevelopedBy.setBounds(0, 429, 594, 36);
		contentPane.add(lblSystemDevelopedBy);
		lblSystemDevelopedBy.setBackground(new Color(210, 180, 140));
		lblSystemDevelopedBy.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblSystemDevelopedBy.setForeground(Color.BLACK);
		lblSystemDevelopedBy.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label.setBackground(new Color(255, 204, 102));
		label.setBounds(0, 28, 594, 537);
		label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/images/wallt.jpg")));
		contentPane.add(label);
		
		Thread th = new Thread(new Runnable() { //cria uma thread
	        public void run() {
	            while(true) { //roda indefinidamente
	                try {
	                    
	                    for(int i = 0; i<6; i++) {
	                    	Thread.sleep(1100); //espera 1,1 segundo para fazer a nova evolução
	                    	if(i == 1) {
	                    		label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/images/wall.jpg")));
	                    	}
	                    	else
	                    		if(i == 3) {
	                		label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/images/ice_cream.jpg")));
	                    	}
	                    	else 
	                    		if(i == 5) {
		                		label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/images/entrada1.jpeg")));
	                		}
	                    }
	                   
	                } catch(InterruptedException ex){
	                }
	            }
	        }
	    }); th.start();

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		menuBar.setBounds(0, 0, 594, 28);
		contentPane.add(menuBar);
		
		JMenu mnAjuda = new JMenu("AJUDA");
		menuBar.add(mnAjuda);

	}
}