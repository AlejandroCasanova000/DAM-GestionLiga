package Practica1GestionLiga;

public class Equipo {
	private String nombre;
	private String estadio;
	private int anioFundacion;
	private Jugador[] jugadores;
	private int puntos;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosEmpatados;
	
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
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	
	public String getEstadio() {
		return estadio;
	}
	
	public void setEstadio(String newEstadio) {
		this.estadio = newEstadio;
	}
	
	public int getAnioFundacion() {
		return anioFundacion;
	}
	
	public void setAnioFundacion(int newAnioFundacion) {
		this.anioFundacion = newAnioFundacion;
	}
	
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	public void setJugadores(Jugador[] newJugadores) {
		this.jugadores = newJugadores;
	}
	
	public Jugador getJugadorEspecifico(int index) {
		return jugadores[index];
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setPuntos(int newPuntos) {
		this.puntos = newPuntos;
	}
	
	public int getPartidosGanados() {
		return partidosGanados;
	}
	
	public void setPartidosGanados(int newPartidosGanados) {
		this.partidosGanados = newPartidosGanados;
	}
	
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	
	public void setPartidosPerdidos(int newPartidosPerdidos) {
		this.partidosPerdidos = newPartidosPerdidos;
	}
	
	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}
	
	public void setPartidosEmpatados(int newPartidosEmpatados) {
		this.partidosEmpatados = newPartidosEmpatados;
	}
	
	public int getGolesAFavor() {
		int cGoles = 0;
		for (int i = 0; i < jugadores.length; i++) {
			cGoles = cGoles + jugadores[i].getGoles();
		}
		return cGoles;
	}
}
