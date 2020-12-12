package Practica1GestionLiga;

public class Jugador {
	private String nombre;
	private int dorsal;
	private int goles;
	private int tarjetasRojas;
	private int tarjetasAmarillas;

	public Jugador (String nombre , int dorsal , int goles , int tarjetasRojas , int tarjetasAmarillas) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	
	public int getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(int newDorsal) {
		this.dorsal = newDorsal;
	}
	
	public int getGoles() {
		return goles;
	}
	
	public void setGoles(int newGoles) {
		this.goles = newGoles;
	}
	
	public int getTarjetasRojas() {
		return tarjetasRojas;
	}
	
	public void setTarjetasRojas(int newTarjetasRojas) {
		this.tarjetasRojas = newTarjetasRojas;
	}
	
	public int gettarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	
	public void setTarjetasAmarillas(int newTarjetasAmarillas) {
		this.tarjetasAmarillas = newTarjetasAmarillas;
	}
}
