package principal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorMoneda extends Conversor {
	
	private String[] listaValores  = { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", 
			"De Pesos a Wong Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos"};
	
	public ConversorMoneda() {
		ejecutarConversorMoneda();	
	}
	
	
	public void ejecutarConversorMoneda() {
		super.setTitle("Monedas"); 
		super.setListaValores(this.listaValores);
		super.setMessageCantidad("Ingrese la cantidad de dinero que desea convertir");
		super.setMessageOpcion("Elija la moneda a la que deseas convertir tu dinero");
		super.cantidadConvertir();
	}
	
	public void opciones(){
		switch(super.getOpcionElegida()){
			case "De Pesos a Dólar": calcularCambio("17.00","Dolares");
			break;
			case "De Pesos a Euro": calcularCambio("18.60","Euros") ;
			break;
			case "De Pesos a Libras": calcularCambio("21.57","Libras");
			break;
			case "De Pesos a Yen": calcularCambio("0.12","Yenes");
			break;
			case "De Pesos a Wong Coreano": calcularCambio("0.013","Wones");
			break;
			case "De Dolar a Pesos": calcularCambio("0.059","Pesos") ;
			break;
			case "De Euro a Pesos": calcularCambio("0.054","Pesos") ;
			break;
			case "De Libras a Pesos": calcularCambio("0.046","Pesos") ;
			break;
			default:; 
			break;
		}
		super.mostrarResultado();
	}
	
	public void calcularCambio(String valorCambio, String tipoMoneda ) {
		BigDecimal cambio = new BigDecimal(valorCambio);
		super.setTipoCantidad(tipoMoneda);
		super.setCantidad(super.getCantidad().divide(cambio, 2,RoundingMode.CEILING));
	}
  
}
