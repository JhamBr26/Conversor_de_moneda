package principal;

import java.awt.Component;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane; 

public class ConversorMoneda {
	private Component ParentComponent = null;
	private String title = "Monedas";
	private String[] listaValores  = { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", 
									"De Pesos a Wong Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos"};
	private String primeroListaValores  = listaValores [0];
	private String opcionElegida;
	private BigDecimal cantidad; 
	private String tipoMoneda;
	
	
	public ConversorMoneda() {
		cantidadConvertir();	
	}


	public void cantidadConvertir() { 
		String message = "Ingrese la cantidad de dinero que desea convertir";
		String valor;
		try {			
			valor = String.valueOf(JOptionPane.showInputDialog(message)) ;
			cantidad = new BigDecimal(valor);
			seleccionarOpcion();
		} catch(NumberFormatException | NullPointerException exception) {
			//exception.printStackTrace();
			valorNoValido();			 
		}		 
	}
	
	
	public void seleccionarOpcion() {  		
		String message = "Elija la moneda a la que deseas convertir tu dinero"; 
		int image = -1;				
		try {
			this.opcionElegida = (String) JOptionPane.showInputDialog(ParentComponent , message , title, image , null, listaValores , primeroListaValores );
			opciones();
		} catch(NullPointerException exception) {
		}			
	}
 
	public void opciones(){
		switch(this.opcionElegida){
			case "De Pesos a Dólar": pesoDolar();
			break;
			case "De Pesos a Euro": pesoEuro();
			break;
			case "De Pesos a Libras": pesoLibras();
			break;
			case "De Pesos a Yen": pesoYen();
			break;
			case "De Pesos a Wong Coreano": pesoWongCoreano();
			break;
			case "De Dolar a Pesos": dolarPeso();
			break;
			case "De Euro a Pesos": euroPeso();
			break;
			case "De Libras a Pesos": librasPeso();
			break;
			default:; 
			break;
		}
		mostrarResultado();
	}
	
	public void mostrarResultado() {		 		
		String message = "Tienes "+ this.cantidad + " "+ tipoMoneda; 
		int image = 1;		
		JOptionPane.showMessageDialog(ParentComponent , message , title , image );		
	}
	
	public void valorNoValido() {		 	
		String message = "Valor no valido";		
		JOptionPane.showMessageDialog(ParentComponent , message);
	}	
	
	
	public void pesoDolar() {
		BigDecimal cambio = new BigDecimal("17.00");		 
		this.tipoMoneda = "Dolares"; 
		this.cantidad = this.cantidad.divide(cambio, 2,RoundingMode.CEILING);
	}
	
	public void pesoEuro() {
		BigDecimal cambio = new BigDecimal("18.60");		 
		this.tipoMoneda = "Euros"; 
		this.cantidad = this.cantidad.divide(cambio, 2,RoundingMode.CEILING);
	}
	
	public void pesoLibras() {
		BigDecimal cambio = new BigDecimal("21.57");		 
		this.tipoMoneda = "Libras"; 
		this.cantidad = this.cantidad.divide(cambio, 2,RoundingMode.CEILING);
	}
	
	public void pesoYen() {
		BigDecimal cambio = new BigDecimal("0.12");		 
		this.tipoMoneda = "yenes"; 
		this.cantidad = this.cantidad.divide(cambio, 2,RoundingMode.CEILING);
	}
	
	public void pesoWongCoreano() {
		BigDecimal cambio = new BigDecimal("0.013");		 
		this.tipoMoneda = "Wones"; 
		this.cantidad = this.cantidad.divide(cambio, 2,RoundingMode.CEILING);
	}
	
	public void dolarPeso() {
		BigDecimal cambio = new BigDecimal("0.059");		 
		this.tipoMoneda = "Pesos"; 
		this.cantidad = this.cantidad.divide(cambio, 2,RoundingMode.CEILING);
	}
	
	public void euroPeso() {
		BigDecimal cambio = new BigDecimal("0.054");		 
		this.tipoMoneda = "Pesos"; 
		this.cantidad = this.cantidad.divide(cambio, 2,RoundingMode.CEILING);
	}
	
	public void librasPeso() {
		BigDecimal cambio = new BigDecimal("0.046");		 
		this.tipoMoneda = "Pesos"; 
		this.cantidad = this.cantidad.divide(cambio, 2,RoundingMode.CEILING);
	}
  
}
