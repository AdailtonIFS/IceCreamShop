package IceCreamShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class Opening extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private static Opening frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Opening();
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
	public Opening() {
	
		setTitle("ICE CREAM SHOP");
		
		Font dropthegame = null;
		
		try {
			dropthegame = Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")).deriveFont(82f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			e.getMessage();
		}
		
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		setLocationRelativeTo(null);
		setResizable(false);

		this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblBemVindo = new JLabel("BEM VINDO");
		lblBemVindo.setBackground(Color.WHITE);
		lblBemVindo.setForeground(Color.BLACK);
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setBounds(0, 104, 599, 105);
		lblBemVindo.setFont(dropthegame);
		contentPane.add(lblBemVindo);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(516, 346, 56, 16);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.WHITE);
		label_1.setBackground(Color.WHITE);
		label_1.setBorder(new MatteBorder(0, 0, 6, 0, (Color) new Color(255, 255, 255)));
		label_1.setBounds(27, 178, 545, 14);
		contentPane.add(label_1);
		
	 	JProgressBar progressBar = new JProgressBar();
		progressBar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		progressBar.setStringPainted(true);
		progressBar.setForeground(new Color(0, 0, 0));
		progressBar.setBackground(new Color(135, 206, 250));
		progressBar.setIndeterminate(true);
		progressBar.setBounds(100, 307, 402, 36);
		contentPane.add(progressBar);
		
		JLabel lblEntrada = new JLabel("");
		lblEntrada.setFont(new Font("Courier New", Font.BOLD, 15));
		lblEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrada.setBounds(0, 386, 596, 16);
		contentPane.add(lblEntrada);
					
			new Thread (){
				public void run() {
					
					for(int i = 0; i < 101; i++) {
						
						try {
							 sleep(30);
							    if(i == 25) {
							    	lblEntrada.setText("CARREGANDO O CÓDIGO...");
							    }
							    else
							    	if(i == 50) {
							    		lblEntrada.setText("CARREGANDO BANCO DE DADOS...");
							    	}
							    	else
							    		if(i == 75) {
								    		lblEntrada.setText("ENTRANDO...");

							    		}
							    progressBar.setValue(i);
							
		
						}catch(InterruptedException ex){
						}
							
					}
					dispose();	
					try {
						MainScreen frame = new MainScreen();
						frame.setVisible(true);	
						
						} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}.start();
	}
}
