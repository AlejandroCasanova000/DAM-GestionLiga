package Practica1GestionLiga;

/**
 * Esta clase Java define el objeto Equipo, formado por nombre, estadio, año de
 * fundación, una tabla de objetos Jugador, los puntos a fin de temporada y los 
 * partidos ganados, perdidos y empatados
 * @author alexc
 *
 */

public class Equipo {
	private String nombre;
	private String estadio;
	private int anioFundacion;
	private Jugador[] jugadores;
	private int puntos;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosEmpatados;
	
	/**
	 * Pre: Método constructor de obejto Equipo
	 * @param nombre Nombre del Equipo
	 * @param estadio	Estadio del Equipo
	 * @param anioFundacion	Año de Fundacion
	 * @param jugadores	Tabla de objetos Jugador
	 * @param puntos Puntos del equipo a fin de temporada
	 * @param partidosGanados Número de partidos ganados a fin de temporada
	 * @param partidosPerdidos Número de partidos perdidos a fin de temporada
	 * @param partidosEmpatados Número de partidos empatados a fin de temporada
	 */
	public Equipo (String nombre , String estadio , int anioFundacion ,
			Jugador[] jugadores , int puntos , int partidosGanados , int partidosPerdidos ,
			int partidosEmpatados) {
		this.nombre = nombre;
		this.estadio = estadio;
		this.anioFundacion = anioFundacion;
		this.jugadores = jugadores;
		this.puntos = puntos;
		this.partidosGanados = partidosGanados;
		this.partidosPerdidos = partidosPerdidos;
		this.partidosEmpatados = partidosEmpatados;
	}
	
	/**
	 * Pre: Este método devuelve el nombre del Equipo
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Pre: Este método cambia el nombre del Equipo a [newNombre]
	 * @param newNombre El nuevo Nombre
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	
	/**
	 * Pre: Este método devuelve el nombre del Estadio del Equipo
	 * @return
	 */
	public String getEstadio() {
		return estadio;
	}
	
	/**
	 * Pre: Este método cambia el Estadio a [newEstadio]
	 * @param newEstadio El nuevo Estadio
	 */
	public void setEstadio(String newEstadio) {
		this.estadio = newEstadio;
	}
	
	/**
	 * Pre: Este metodo devuelve al año de fundación del Equipo
	 * @return
	 */
	public int getAnioFundacion() {
		return anioFundacion;
	}
	
	/**
	 * Pre: Este método cabia el año de fundación a [newAnioFundacion]
	 * @param newAnioFundacion El nuevo año de Fundación
	 */
	public void setAnioFundacion(int newAnioFundacion) {
		this.anioFundacion = newAnioFundacion;
	}
	
	/**
	 * Pre: Este método devuelve la table de jugadores del equipo
	 * @return
	 */
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	/**
	 * Pre: Este método cambia la tabla de jugadores a [newJugadores]
	 * @param newJugadores La nueva tabla de jugadores
	 */
	public void setJugadores(Jugador[] newJugadores) {
		this.jugadores = newJugadores;
	}
	
	/**
	 * Pre: Este método devuelve el objeto Jugador de la casilla [index] de la tabla
	 * jugadores
	 * @param index El índice del jugador Específico
	 * @return
	 */
	public Jugador getJugadorEspecifico(int index) {
		return jugadores[index];
	}
	
	/**
	 * Pre: Este método devuelve los puntos del Equipo
	 * @return
	 */
	public int getPuntos() {
		return puntos;
	}
	
	/**
	 * Pre: Este método cambia los puntos a [newPuntos]
	 * @param newPuntos Los nuevos puntos
	 */
	public void setPuntos(int newPuntos) {
		this.puntos = newPuntos;
	}
	
	/**
	 * Pre: Este método devuelve en número de partidos ganados
	 * @return
	 */
	public int getPartidosGanados() {
		return partidosGanados;
	}
	
	/**
	 * Pre: Este método cambia el número de partidos ganados a [newPartidosGanados]
	 * @param newPartidosGanados El nuevo número de partidos ganados
	 */
	public void setPartidosGanados(int newPartidosGanados) {
		this.partidosGanados = newPartidosGanados;
	}
	
	/**
	 *Pre: Este método devuelve el número de partidos perdidos
	 * @return
	 */
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	
	/**
	 * Pre: Este método cambia el número de partidos perdidos a [newPartidosPerdidos]
	 * @param newPartidosPerdidos El nuevo número de partidos perdidos
	 */
	public void setPartidosPerdidos(int newPartidosPerdidos) {
		this.partidosPerdidos = newPartidosPerdidos;
	}
	
	/**
	 * Pre: Este método devuelve en número de partidos empatados
	 * @return
	 */
	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}
	
	/**
	 * Pre: Este método cambia el número de partidos empatados a [newPartidosEmpatados]
	 * @param newPartidosEmpatados El nuevo número de partidos empatados
	 */
	public void setPartidosEmpatados(int newPartidosEmpatados) {
		this.partidosEmpatados = newPartidosEmpatados;
	}
	
	/**
	 * Pre: Este método devuelve la cantidad de los goles metidos por el Equipo
	 * Post: Para ello se recorre la tabla jugadores y se va sumando los goles de cada
	 * objeto Jugador, al final devuelve el cGoles (numero total de goles)
	 * @return
	 */
	public int getGolesAFavor() {
		int cGoles = 0;
		for (int i = 0; i < jugadores.length; i++) {
			cGoles = cGoles + jugadores[i].getGoles();
		}
		return cGoles;
	}
}
