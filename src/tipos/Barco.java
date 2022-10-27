package tipos;

import acuatico_aereo.Acuatico;

public class Barco extends Acuatico {
	
	private String nombreBarco;
	
	public String prenderMotor() {
		return " está premiendo motores";
	}
	
	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}	

	public String getNombreBarco() {
		return nombreBarco;
	}

	@Override
	public String toString() {
		return "Barco [nombreBarco=" + nombreBarco + ", getNombreAcuatico()=" + getNombreAcuatico()
				+ ", getNombreVehiculo()=" + getNombreVehiculo() + "]";
	}
	
	


}
