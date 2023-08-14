package principal;

//import java.awt.Component;

import javax.swing.JOptionPane;

public class App {
	
	void testi() {
		JOptionPane.showInputDialog(null, getClass(), null, 0, null, null, getClass());
	}
	
	public static void main(String[] args) {
		new Menu();
		
		/*
		Component ParentComponent = null;		
		String message= "Seleccione una opción de conversión";
		String title = "Menu";
		int image= -1;
		String[] selectionValues = { "Conversor de Moneda","Conversor de Temperatura","Conversor de Longitud","Conversor de velocidad"};
		String initialSelectionValue = selectionValues[0];
		
		JOptionPane.showInputDialog(ParentComponent, message, title, image, null, selectionValues, initialSelectionValue);
		
		//			
		String message2= "Ingrese la cantidad de dinero que desea convertir";
		JOptionPane.showInputDialog(message2);
		
		//
		Component ParentComponent3 = null;		
		String message3= "Elija la moneda a la que deseas convertir tu dinero";
		String title3 = "Monedas";
		int image3= -1;
		String[] selectionValues3 = { "De Pesos a Dólar", "De Pesos a Euro",
				"De Pesos a Libras", "De Pesos a Yen", "De Pesos a Wong Coreano", 
				"De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos"};
		String initialSelectionValue3 = selectionValues3[0];
		
		JOptionPane.showInputDialog(ParentComponent3, message3, title3, image3, null, selectionValues3, initialSelectionValue3);
				
		//
		double resultado = 6.27;
		Component ParentComponent4 = null;		
		String message4= "Tienes "+ resultado + " Moneda";
		String title4 = "Monedas";
		int image4= 1;
		
		JOptionPane.showMessageDialog(ParentComponent4, message4, title4, image4);
		
		//
		Component ParentComponent5 = null;		
		String message5= "Valor no valido";		
		JOptionPane.showMessageDialog(ParentComponent5, message5);
		
		//
		Component ParentComponent6 = null;		
		String message6= "¿Desea Continuar?";		
		int res = JOptionPane.showConfirmDialog(ParentComponent6, message6);
		System.out.print(res);
		
		//
		Component ParentComponent7 = null;		
		String message7= "Programa terminado";
		JOptionPane.showMessageDialog(ParentComponent7, message7);
		
		
		*/
		
		
	}
}
