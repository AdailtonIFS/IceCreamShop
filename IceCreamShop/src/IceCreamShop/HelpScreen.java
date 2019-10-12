package IceCreamShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

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
		setBounds(100, 100, 699, 607);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(12, 80, 669, 234);
				panel.setLayout(null);
				contentPane.add(panel);

				List listaPerguntas = new List();
				listaPerguntas.setFont(new Font("Arial", Font.PLAIN, 16) );
				listaPerguntas.add("QUANDO SABER SE O CAMPO É OBRIGATÓRIO");
				listaPerguntas.setBounds(10, 10, 649, 214);
				panel.add(listaPerguntas);
				listaPerguntas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
			
					}
				});
				
				TextArea resposta = new TextArea();
				contentPane.add(resposta);
				resposta.setEditable(false);
				resposta.setFont(new Font("Arial", Font.PLAIN, 18));
				resposta.setBounds(48, 305, 597, 170);
				resposta.setFocusable(false);
				
				JPanel pnCima = new JPanel();
				pnCima.setBounds(0, 0, 693, 67);
				contentPane.add(pnCima);
				pnCima.setBackground(new Color(255, 228, 181));
				pnCima.setLayout(null);
				
				JPanel pnBaixo = new JPanel();
				pnBaixo.setBounds(0, 512, 693, 60);
				contentPane.add(pnBaixo);
				pnBaixo.setBackground(new Color(255, 228, 181));
				pnBaixo.setLayout(null);
		
				
	}
}
