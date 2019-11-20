package IceCream;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Class.IceCream;

public class IceCreamRegistration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFSabor;
	private JTextField txtFTipo;
	private JTextField txtFPreco;
	private JTextField txtFCod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IceCreamRegistration frame = new IceCreamRegistration();
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
	public IceCreamRegistration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IceCreamRegistration.class.getResource("/images/ice-cream1.png")));
		
		Font dropthegame1 = null;
		
		try {
			dropthegame1 = Font.createFont(Font.TRUETYPE_FONT, new File("AquateScript_PERSONAL_USE_ONLY.ttf")).deriveFont(50f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("BRUX.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 667);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFSabor = new JTextField();
		txtFSabor.setBorder(new LineBorder(Color.BLACK));
		txtFSabor.setBounds(102, 154, 156, 22);
		contentPane.add(txtFSabor);
		txtFSabor.setColumns(10);
		
		JLabel lblNome = new JLabel("SABOR");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(102, 125, 156, 16);
		contentPane.add(lblNome);
		
		txtFTipo = new JTextField();
		txtFTipo.setBorder(new LineBorder(Color.BLACK));
		txtFTipo.setBounds(363, 154, 156, 22);
		contentPane.add(txtFTipo);
		txtFTipo.setColumns(10);
		
		JLabel lblTipo = new JLabel("TIPO:");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setBounds(363, 125, 156, 16);
		contentPane.add(lblTipo);
		
		txtFPreco = new JTextField();
		txtFPreco.setBorder(new LineBorder(Color.BLACK));
		txtFPreco.setBounds(102, 241, 156, 22);
		contentPane.add(txtFPreco);
		txtFPreco.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(241, 40, 56, 16);
		contentPane.add(label);
		
		JLabel lblPreo = new JLabel("PRE\u00C7O:");
		lblPreo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreo.setBounds(102, 212, 156, 16);
		contentPane.add(lblPreo);
		
		JLabel lblCdigo = new JLabel("C\u00D3DIGO:");
		lblCdigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCdigo.setBounds(363, 212, 156, 16);
		contentPane.add(lblCdigo);
		
		txtFCod = new JTextField();
		txtFCod.setBorder(new LineBorder(Color.BLACK));
		txtFCod.setBounds(363, 241, 156, 22);
		contentPane.add(txtFCod);
		txtFCod.setColumns(10);
		
		JPanel btnCadastrar = new JPanel();
		btnCadastrar.setBackground(Color.GRAY);
		btnCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCadastrar.setBounds(478, 572, 133, 31);
		contentPane.add(btnCadastrar);
		btnCadastrar.setLayout(null);
		
		JLabel lblCadastrar = new JLabel("CADASTRAR");
	
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		lblCadastrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrar.setBounds(0, 0, 133, 31);
		btnCadastrar.add(lblCadastrar);
		
		JPanel btnVoltar = new JPanel();
		btnVoltar.setLayout(null);
		btnVoltar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnVoltar.setBackground(new Color(220,80,53));

		btnVoltar.setBounds(30, 572, 133, 31);
		contentPane.add(btnVoltar);
		
		JLabel lblVoltar = new JLabel("VOLTAR");
		lblVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
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
		lblVoltar.setHorizontalAlignment(SwingConstants.CENTER);
		lblVoltar.setForeground(Color.WHITE);
		lblVoltar.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		lblVoltar.setBounds(0, 0, 133, 31);
		btnVoltar.add(lblVoltar);
		
		JPanel panelCima = new JPanel();
		panelCima.setLayout(null);
		panelCima.setBorder(new LineBorder(Color.BLACK));
		panelCima.setBackground(new Color(28, 189, 127));
		panelCima.setBounds(0, 0, 636, 81);
		contentPane.add(panelCima);
		
		JLabel label_1 = new JLabel("Ice Cream Shop");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(dropthegame1);
		label_1.setBounds(0, 0, 636, 81);
		panelCima.add(label_1);
		
		TextArea Tadescricao = new TextArea();
		Tadescricao.setBounds(125, 354, 386, 180);
		contentPane.add(Tadescricao);
		
		JLabel lblDescrio = new JLabel("DESCRI\u00C7\u00C3O:");
		lblDescrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescrio.setBounds(125, 332, 386, 16);
		contentPane.add(lblDescrio);
		
		lblCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				IceCream c = new IceCream();
				ArrayList<Object> valores = new ArrayList<Object>();

				c.setFlavor(txtFSabor.getText());
				valores.add(c.getFlavor());
				c.setPrice(Double.parseDouble(txtFPreco.getText()));
				valores.add(c.getPrice());
				c.setDescription(Tadescricao.getText());
				valores.add(c.getDescription());
				c.setType(txtFTipo.getText());
				valores.add(c.getType());
				c.setCodigo(txtFCod.getText());
				valores.add(c.getCodigo());
				
				for (int i = 0; i < valores.size(); i++) {
					System.out.println(valores.get(i));					
				}
			
				boolean b = false;
				try {
					 b = DataBase.Functions.cadastroSorvetes("icecream", c.getCodigo());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(b == false) {
					try {
						DataBase.Functions.register("icecream",valores);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Sorvete já cadastrado", "Aviso",2);
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
				lblCadastrar.setFont(new Font("Segoe UI Black", Font.BOLD, 17));

			}
		});
	}
}
