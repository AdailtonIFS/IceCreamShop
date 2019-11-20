package IceCreamShop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class SalesScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public String sorvetes;
	public int pegarPreco;
	public double valorTotal;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesScreen frame = new SalesScreen();
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
	public SalesScreen() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SalesScreen.class.getResource("/images/coins.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 807, 686);
		setLocationRelativeTo(null);
		setResizable(false);
		
			this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Sorvete = new JPanel();
		Sorvete.setBorder(new LineBorder(new Color(0, 0, 0)));
		Sorvete.setBounds(33, 121, 449, 174);
		contentPane.add(Sorvete);
		Sorvete.setLayout(null);
		
		ArrayList<Object> valoresCliente = new ArrayList<Object>();
		String tabela  = "client";
		
		try {
			valoresCliente.addAll(DataBase.Functions.buscarDadosCliente(tabela));
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível conectar ao Banco de Da123123dos","AVISO",2);
		}
		
		ArrayList<Object> valoresSorvetes = new ArrayList<Object>();
		String tabela1  = "icecream";
		
		try {
			valoresSorvetes.addAll(DataBase.Functions.buscarDadosSorvetes(tabela1));
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível conectar ao Banco de Da1dos","AVISO",2);
		}
		
		
		List listSorvetes = new List();
		listSorvetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				sorvetes = listSorvetes.getSelectedItem();
				System.out.println(sorvetes);
				for (int i = 0; i < valoresSorvetes.size(); i++) {
					if(sorvetes.equals(valoresSorvetes.get(i))) {
						pegarPreco = i+1;
					}
					
				}
				System.out.println(valoresSorvetes.get(pegarPreco));
				String vt = (String) valoresSorvetes.get(pegarPreco);
				String a = vt.replaceAll(",",".");
				 valorTotal =+ Double.parseDouble(a);
				 textField.setText(String.valueOf(valorTotal));
			
			}
		});
		listSorvetes.setBounds(10, 10, 429, 155);
		Sorvete.add(listSorvetes);
		
		JPanel Clientes = new JPanel();
		Clientes.setLayout(null);
		Clientes.setBorder(new LineBorder(new Color(0, 0, 0)));
		Clientes.setBounds(33, 308, 449, 174);
		contentPane.add(Clientes);
		
		List listClientes = new List();
		listClientes.setBounds(10, 10, 428, 155);
		Clientes.add(listClientes);
		
		JPanel Sorvetes = new JPanel();
		Sorvetes.setBorder(new LineBorder(new Color(0, 0, 0)));
		Sorvetes.setBounds(555, 92, 236, 544);
		contentPane.add(Sorvetes);
		Sorvetes.setLayout(null);
		
		List list_2 = new List();
		list_2.setBounds(10, 10, 216, 494);
		Sorvetes.add(list_2);
		
		textField = new JTextField();
		textField.setBounds(70, 513, 104, 20);
		Sorvetes.add(textField);
		textField.setColumns(10);
		list_2.add(sorvetes);
		
		
		JPanel btnCadastrar = new JPanel();
		btnCadastrar.setLayout(null);
		btnCadastrar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnCadastrar.setBackground(Color.GRAY);
		btnCadastrar.setBounds(363, 599, 119, 28);
		contentPane.add(btnCadastrar);
		
		JLabel lblCadastrar = new JLabel("Vender");
		lblCadastrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblCadastrar.setBounds(0, 0, 119, 28);
		btnCadastrar.add(lblCadastrar);
		
		lblCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCadastrar.setForeground(Color.GRAY);
				btnCadastrar.setBackground(Color.WHITE);
				lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblCadastrar.setForeground(Color.WHITE);
				btnCadastrar.setBackground(Color.GRAY);
				lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));

			}
		});
		
		JPanel btnVoltar = new JPanel();
		btnVoltar.setLayout(null);
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnVoltar.setBackground(new Color(220, 80, 53));
		btnVoltar.setBounds(59, 599, 119, 28);
		contentPane.add(btnVoltar);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoltar.setForeground(Color.WHITE);
		lblVoltar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblVoltar.setBounds(0, 0, 119, 28);
		btnVoltar.add(lblVoltar);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBackground(new Color(28, 189, 127));
		panel.setBounds(0, 0, 801, 81);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("Ice Cream Shop");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(null);
		label_1.setBounds(0, 0, 801, 81);
		panel.add(label_1);
		lblVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblVoltar.setForeground(new Color(220,80,53));
				btnVoltar.setBackground(Color.white);
				lblVoltar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblVoltar.setForeground(Color.WHITE);
				btnVoltar.setBackground(new Color(220,80,53));
				lblVoltar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));

			}
		});
		int quantidade = DataBase.Functions.countQuantiy(tabela);
		
		
		if(quantidade > 0) {
		for(int i = 0; i < valoresCliente.size(); i++) {
		
		listClientes.add((String) valoresCliente.get(i));
			
		i+=7;
		}
	}	
		
		int quantidade1 = DataBase.Functions.countQuantiy("icecream");
		
		
		if(quantidade1 > 0) {
		for(int i = 0; i < valoresSorvetes.size(); i++) {
		
		listSorvetes.add((String) valoresSorvetes.get(i));
			
		i+=5;
		}
	}	
		
		
	}
}
