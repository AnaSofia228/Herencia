package acuatico_aereo;

import vehiculos.Vehiculos;

public class Acuatico extends Vehiculos {

	private String nombreAcuatico;
	
	public String navegar() {
		return " está navegando";
	}
	
	public void setNombreAcuatico(String nombreAcuatico) {
		this.nombreAcuatico = nombreAcuatico;
	}

	public String getNombreAcuatico() {
		return nombreAcuatico;
	}

	
}
