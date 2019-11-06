package Administrator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Class.Objetos;
import Employees.Employee_Configuration;
import Employees.Employee_Registration;
import IceCreamShop.HelpScreen;
import IceCreamShop.LoginUser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministratorMainScreen extends JFrame {

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
					AdministratorMainScreen frame = new AdministratorMainScreen();
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
	public AdministratorMainScreen() throws SQLException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		
			this.addComponentListener(new ComponentAdapter() {

				public void componentMoved(ComponentEvent e) {

				setEnabled(false);

				setEnabled(true);
				}
		});
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuBar.setBounds(0, 0, 594, 37);
		contentPane.add(menuBar);
		
		JMenu mnFuncionrios = new JMenu("FUNCION\u00C1RIOS ");
		mnFuncionrios.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/employee.png")));
		mnFuncionrios.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuBar.add(mnFuncionrios);
		
		JMenuItem mntmPesquisar = new JMenuItem(" CONFIGURAR");
		mntmPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Employee_Configuration frame = new Employee_Configuration();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
			}
		});
		mntmPesquisar.setBorder(new LineBorder(new Color(0, 0, 0)));
		mntmPesquisar.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/gear.png")));
		mnFuncionrios.add(mntmPesquisar);
		
		JMenu mnAdministradores = new JMenu("ADMINISTRADORES ");
		mnAdministradores.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/man.png")));
		mnAdministradores.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuBar.add(mnAdministradores);
		
		JMenuItem mntmCadastrar = new JMenuItem("  CADASTRAR");
		mntmCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		mntmCadastrar.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/more.png")));
		mnAdministradores.add(mntmCadastrar);
		
		JMenuItem mntmConfigurar = new JMenuItem("  CONFIGURAR");
		mntmConfigurar.setBorder(new LineBorder(new Color(0, 0, 0)));
		mntmConfigurar.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/gear.png")));
		mnAdministradores.add(mntmConfigurar);
		
		JMenu mnAjuda = new JMenu("AJUDA ");
		mnAjuda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					HelpScreen frame = new HelpScreen();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		mnAjuda.setIcon(new ImageIcon(AdministratorMainScreen.class.getResource("/images/question.png")));
		mnAjuda.setBorder(new LineBorder(new Color(0, 0, 0)));
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSair = new JMenuItem("SAIR");
		mntmSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				dispose();
				try {
					LoginUser frame = new LoginUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		menuBar.add(mntmSair);
		
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		@SuppressWarnings("unused")
		String finalDate = formatador.format(data);
		
		ArrayList<Object> valores = new ArrayList<Object>();
		valores.addAll(DataBase.Functions.buscarDadosFuncionario("employee"));
		
		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label.setBackground(new Color(255, 204, 102));
		label.setBounds(0, 35, 594, 496);
		label.setIcon(new ImageIcon(Employee_Registration.class.getResource("/imagesAdministrator/sorvete01.jpg")));
		contentPane.add(label);
		
		/*
		 * 
		 * Efeito de apresentação de slides
		 */
		Objetos.slides(label);
		
		
		
	}
}
