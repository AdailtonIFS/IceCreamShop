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
		setBounds(100, 100, 949, 524);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 919, 240);
				panel.setLayout(null);
				contentPane.add(panel);

				List listaPerguntas = new List();
				listaPerguntas.setFont(new Font("Arial", Font.PLAIN, 16) );
				listaPerguntas.add("QUANDO SABER SE O CAMPO É OBRIGATÓRIO");
				listaPerguntas.setBounds(10, 5, 899, 225);
				panel.add(listaPerguntas);
				listaPerguntas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
			
					}
				});
				
				TextArea resposta = new TextArea();
				contentPane.add(resposta);
				resposta.setEditable(false);
				resposta.setFont(new Font("Arial", Font.PLAIN, 18));
				resposta.setBounds(174, 262, 620, 215);
				resposta.setFocusable(false);
		
				
	}
}
