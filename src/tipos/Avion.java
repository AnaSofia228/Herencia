package tipos;

import acuatico_aereo.Aereo;

public class Avion extends Aereo {
	
	private String nombreAvion;
	
	public String bajarTrenDeAterrizaje() {
		return " está bajando el tren de aterrizaje";
	}

	public String getNombreAvion() {
		return nombreAvion;
	}

	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}

	@Override
	public String toString() {
		return "Avion [nombreAvion=" + nombreAvion + ", getNombreAereo()=" + getNombreAereo() + ", getNombreVehiculo()="
				+ getNombreVehiculo() + "]";
	}

}
