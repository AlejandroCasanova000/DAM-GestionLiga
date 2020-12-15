package Practica1GestionLiga;

/**
 * Esta clase Java define el objeto Liga, formado por el nombre y la tabla de objetos
 * Equipo que la forman
 * @author alexc
 *
 */
public class Liga {
	private String nombre;
	private Equipo[] clasificacion;
	
	/**
	 * M�todo constructor del objeto Liga
	 * @param nombre El nombre de la liga
	 * @param clasificacion Tabla de obetos Equipo que forman la liga
	 */
	public Liga(String nombre , Equipo[] clasificacion) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
	}
	
	/**
	 * Pre: Este m�todo devuelve el nombre de la Liga
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Pre: Este m�todo cambia el nombre de la liga a [newNombre]
	 * @param newNombre
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	
	/**
	 * Pre: Este m�todo devuelve la tabla de objetos Equipo que integran la liga
	 * @return
	 */
	public Equipo[] getClasificacion() {
		return clasificacion;
	}
	
	/**
	 * Pre: Este m�todo cambia la tabla de objetos Equipo que integran la liga a
	 * [newClasificacion]
	 * @param newClasificacion
	 */
	public void setClasificacion(Equipo[] newClasificacion) {
		this.clasificacion = newClasificacion;
	}
	
	/**
	 * Pre: Este m�todo muestra por pantalla la tabla de clasificaci�n ordenada por 
	 * puntos.
	 * Post: Para ello copia los equipos en la tabla (equipos) y la va recorriendo
	 *  de tal manera que saca el equipo que m�s puntos tiene en el segundo bucle, 
	 *  muestra por pantalla la informacion pedida y machaca los puntos
	 *  al acabar para que no vuelva a salir el equipo
	 */
	public void mostrarOrdeadaPorPuntos() {
		System.out.println("La tabla de clasificaci�n: ");
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
	
	/**
	 * Pre: Este m�todo devuelve una tabla de objetos Jugador, que son todos los jugadores
	 * que integran una Liga
	 * Post: Para ello se crea una tabla jugadorEquipo, donde se albergar�n cada los
	 * jugadores de cada equipo, luego se a�aden a la tabla jugadores (donde van todos
	 * los de la liga), posteriormente se repite el proceso tantas veces como equipos
	 * hay en la liga
	 * @return
	 */
	public Jugador[] jugadoresLiga() {
		int contadorJugadores = 0;
		for (int i = 0; i < clasificacion.length; i++) {
			contadorJugadores = contadorJugadores + clasificacion[i].getJugadores().length;
		}
		Jugador[] jugadores = new Jugador[contadorJugadores];
		contadorJugadores = 0;
		/**jugadorEquipo es una tabla donde se almacenan temporalmente los jugadores
		 * del equipo que se est� recorriendo
		 */
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
	
	/**
	 * Pre: Este m�todo se encarga de mostrar por pantalla el Top 5 de jugadores con mas
	 * goles
	 * Post: Para ello se hace uso del m�todo jugadoresLiga() para crear una tabla con
	 * todos los njugadores de la liga, que se recorre buscando el mayor goleador en el
	 * bucle de las j, una vez hecho eso se muestra por pantalla el nombre del jugador
	 * y el n�mero de goles, posteriormente se machaca el valor de los goles y se vuelve
	 * a recorrer hasta que i sea 5, para mostrar los 5 pichichis.
	 */
	public void mostrar5Goleadores() {
		System.out.println("El Top 5 Pichichis: ");
		String leftAlignFormat = "| %-16s | %-3d |%n";
		System.out.format("+-----------------+-------+%n");
		System.out.format("| Jugador          |Goles |%n");
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
	
	/**
	 * Pre: Este m�todo muestra por pantalla el Top 5 de jugadores con mayor n�mero de
	 * tarjetas Rojas.
	 * Post: Para ello se hace uso del m�todo jugadoresLiga() para hacer una tabla donde
	 * est�n todos los jugadores de la liga, posteriormente se recorre la tabla buscando
	 * el jugador con mas tarjetas rojas (bucle de la j), se muestra por pantalla y se
	 * machaca el valor de las tarjetas rojas, se vuelve a recorrer este proceso hasta
	 * tener 5 jugadores con sus respectivas tarjetas
	 */
	public void mostrar5Expulsiones() {
		System.out.println("El Top 5 carniceros: ");
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
	
	/**
	 * Pre: Este m�todo muestra por pantalla el Top 5 de jugadores con m�s goles
	 * 
	 * Post: Para ello primero se ordena la tabla clasificacion en la tabla 
	 * equiposOrdenados, para ello se recorre la tabla buscando el equipo con mas goles
	 * haciendo uso del m�todo getGolesAFavor() de la clase Equipo, posteriormente
	 * se guarda en la casilla ordenada de equipoOrdenados, se reppite el proceso, pero
	 * esta vez, para que no se repita el equipo con mas goles, el resultado devuelto por
	 * getGolesAFavor ha de ser menor que el de la iteraci�n anterior (variable 
	 * golesMaximos).
	 */
	public void mostrar3EquiposGoleadores() {
		System.out.println("Top 3 equipos goleadores: ");
		Equipo[] equiposOrdenados = new Equipo[clasificacion.length];
		int mayorGoles = clasificacion[0].getGolesAFavor() - 1;
		int golesMaximos = clasificacion[0].getGolesAFavor() + 1;
		int indexGoleador = 0;
		String nombreEquipo = "";
		/**
		 * Este bucle se ejecuta tres veces, en cada iteraci�n del primer bucle se
		 * comparan los goles a favor de un equipo, la primera vez se guarda como si
		 * fueran los maximos goleadores, y en las sigiente ese dato se compara con el
		 * siguiente y si es mayor, se cambian los datos, asi sucesivamente hasta que se
		 * saca el mayor goleador de la liga, cuando i pasa a ser de 1 en adelante, 
		 * la consicion para encontrar el siguiente maximo goleador, el computo de goles
		 * a favor debe de ser menor que el de la iteraci�n anterior + 1 (por si hay
		 * equipos con el mismo numnero de goles), y nombre distinto al anterior.
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < clasificacion.length; j++) {
				if (i == 0) {
					if (clasificacion[j].getGolesAFavor() > mayorGoles) {
						mayorGoles = clasificacion[j].getGolesAFavor();
						indexGoleador = j;
						nombreEquipo = clasificacion[j].getNombre() + 1;
					}
				} else {
					if (clasificacion[j].getGolesAFavor() > mayorGoles && 
							clasificacion[j].getGolesAFavor() < golesMaximos && 
							!clasificacion[j].getNombre().equals(nombreEquipo)) {
						mayorGoles = clasificacion[j].getGolesAFavor() + 1;
						indexGoleador = j;
						nombreEquipo = clasificacion[j].getNombre();
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
		for (int i = 0; i < 3; i++) {
		    System.out.format(leftAlignFormat, equiposOrdenados[i].getNombre() , 
		    		equiposOrdenados[i].getGolesAFavor());
		}
		System.out.format("+-----------------+------+%n");
	}
}
