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
	 * Método constructor del objeto Liga
	 * @param nombre El nombre de la liga
	 * @param clasificacion Tabla de obetos Equipo que forman la liga
	 */
	public Liga(String nombre , Equipo[] clasificacion) {
		this.nombre = nombre;
		this.clasificacion = clasificacion;
	}
	
	/**
	 * Pre: Este método devuelve el nombre de la Liga
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Pre: Este método cambia el nombre de la liga a [newNombre]
	 * @param newNombre
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	
	/**
	 * Pre: Este método devuelve la tabla de objetos Equipo que integran la liga
	 * @return
	 */
	public Equipo[] getClasificacion() {
		return clasificacion;
	}
	
	/**
	 * Pre: Este método cambia la tabla de objetos Equipo que integran la liga a
	 * [newClasificacion]
	 * @param newClasificacion
	 */
	public void setClasificacion(Equipo[] newClasificacion) {
		this.clasificacion = newClasificacion;
	}
	
	/**
	 * Pre: Este método muestra por pantalla la tabla de clasificación ordenada por 
	 * puntos.
	 * Post: Para ello copia los equipos en la tabla (equipos) y la va recorriendo
	 *  de tal manera que saca el equipo que más puntos tiene en el segundo bucle, 
	 *  muestra por pantalla la informacion pedida y machaca los puntos
	 *  al acabar para que no vuelva a salir el equipo (al final se recuperan los puntos
	 *  para no perderlos
	 */
	public void mostrarOrdeadaPorPuntos() {
		System.out.println("La tabla de clasificación: ");
		String leftAlignFormat = "| %-15s | %-4d | %-5d | %-6d | %-7d | %-3d |%n";
		System.out.format("+-----------------+------+-------+--------+---------+-----+"
				+ "%n");
		System.out.format("| Equipo          |Puntos|Ganados|Perdidos|Empatados|Goles|"
				+ "%n");
		System.out.format("+-----------------+------+-------+--------+---------+-----+"
				+ "%n");
		int[] puntos = new int[clasificacion.length];
		//Guardamos los puntos para luego no perderlos
		for (int i = 0; i < puntos.length; i++) {
			puntos[i] = clasificacion[i].getPuntos();
		}
		int mayor = clasificacion[0].getPuntos() + 1;
		Equipo equipoMayor = clasificacion[0];
		int indexEliminar = 0;
		for (int i = 0; i < clasificacion.length; i++) {
			for (int j = 0; j < clasificacion.length; j++) {
				if (clasificacion[j].getPuntos() > mayor) {
					equipoMayor = clasificacion[j];
					mayor = clasificacion[j].getPuntos();
					indexEliminar = j;
				}
			}
		    System.out.format(leftAlignFormat ,  equipoMayor.getNombre() , 
		    		equipoMayor.getPuntos() , equipoMayor.getPartidosGanados() , 
		    		equipoMayor.getPartidosPerdidos() ,equipoMayor.getPartidosEmpatados()
		    		, equipoMayor.getGolesAFavor());
		    clasificacion[indexEliminar].setPuntos(-1);
			mayor = -1;
		    if (i != clasificacion.length - 1) {
			    System.out.format("+-----------------+------+-------+--------+--------"
			    		+ "-+-----+%n");
		    }
		}
		System.out.format("+-----------------+------+-------+--------+---------+-----+"
				+ "%n");
		
		//Finalmente Volvemos a poner los puntos que han sido machacados
		for (int i = 0; i < puntos.length; i++) {
			clasificacion[i].setPuntos(puntos[i]);
		}
	}
	
	/**
	 * Pre: Este método devuelve una tabla de objetos Jugador, que son todos los jugadores
	 * que integran una Liga
	 * Post: Para ello se crea una tabla jugadorEquipo, donde se albergarán cada los
	 * jugadores de cada equipo, luego se añaden a la tabla jugadores (donde van todos
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
		 * del equipo que se está recorriendo
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
	 * Pre: Este método se encarga de mostrar por pantalla el Top 5 de jugadores con mas
	 * goles
	 * Post: Para ello se hace uso del método jugadoresLiga() para crear una tabla con
	 * todos los njugadores de la liga, que se recorre buscando el mayor goleador en el
	 * bucle de las j, una vez hecho eso se muestra por pantalla el nombre del jugador
	 * y el número de goles, posteriormente se machaca el valor de los goles y se vuelve
	 * a recorrer hasta que i sea 5, para mostrar los 5 pichichis. Al final los goles son
	 * vueltos a poner para que se pueda volver a ejecutar sin necesidad de resetear el 
	 * programa
	 */
	public void mostrar5Goleadores() {
		System.out.println("El Top 5 Pichichis: ");
		String leftAlignFormat = "| %-15s | %-3d |%n";
		System.out.format("+-----------------+-----+%n");
		System.out.format("| Jugador         |Goles|%n");
		System.out.format("+-----------------+-----+%n");
		Jugador[] jugadoresLiga = new Jugador[this.jugadoresLiga().length];
		jugadoresLiga = this.jugadoresLiga();
		int[] goles = new int[jugadoresLiga.length];
		for (int i = 0; i < goles.length; i++) {
			goles[i] = jugadoresLiga[i].getGoles();
		}
		int mayorGoles = jugadoresLiga[0].getGoles();
		int indexGoles = 0;
		Jugador mayorGoleador = jugadoresLiga[0];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < jugadoresLiga.length; j++) {
				if (jugadoresLiga[j].getGoles() > mayorGoles) {
					mayorGoles = jugadoresLiga[j].getGoles();
					mayorGoleador = jugadoresLiga[j];
					indexGoles = j;
				}
			}
			System.out.format(leftAlignFormat, mayorGoleador.getNombre() ,
		    		mayorGoleador.getGoles());
			mayorGoles = -1;
			jugadoresLiga[indexGoles].setGoles(-1);
		}
		System.out.format("+-----------------+-----+%n");
		
		//Finalmente volvemos a poner los goles machacados
		for (int i = 0; i < goles.length; i++) {
			jugadoresLiga[i].setGoles(goles[i]);
		}
	}
	
	/**
	 * Pre: Este método muestra por pantalla el Top 5 de jugadores con mayor número de
	 * tarjetas Rojas.
	 * Post: Para ello se hace uso del método jugadoresLiga() para hacer una tabla donde
	 * estén todos los jugadores de la liga, posteriormente se recorre la tabla buscando
	 * el jugador con mas tarjetas rojas (bucle de la j), se muestra por pantalla y se
	 * machaca el valor de las tarjetas rojas, se vuelve a recorrer este proceso hasta
	 * tener 5 jugadores con sus respectivas tarjetas. Al final se vuelven a poner las
	 * tarjetas rojas machacadas.
	 */
	public void mostrar5Expulsiones() {
		System.out.println("El Top 5 carniceros: ");
		String leftAlignFormat = "| %-15s | %-4d |%n";
		System.out.format("+-----------------+------+%n");
		System.out.format("| Equipo          |Rojas |%n");
		System.out.format("+-----------------+------+%n");
		Jugador[] jugadores = new Jugador[this.jugadoresLiga().length];
		jugadores = this.jugadoresLiga();
		
		//Guardamos las Tarjetas rojas para luego poder Machacarlas
		int[] rojas = new int[jugadores.length];
		for (int i = 0; i < rojas.length; i++) {
			rojas[i] = jugadores[i].getTarjetasRojas();
		}
		int mayorExplusiones = jugadores[0].getTarjetasRojas();
		int indexExpulsiones = 0;
		Jugador mayorCarnicero = jugadores[0];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < jugadores.length; j++) {
				if (jugadores[j].getTarjetasRojas() > mayorExplusiones) {
					mayorExplusiones = jugadores[j].getTarjetasRojas();
					mayorCarnicero = jugadores[j];
					indexExpulsiones = j;
				}
			}
			System.out.format(leftAlignFormat, mayorCarnicero.getNombre() ,
		    		mayorCarnicero.getTarjetasRojas());
			mayorExplusiones = -1;
			jugadores[indexExpulsiones].setTarjetasRojas(-1);
		}
		System.out.format("+-----------------+------+%n");
		
		//Finalmente volvemos a poner las tarjetas rojas machacadas
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i].setTarjetasRojas(rojas[i]);
		}
	}
	
	/**
	 * Pre: Este método muestra por pantalla el Top 5 de jugadores con más goles
	 * 
	 * Post: Para ello primero se ordena la tabla clasificacion en la tabla 
	 * equiposOrdenados, para ello se recorre la tabla buscando el equipo con mas goles
	 * haciendo uso del método getGolesAFavor() de la clase Equipo, posteriormente
	 * se guarda en la casilla ordenada de equipoOrdenados, se reppite el proceso, pero
	 * esta vez, para que no se repita el equipo con mas goles, el resultado devuelto por
	 * getGolesAFavor ha de ser menor que el de la iteración anterior (variable 
	 * golesMaximos) y no estar en la tabla de nombres (tablaNombres) de equipos ya 
	 * ordenados (haciendo uso del método comprobarEquipoEnTabla()).
	 */
	public void mostrar3EquiposGoleadores() {
		System.out.println("Top 3 equipos goleadores: ");
		Equipo[] equiposOrdenados = new Equipo[clasificacion.length];
		int mayorGoles = clasificacion[0].getGolesAFavor() - 1;
		int golesMaximos = clasificacion[0].getGolesAFavor() + 1;
		int indexGoleador = 0;
		String[] tablaNombres = new String[equiposOrdenados.length];
		for (int i = 0; i < tablaNombres.length; i++) {
			tablaNombres[i] = "";
		}
		int indexTablaNombres = 0;
		/**
		 * Este bucle se ejecuta tres veces, en cada iteración del primer bucle se
		 * comparan los goles a favor de un equipo, la primera vez se guarda como si
		 * fueran los maximos goleadores, y en las sigiente ese dato se compara con el
		 * siguiente y si es mayor, se cambian los datos, asi sucesivamente hasta que se
		 * saca el mayor goleador de la liga, cuando i pasa a ser de 1 en adelante, 
		 * la consicion para encontrar el siguiente maximo goleador, el computo de goles
		 * a favor debe de ser menor que el de la iteración anterior + 1 (por si hay
		 * equipos con el mismo numnero de goles), y nombre distinto a alguno de los
		 * anteriores top goleadores almacenados en la tabla nombreEquipos.
		 */
		for (int i = 0; i < clasificacion.length; i++) {
			for (int j = 0; j < clasificacion.length; j++) {
				if (i == 0) {
					if (clasificacion[j].getGolesAFavor() > mayorGoles) {
						mayorGoles = clasificacion[j].getGolesAFavor() + 1;
						indexGoleador = j;
					}
				} else {
					if (clasificacion[j].getGolesAFavor() > mayorGoles && 
							clasificacion[j].getGolesAFavor() < golesMaximos &&
							!this.comprobarEquipoEnTabla(tablaNombres ,
									clasificacion[j])) {
						mayorGoles = clasificacion[j].getGolesAFavor() + 1;
						indexGoleador = j;
					}
				}
			}
			golesMaximos = mayorGoles;
			equiposOrdenados[i] = clasificacion[indexGoleador];
			tablaNombres[indexTablaNombres] = equiposOrdenados[i].getNombre();
			indexTablaNombres++;
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
	
	/**
	 * Pre: Este método comprueba si el Equipo [equipo] se encuentra en la tabla 
	 * [tablaNombres]
	 * @param tablaNombres
	 * @param equipo
	 * @return
	 */
	public boolean comprobarEquipoEnTabla(String[] tablaNombres , Equipo equipo) {
		boolean ok = false;
		for (int i = 0; i < clasificacion.length; i++) {
			if (equipo.getNombre().equals(tablaNombres[i])) {
				ok = true;
			}
		}
		return ok;
	}
}
