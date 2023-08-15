package principal;

import java.awt.Component; 
import javax.swing.JOptionPane;

public class Menu {
	private Component ParentComponent = null;		
	private String message= "Seleccione una opción de conversión";
	private String title = "Menu";
	private int image= -1;
	private String[] selectionValues = { "Conversor de Moneda","Conversor de Temperatura"};
	private String initialSelectionValue = selectionValues[0];
	
	public Menu(){
		desplegarMenu();			
	}	
	
	//Metodo que muestra el menú y sus opciones de conversion
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
	
	//Se pregunta al usuario si quiere continuar con otra conversion
	public void continuarPrograma(){	
		String message= "¿Desea Continuar?";	
		int resultado;
		resultado = JOptionPane.showConfirmDialog(null, message);
		
		switch(resultado) {
			case 0: new Menu();
			break;
			default: programaTerminado();
			break;		
		}				
	}
	
	//Metodo para desplegar mensaje de programa terminado
	public void programaTerminado(){
		String message= "Programa terminado";
		JOptionPane.showMessageDialog(null, message); 
	}

}
