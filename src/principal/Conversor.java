package principal;

import java.awt.Component;
import java.math.BigDecimal;

import javax.swing.JOptionPane;

public abstract class Conversor {
	private Component ParentComponent = null; 
	private String title ;
	private String[] listaValores ;
	private String primeroListaValores;
	private String opcionElegida;
	private BigDecimal cantidad; 
	private String tipoCantidad;
	private String messageCantidad;
	private String messageOpcion;
	
	public Conversor() { 
		
	}


	public Component getParentComponent() {
		return ParentComponent;
	}


	public void setParentComponent(Component parentComponent) {
		ParentComponent = parentComponent;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String[] getListaValores() {
		return listaValores;
	}


	public void setListaValores(String[] listaValores) {
		this.listaValores = listaValores;
		this.primeroListaValores  = listaValores [0];
	}


	public String getPrimeroListaValores() {
		return primeroListaValores;
	}

	public String getOpcionElegida() {
		return opcionElegida;
	}


	public void setOpcionElegida(String opcionElegida) {
		this.opcionElegida = opcionElegida;
	}


	public BigDecimal getCantidad() {
		return cantidad;
	}


	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
		
	public String getTipoCantidad() {
		return tipoCantidad;
	}


	public void setTipoCantidad(String tipoCantidad) {
		this.tipoCantidad = tipoCantidad;
	}


	public String getMessageCantidad() {
		return messageCantidad;
	}


	public void setMessageCantidad(String messageCantidad) {
		this.messageCantidad = messageCantidad;
	}


	public String getMessageOpcion() {
		return messageOpcion;
	}


	public void setMessageOpcion(String messageOpcion) {
		this.messageOpcion = messageOpcion;
	}

	//Metodo que guarda el valor a convertir
	public void cantidadConvertir() {  
		try {			
			String valor = String.valueOf(JOptionPane.showInputDialog(this.messageCantidad)) ;
			this.cantidad = new BigDecimal(valor);
			seleccionarOpcion();
		} catch(NumberFormatException | NullPointerException exception) {
			//exception.printStackTrace();
			valorNoValido();			 
		}		 
	}
	
	//Metodo que despliega las opciones de conversion
	public void seleccionarOpcion() {  		 
		int image = -1;				
		try {
			this.opcionElegida = (String) JOptionPane.showInputDialog(getParentComponent() , this.messageOpcion , 
									getTitle(), image , null, getListaValores() , getPrimeroListaValores() );
			opciones();
		} catch(NullPointerException exception) {
			//exception.printStackTrace();
		}			
	}
	
	//metodo abstracto en el cual se presentan las distintas opciones
	public abstract void opciones();
	 
	//Metodo para mostrar el resultado de la conversion
	public void mostrarResultado( ) {		 		
		String message = "Equivale a "+ getCantidad() + " "+ getTipoCantidad(); 
		int image = 1;		
		JOptionPane.showMessageDialog(getParentComponent() , message , this.title , image );		
	}
	
	//Muestra si el mensaje no es valido para cuando se ingrese un valor no adecuado
	public void valorNoValido() {		 	
		String message = "Valor no valido";		
		JOptionPane.showMessageDialog(getParentComponent() , message);
	}	
}
