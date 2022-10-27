package tipos;

import acuatico_aereo.Acuatico;

public class Velero extends Acuatico {
	
	private String nombreVelero;
	
	public String izarVelas() {
		return " está izando las velas";
	}
	
	public void setNombreVelero(String nombreVelero) {
		this.nombreVelero = nombreVelero;
	}

	public String getNombreVelero() {
		return nombreVelero;
	}

	@Override
	public String toString() {
		return "Velero [nombreVelero=" + nombreVelero + ", getNombreAcuatico()=" + getNombreAcuatico()
				+ ", getNombreVehiculo()=" + getNombreVehiculo() + "]";
	}
	

}
