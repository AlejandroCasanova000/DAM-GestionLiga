package Practica1GestionLiga;

public class Liga {
	private String nombre;
	private Equipo[] clasificacion;
	
	public Liga(String nombre , Equipo[] clasificacion) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	
	public Equipo[] getClasificacion() {
		return clasificacion;
	}
	
	public void setClasificacion(Equipo[] newClasificacion) {
		this.clasificacion = newClasificacion;
	}
	
	/**
	 * Pre: Este método muestra por pantalla la tabla de clasificación ordenada por puntos
	 * Post: Para ello copia los equipos en la tabla (equipos) y la va recorriendo de tal manera que saca el equipo
	 * que más puntos tiene en el segundo bucle, muestra por pantalla la informacion pedida y machaca los puntos
	 * al acabar para que no vuelva a salir el equipo
	 */
	public void mostrarOrdeadaPorPuntos() {
		String leftAlignFormat = "| %-15s | %-4d |%n";
		System.out.format("+-----------------+------+%n");
		System.out.format("| Equipo          |PTS   |%n");
		System.out.format("+-----------------+------+%n");
		Equipo[] equipos = new Equipo[clasificacion.length];//Tabla auxiliar para no machacar los puntos de la real
		for (int i = 0; i < clasificacion.length; i++) {
			equipos[i] = clasificacion[i];
		}
		int mayor = equipos[0].getPuntos();
		Equipo equipoMayor = equipos[0];
		int indexEliminar = 0;
		for (int i = 0; i < equipos.length; i++) {
			for (int j = 0; j < equipos.length; j++) {
				if (equipos[j].getPuntos() > mayor) {
					equipoMayor = equipos[j];
					mayor = equipos[j].getPuntos();
					indexEliminar = j;
				}
			}
		    System.out.format(leftAlignFormat, equipoMayor.getNombre() , 
		    		equipoMayor.getPuntos());
			equipos[indexEliminar].setPuntos(-1);
			mayor = -1;
		}
		System.out.format("+-----------------+------+%n");
	}
	
	public Jugador[] jugadoresLiga() {
		int contadorJugadores = 0;
		for (int i = 0; i < clasificacion.length; i++) {
			contadorJugadores = contadorJugadores + clasificacion[i].getJugadores().length;
		}
		Jugador[] jugadores = new Jugador[contadorJugadores];
		contadorJugadores = 0;
		Jugador[] jugadorEquipo = new Jugador[clasificacion[0].getJugadores().length];
		for (int i = 0; i < clasificacion.length; i++) {
			for (int j = 0; j < clasificacion[i].getJugadores().length; j++) {
				jugadorEquipo[j] = clasificacion[i].getJugadorEspecifico(j);
			}
			for(int j = 0; j < jugadorEquipo.length; j++) {
				jugadores[contadorJugadores] = jugadorEquipo[j];
				contadorJugadores++;
			}
		}
		return jugadores;
	}
	
	public void mostrar5Goleadores() {
		String leftAlignFormat = "| %-16s | %-3d |%n";
		System.out.format("+-----------------+-------+%n");
		System.out.format("| Equipo          |Jugador|%n");
		System.out.format("+-----------------+-------+%n");
		Jugador[] jugadores = new Jugador[this.jugadoresLiga().length];
		jugadores = this.jugadoresLiga();
		int mayorGoles = jugadores[0].getGoles();
		int indexGoles = 0;
		Jugador mayorGoleador = jugadores[0];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < jugadores.length; j++) {
				if (jugadores[j].getGoles() > mayorGoles) {
					mayorGoles = jugadores[j].getGoles();
					mayorGoleador = jugadores[j];
					indexGoles = j;
				}
			}
			System.out.format(leftAlignFormat, mayorGoleador.getNombre() ,
		    		mayorGoleador.getGoles());
			mayorGoles = -1;
			jugadores[indexGoles].setGoles(-1);
		}
		System.out.format("+-----------------+-------+%n");
	}
	
	public void mostrar5Expulsiones() {
		String leftAlignFormat = "| %-15s | %-4d |%n";
		System.out.format("+-----------------+------+%n");
		System.out.format("| Equipo          |Rojas |%n");
		System.out.format("+-----------------+------+%n");
		Jugador[] jugadores = new Jugador[this.jugadoresLiga().length];
		jugadores = this.jugadoresLiga();
		int mayorExplusiones = jugadores[0].getTarjetasRojas();
		int indexExpulsiones = 0;
		Jugador mayorGoleador = jugadores[0];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < jugadores.length; j++) {
				if (jugadores[j].getTarjetasRojas() > mayorExplusiones) {
					mayorExplusiones = jugadores[j].getTarjetasRojas();
					mayorGoleador = jugadores[j];
					indexExpulsiones = j;
				}
			}
			System.out.format(leftAlignFormat, mayorGoleador.getNombre() ,
		    		mayorGoleador.getTarjetasRojas());
			mayorExplusiones = -1;
			jugadores[indexExpulsiones].setTarjetasRojas(-1);
		}
		System.out.format("+-----------------+------+%n");
	}
	
	public void mostrar5EquiposGoleadores() {
		Equipo[] equiposOrdenados = new Equipo[clasificacion.length];
		int mayorGoles = clasificacion[0].getGolesAFavor() - 1;
		int golesMaximos = clasificacion[0].getGolesAFavor() + 1;
		int indexGoleador = 0;
		for (int i = 0; i < clasificacion.length; i++) {
			for (int j = 0; j < clasificacion.length; j++) {
				if (i == 0) {
					if (clasificacion[j].getGolesAFavor() > mayorGoles) {
						mayorGoles = clasificacion[j].getGolesAFavor();
						indexGoleador = j;
					}
				} else {
					if (clasificacion[j].getGolesAFavor() > mayorGoles && 
							clasificacion[j].getGolesAFavor() < golesMaximos) {
						mayorGoles = clasificacion[j].getGolesAFavor();
						indexGoleador = j;
					}
				}
			}
			golesMaximos = mayorGoles;
			equiposOrdenados[i] = clasificacion[indexGoleador];
			mayorGoles = 0;
		}
		String leftAlignFormat = "| %-15s | %-4d |%n";
		System.out.format("+-----------------+------+%n");
		System.out.format("| Equipo          |Goles |%n");
		System.out.format("+-----------------+------+%n");
		for (int i = 0; i < equiposOrdenados.length; i++) {
		    System.out.format(leftAlignFormat, equiposOrdenados[i].getNombre() , 
		    		equiposOrdenados[i].getGolesAFavor());
		}
		System.out.format("+-----------------+------+%n");
	}
}
