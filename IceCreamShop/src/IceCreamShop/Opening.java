package IceCreamShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Opening.class.getResource("/images/business.png")));

		Font dropthegame = null;
		
		try {
			dropthegame = Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")).deriveFont(55f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			e.getMessage();
		}
		
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 430);
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
		setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	 	JProgressBar progressBar = new JProgressBar();
	 	progressBar.setOpaque(true);
		progressBar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		progressBar.setStringPainted(true);
		progressBar.setBackground(new Color(28, 189, 127));
		progressBar.setBackground(Color.WHITE);
		progressBar.setIndeterminate(true);
		progressBar.setBounds(203, 242, 30, 36);
		contentPane.add(progressBar);
		
		JLabel lblEntrada = new JLabel("");
		lblEntrada.setForeground(Color.BLACK);
		lblEntrada.setFont(new Font("Cambria Math", Font.BOLD, 17));
		lblEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrada.setBounds(0, 273, 400, 16);
		contentPane.add(lblEntrada);
		
		JPanel panelCima = new JPanel();
		panelCima.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCima.setBackground(new Color(28, 189, 127));

		panelCima.setBounds(0, 0, 437, 86);
		contentPane.add(panelCima);
		panelCima.setLayout(null);
		
		
		JLabel lblBemVindo = new JLabel("BEM VINDO");
		lblBemVindo.setForeground(Color.WHITE);
		lblBemVindo.setBounds(0, 0, 437, 86);
		panelCima.add(lblBemVindo);
		lblBemVindo.setBackground(Color.WHITE);
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setFont(dropthegame);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Opening.class.getResource("/images/068a78627d7840d2d861d68ffb1a89f6.gif")));
		label.setBounds(0, 86, 437, 344);
		contentPane.add(label);
					
			new Thread (){
				public void run() {
					
					for(int i = 0; i < 101; i++) {
						
						try {
							 sleep(30);
							    if(i == 25) {
							    }
							    else
							    	if(i == 50) {
							    	}
							    	else
							    		if(i == 75) {

							    		}
							    progressBar.setValue(i);
							
		
						}catch(InterruptedException ex){
						}
							
					}
					dispose();	
					try {
							LoginUser frame = new LoginUser();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
				}
			}.start();
	}
}
