package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.sun.glass.events.WindowEvent;

import IceCreamShop.MainScreen;

public class Client_MainScreen extends JFrame {

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
					Client_MainScreen frame = new Client_MainScreen();
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
	public Client_MainScreen() {
		
	Font dropthegame1 = null;
		
		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")).deriveFont(82f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Client_MainScreen.class.getResource("/images/target.png")));
		setTitle("CONFIGURA\u00C7\u00C3O");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		
			this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
			
		
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLACK, 1, true));
		contentPane.setBackground(new Color(153, 204, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSearch = new JButton("PESQUISAR");
		btnSearch.setIcon(new ImageIcon(Client_MainScreen.class.getResource("/images/search.png")));
		btnSearch.setFont(new Font("Cambria Math", Font.BOLD, 23));
		btnSearch.setBounds(339, 146, 214, 106);
		contentPane.add(btnSearch);
		
		JButton btnRegister = new JButton("CADASTRAR");
		btnRegister.setIcon(new ImageIcon(Client_MainScreen.class.getResource("/images/copywriter.png")));
		btnRegister.setFont(new Font("Cambria Math", Font.BOLD, 23));
		btnRegister.setBounds(47, 146, 214, 106);
		
		
		contentPane.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Client_Registration frame = new Client_Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		JPanel pnTitle = new JPanel();
		pnTitle.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pnTitle.setBackground(new Color(255, 222, 173));
		pnTitle.setBounds(0, 0, 593, 99);
		contentPane.add(pnTitle);
		pnTitle.setLayout(null);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblClientes.setBounds(0, 0, 593, 99);
		lblClientes.setFont(dropthegame1);
		pnTitle.add(lblClientes);
		
		JPanel pnBaixo = new JPanel();
		pnBaixo.setBounds(0, 318, 593, 53);
		pnBaixo.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pnBaixo.setBackground(new Color(255, 222, 173));
		contentPane.add(pnBaixo);
		pnBaixo.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(32, 7, 35, 40);
		pnBaixo.add(label);
		label.setIcon(new ImageIcon(Client_Registration.class.getResource("/images/back.png")));
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.YELLOW);
		separator.setForeground(Color.BLACK);
		separator.setBounds(30, 279, 537, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.YELLOW);
		separator_1.setBounds(301, 130, 2, 123);
		contentPane.add(separator_1);
		
		
		
	}
}
