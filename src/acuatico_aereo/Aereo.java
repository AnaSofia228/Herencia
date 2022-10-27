package acuatico_aereo;

import vehiculos.Vehiculos;

public class Aereo extends Vehiculos {
	
	private String nombreAereo;
	
	public String volar() {
		return " está volando";
	}

	public String getNombreAereo() {
		return nombreAereo;
	}

	public void setNombreAereo(String nombreAereo) {
		this.nombreAereo = nombreAereo;
	}

}
