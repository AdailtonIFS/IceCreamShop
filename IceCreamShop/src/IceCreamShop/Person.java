package IceCreamShop;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Person{
	
	private String Name;
	private String CPF;
	private String Phone;
	private String Adress;
	private String CEP;
	private String Sex;
	private String DataNascimento;
	
	
	

		
	
		
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public Person(String name, String cPF, String phone, String adress, String cEP, String sex, String dataNascimento) {
		super();
		Name = name;
		CPF = cPF;
		Phone = phone;
		Adress = adress;
		CEP = cEP;
		Sex = sex;
		DataNascimento = dataNascimento;
	}

	public Person() {
		super();
	}

	public static boolean isCPF(String CPF) {
		//CPF COM TODOS OS NÚMEROS IGUAIS
		if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999")) {
			
            return(false);
            
		}
		
        char dig10, dig11;
        int sm, i, r, num, peso;
          
               try {
        	//CALCULANDO O PRIMEIRO DIGITO VERIFICADOR
        	
            //==================================================	 
            sm = 0;
            peso = 10;
            //=========
            
            for (i = 0; i < 9; i++) {  
    
            num = (int)(CPF.charAt(i) - 48);
            
            sm = sm + (num * peso);
            
            peso = peso - 1;
            
            }
          
            r = 11 - (sm % 11);
           
            if ((r == 10) || (r == 11)) {     
                dig10 = '0';
            }
            else {
            	dig10 = (char)(r + 48);
            }
          
            //===================================================
       
            sm = 0;
            peso = 11;
            
            for(i = 0; i < 10; i++) {

            num = (int)(CPF.charAt(i) - 48);
            
            sm = sm + (num * peso);
            
            peso = peso - 1;
            
            }
          
            r = 11 - (sm % 11);
            
            if ((r == 10) || (r == 11)) {
            	
                 dig11 = '0';
                 
            }
            else {
            	
            	dig11 = (char)(r + 48);
            	
            }
      
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                 return(true);
            }
            else 
            	return(false);
               
               } catch (InputMismatchException erro) {
                
            	   return(false);
            }
        }
          
    		public static boolean clicarCancelar (String palavra) {
    				
    				Object[] options = { "SIM", "NÃO" };//CRIANDO UM OBJETO DE OPÇÕES
    				int Cancel = JOptionPane.showOptionDialog(null, "TEM CERTEZA QUE DESEJA "+palavra, "                   CONFIRMAÇÃO", JOptionPane.DEFAULT_OPTION, JOptionPane.CANCEL_OPTION , null, options, options[0]);//JOptionPane DE CONFIRMAÇÃO
		
								if(Cancel == JOptionPane.YES_OPTION) {//RESPOSTA SIM
								return true;									
								}
								else {
									return false;
						}
    			
    		}
	   

	}