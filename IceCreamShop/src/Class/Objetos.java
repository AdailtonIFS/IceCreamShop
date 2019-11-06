package Class;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

import Employees.Employee_MainScreen;

public class Objetos {

	
	public static void slides(JLabel label) {
			
		Thread th = new Thread(new Runnable() { //cria uma thread
	        public void run() {
	            while(true) { //roda indefinidamente
	                try {
	                    
	                    for(int i = 0; i<12; i++) {
	                    	Thread.sleep(1000); //espera 1,1 segundo para fazer a nova evolução
	                    	if(i == 2) {
	                		label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete02.jpg")));
	                    	}
	                    	else 
	                    		if(i == 4) {
		                		label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete03.jpg")));
	                		}
	                    		else
	                    			if(i == 6) {
	    		                		label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete04.jpg")));

	                    			}
	                    			else
	                    				if(i == 8) {
	                    					label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete05.jpg")));
	                    				}
	                    				else
	                    					if(i == 10) {
		                    					label.setIcon(new ImageIcon(Employee_MainScreen.class.getResource("/imagesAdministrator/sorvete01.jpg")));	
	                    					}
	                    	
	                    }//Fim do for
	                   
	                } catch(InterruptedException ex){
	                	ex.printStackTrace();
	                }
	            }
	        }
	    }); th.start(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static MaskFormatter aplicarMascaras(String masq) throws ParseException {
//		
//		if(masq.equalsIgnoreCase("TEL")) {
//			MaskFormatter ftmTel;// 
//			ftmTel = new MaskFormatter("(##)#####-####");
//			return ftmTel;
//		}
//		else
//			if(masq.equalsIgnoreCase("CEP")) {
//				MaskFormatter ftmCEP;
//				ftmCEP = new MaskFormatter("#####-###");
//				return ftmCEP;
//			}
//			else
//				if(masq.equalsIgnoreCase("CPF")) {
//					MaskFormatter ftmCPF;
//					ftmCPF = new MaskFormatter("###.###.###-##");
//					return ftmCPF;
//				}
//				else {
//					return null;
//				}
//	}
	
}
