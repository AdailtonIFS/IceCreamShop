package Client;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JSpinField;

import Class.Client;
import java.awt.SystemColor;


public class Client_Registration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtFNome;
	private MaskFormatter ftmTelefone;// ATRIBUTO FORMATADOR PARA TELEFONE     
	private MaskFormatter ftmCPF;// ATRIBUTO FORMATADOR PARA CPF
	private MaskFormatter ftmCEP;// ATRIBUTO FORMATADOR PARA CEP
	private JTextField txtFEndereco;
	private JTextField txtFEmail;
	private JTextField txtBairro;
	private JTextField txtNmero;

	/*
	 * Modificar a tela, as cores o tamanho, jradiobutton,jcombobox e etc...
	 * 
	 * 
	 * /** Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client_Registration frame = new Client_Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */

				public Client_Registration() throws ParseException {
		
			
					setIconImage(Toolkit.getDefaultToolkit().getImage(Client_Registration.class.getResource("/images/internet.png")));
					setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			
					// =================mascarasCampos================
					ftmTelefone = new MaskFormatter("(##)#####-####");
					ftmCPF = new MaskFormatter("###.###.###-##");
					ftmCEP = new MaskFormatter("#####-###");
					// ===============================================
			
					Client Cl = new Client(); //instanciarClasseClient
			
					setTitle("CADASTRO DE CLIENTES"); // tituloPagina
					setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					setBounds(100, 100, 600, 600);
					setLocationRelativeTo(null); // centralizarFrame
					setResizable(false); // bloquearMaximizar
					
//					//bloquearFrame
//						this.addComponentListener(new ComponentAdapter() {
//			
//							public void componentMoved(ComponentEvent e) {
//			
//							setEnabled(false);
//			
//							setEnabled(true);
//							}
//					});
	
	
					contentPane = new JPanel();
					contentPane.setBackground(new Color(153, 204, 255));
					contentPane.setBorder(new LineBorder(Color.BLACK, 1, true));
					setContentPane(contentPane);
					contentPane.setLayout(null);
					
					JPanel pnTitle = new JPanel();
					pnTitle.setForeground(new Color(255, 255, 0));
					pnTitle.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
					pnTitle.setBackground(SystemColor.scrollbar);
					pnTitle.setBounds(0, 0, 594, 53);
					contentPane.add(pnTitle);
					pnTitle.setLayout(null);
					
					JPanel pnBaixo = new JPanel();
					pnBaixo.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
					pnBaixo.setBackground(SystemColor.scrollbar);
					pnBaixo.setBounds(0, 518, 594, 53);
					contentPane.add(pnBaixo);
					pnBaixo.setLayout(null);
					
					JLabel label = new JLabel("");
					label.setBounds(32, 7, 35, 40);
					label.setIcon(new ImageIcon(Client_Registration.class.getResource("/images/back.png")));
					pnBaixo.add(label);
					
					
					label.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							dispose();
						}
					});
					
					JButton SALVAR = new JButton("SALVAR");// CRIANDO BOTÃO SALVAR
					SALVAR.setBounds(237, 459, 114, 41);
					contentPane.add(SALVAR);
					SALVAR.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
					SALVAR.setFont(new Font("Cambria Math", Font.BOLD, 15));
					SALVAR.setForeground(Color.BLACK);// FUNDO DO BOTÃO
					SALVAR.setBackground(UIManager.getColor("Button.background"));
					

				
	
				JPanel pnEspecial = new JPanel();
				pnEspecial.setBackground(new Color(135, 204, 255));
				pnEspecial.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				pnEspecial.setBounds(64, 78, 471, 370);
				contentPane.add(pnEspecial);
				pnEspecial.setLayout(null);
		
				JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
				lblDataDeNascimento.setBounds(42, 120, 163, 25);
				pnEspecial.add(lblDataDeNascimento);
				lblDataDeNascimento.setForeground(Color.GRAY);
				lblDataDeNascimento.setHorizontalAlignment(SwingConstants.LEFT);
				lblDataDeNascimento.setFont(new Font("Cambria Math", Font.BOLD, 17));
				
				JYearChooser yearChooser = new JYearChooser();
				yearChooser.setBounds(309, 148, 130, 25);
				pnEspecial.add(yearChooser);
				
				JMonthChooser monthChooser = new JMonthChooser();
				monthChooser.setBounds(186, 148, 111, 25);
				pnEspecial.add(monthChooser);
	
				JSpinField spinField = new JSpinField();
				spinField.setMaximum(31);
				spinField.setMinimum(1);
				spinField.setValue(1);
				spinField.setBounds(42, 148, 130, 25);
				pnEspecial.add(spinField);
		
				JLabel lblGnero = new JLabel("G\u00EAnero");
				lblGnero.setBounds(42, 184, 163, 25);
				pnEspecial.add(lblGnero);
				lblGnero.setHorizontalAlignment(SwingConstants.LEFT);
				lblGnero.setForeground(Color.GRAY);
				lblGnero.setFont(new Font("Cambria Math", Font.BOLD, 17));
		
				JRadioButton rdbtnPersonalizado = new JRadioButton("PERSONALIZADO");
				rdbtnPersonalizado.setFont(new Font("Dialog", Font.PLAIN, 13));
				rdbtnPersonalizado.setBounds(300, 216, 139, 25);
				pnEspecial.add(rdbtnPersonalizado);
				
				JRadioButton rdbtnMasculino = new JRadioButton("MASCULINO");
				rdbtnMasculino.setBorder(new LineBorder(new Color(0, 0, 0)));
				rdbtnMasculino.setFont(new Font("Dialog", Font.PLAIN, 13));
				rdbtnMasculino.setBounds(45, 216, 109, 25);
				pnEspecial.add(rdbtnMasculino);
				rdbtnMasculino.setHorizontalAlignment(SwingConstants.CENTER);
				
				JRadioButton rdbtnFeminino = new JRadioButton("FEMININO");
				rdbtnFeminino.setFont(new Font("Dialog", Font.PLAIN, 13));
				rdbtnFeminino.setBounds(175, 216, 109, 25);
				pnEspecial.add(rdbtnFeminino);
				rdbtnFeminino.setHorizontalAlignment(SwingConstants.CENTER);
						
				JTextField txtGnero = new JTextField();
				txtGnero.setText("G\u00EAnero");
				txtGnero.setForeground(new Color(128, 128, 128));
				txtGnero.setVisible(false);
				txtGnero.setFont(new Font("Dialog", Font.PLAIN, 16));
				txtGnero.setBounds(42, 269, 182, 25);
				pnEspecial.add(txtGnero);
				txtGnero.setColumns(10);
						
				JSeparator separator = new JSeparator();
				separator.setBounds(45, 256, 182, 2);
				separator.setVisible(false);
				pnEspecial.add(separator);
				
				JLabel label_1 = new JLabel("");
				label_1.setBounds(215, 120, 24, 25);
				label_1.setIcon(new ImageIcon(Client_Registration.class.getResource("/images/faqs.png")));
				pnEspecial.add(label_1);
				

										
//------------------------------------------------------------------------------------------------------------
				//==================================__Campo_Nome__===================================
				txtFNome = new JTextField();
				txtFNome.setBounds(42, 48, 182, 25);
				txtFNome.setForeground(new Color(128, 128, 128));
				txtFNome.setText("Nome");
				txtFNome.setFont(new Font("Dialog", Font.PLAIN, 16));
				txtFNome.setBorder(new LineBorder(Color.BLACK, 1, true));
				txtFNome.setColumns(10);
				pnEspecial.add(txtFNome);
				//=================================__ACÃO__NO__txtField===============================	
				txtFNome.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
			
						if (txtFNome.getText().equalsIgnoreCase("Nome")) {
							
							txtFNome.setText("");
							txtFNome.setForeground(Color.black);
							
						}
					}
					@Override
					public void focusLost(FocusEvent e) {
						if (txtFNome.getText().isEmpty()) {
							
							txtFNome.setText("Nome");
							txtFNome.setForeground(new Color(128, 128, 128));
							txtFNome.setBorder(new LineBorder(Color.BLACK, 1, true));
		
						}
					}
				});
				//=====================================__FIM__======================================
//------------------------------------------------------------------------------------------------------------				
				
												
				
//-------------------------------------------------------------------------------------------------------------				
				//==================================__Campo_CPF__===================================
						JFormattedTextField txtFCPF = new JFormattedTextField();
						txtFCPF.setBounds(257, 48, 182, 25);
						txtFCPF.setForeground(new Color(128, 128, 128));
						txtFCPF.setText("CPF");
						txtFCPF.setFont(new Font("Dialog", Font.PLAIN, 16));
						txtFCPF.setBorder(new LineBorder(Color.BLACK, 1, true));
						pnEspecial.add(txtFCPF);							
				//=================================__Ação__no__CampoCPF==============================
						
						txtFCPF.addFocusListener(new FocusAdapter() {
							@Override
							public void focusGained(FocusEvent e) {
								
								txtFCPF.setForeground(Color.BLACK);
								txtFCPF.setText("");
								ftmCPF.install(txtFCPF);
							}
							@Override
							public void focusLost(FocusEvent e) {
	
								if (txtFCPF.getText().trim().length() < 14) {
									ftmCPF.uninstall();
									txtFCPF.setForeground(new Color(128, 128, 128));
									txtFCPF.setText("CPF");
								}
							}
						});
						
				//=====================================__FIM__========================================
//---------------------------------------------------------------------------------------------------------------
						
						
							
//---------------------------------------------------------------------------------------------------------------
				//==================================__Campo_Email__===================================		
					txtFEmail = new JTextField();
					txtFEmail.setBounds(42, 84, 182, 25);
					txtFEmail.setForeground(new Color(128, 128, 128));
					txtFEmail.setText("Email");
					txtFEmail.setHorizontalAlignment(SwingConstants.LEFT);
					txtFEmail.setFont(new Font("Dialog", Font.PLAIN, 16));
					txtFEmail.setBorder(new LineBorder(Color.BLACK));
					txtFEmail.setColumns(10);
					pnEspecial.add(txtFEmail);
				//=================================__Ação__no__CampoEmail==============================	
					txtFEmail.addFocusListener(new FocusAdapter() {
						@Override
						public void focusGained(FocusEvent e) {
							
							if (txtFEmail.getText().equalsIgnoreCase("Email")) {
								txtFEmail.setText("");
								txtFEmail.setForeground(Color.BLACK);
							}
							
						}
						@Override
						public void focusLost(FocusEvent e) {
							
							if (txtFEmail.getText().isEmpty()) {
								txtFEmail.setText("Email");
								txtFEmail.setForeground(new Color(128, 128, 128));
								}
							
						}
					});
					
				//=====================================__FIM__========================================
//----------------------------------------------------------------------------------------------------------------					
				
				
					
//----------------------------------------------------------------------------------------------------------------
					//==================================__Campo_Telefone__===================================								
							JFormattedTextField txtFTelefone = new JFormattedTextField();// CAMPO
							txtFTelefone.setBounds(257, 84, 182, 25);
							txtFTelefone.setForeground(new Color(128, 128, 128));
							txtFTelefone.setText("Telefone");
							txtFTelefone.setFont(new Font("Dialog", Font.PLAIN, 16));
							txtFTelefone.setBorder(new LineBorder(Color.BLACK));
							pnEspecial.add(txtFTelefone);
					//=================================__Ação__no__CampoTelefone=============================			
						
							txtFTelefone.addFocusListener(new FocusAdapter() {
								@Override
								public void focusGained(FocusEvent e) {
	
									txtFTelefone.setForeground(Color.BLACK);
									txtFTelefone.setText("");
									ftmTelefone.install(txtFTelefone);
									
								}
								@Override
								public void focusLost(FocusEvent e) {
									
									if (txtFTelefone.getText().trim().length() < 14) {
										
										ftmTelefone.uninstall();
										txtFTelefone.setForeground(new Color(128, 128, 128));
										txtFTelefone.setText("Telefone");
							
									}
									
								}
							});
					//=====================================__FIM__========================================
//----------------------------------------------------------------------------------------------------------------					
												
		
							
//----------------------------------------------------------------------------------------------------------------
					//==================================__Campo_Endereco__===================================	
							txtFEndereco = new JTextField();// CAMPO DO ENDERECO
							txtFEndereco.setBounds(42, 298, 182, 25);
							txtFEndereco.setForeground(new Color(128, 128, 128));
							txtFEndereco.setText("Logradouro");
							txtFEndereco.setFont(new Font("Dialog", Font.PLAIN, 16));
							txtFEndereco.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
							txtFEndereco.setColumns(10);
							pnEspecial.add(txtFEndereco);
					//=================================__Ação__no__CampoEndereco=============================		
							
							txtFEndereco.addFocusListener(new FocusAdapter() {
								@Override
								public void focusGained(FocusEvent e) {
									if (txtFEndereco.getText().equalsIgnoreCase("Logradouro")) {

										txtFEndereco.setText("");
										txtFEndereco.setForeground(Color.BLACK);
									}
								}
								@Override
								public void focusLost(FocusEvent e) {
									
									if (txtFEndereco.getText().isEmpty()) {
										
										txtFEndereco.setForeground(new Color(128, 128, 128));
										txtFEndereco.setText("Logradouro");
									
									}
									
								}
							});
							
							
					//=====================================__FIM__========================================
//----------------------------------------------------------------------------------------------------------------
							
							
							
//----------------------------------------------------------------------------------------------------------------
					//==================================__Campo_Bairro__===================================
									txtBairro = new JTextField();
									txtBairro.setBounds(257, 297, 182, 26);
									txtBairro.setBorder(new LineBorder(Color.BLACK, 1, true));
									txtBairro.setFont(new Font("Dialog", Font.PLAIN, 16));
									txtBairro.setForeground(new Color(128, 128, 128));
									txtBairro.setText("Bairro");
									txtBairro.setColumns(10);
									pnEspecial.add(txtBairro);
					//=================================__Ação__no__CampoBairro=============================					
									txtBairro.addFocusListener(new FocusAdapter() {
										@Override
										public void focusGained(FocusEvent e) {
											if (txtBairro.getText().equalsIgnoreCase("Bairro")) {

												txtBairro.setText("");
												txtBairro.setForeground(Color.BLACK);
											}
											
										}
										@Override
										public void focusLost(FocusEvent e) {
											
											if (txtBairro.getText().isEmpty()) {
												
												txtBairro.setForeground(new Color(128, 128, 128));
												txtBairro.setText("Bairro");
											
											}
											
										}
									});
									

					//=====================================__FIM__========================================
//----------------------------------------------------------------------------------------------------------------				
									
						
									
//----------------------------------------------------------------------------------------------------------------
					//==================================__Campo_CEP__===================================
							
					JFormattedTextField txtFCep = new JFormattedTextField();
					txtFCep.setBounds(42, 334, 182, 25);
					txtFCep.setForeground(new Color(128, 128, 128));
					txtFCep.setText("CEP");
					txtFCep.setFont(new Font("Dialog", Font.PLAIN, 16));
					txtFCep.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
					pnEspecial.add(txtFCep);
					
				//=================================__Ação__no__CampoCEP=============================	
					txtFCep.addFocusListener(new FocusAdapter() {
						@Override
						public void focusGained(FocusEvent e) {
							
							txtFCep.setForeground(Color.BLACK);
							txtFCep.setText("");
							ftmCEP.install(txtFCep);
						}
						@Override
						public void focusLost(FocusEvent e) {
	
							if (txtFCep.getText().trim().length() < 9) {
							ftmCEP.uninstall();
							txtFCep.setForeground(new Color(128, 128, 128));
							txtFCep.setText("CEP");
						
							}
							
						}
				});
				//=====================================__FIM__========================================
//----------------------------------------------------------------------------------------------------------------	
					
			

//----------------------------------------------------------------------------------------------------------------
				//==================================__Campo_Numero__===================================
				
				txtNmero = new JTextField();
				txtNmero.setBounds(257, 334, 182, 25);
				pnEspecial.add(txtNmero);
				txtNmero.setBorder(new LineBorder(Color.BLACK, 1, true));
				txtNmero.setForeground(new Color(128, 128, 128));
				txtNmero.setFont(new Font("Dialog", Font.PLAIN, 16));
				txtNmero.setHorizontalAlignment(SwingConstants.LEFT);
				txtNmero.setText("N\u00FAmero");
				txtNmero.setColumns(10);
				
				//=================================__Ação__no__CampoNumero=============================	
				
				txtNmero.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						
						if (txtNmero.getText().equalsIgnoreCase("Número")) {

							txtNmero.setText("");
							txtNmero.setForeground(Color.BLACK);
						}
						
					}
					@Override
					public void focusLost(FocusEvent e) {
						
						if (txtNmero.getText().isEmpty()) {
						
							txtNmero.setForeground(new Color(128, 128, 128));
							txtNmero.setText("Número");
						
						}
						
						
					}
				});
				
				//=====================================__FIM__========================================
//----------------------------------------------------------------------------------------------------------------	
				// AÇÃO DO BOTÃO SALVAR 	
				
//				Name varchar(45)not null,
//				CPF char(14) not null primary key,
//				Phone char(14) null,
//				Adress varchar(45) null,
//				CEP char(9) null,
//				Sex varchar(15) not null,
//				DataNascimento char(10) not null,
//				Email varchar(60) null
				
		//		private String Name;
//				private String CPF;
//				private String Phone;
//				private String Adress;
//				private String CEP;
//				private String Sex;
//				private String DataNascimento;

				SALVAR.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						JOptionPane.showMessageDialog(null,"pe");

						// String cpff = txtFCPF.getText().replaceAll("\\.", "");
						// String cpfff = cpff.replaceAll("\\-", ""); // CONVERTER CPF'S
						
						if(!txtFNome.getText().equals("") || !txtFNome.getText().equalsIgnoreCase("Nome")) {
							Cl.setName(txtFNome.getText());
							JOptionPane.showMessageDialog(null, "nome");
						}
				
						if(!txtFCPF.getText().equalsIgnoreCase("CPF")) {
								Cl.setCPF(txtFCPF.getText());
								JOptionPane.showMessageDialog(null, "CPFPFPFASPFPS");
							}
							
						if(!txtFTelefone.getText().equalsIgnoreCase("Telefone")) {
									Cl.setPhone(txtFTelefone.getText());
									JOptionPane.showMessageDialog(null, "TELEFONE");
						}
				
						if(   (!txtFEndereco.getText().equals("") || !txtFEndereco.getText().equalsIgnoreCase("Logradouro"))  && (!txtNmero.getText().equals("") || !txtNmero.getText().equalsIgnoreCase("Número")) && ( !txtBairro.getText().equals("") || !txtBairro.getText().equalsIgnoreCase("Bairro") )      ) {									
									
										String endereco = String.format("%s n° %s, %s " , txtFEndereco.getText(),txtNmero.getText(),txtBairro.getText()  );
										System.out.println(endereco);
							}
						
					JOptionPane.showMessageDialog(null, "2312");

					}
				});
				
						
				JPanel pnDadosPessoais = new JPanel();
				pnDadosPessoais.setBounds(0, 0, 471, 25);
				pnDadosPessoais.setLayout(null);
				pnEspecial.add(pnDadosPessoais);
				
										
						JLabel lblDadosPessoais = new JLabel("Dados Pessoais");
						lblDadosPessoais.setBounds(0, 0, 471, 25);
						pnDadosPessoais.add(lblDadosPessoais);
						lblDadosPessoais.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
						lblDadosPessoais.setHorizontalAlignment(SwingConstants.CENTER);
						lblDadosPessoais.setForeground(Color.GRAY);
						lblDadosPessoais.setFont(new Font("Courier New", Font.BOLD, 17));
						
						JPanel pnEndereco = new JPanel();
						pnEndereco.setBounds(0, 262, 471, 24);
						pnEspecial.add(pnEndereco);
						pnEndereco.setLayout(null);
						
						JLabel lblEndereco = new JLabel("Endere\u00E7o");
						lblEndereco.setBounds(0, 0, 471, 24);
						pnEndereco.add(lblEndereco);
						lblEndereco.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
						lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
						lblEndereco.setForeground(Color.GRAY);
						lblEndereco.setFont(new Font("Courier New", Font.BOLD, 17));
					
				rdbtnMasculino.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (rdbtnMasculino.isSelected()) {
							rdbtnFeminino.setSelected(false);
							rdbtnPersonalizado.setSelected(false);
							
							setBounds(100, 100, 600, 600);
							setLocationRelativeTo(null); // centralizarFrame
							setResizable(false);
							txtGnero.setVisible(false);
							separator.setVisible(false);
							
							pnEspecial.setBounds(64, 78, 471, 370);
							pnBaixo.setBounds(0, 518, 594, 53);
							SALVAR.setBounds(237, 459, 114, 41);
							pnEndereco.setBounds(0, 262, 471, 24);
							txtFEndereco.setBounds(42, 298, 182, 25);
							txtFCep.setBounds(42, 334, 182, 25);
							txtBairro.setBounds(257, 297, 182, 26);
							txtNmero.setBounds(257, 334, 182, 25);

		
						}
		
					}
				});
								
				rdbtnFeminino.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
		
						rdbtnMasculino.setSelected(false);
						rdbtnPersonalizado.setSelected(false);
						
						
						setBounds(100, 100, 600, 600);
						setLocationRelativeTo(null); // centralizarFrame
						setResizable(false);
						txtGnero.setVisible(false);
						separator.setVisible(false);
						
						pnEspecial.setBounds(64, 78, 471, 370);
						pnBaixo.setBounds(0, 518, 594, 53);
						SALVAR.setBounds(237, 459, 114, 41);
						pnEndereco.setBounds(0, 262, 471, 24);
						txtFEndereco.setBounds(42, 298, 182, 25);
						txtFCep.setBounds(42, 334, 182, 25);
						txtBairro.setBounds(257, 297, 182, 26);
						txtNmero.setBounds(257, 334, 182, 25);

					}
				});
				
						rdbtnPersonalizado.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
				
								if (rdbtnPersonalizado.isSelected()) {
									rdbtnMasculino.setSelected(false);
									rdbtnFeminino.setSelected(false);
									
									setBounds(100, 100, 600, 650);
									setLocationRelativeTo(null); // centralizarFrame
									setResizable(false); // bloquearMaximizar
									
									//bloquearFrame
										addComponentListener(new ComponentAdapter() {

											public void componentMoved(ComponentEvent e) {

											setEnabled(false);
											setEnabled(true);
											}
									});
				
									txtGnero.setVisible(true);
									separator.setVisible(true);
				
									pnEspecial.setBounds(64, 78, 471, 426);
									pnBaixo.setBounds(0, 568, 594, 53);
									SALVAR.setBounds(239, 515, 114, 41);
									pnEndereco.setBounds(0, 305, 471, 24);
									txtFEndereco.setBounds(42, 354, 182, 25);
									txtFCep.setBounds(42, 390, 182, 25);
									txtBairro.setBounds(257, 354, 182, 26);
									txtNmero.setBounds(257, 390, 182, 25);

									
									
								} else {
									setBounds(100, 100, 600, 600);
									setLocationRelativeTo(null); // centralizarFrame
									setResizable(false);
									txtGnero.setVisible(false);
									separator.setVisible(false);
									
									pnEspecial.setBounds(64, 78, 471, 370);
									pnBaixo.setBounds(0, 518, 594, 53);
									SALVAR.setBounds(237, 459, 114, 41);
									pnEndereco.setBounds(0, 262, 471, 24);
									txtFEndereco.setBounds(42, 298, 182, 25);
									txtFCep.setBounds(42, 334, 182, 25);
									txtBairro.setBounds(257, 297, 182, 26);
									txtNmero.setBounds(257, 334, 182, 25);

				
								}
							}
						});

		
	}
}
