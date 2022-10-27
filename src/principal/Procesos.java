package principal;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import tipos.Avion;
import tipos.Barco;
import tipos.Helicoptero;
import tipos.Velero;

public class Procesos {
	
	ArrayList<String> listaBarco = new ArrayList<>();
	ArrayList<String> listaVelero = new ArrayList<>();
	ArrayList<String> listaAvion = new ArrayList<>();
	ArrayList<String> listaHelicoptero = new ArrayList<>();
	
	Barco miBarco = new Barco();			
	Velero miVelero = new Velero();
	Avion miAvion = new Avion();
	Helicoptero miHelicoptero = new Helicoptero();
	
	public Procesos() {
		
		iniciar();
		
	}

	private void iniciar() {
		
		String menu = "OPCIONES\n";
		menu+="1. Registrar Barco\n";
		menu+="2. Registrar Velero\n";
		menu+="3. Registrar Avion\n";
		menu+="4. Registrar Helicoptero\n";
		menu+="5. Consultar Registros\n";
		menu+="6. Salir\n";
		
		int cod = 0;
		
		do {
			
			cod = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (cod) {
			case 1:
				
				
				miBarco.setNombreVehiculo(JOptionPane.showInputDialog("Ingresa el nombre del vehiculo: "));
				miBarco.setNombreAcuatico(JOptionPane.showInputDialog("Ingresa el nombre acuatico: "));
				miBarco.setNombreBarco(JOptionPane.showInputDialog("Ingrese el nombre del barco: "));
				
				listaBarco.add("Vehiculo: " + miBarco.getNombreVehiculo() + "\n" + "Acuatico: " + miBarco.getNombreAcuatico() 
				+ "\n" + "Barco: " + miBarco.getNombreBarco());
				
				System.out.println(listaBarco);			
				System.out.println("Usando al barco " + miBarco.getNombreBarco() + " llamo al acuatico " + miBarco.getNombreAcuatico());
				System.out.println("Usando al acuatico " + miBarco.getNombreAcuatico() + " llamo al vehiculo " + miBarco.getNombreVehiculo());
				System.out.println(miBarco.getNombreBarco() + miBarco.transportar());
				System.out.println(miBarco.getNombreBarco() + miBarco.prenderMotor());
				System.out.println(miBarco.getNombreBarco() + miBarco.navegar());
				
				System.out.println();
				
				break;
				
			case 2: 
				
				miVelero.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre del vehiculo: "));		
				miVelero.setNombreAcuatico(JOptionPane.showInputDialog("Ingrese el nombre acuatico: "));
				miVelero.setNombreVelero(JOptionPane.showInputDialog("Ingrese el nombre del velero: "));
				
				listaVelero.add("Vehiculo: " + miVelero.getNombreVehiculo() + "\n" + "Acuatico: " + miVelero.getNombreAcuatico()
				+ "\n" + "Velero: " + miVelero.getNombreVelero());
				
				System.out.println(listaVelero);
				System.out.println("Usando al velero " + miVelero.getNombreVelero() + " llamo al acuatico " + miVelero.getNombreAcuatico());
				System.out.println("Usando al acuatico " + miVelero.getNombreAcuatico() + " llamo al vehiculo " + miVelero.getNombreVehiculo());
				System.out.println(miVelero.getNombreVelero() + miVelero.transportar());
				System.out.println(miVelero.getNombreVelero() + miVelero.izarVelas());
				System.out.println(miVelero.getNombreVelero() + miVelero.navegar());
				
				System.out.println();
				
				break;
				
			case 3: 
				
				miAvion.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre del vehiculo: "));
				miAvion.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre aereo: "));
				miAvion.setNombreAvion(JOptionPane.showInputDialog("Ingrese el nombre del avion: "));
				
				listaAvion.add("Vehiculo: " + miAvion.getNombreVehiculo() + "\n" + "Acuatico: " + miAvion.getNombreAereo()
				+ "\n" + "Avion: " + miAvion.getNombreAvion());
				
				System.out.println(listaAvion);
				System.out.println("Usando al avion " + miAvion.getNombreAvion() + " llamo al aereo " + miAvion.getNombreAereo());
				System.out.println("Usando al aereo " + miAvion.getNombreAereo() + " llamo al vehiculo " + miAvion.getNombreVehiculo());
				System.out.println(miAvion.getNombreAvion() + miAvion.transportar());
				System.out.println(miAvion.getNombreAvion() + miAvion.bajarTrenDeAterrizaje());
				System.out.println(miAvion.getNombreAvion() + miAvion.volar());
				
				System.out.println();
				
				break;
				
			case 4:
				
				miHelicoptero.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el nombre del vehiculo: "));
				miHelicoptero.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre aereo: "));
				miHelicoptero.setNombreHelicoptero(JOptionPane.showInputDialog("Ingrese el nombre del helicoptero: "));
				
				listaHelicoptero.add("Vehiculo: " + miHelicoptero.getNombreVehiculo() + "\n" + "Aereo: " + miHelicoptero.getNombreAereo() 
				+ "\n" + "Helicoptero: " + miHelicoptero.getNombreHelicoptero());
				
				System.out.println(listaHelicoptero);
				System.out.println("Usando al helicoptero " + miHelicoptero.getNombreHelicoptero() + " llamo al aereo " + miHelicoptero.getNombreAereo());
				System.out.println("Usando al aereo " + miHelicoptero.getNombreAereo() + " llamo al vehiculo " + miHelicoptero.getNombreVehiculo());
				System.out.println(miHelicoptero.getNombreHelicoptero() + miHelicoptero.transportar());
				System.out.println(miHelicoptero.getNombreHelicoptero() + miHelicoptero.encenderHelices());
				System.out.println(miHelicoptero.getNombreHelicoptero() + miHelicoptero.volar());
				
				System.out.println();
				
				break;
				
			case 5: 
				
				System.out.println("Lista Barco: " + miBarco.toString() + "\n" + "Lista Velero: " + miVelero.toString() 
				+ "\n" + "Lista Avion: " + miAvion.toString() + "\n" + "Lista Helicoptero: " + miHelicoptero.toString());
				
				System.out.println();
				
				break;
				
			case 6: 
				
				System.out.println(" Chao ");
				
				System.out.println();
				
				break;
				
			default: System.out.println("No existe esta opcion");
				break;
			}
			
		} while (cod != 6);
		
		
		
	}

}
