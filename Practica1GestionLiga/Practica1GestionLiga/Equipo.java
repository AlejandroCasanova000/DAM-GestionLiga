package Practica1GestionLiga;

/**
 * Esta clase Java define el objeto Equipo, formado por nombre, estadio, a�o de
 * fundaci�n, una tabla de objetos Jugador, los puntos a fin de temporada y los 
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
	 * Pre: M�todo constructor de obejto Equipo
	 * @param nombre Nombre del Equipo
	 * @param estadio	Estadio del Equipo
	 * @param anioFundacion	A�o de Fundacion
	 * @param jugadores	Tabla de objetos Jugador
	 * @param puntos Puntos del equipo a fin de temporada
	 * @param partidosGanados N�mero de partidos ganados a fin de temporada
	 * @param partidosPerdidos N�mero de partidos perdidos a fin de temporada
	 * @param partidosEmpatados N�mero de partidos empatados a fin de temporada
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
	 * Pre: Este m�todo devuelve el nombre del Equipo
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Pre: Este m�todo cambia el nombre del Equipo a [newNombre]
	 * @param newNombre El nuevo Nombre
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	
	/**
	 * Pre: Este m�todo devuelve el nombre del Estadio del Equipo
	 * @return
	 */
	public String getEstadio() {
		return estadio;
	}
	
	/**
	 * Pre: Este m�todo cambia el Estadio a [newEstadio]
	 * @param newEstadio El nuevo Estadio
	 */
	public void setEstadio(String newEstadio) {
		this.estadio = newEstadio;
	}
	
	/**
	 * Pre: Este metodo devuelve al a�o de fundaci�n del Equipo
	 * @return
	 */
	public int getAnioFundacion() {
		return anioFundacion;
	}
	
	/**
	 * Pre: Este m�todo cabia el a�o de fundaci�n a [newAnioFundacion]
	 * @param newAnioFundacion El nuevo a�o de Fundaci�n
	 */
	public void setAnioFundacion(int newAnioFundacion) {
		this.anioFundacion = newAnioFundacion;
	}
	
	/**
	 * Pre: Este m�todo devuelve la table de jugadores del equipo
	 * @return
	 */
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	/**
	 * Pre: Este m�todo cambia la tabla de jugadores a [newJugadores]
	 * @param newJugadores La nueva tabla de jugadores
	 */
	public void setJugadores(Jugador[] newJugadores) {
		this.jugadores = newJugadores;
	}
	
	/**
	 * Pre: Este m�todo devuelve el objeto Jugador de la casilla [index] de la tabla
	 * jugadores
	 * @param index El �ndice del jugador Espec�fico
	 * @return
	 */
	public Jugador getJugadorEspecifico(int index) {
		return jugadores[index];
	}
	
	/**
	 * Pre: Este m�todo devuelve los puntos del Equipo
	 * @return
	 */
	public int getPuntos() {
		return puntos;
	}
	
	/**
	 * Pre: Este m�todo cambia los puntos a [newPuntos]
	 * @param newPuntos Los nuevos puntos
	 */
	public void setPuntos(int newPuntos) {
		this.puntos = newPuntos;
	}
	
	/**
	 * Pre: Este m�todo devuelve en n�mero de partidos ganados
	 * @return
	 */
	public int getPartidosGanados() {
		return partidosGanados;
	}
	
	/**
	 * Pre: Este m�todo cambia el n�mero de partidos ganados a [newPartidosGanados]
	 * @param newPartidosGanados El nuevo n�mero de partidos ganados
	 */
	public void setPartidosGanados(int newPartidosGanados) {
		this.partidosGanados = newPartidosGanados;
	}
	
	/**
	 *Pre: Este m�todo devuelve el n�mero de partidos perdidos
	 * @return
	 */
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	
	/**
	 * Pre: Este m�todo cambia el n�mero de partidos perdidos a [newPartidosPerdidos]
	 * @param newPartidosPerdidos El nuevo n�mero de partidos perdidos
	 */
	public void setPartidosPerdidos(int newPartidosPerdidos) {
		this.partidosPerdidos = newPartidosPerdidos;
	}
	
	/**
	 * Pre: Este m�todo devuelve en n�mero de partidos empatados
	 * @return
	 */
	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}
	
	/**
	 * Pre: Este m�todo cambia el n�mero de partidos empatados a [newPartidosEmpatados]
	 * @param newPartidosEmpatados El nuevo n�mero de partidos empatados
	 */
	public void setPartidosEmpatados(int newPartidosEmpatados) {
		this.partidosEmpatados = newPartidosEmpatados;
	}
	
	/**
	 * Pre: Este m�todo devuelve la cantidad de los goles metidos por el Equipo
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
