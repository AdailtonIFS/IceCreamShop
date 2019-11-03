package Client;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

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
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JDateChooser;

import Class.Client;
import Class.Person;


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
					setBounds(100, 100, 650, 650);
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
					

				
	
				JPanel pnEspecial = new JPanel();
				pnEspecial.setBackground(new Color(255, 250, 250));
				pnEspecial.setBorder(new LineBorder(new Color(0, 0, 0), 2));
				pnEspecial.setBounds(74, 31, 503, 503);
				contentPane.add(pnEspecial);
				pnEspecial.setLayout(null);
				
						JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
						lblDataDeNascimento.setBounds(0, 131, 503, 25);
						pnEspecial.add(lblDataDeNascimento);
						lblDataDeNascimento.setForeground(Color.BLACK);
						lblDataDeNascimento.setHorizontalAlignment(SwingConstants.CENTER);
						lblDataDeNascimento.setFont(new Font("Segoe UI", Font.BOLD, 17));
						
								JLabel lblGnero = new JLabel("G\u00EAnero");
								lblGnero.setBounds(0, 205, 503, 25);
								pnEspecial.add(lblGnero);
								lblGnero.setHorizontalAlignment(SwingConstants.CENTER);
								lblGnero.setForeground(Color.BLACK);
								lblGnero.setFont(new Font("Segoe UI", Font.BOLD, 17));
								
										JRadioButton rdbtnPersonalizado = new JRadioButton("PERSONALIZADO");
										rdbtnPersonalizado.setBorder(new LineBorder(new Color(0, 0, 0)));
										rdbtnPersonalizado.setHorizontalAlignment(SwingConstants.CENTER);
										rdbtnPersonalizado.setFont(new Font("Dialog", Font.PLAIN, 13));
										rdbtnPersonalizado.setBounds(39, 291, 190, 25);
										pnEspecial.add(rdbtnPersonalizado);
										
										JRadioButton rdbtnMasculino = new JRadioButton("MASCULINO");
										rdbtnMasculino.setBorder(new LineBorder(new Color(0, 0, 0)));
										rdbtnMasculino.setFont(new Font("Dialog", Font.PLAIN, 13));
										rdbtnMasculino.setBounds(39, 253, 190, 25);
										pnEspecial.add(rdbtnMasculino);
										rdbtnMasculino.setHorizontalAlignment(SwingConstants.CENTER);
										
										JRadioButton rdbtnFeminino = new JRadioButton("FEMININO");
										rdbtnFeminino.setBorder(new LineBorder(new Color(0, 0, 0)));
										rdbtnFeminino.setFont(new Font("Dialog", Font.PLAIN, 13));
										rdbtnFeminino.setBounds(281, 253, 190, 25);
										pnEspecial.add(rdbtnFeminino);
										rdbtnFeminino.setHorizontalAlignment(SwingConstants.CENTER);
										
				JTextField txtGnero = new JTextField();
				txtGnero.setBorder(new LineBorder(new Color(0, 0, 0)));
				txtGnero.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						
						if(txtGnero.isEditable() == true) {
						if (txtGnero.getText().equalsIgnoreCase("Gênero")) {
							
							txtGnero.setText("");
							txtGnero.setForeground(Color.black);
							
						}
						
					}
						}
					@Override
					public void focusLost(FocusEvent e) {
						if (txtGnero.getText().isEmpty()) {
							
							txtGnero.setText("Gênero");
							txtGnero.setForeground(new Color(128, 128, 128));
							txtGnero.setBorder(new LineBorder(Color.BLACK, 1, true));
		
						}
					}
				});
				txtGnero.setEditable(false);
				txtGnero.setText("G\u00EAnero");
				txtGnero.setForeground(new Color(128, 128, 128));
				txtGnero.setFont(new Font("Dialog", Font.PLAIN, 16));
				txtGnero.setBounds(281, 289, 190, 25);
				pnEspecial.add(txtGnero);
				txtGnero.setColumns(10);
				
				JLabel label_1 = new JLabel("");
				label_1.setBounds(215, 120, 24, 25);
				pnEspecial.add(label_1);
				

										
//------------------------------------------------------------------------------------------------------------
				//==================================__Campo_Nome__===================================
				txtFNome = new JTextField();
				txtFNome.setBounds(39, 50, 190, 25);
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
						txtFCPF.setBounds(281, 50, 190, 25);
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
					txtFEmail.setBounds(39, 88, 190, 25);
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
								txtFTelefone.setBounds(281, 88, 190, 25);
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
												txtFEndereco.setEditable(false);
												txtFEndereco.setBounds(39, 429, 163, 25);
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
																txtBairro.setEditable(false);
																txtBairro.setBounds(308, 429, 163, 25);
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
					txtFCep.setBounds(39, 385, 163, 25);
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
					txtNmero.setBounds(224, 429, 64, 25);
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
					
							
					JPanel pnDadosPessoais = new JPanel();
					pnDadosPessoais.setBorder(new LineBorder(new Color(0, 0, 0)));
					pnDadosPessoais.setBounds(0, 0, 503, 25);
					pnDadosPessoais.setLayout(null);
					pnEspecial.add(pnDadosPessoais);
					
											
							JLabel lblDadosPessoais = new JLabel("Dados Pessoais");
							lblDadosPessoais.setBounds(0, 0, 503, 25);
							pnDadosPessoais.add(lblDadosPessoais);
							lblDadosPessoais.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
							lblDadosPessoais.setHorizontalAlignment(SwingConstants.CENTER);
							lblDadosPessoais.setForeground(Color.BLACK);
							lblDadosPessoais.setFont(new Font("Segoe UI", Font.BOLD, 15));
							
							JPanel pnEndereco = new JPanel();
							pnEndereco.setBorder(new LineBorder(new Color(0, 0, 0)));
							pnEndereco.setBounds(0, 338, 503, 24);
							pnEspecial.add(pnEndereco);
							pnEndereco.setLayout(null);
							
							JLabel lblEndereco = new JLabel("Endere\u00E7o");
							lblEndereco.setBounds(0, 0, 503, 24);
							pnEndereco.add(lblEndereco);
							lblEndereco.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
							lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
							lblEndereco.setForeground(Color.BLACK);
							lblEndereco.setFont(new Font("Segoe UI", Font.BOLD, 15));
							
							JDateChooser DateN = new JDateChooser();
							DateN.setBorder(new LineBorder(new Color(0, 0, 0)));
							DateN.setBounds(148, 170, 206, 22);
							pnEspecial.add(DateN);
							
							
							
							JButton btnBuscarEndereo = new JButton("");
							btnBuscarEndereo.setBorder(new LineBorder(new Color(0, 0, 0)));
							
							
							btnBuscarEndereo.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseClicked(MouseEvent arg0) {
									
								
									if (txtFCep.getText().trim().length() < 9) {
										
										JOptionPane.showMessageDialog(null, "Informe o seu CEP","AVISO",2);
										
								}
									else {
										
										String cep = txtFCep.getText().replaceAll("-", "");
										System.out.println(cep);
									    
										Person p = new Person();
										
											try {
												txtBairro.setForeground(Color.BLACK);
												txtFEndereco.setForeground(Color.BLACK);
												txtBairro.setText(p.Consultbairro(cep));
												txtFEndereco.setText(p.ConsultEndereco(cep));
											} catch (IOException e) {
												JOptionPane.showMessageDialog(null, "Não foi possível conectar a internet");
											}
									}
									
							}
							});
							btnBuscarEndereo.setBounds(224, 385, 64, 25);
							btnBuscarEndereo.setIcon(new ImageIcon(Client_Registration.class.getResource("/images/search.png")));
							pnEspecial.add(btnBuscarEndereo);
							
							JLabel lblNoSeiMeu = new JLabel("N\u00E3o sei o meu cep?");
							lblNoSeiMeu.setHorizontalAlignment(SwingConstants.CENTER);
							lblNoSeiMeu.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseClicked(MouseEvent arg0) {
									try {
										Runtime.getRuntime().exec("cmd.exe /C start chrome.exe http://www.buscacep.correios.com.br/sistemas/buscacep/");
									} catch (IOException e) {
										JOptionPane.showMessageDialog(null, "Não foi possível conectar a internet");
									}
								}
								@SuppressWarnings("deprecation")
								@Override
								public void mouseEntered(MouseEvent e) {
									setCursor(HAND_CURSOR);
								}
							});
							lblNoSeiMeu.setFont(new Font("Segoe UI", Font.BOLD, 17));
							lblNoSeiMeu.setForeground(new Color(84, 134, 210));
							lblNoSeiMeu.setBounds(308, 385, 163, 25);
							pnEspecial.add(lblNoSeiMeu);
							
							JSeparator separator = new JSeparator();
							separator.setForeground(new Color(0, 0, 0));
							separator.setOrientation(SwingConstants.VERTICAL);
							separator.setBounds(258, 38, 1, 82);
							pnEspecial.add(separator);
							
							JSeparator separator_1 = new JSeparator();
							separator_1.setOrientation(SwingConstants.VERTICAL);
							separator_1.setForeground(new Color(0, 0, 0));
							separator_1.setBounds(258, 243, 1, 82);
							pnEspecial.add(separator_1);
							
							JSeparator separator_2 = new JSeparator();
							separator_2.setForeground(new Color(0, 0, 0));
							separator_2.setOrientation(SwingConstants.VERTICAL);
							separator_2.setBounds(213, 375, 1, 92);
							pnEspecial.add(separator_2);
							
							JSeparator separator_3 = new JSeparator();
							separator_3.setOrientation(SwingConstants.VERTICAL);
							separator_3.setForeground(new Color(0, 0, 0));
							separator_3.setBounds(298, 375, 1, 92);
							pnEspecial.add(separator_3);
								

								
				rdbtnMasculino.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								if (rdbtnMasculino.isSelected()) {
									
									rdbtnFeminino.setSelected(false);
									rdbtnPersonalizado.setSelected(false);
										
									txtGnero.setEditable(false);
									txtGnero.setText("Gênero");
									txtGnero.setForeground(new Color(128, 128, 128));
									txtGnero.setBorder(new LineBorder(Color.BLACK, 1, true));
				
		
								}
		
							}
				});
				
							
				
			

				
				rdbtnFeminino.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						rdbtnMasculino.setSelected(false);
						rdbtnPersonalizado.setSelected(false);
						
						txtGnero.setEditable(false);
						txtGnero.setText("Gênero");
						txtGnero.setForeground(new Color(128, 128, 128));
						txtGnero.setBorder(new LineBorder(Color.BLACK, 1, true));
						
					}
				});
				
				rdbtnPersonalizado.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								rdbtnMasculino.setSelected(false);
								rdbtnFeminino.setSelected(false);
								txtGnero.setEditable(true);
								
							}
						});
				
				
				
					
					JButton SALVAR = new JButton("SALVAR");// CRIANDO BOTÃO SALVAR
					SALVAR.setBounds(265, 547, 114, 41);
					contentPane.add(SALVAR);
					SALVAR.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
					SALVAR.setFont(new Font("Cambria Math", Font.BOLD, 15));
					SALVAR.setForeground(Color.BLACK);// FUNDO DO BOTÃO
					
					//=====================================__FIM__========================================
//----------------------------------------------------------------------------------------------------------------	
					
					
					
					// AÇÃO DO BOTÃO SALVAR 	
					

					SALVAR.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
														
							ArrayList<Object> valores = new ArrayList<Object>();
							
							if(!txtFNome.getText().equalsIgnoreCase("Nome") && !txtFCPF.getText().equalsIgnoreCase("CPF") 
									&& !txtFTelefone.getText().equalsIgnoreCase("Telefone") && !txtFEndereco.getText().equalsIgnoreCase("Logradouro")
									&& !txtNmero.getText().equalsIgnoreCase("Número") && !txtBairro.getText().equalsIgnoreCase("Bairro")  
									&& !txtFCep.getText().equalsIgnoreCase("CEP") && DateN.getDate() != null && !txtFEmail.getText().equalsIgnoreCase("Email") ) {
							
								
									Cl.setName(txtFNome.getText());
									valores.add(Cl.getName());
									Cl.setCPF(txtFCPF.getText());
									valores.add(Cl.getCPF());
									Cl.setPhone(txtFTelefone.getText());
									valores.add(Cl.getPhone());
									String endereco = String.format("%s n° %s, %s " , txtFEndereco.getText(),txtNmero.getText(),txtBairro.getText()  );
									Cl.setAdress(endereco);
									valores.add(Cl.getAdress());
									Cl.setCEP(txtFCep.getText());
									valores.add(Cl.getCEP());
									
									SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
									String result = out.format(DateN.getDate()); 
								
									Cl.setDataNascimento(result);
									valores.add(Cl.getDataNascimento());
									
									Cl.setEmail(txtFEmail.getText());				
									valores.add(Cl.getEmail());
									

//									gettando the sex
									
									if(rdbtnMasculino.isSelected() == true){
								Cl.setSex(rdbtnMasculino.getText());
								valores.add(Cl.getSex());
							}
									else
										if(rdbtnFeminino.isSelected() == true) {
											Cl.setSex(rdbtnFeminino.getText());
											valores.add(Cl.getSex());

										}
										else
											if(rdbtnPersonalizado.isSelected() == true && !txtGnero.getText().equalsIgnoreCase("Gênero")) {
												Cl.setSex(txtGnero.getText());
												valores.add(Cl.getSex());

											}
									
									
									JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso","AVISO",1);
									dispose();
							}
							else {
								JOptionPane.showMessageDialog(null, "Preencha todos os dados corretamente","AVISO",2);
							}
							
							String tabela = "client";
							
							try {
								DataBase.Functions.register(tabela, valores);
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null, "Não foi possível adquirir conexão com o Banco de Dados");
							}
							
								
							for(int i = 0 ; i < valores.size(); i++){
						System.out.println(valores.get(i));
					}

						}
					});
					
					JLabel label = new JLabel("");
					label.setBounds(-34, 0, 678, 615);
					label.setIcon(new ImageIcon(Client_Registration.class.getResource("/images/entrada.jpg")));
					contentPane.add(label);

		
	}
}
