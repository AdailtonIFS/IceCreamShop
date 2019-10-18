package Employees;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class Employee_Registration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

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
		
		//bloquearFrame
			this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
			
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
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
		
		textField = new JTextField();
		textField.setBounds(173, 141, 182, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
