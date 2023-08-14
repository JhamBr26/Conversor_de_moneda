package principal;

import java.math.BigDecimal;

public class ConversorTemperatura extends Conversor {	 
	private String[] listaValores  = { "De Celsius a Kelvin", "De Celsius a Fahrenheit", 
			"De Kelvin a Celsius", "De Kelvin a Fahrenheit", 
			"De Fahrenheit a Celsius", "De Fahrenheit a Kelvin"};
	
	public ConversorTemperatura() {		 
		ejecutarConversorTemperatura();
	}
	
	public void ejecutarConversorTemperatura() {
		super.setTitle("Temperatura"); 
		super.setListaValores(this.listaValores);
		super.setMessageCantidad("Ingrese la cantidad de grados que desea convertir");
		super.setMessageOpcion("Elija la Escala a la que deseas convertir la temperatura");
		super.cantidadConvertir();
	}
  
	public void opciones(){
		
		switch(super.getOpcionElegida()){
			case "De Celsius a Kelvin":  CelsiusKelvin();
			break;
			case "De Celsius a Fahrenheit":  CelsiusFahrenheit();
			break;
			default:; 
			break;
		}
		super.mostrarResultado();
	}
	
	public void CelsiusKelvin() { 
		BigDecimal constante = new BigDecimal("273.15");
		super.setTipoCantidad("Kelvin"); 
		super.setCantidad(super.getCantidad().add(constante));
	}
	
	public void CelsiusFahrenheit() {  
		BigDecimal constante1 = new BigDecimal("1.8");
		BigDecimal constante2 = new BigDecimal("32");
		super.setTipoCantidad("Kelvin"); 		
		super.setCantidad(super.getCantidad().multiply(constante1).add(constante2));
	} 

}
