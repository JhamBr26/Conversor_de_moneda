package principal;

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
			case "De Celsius a Kelvin":  System.out.print("FUNCIONO 1");
			break;
			case "De Celsius a Fahrenheit":  System.out.print("FUNCIONO 2");
			break;
			case "De Kelvin a Celsius":  System.out.print("FUNCIONO 3");
			break;
			case "De Kelvin a Fahrenheit":  System.out.print("FUNCIONO 4");
			break;
			case "De Fahrenheit a Celsius": System.out.print("FUNCIONO 5") ;
			break;
			case "De Fahrenheit a Kelvin":  System.out.print("FUNCIONO 6");
			break; 
			default:; 
			break;
		}
		super.mostrarResultado();
	}
	
 

}
