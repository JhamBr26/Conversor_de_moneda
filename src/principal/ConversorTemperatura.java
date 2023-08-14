package principal;

import java.awt.Component;
import java.math.BigDecimal;

public class ConversorTemperatura {
	private Component ParentComponent = null;
	private String title = "Temperatura";
	private String[] listaValores  = { "De Celsius a Kelvin", "De Celsius a Fahrenheit", "De Kelvin a Celsius", "De Kelvin a Fahrenheit", 
									"De Fahrenheit a Celsius", "De Fahrenheit a Kelvin"};
	private String primeroListaValores  = listaValores [0];
	private String opcionElegida;
	private BigDecimal grados; 
	private String tipoEscalaTemperatura;

}
