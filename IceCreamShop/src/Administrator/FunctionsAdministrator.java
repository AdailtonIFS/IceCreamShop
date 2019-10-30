package Administrator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import java.awt.Color;

public class FunctionsAdministrator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEndereco;
	private JTextField txtPhone;
	private JTextField txtSalar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FunctionsAdministrator frame = new FunctionsAdministrator();
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
	public FunctionsAdministrator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		
			this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDemitir = new JButton("DEMITIR");
		btnDemitir.setBounds(190, 338, 89, 23);
		contentPane.add(btnDemitir);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(120, 109, 238, 23);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(120, 153, 238, 23);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(120, 199, 238, 23);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtSalar = new JTextField();
		txtSalar.setBounds(120, 247, 238, 23);
		contentPane.add(txtSalar);
		txtSalar.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 11, 474, 449);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
	}
}
