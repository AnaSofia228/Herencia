package tipos;

import acuatico_aereo.Aereo;

public class Helicoptero extends Aereo {
	
	private String nombreHelicoptero;
	
	public String encenderHelices() {
		return " está encendiendo las helices";
	}

	public String getNombreHelicoptero() {
		return nombreHelicoptero;
	}

	public void setNombreHelicoptero(String nombreHelicoptero) {
		this.nombreHelicoptero = nombreHelicoptero;
	}

	@Override
	public String toString() {
		return "Helicoptero [nombreHelicoptero=" + nombreHelicoptero + ", getNombreAereo()=" + getNombreAereo()
				+ ", getNombreVehiculo()=" + getNombreVehiculo() + "]";
	}
	

}
