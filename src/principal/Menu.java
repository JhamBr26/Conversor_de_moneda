package principal;

import java.awt.Component; 

import javax.swing.JOptionPane;

public class Menu {
	private Component ParentComponent = null;		
	private String message= "Seleccione una opción de conversión";
	private String title = "Menu";
	private int image= -1;
	private String[] selectionValues = { "Conversor de Moneda","Conversor de Temperatura","Conversor de Longitud","Conversor de velocidad"};
	private String initialSelectionValue = selectionValues[0];
	
	public Menu(){
		desplegarMenu();			
	}	
	
	public void desplegarMenu(){
		String resultado;	 
		try {
			resultado = (String) JOptionPane.showInputDialog(ParentComponent, message, title, image, null, selectionValues, initialSelectionValue);
			
			switch(resultado) {
				case "Conversor de Moneda": new ConversorMoneda();
											continuarPrograma();
				break;
				case "Conversor de Temperatura": new ConversorTemperatura();
												continuarPrograma();
				break;
				default: programaTerminado(); 	
				break;
			}
			
		} catch(NullPointerException exception) {
			//exception.printStackTrace();
			programaTerminado();
		}		
	}
	
	public void continuarPrograma(){	
		String message= "¿Desea Continuar?";	
		int resultado;
		resultado = JOptionPane.showConfirmDialog(null, message);
		
		switch(resultado) {
			case 0: new Menu();
			break;
			/*case 1: programaTerminado();
			break;
			case 2: programaTerminado();
			break;*/
			default: programaTerminado();
			break;		
		}				
	}
	
	public void programaTerminado(){
		String message= "Programa terminado";
		JOptionPane.showMessageDialog(null, message); 
	}

}
