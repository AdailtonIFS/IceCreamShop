package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

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
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(36, 29, 296, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setMnemonic('a');
		btnCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCadastrar.setIcon(new ImageIcon(Client_Configuration.class.getResource("/images/more.png")));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Client_Registration frame = new Client_Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnCadastrar.setBounds(131, 496, 122, 37);
		contentPane.add(btnCadastrar);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setBounds(373, 29, 180, 16);
		contentPane.add(lblCpf);
		
		JFormattedTextField txtFCpf = new JFormattedTextField();
		txtFCpf.setBorder(new LineBorder(Color.BLACK));
		txtFCpf.setBounds(373, 58, 180, 22);
		contentPane.add(txtFCpf);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(373, 93, 180, 16);
		contentPane.add(lblEmail);
		
		txtFEmail = new JTextField();
		txtFEmail.setBorder(new LineBorder(Color.BLACK));
		txtFEmail.setBounds(373, 122, 180, 22);
		contentPane.add(txtFEmail);
		txtFEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setBounds(373, 157, 180, 16);
		contentPane.add(lblTelefone);
		
		JFormattedTextField txtFPhone = new JFormattedTextField();
		txtFPhone.setBorder(new LineBorder(Color.BLACK));
		txtFPhone.setBounds(373, 186, 180, 22);
		contentPane.add(txtFPhone);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataDeNascimento.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblDataDeNascimento.setBounds(373, 221, 180, 16);
		contentPane.add(lblDataDeNascimento);
		
		JDateChooser DateN = new JDateChooser();
		DateN.setBorder(new LineBorder(new Color(0, 0, 0)));
		DateN.setBounds(373, 250, 180, 22);
		contentPane.add(DateN);
		
		JLabel lblSexo = new JLabel("G\u00EAnero:");
		lblSexo.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblSexo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexo.setBounds(373, 285, 180, 16);
		contentPane.add(lblSexo);
		
		txtFGnero = new JTextField();
		txtFGnero.setBorder(new LineBorder(Color.BLACK));
		txtFGnero.setBounds(373, 314, 180, 22);
		contentPane.add(txtFGnero);
		txtFGnero.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Endere\u00E7o:");
		lblLogradouro.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblLogradouro.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogradouro.setBounds(373, 349, 180, 22);
		contentPane.add(lblLogradouro);
		
		txtFLogradouro = new JTextField();
		txtFLogradouro.setBorder(new LineBorder(Color.BLACK));
		txtFLogradouro.setBounds(373, 384, 180, 22);
		contentPane.add(txtFLogradouro);
		txtFLogradouro.setColumns(10);
		
		JLabel lblBairro = new JLabel("CEP");
		lblBairro.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblBairro.setHorizontalAlignment(SwingConstants.CENTER);
		lblBairro.setBounds(373, 419, 180, 16);
		contentPane.add(lblBairro);
		
		txtFCep = new JTextField();
		txtFCep.setBorder(new LineBorder(Color.BLACK));
		txtFCep.setBounds(373, 448, 180, 22);
		contentPane.add(txtFCep);
		txtFCep.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					JOptionPane.showMessageDialog(null, "Não foi possível estabelecer conexão com o banco de dados","Aviso",2);
				}
				}
				else {
					JOptionPane.showMessageDialog(null, "Não há clientes cadastrados","Aviso",2);
				}
			}
		});
		btnExcluir.setIcon(new ImageIcon(Client_Configuration.class.getResource("/images/delete.png")));
		btnExcluir.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnExcluir.setBounds(406, 496, 122, 37);
		contentPane.add(btnExcluir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Client_Configuration.class.getResource("/images/entrada.jpg")));
		label.setBounds(0, 0, 594, 565);
		contentPane.add(label);
		
		//ArrayList use getInformations of DataBase
				ArrayList<Object> valores = new ArrayList<Object>();
				String tabela  = "client";
				
				try {
					valores.addAll(DataBase.Functions.searchClient(tabela));
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Não foi possível conectar ao Banco de Dados","AVISO",2);
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
						
						String dataString = (String) valores.get(indice+5);
					    try {
							Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
							DateN.setDate(date);

						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}  
						txtFGnero.setText((String) valores.get(indice+7));
						txtFLogradouro.setText((String) valores.get(indice+3));
						txtFCep.setText((String) valores.get(indice+4));
						}
						else {
							JOptionPane.showMessageDialog(null, "Não há clientes cadastrados","Aviso",2);
						}
					}
				});
				list.setFont(new Font("Segoe UI", Font.BOLD, 15));
				list.setBounds(10, 24, 276, 403);
				panel.add(list);
				
				
				
					int quantidade = DataBase.Functions.countQuantiy(tabela);
				
				
				if(quantidade > 0) {
				for(int i = 0; i < valores.size(); i++) {
					
				list.add((String) valores.get(i));
						
				i+=7;
				}
			}
				
		
	}
}
