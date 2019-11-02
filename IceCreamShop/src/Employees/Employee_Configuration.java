package Employees;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.List;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class Employee_Configuration extends JFrame {

	private JPanel contentPane;
	private JTextField txtFNome;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Configuration frame = new Employee_Configuration();
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
	public Employee_Configuration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 27, 241, 474);
		contentPane.add(panel);
		panel.setLayout(null);
		
		List list = new List();
		list.setBounds(10, 5, 221, 459);
		panel.add(list);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(331, 30, 38, 16);
		contentPane.add(lblNome);
		
		txtFNome = new JTextField();
		txtFNome.setBounds(381, 27, 161, 22);
		contentPane.add(txtFNome);
		txtFNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCPF.setBounds(331, 62, 38, 16);
		contentPane.add(lblCPF);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(381, 59, 161, 22);
		contentPane.add(formattedTextField);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(331, 91, 38, 16);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(314, 120, 55, 16);
		contentPane.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(381, 88, 161, 22);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
