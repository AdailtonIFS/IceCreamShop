package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Client_Configuration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFEmail;
	private JTextField txtFGnero;
	private JTextField txtFLogradouro;
	private JTextField txtFCep;
	private JTextField DateN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client_Configuration frame = new Client_Configuration();
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
	public Client_Configuration() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Client_Configuration.class.getResource("/images/gear.png")));
		Font dropthegame1 = null;
		
		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("AquateScript_PERSONAL_USE_ONLY.ttf")).deriveFont(50f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		setResizable(false);
		setLocationRelativeTo(null);
		
		this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
			}
		});
		
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(25, 119, 544, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setBounds(25, 386, 180, 16);
		contentPane.add(lblCpf);
		
		JFormattedTextField txtFCpf = new JFormattedTextField();
		txtFCpf.setEditable(false);
		txtFCpf.setBorder(new LineBorder(Color.BLACK));
		txtFCpf.setBounds(25, 413, 178, 22);
		contentPane.add(txtFCpf);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(211, 359, 180, 16);
		contentPane.add(lblEmail);
		
		txtFEmail = new JTextField();
		txtFEmail.setEditable(false);
		txtFEmail.setBorder(new LineBorder(Color.BLACK));
		txtFEmail.setBounds(211, 386, 178, 22);
		contentPane.add(txtFEmail);
		txtFEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setBounds(25, 451, 180, 16);
		contentPane.add(lblTelefone);
		
		JFormattedTextField txtFPhone = new JFormattedTextField();
		txtFPhone.setEditable(false);
		txtFPhone.setBorder(new LineBorder(Color.BLACK));
		txtFPhone.setBounds(25, 478, 178, 22);
		contentPane.add(txtFPhone);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataDeNascimento.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblDataDeNascimento.setBounds(211, 419, 180, 16);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblSexo = new JLabel("G\u00EAnero:");
		lblSexo.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblSexo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexo.setBounds(211, 478, 180, 16);
		contentPane.add(lblSexo);
		
		txtFGnero = new JTextField();
		txtFGnero.setEditable(false);
		txtFGnero.setBorder(new LineBorder(Color.BLACK));
		txtFGnero.setBounds(211, 505, 180, 22);
		contentPane.add(txtFGnero);
		txtFGnero.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Endere\u00E7o:");
		lblLogradouro.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblLogradouro.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogradouro.setBounds(402, 369, 167, 22);
		contentPane.add(lblLogradouro);
		
		txtFLogradouro = new JTextField();
		txtFLogradouro.setEditable(false);
		txtFLogradouro.setBorder(new LineBorder(Color.BLACK));
		txtFLogradouro.setBounds(398, 413, 178, 22);
		contentPane.add(txtFLogradouro);
		txtFLogradouro.setColumns(10);
		
		JLabel lblBairro = new JLabel("CEP");
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblBairro.setHorizontalAlignment(SwingConstants.CENTER);
		lblBairro.setBounds(396, 451, 178, 16);
		contentPane.add(lblBairro);
		
		txtFCep = new JTextField();
		txtFCep.setEditable(false);
		txtFCep.setBorder(new LineBorder(Color.BLACK));
		txtFCep.setBounds(398, 478, 178, 22);
		contentPane.add(txtFCep);
		txtFCep.setColumns(10);
		
		//ArrayList use getInformations of DataBase
				ArrayList<Object> valores = new ArrayList<Object>();
				String tabela  = "client";
				
				try {
					valores.addAll(DataBase.Functions.buscarDadosCliente(tabela));
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "N�o foi poss�vel conectar ao Banco de Dados","AVISO",2);
				}
				
				List list = new List();
				list.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						int quantidade = 0;
						try {
							quantidade = DataBase.Functions.countQuantiy(tabela);
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						
						if(quantidade > 0) {
						int indice  = list.getSelectedIndex();
						
						txtFCpf.setText((String) valores.get(indice+1));
						txtFEmail.setText((String) valores.get(indice+6));
						txtFPhone.setText((String) valores.get(indice+2));
					    DateN.setText((String) valores.get(indice+5));
						txtFGnero.setText((String) valores.get(indice+7));
						txtFLogradouro.setText((String) valores.get(indice+3));
						txtFCep.setText((String) valores.get(indice+4));
						}
						else {
							JOptionPane.showMessageDialog(null, "N�o h� clientes cadastrados","Aviso",2);
						}
					}
				});
				list.setFont(new Font("Segoe UI", Font.BOLD, 15));
				list.setBounds(10, 10, 524, 198);
				panel.add(list);
				
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new LineBorder(Color.BLACK));
				panel_1.setBackground(new Color(28, 189, 127));
				panel_1.setBounds(0, 0, 600, 81);
				contentPane.add(panel_1);
				
				JLabel label = new JLabel("Ice Cream Shop");
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setForeground(Color.WHITE);
				label.setFont(dropthegame1);
				label.setBounds(0, 0, 600, 81);
				panel_1.add(label);
				
				JPanel btnExcluir = new JPanel();
				btnExcluir.setLayout(null);
				btnExcluir.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				btnExcluir.setBackground(new Color(220, 80, 53));
				btnExcluir.setBounds(25, 582, 119, 28);
				contentPane.add(btnExcluir);
				
				JLabel lblExcluir = new JLabel("Excluir");
				lblExcluir.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						String tabela = "client";
						int quantidade = 0;
						try {
							quantidade = DataBase.Functions.countQuantiy(tabela);
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						
						String chavePrimaria = "cpf";
						String valor = txtFCpf.getText();
						if(quantidade > 0) {
						
						try {
							DataBase.Functions.delete(tabela, chavePrimaria, valor);
							System.out.println("Excluiu");

						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, "N�o foi poss�vel estabelecer conex�o com o banco de dados","Aviso",2);
						}
						}
						else {
							JOptionPane.showMessageDialog(null, "N�o h� clientes cadastrados","Aviso",2);
						}
					}
					@Override
					public void mouseEntered(MouseEvent arg0) {
						lblExcluir.setForeground(new Color(220,80,53));
						btnExcluir.setBackground(Color.white);
						lblExcluir.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblExcluir.setForeground(Color.WHITE);
						btnExcluir.setBackground(new Color(220,80,53));
						lblExcluir.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
						
					}
				});
				lblExcluir.setHorizontalAlignment(SwingConstants.CENTER);
				lblExcluir.setForeground(Color.WHITE);
				lblExcluir.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
				lblExcluir.setBounds(0, 0, 119, 28);
				btnExcluir.add(lblExcluir);
				
				JPanel btnCadastrar = new JPanel();
				btnCadastrar.setLayout(null);
				btnCadastrar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				btnCadastrar.setBackground(Color.GRAY);
				btnCadastrar.setBounds(465, 582, 119, 28);
				contentPane.add(btnCadastrar);
				
				JLabel lblCadastrar = new JLabel("Cadastrar");
				lblCadastrar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						try {
							dispose();
							Client_Registration frame = new Client_Registration();
							frame.setVisible(true);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
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
						lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
					}
				});
				lblCadastrar.setHorizontalAlignment(SwingConstants.CENTER);
				lblCadastrar.setForeground(Color.WHITE);
				lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
				lblCadastrar.setBounds(0, 0, 119, 28);
				btnCadastrar.add(lblCadastrar);
				
				JLabel label_1 = new JLabel("");
				label_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
					@SuppressWarnings("deprecation")
					@Override
					public void mouseEntered(MouseEvent e) {
						setCursor(HAND_CURSOR);
					}
					@SuppressWarnings("deprecation")
					@Override
					public void mouseExited(MouseEvent e) {
						setCursor(DEFAULT_CURSOR);
					}
				});
				label_1.setHorizontalAlignment(SwingConstants.CENTER);
				label_1.setIcon(new ImageIcon(Client_Configuration.class.getResource("/images/hand.png")));
				label_1.setBounds(509, 86, 35, 28);
				contentPane.add(label_1);
				
				DateN = new JTextField();
				DateN.setEditable(false);
				DateN.setColumns(10);
				DateN.setBorder(new LineBorder(Color.BLACK));
				DateN.setBounds(211, 450, 180, 22);
				contentPane.add(DateN);
				
				
				
				
					int quantidade = DataBase.Functions.countQuantiy(tabela);
				
				
				if(quantidade > 0) {
				for(int i = 0; i < valores.size(); i++) {
					
				list.add((String) valores.get(i));
						
				i+=7;
				}
			}
				

		
		
	}
}
