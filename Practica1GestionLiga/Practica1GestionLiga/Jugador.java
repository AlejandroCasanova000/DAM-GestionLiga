package Practica1GestionLiga;

/**
 * Esta clase Java define el objeto Jugador, formado por Nombre, dorsal, goles metidos
 * al fin de temporada, numero de tarjetas rojas totales, y de amarillas totales
 * @author alexc
 *
 */
public class Jugador {
	private String nombre;
	private int dorsal;
	private int goles;
	private int tarjetasRojas;
	private int tarjetasAmarillas;

	/**
	 * Método constructor del objeto Jugador
	 * @param nombre El nombre del jugador
	 * @param dorsal El dorsal de su camiseta
	 * @param goles Número de goles metidos en la temporada
	 * @param tarjetasRojas Número de tarjetas rojas finales
	 * @param tarjetasAmarillas Número de tarjetas amarillas finales
	 */
	public Jugador (String nombre , int dorsal , int goles , int tarjetasRojas , int tarjetasAmarillas) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	/**
	 * Pre: Este método devuelve el nombre del Jugador
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Pre: Este método cambia el nombre del juagdor a [newNombre]
	 * @param newNombre El nuevo nombre
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	
	/**
	 * Pre: Este método devuelve el dorsal del jugador
	 * @return
	 */
	public int getDorsal() {
		return dorsal;
	}
	
	/**
	 * Pre: Este método cambia el dorsal del jugador a [newDorsal]
	 * @param newDorsal
	 */
	public void setDorsal(int newDorsal) {
		this.dorsal = newDorsal;
	}
	
	/**
	 * Per: Este método devuelve el número de goles totales a fin de temporada
	 * @return
	 */
	public int getGoles() {
		return goles;
	}
	
	/**
	 * Pre: Este método cambia el número de goles a [newGoles]
	 * @param newGoles
	 */
	public void setGoles(int newGoles) {
		this.goles = newGoles;
	}
	
	/**
	 * Pre: Este método devuelve la cantidad de tarjetas rojas totales del jugador
	 * @return
	 */
	public int getTarjetasRojas() {
		return tarjetasRojas;
	}
	
	/**
	 * Pre: Este método cambia el número de tarjetas rojas totales a [newTarjetasRojas]
	 */
	public void setTarjetasRojas(int newTarjetasRojas) {
		this.tarjetasRojas = newTarjetasRojas;
	}
	
	/**
	 * Pre: Este método devuelve la cantidad de tarjetas amarillas totales del jugador
	 * @return
	 */
	public int gettarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	
	/**
	 * Pre: Este método cambia el número de tarjetas amarillas totales a 
	 * [newTarjetasAmarillas]
	 */
	public void setTarjetasAmarillas(int newTarjetasAmarillas) {
		this.tarjetasAmarillas = newTarjetasAmarillas;
	}
}
