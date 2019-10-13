package IceCreamShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Panel;
import java.awt.SystemColor;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class AboutScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutScreen frame = new AboutScreen();
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
	public AboutScreen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutScreen.class.getResource("/images/info.png")));
		
		Font dropthegame1 = null;
		
		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")).deriveFont(52f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		
		setBackground(SystemColor.controlShadow);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEsseO = new JLabel("Esse \u00E9 o Ice Cream Shop, um programa");
		lblEsseO.setForeground(Color.WHITE);
		lblEsseO.setFont(new Font("Serif", Font.BOLD, 16));
		lblEsseO.setHorizontalAlignment(SwingConstants.CENTER);
		lblEsseO.setBounds(0, 92, 444, 28);
		contentPane.add(lblEsseO);
		
		JLabel lblComOIntuito = new JLabel("com o intuito de ajudar os donos de sorveteria");
		lblComOIntuito.setForeground(Color.WHITE);
		lblComOIntuito.setFont(new Font("Serif", Font.BOLD, 16));
		lblComOIntuito.setHorizontalAlignment(SwingConstants.CENTER);
		lblComOIntuito.setBounds(0, 133, 444, 22);
		contentPane.add(lblComOIntuito);
		
		JLabel lblQueTemInteresse = new JLabel("que tem interesse em crescer no mercado de sorveterias,");
		lblQueTemInteresse.setForeground(Color.WHITE);
		lblQueTemInteresse.setFont(new Font("Serif", Font.BOLD, 15));
		lblQueTemInteresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblQueTemInteresse.setBounds(0, 153, 444, 22);
		contentPane.add(lblQueTemInteresse);
		
		JLabel lblEsteProgramaConta = new JLabel("este programa conta com diversas funcionalidades para ajuda-lo.");
		lblEsteProgramaConta.setForeground(Color.WHITE);
		lblEsteProgramaConta.setFont(new Font("Serif", Font.BOLD, 14));
		lblEsteProgramaConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblEsteProgramaConta.setBounds(0, 171, 444, 22);
		contentPane.add(lblEsteProgramaConta);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		panel.setBounds(0, 0, 444, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ice Creamoso");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel.setFont(dropthegame1);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 444, 79);
		panel.add(lblNewLabel);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 222, 173));
		panel_1.setBounds(0, 217, 444, 47);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblVersion = new JLabel("Version 1.0");
		lblVersion.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblVersion.setBounds(0, 0, 444, 47);
		panel_1.add(lblVersion);
		lblVersion.setForeground(SystemColor.desktop);
		lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersion.setFont(new Font("Cambria Math", Font.BOLD, 30));
	}
}
