package IceCreamShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class HelpScreen extends JFrame {

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
					HelpScreen frame = new HelpScreen();
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
	public HelpScreen() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.setBounds(87, 84, 420, 397);
				panel.setLayout(null);
				contentPane.add(panel);
				
				List listaPerguntas = new List();
				listaPerguntas.setFont(new Font("SansSerif", Font.PLAIN, 15) );
				listaPerguntas.add("COMO CADASTRAR UM FUNCIONÁRIO?");
				listaPerguntas.add("PESQUISAR, ALTERAR OU EXCLUIR FUNCIONÁRIO?");
				listaPerguntas.add("COMO CADASTRAR UM ADMINISTRADOR");
				listaPerguntas.add("PESQUISAR, ALTERAR OU EXCLUIR ADMINISTRADOR?");
				listaPerguntas.setBounds(19, 21, 382, 214);
				panel.add(listaPerguntas);
				
				
				
				
				JLabel lblCliqueNaAba = new JLabel("Clique na aba ");
				lblCliqueNaAba.setVisible(false);
				lblCliqueNaAba.setFont(new Font("SansSerif", Font.PLAIN, 15));
				lblCliqueNaAba.setBounds(98, 270, 93, 26);
				panel.add(lblCliqueNaAba);
				
				JLabel opcao1 = new JLabel("");
				opcao1.setVisible(false);
				opcao1.setBounds(207, 270, 167, 26);
				panel.add(opcao1);
				
				JLabel lblEDepois = new JLabel("e depois clique na op\u00E7\u00E3o");
				lblEDepois.setVisible(false);
				lblEDepois.setFont(new Font("SansSerif", Font.PLAIN, 15));
				lblEDepois.setBounds(42, 324, 177, 16);
				panel.add(lblEDepois);
				
				JLabel opcao2 = new JLabel("");
				opcao2.setVisible(false);
				opcao2.setHorizontalAlignment(SwingConstants.CENTER);
				opcao2.setBounds(231, 315, 143, 37);
				panel.add(opcao2);
				
				listaPerguntas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if(listaPerguntas.getSelectedIndex() == 0) {
							lblCliqueNaAba.setVisible(true);
							opcao1.setVisible(true);
							opcao1.setIcon(new ImageIcon(HelpScreen.class.getResource("/imagesAdministrator/im1.png")));
							lblEDepois.setVisible(true);
							opcao2.setVisible(true);
							opcao2.setIcon(new ImageIcon(HelpScreen.class.getResource("/imagesAdministrator/im2.png")));
							
						}
						if(listaPerguntas.getSelectedIndex() == 1) {

							lblCliqueNaAba.setVisible(true);
							opcao1.setVisible(true);
							opcao1.setIcon(new ImageIcon(HelpScreen.class.getResource("/imagesAdministrator/im1.png")));
							lblEDepois.setVisible(true);
							opcao2.setVisible(true);
							opcao2.setIcon(new ImageIcon(HelpScreen.class.getResource("/imagesAdministrator/im3.png")));

			        }
						if(listaPerguntas.getSelectedIndex() == 2) {
							
							lblCliqueNaAba.setVisible(true);
							opcao1.setVisible(true);
							opcao1.setIcon(new ImageIcon(HelpScreen.class.getResource("/imagesAdministrator/im4.png")));
							lblEDepois.setVisible(true);
							opcao2.setVisible(true);
							opcao2.setIcon(new ImageIcon(HelpScreen.class.getResource("/imagesAdministrator/im2.png")));

			        }
						if(listaPerguntas.getSelectedIndex() == 3) {
							
							lblCliqueNaAba.setVisible(true);
							opcao1.setVisible(true);
							opcao1.setIcon(new ImageIcon(HelpScreen.class.getResource("/imagesAdministrator/im4.png")));
							lblEDepois.setVisible(true);
							opcao2.setVisible(true);
							opcao2.setIcon(new ImageIcon(HelpScreen.class.getResource("/imagesAdministrator/im3.png")));

			        }
						
					}
				});
				
				
				JLabel wallpaper = new JLabel("");
				wallpaper.setIcon(new ImageIcon(HelpScreen.class.getResource("/images/entrada.jpg")));
				wallpaper.setBounds(0, 0, 594, 565);
				contentPane.add(wallpaper);
		
				
	}
}
