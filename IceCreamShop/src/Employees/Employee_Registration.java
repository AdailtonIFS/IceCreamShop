package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JRadioButton;

public class Employee_Registration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JPanel pnDadosPessoais;
	private JLabel lblDadosPessoais;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JLabel lblDataNascimento;
	private JLabel lblGnero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Registration frame = new Employee_Registration();
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
	public Employee_Registration() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setLocationRelativeTo(null); // centralizarFrame
		setResizable(false); // bloquearMaximizar
		
//		//bloquearFrame
//			this.addComponentListener(new ComponentAdapter() {
//
//				public void componentMoved(ComponentEvent e) {
//
//				setEnabled(false);
//
//				setEnabled(true);
//				}
//		});
			
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnCima = new JPanel();
		pnCima.setBounds(0, 0, 594, 51);
		pnCima.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnCima.setBackground(new Color(255, 222, 173));
		contentPane.add(pnCima);
		
		JPanel pnBaixo = new JPanel();
		pnBaixo.setBounds(0, 520, 594, 51);
		pnBaixo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnBaixo.setBackground(new Color(255, 222, 173));
		contentPane.add(pnBaixo);
		
		JPanel pnEspecial = new JPanel();
		pnEspecial.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnEspecial.setBounds(79, 75, 443, 418);
		pnEspecial.setBackground(new Color(204, 255, 204));
		contentPane.add(pnEspecial);
		pnEspecial.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(37, 44, 182, 25);
		pnEspecial.add(txtNome);
		txtNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNome.setText("Nome:");
		txtNome.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtNome.setForeground(new Color(128, 128, 128));
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtCpf.setText("CPF");
		txtCpf.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtCpf.setBounds(231, 44, 182, 25);
		pnEspecial.add(txtCpf);
		txtCpf.setColumns(10);
		
		pnDadosPessoais = new JPanel();
		pnDadosPessoais.setBounds(0, 0, 443, 25);
		pnEspecial.add(pnDadosPessoais);
		pnDadosPessoais.setLayout(null);
		
		lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosPessoais.setFont(new Font("Courier New", Font.PLAIN, 13));
		lblDadosPessoais.setBounds(0, 0, 443, 25);
		pnDadosPessoais.add(lblDadosPessoais);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtEmail.setBorder(new LineBorder(Color.BLACK, 1, true));
		txtEmail.setBounds(37, 82, 182, 25);
		pnEspecial.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setText("Telefone");
		txtTelefone.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		txtTelefone.setBounds(231, 82, 182, 25);
		pnEspecial.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		lblDataNascimento = new JLabel("Data de Nascimento");
		lblDataNascimento.setFont(new Font("Cambria Math", Font.BOLD, 17));
		lblDataNascimento.setBounds(37, 120, 182, 16);
		pnEspecial.add(lblDataNascimento);
		
		JSpinField spinField = new JSpinField();
		spinField.setBounds(37, 149, 149, 22);
		pnEspecial.add(spinField);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(200, 149, 106, 22);
		pnEspecial.add(monthChooser);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(318, 149, 95, 22);
		pnEspecial.add(yearChooser);
		
		lblGnero = new JLabel("G\u00EAnero");
		lblGnero.setFont(new Font("Cambria Math", Font.BOLD, 17));
		lblGnero.setBounds(37, 195, 87, 16);
		pnEspecial.add(lblGnero);
		
		JRadioButton rdbtnMasculino = new JRadioButton("MASCULINO");
		rdbtnMasculino.setBounds(37, 220, 127, 25);
		pnEspecial.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("FEMININO");
		rdbtnFeminino.setBounds(178, 220, 106, 25);
		pnEspecial.add(rdbtnFeminino);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("PERSONALIZADO");
		rdbtnNewRadioButton.setBounds(288, 220, 127, 25);
		pnEspecial.add(rdbtnNewRadioButton);
		
		JPanel pnEndereco = new JPanel();
		pnEndereco.setBounds(0, 265, 443, 25);
		pnEspecial.add(pnEndereco);
		pnEndereco.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Endere\u00E7o");
		lblNewLabel.setFont(new Font("Courier New", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 443, 25);
		pnEndereco.add(lblNewLabel);
	}
}
