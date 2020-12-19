package Practica1GestionLiga;

/**
 * Esta clase se encarga de definir todos los jugadores y los 15 equios de la liga, así
 * como de crearla y de inicializar el menú
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Creaamos RealMadrid (Equipo 1) 57
		Jugador jugador1 = new Jugador("Eden Hazard", 7, 40, 2, 3);
		Jugador jugador2 = new Jugador("Karim Benzema", 9, 25, 2, 4);
		Jugador jugador3 = new Jugador("Courtois", 1, 75, 0, 1);
		Jugador jugador4 = new Jugador("Daniel Carvajal", 2, 0, 0, 3);
		Jugador jugador5 = new Jugador("Marcelo", 12, 0, 3, 5);
		Jugador jugador6 = new Jugador("Raphael Varane", 5, 20, 2, 3);
		Jugador jugador7 = new Jugador("Casemiro", 14, 10, 5, 5);
		Jugador jugador8 = new Jugador("Sergio Ramos", 4, 69, 0, 2);
		Jugador jugador9 = new Jugador("Luka Modric", 10, 5, 0, 3);
		Jugador jugador10 = new Jugador("Ferland Mendy", 23, 0, 2, 3);
		Jugador jugador11 = new Jugador("Isco", 22, 3, 0, 3);
		Jugador[] jugadoresEquipo1 = { jugador1, jugador2, jugador3, jugador4,
				jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo1 = new Equipo("Real Madrid", "Santiago Bernabeu", 1902,
				jugadoresEquipo1, 87, 26, 9, 3);

		// Creamos Barsa (Equipo 2) 86
		jugador1 = new Jugador("Lionel Messi", 10, 30, 0, 4);
		jugador2 = new Jugador("Antoine Griezmann", 7, 10, 0, 3);
		jugador3 = new Jugador("Ansu Fati", 22, 15, 0, 2);
		jugador4 = new Jugador("Marc-André ter Stegen", 1, 0, 0, 0);
		jugador5 = new Jugador("Gerard Piqué", 3, 31, 3, 5);
		jugador6 = new Jugador("Miralem Pjanic", 8, 3, 0, 2);
		jugador7 = new Jugador("Jordi Alba", 18, 2, 1, 2);
		jugador8 = new Jugador("Philippe Coutinho", 14, 0, 1, 2);
		jugador9 = new Jugador("Francisco Trincao", 17, 0, 0, 3);
		jugador10 = new Jugador("Clément Lenglet", 15, 0, 2, 3);
		jugador11 = new Jugador("Pedri González", 16, 5, 0, 3);
		Jugador[] jugadoresEquipo2 = { jugador1, jugador2, jugador3, jugador4,
				jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo2 = new Equipo("FC Barcelona", "Camp Nou", 1899, 
				jugadoresEquipo2, 82, 25, 6, 7);

		// Creamos Atlético Madrid (Equipo 3) 22
		jugador1 = new Jugador("Luis Suárez", 9, 5, 1, 2);
		jugador2 = new Jugador("Joao Felix", 7, 3, 0, 3);
		jugador3 = new Jugador("Diego Costa", 19, 1, 0, 2);
		jugador4 = new Jugador("Marcos Llorente", 14, 3, 1, 5);
		jugador5 = new Jugador("Héctor Herrera", 16, 0, 1, 3);
		jugador6 = new Jugador("Lucas Torreira", 5, 3, 0, 2);
		jugador7 = new Jugador("Yannick Carrasco", 21, 1, 0, 2);
		jugador8 = new Jugador("Geoffrey Kondogbia", 4, 3, 1, 2);
		jugador9 = new Jugador("José María Giménez", 2, 1, 0, 3);
		jugador10 = new Jugador("Jan Oblak", 13, 0, 0, 1);
		jugador11 = new Jugador("Koke Resurrección", 6, 2, 1, 3);
		Jugador[] jugadoresEquipo3 = { jugador1, jugador2, jugador3, jugador4,
				jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo3 = new Equipo("Atl Madrid", "Wanda Metropolitano", 1903, 
				jugadoresEquipo3, 70, 18, 4, 16);

		// Creamos Sevilla FC (Equipo4)
		jugador1 = new Jugador("Ivan Rakitic", 10, 5, 0, 2);
		jugador2 = new Jugador("Luuk de Jong", 9, 3, 0, 3);
		jugador3 = new Jugador("Jules Coundé", 12, 1, 0, 2);
		jugador4 = new Jugador("Jesús Navas", 16, 20, 1, 5);
		jugador5 = new Jugador("Ciro Immobile", 17, 5, 1, 3);
		jugador6 = new Jugador("Suso", 7, 3, 0, 2);
		jugador7 = new Jugador("Sergio Escudero", 18, 6, 0, 2);
		jugador8 = new Jugador("Joaquín Correa", 29, 3, 1, 2);
		jugador9 = new Jugador("Steven N´Zonzi", 15, 1, 0, 3);
		jugador10 = new Jugador("Yassine Bounou", 1, 198, 0, 1);
		jugador11 = new Jugador("Diego Carlos", 20, 2, 3, 3);
		Jugador[] jugadoresEquipo4 = { jugador1, jugador2, jugador3, jugador4,
				jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo4 = new Equipo("Sevilla FC", "Ramón Sanchez-Pijuán", 1890,
				jugadoresEquipo4, 70, 19, 6, 13);

		// Creamos Real Betis(Equipo5)
		jugador1 = new Jugador("Claudio Bravo", 25, 1, 0, 0);
		jugador2 = new Jugador("Joaquín", 17, 25, 0, 3);
		jugador3 = new Jugador("Nabil Fekir", 8, 145, 0, 2);
		jugador4 = new Jugador("Emerson Royal", 22, 20, 1, 5);
		jugador5 = new Jugador("Cristian Tello", 11, 5, 1, 3);
		jugador6 = new Jugador("Marc Bartra", 5, 3, 0, 2);
		jugador7 = new Jugador("Aissa Mandi", 23, 6, 0, 2);
		jugador8 = new Jugador("Juanmi Jiménez", 7, 3, 1, 2);
		jugador9 = new Jugador("Sergio Canales", 10, 1, 0, 3);
		jugador10 = new Jugador("William Carvalho", 14, 36, 0, 1);
		jugador11 = new Jugador("Victor Ruiz Torre", 6, 2, 1, 3);
		Jugador[] jugadoresEquipo5 = { jugador1, jugador2, jugador3, jugador4,
				jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo5 = new Equipo("Real Betis", "Benito Villamarín", 1907,
				jugadoresEquipo5, 89, 5, 7, 1);

		// Creamos CD Tenerife(equipo6)
		jugador1 = new Jugador("Luis Perez", 2, 4, 0, 0);
		jugador2 = new Jugador("Isma Lopez", 18, 10, 0, 1);
		jugador3 = new Jugador("Naranjo", 7, 5, 1, 1);
		jugador4 = new Jugador("Undabarrena", 15, 4, 0, 0);
		jugador5 = new Jugador("Mauro dos Santos", 15, 1, 1, 1);
		jugador6 = new Jugador("Dani Gomez", 9, 2, 1, 0);
		jugador7 = new Jugador("Robert Mazan", 17, 9, 2, 0);
		jugador8 = new Jugador("Ramon Mierez", 20, 1, 0, 0);
		jugador9 = new Jugador("Daniel Lasure", 24, 6, 0, 1);
		jugador10 = new Jugador("Lluis Lopez", 15, 8, 0, 0);
		jugador11 = new Jugador("Luis Milla", 6, 3, 1, 0);
		Jugador[] jugadoresEquipo6 = { jugador1, jugador2, jugador3, jugador4,
				jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo6 = new Equipo("CD Tenerife", "Heliodoro Rodríguez López", 1912,
				jugadoresEquipo6, 53, 4, 2, 2);
		// Creamos Chelsea FC(equipo7)
		jugador1 = new Jugador("Kepa Arrizabalaga", 1, 8, 0, 0);
		jugador2 = new Jugador("Antonio Rudiguer", 2, 10, 0, 1);
		jugador3 = new Jugador("Marcos Alonso", 3, 7, 0, 1);
		jugador4 = new Jugador("Thiago Silva", 6, 9, 1, 0);
		jugador5 = new Jugador("Kurt Zouma", 15, 6, 1, 2);
		jugador6 = new Jugador("Reece James", 24, 7, 1, 0);
		jugador7 = new Jugador("Ben Chillwell", 21, 9, 1, 3);
		jugador8 = new Jugador("Christian Pulisic", 10, 9, 0, 0);
		jugador9 = new Jugador("Mateo Kovacic", 17, 6, 0, 0);
		jugador10 = new Jugador("Billy Gilmour", 23, 8, 0, 0);
		jugador11 = new Jugador("Mason Mount", 19, 4, 0, 0);
		Jugador[] jugadoresEquipo7 = { jugador1, jugador2, jugador3, jugador4,
				jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo7 = new Equipo("Chelsea FC", "Stamford Bridge", 1905,
				jugadoresEquipo7, 63, 4, 3, 5);

		// Creamos Galatasaray SK(equipo 8)
		jugador1 = new Jugador("Sener Ozbayrakli", 2, 6, 0, 0);
		jugador2 = new Jugador("Omar Elabdellaoui", 3, 8, 1, 1);
		jugador3 = new Jugador("Younes Belhanda", 10, 3, 0, 3);
		jugador4 = new Jugador("Martin Linnes", 14, 7, 1, 1);
		jugador5 = new Jugador("Ryan Donk", 15, 7, 0, 1);
		jugador6 = new Jugador("Emre Akbaba", 20, 9, 0, 0);
		jugador7 = new Jugador("Arda Turan", 66, 8, 2, 0);
		jugador8 = new Jugador("Yunus Akgun", 17, 5, 1, 1);
		jugador9 = new Jugador("Ryan Babel", 11, 4, 0, 3);
		jugador10 = new Jugador("Radamel Falcao", 9, 2, 3, 3);
		jugador11 = new Jugador("Omer Bayram", 19, 1, 4, 3);
		Jugador[] jugadoresEquipo8 = { jugador1, jugador2, jugador3, jugador4,
				jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo8 = new Equipo("Galatasaray SK", "Türk Telekom Stadium", 1905,
				jugadoresEquipo8, 47, 2, 1, 3);

		// Creamos FC Union Berlin(equipo 9)
		jugador1 = new Jugador("Andrreas Luthe", 1, 5, 1, 0);
		jugador2 = new Jugador("Loris Karius", 20, 9, 1, 1);
		jugador3 = new Jugador("Nico Schlotterbeck", 4, 6, 0, 3);
		jugador4 = new Jugador("Florian Hubner", 19, 7, 0, 0);
		jugador5 = new Jugador("Robert Andrich", 30, 4, 3, 1);
		jugador6 = new Jugador("Robin Knoche", 31, 8, 0, 1);
		jugador7 = new Jugador("Marvin Friedrich", 5, 3, 2, 2);
		jugador8 = new Jugador("Akaki Gogia", 7, 5, 1, 1);
		jugador9 = new Jugador("Sebastian Griesbeck", 33, 4, 1, 3);
		jugador10 = new Jugador("Christian Gentner", 34, 2, 3, 3);
		jugador11 = new Jugador("Berkan Taz", 31, 6, 1, 2);
		Jugador[] jugadoresEquipo9 = { jugador1, jugador2, jugador3,
				jugador4, jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo9 = new Equipo("FC Union Berlin", "Stadion An der Alten Försterei", 
				1906, jugadoresEquipo9, 58, 4, 1, 3);

		// Creamos CD Numancia Soria(equipo 10)
		jugador1 = new Jugador("Roberto Jara", 1, 6, 1, 0);
		jugador2 = new Jugador("Borja San Emeterio", 2, 9, 0, 0);
		jugador3 = new Jugador("David Castro", 3, 6, 0, 2);
		jugador4 = new Jugador("Jon Sillero", 20, 8, 0, 0);
		jugador5 = new Jugador("Antonio Cotan", 8, 6, 0, 1);
		jugador6 = new Jugador("Diego Camara", 26, 7, 0, 1);
		jugador7 = new Jugador("Alvaro Traver", 22, 2, 2, 2);
		jugador8 = new Jugador("Asier Benito", 9, 6, 0, 1);
		jugador9 = new Jugador("Jesus Tamayo", 17, 4, 1, 3);
		jugador10 = new Jugador("Toni Gabarre", 19, 4, 2, 3);
		jugador11 = new Jugador("Oscar de Frutos", 27, 6, 1, 0);
		Jugador[] jugadoresEquipo10 = { jugador1, jugador2, jugador3, 
				jugador4, jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo10 = new Equipo("Numancia Soria", "Los Pajaritos",
				1945, jugadoresEquipo10, 26, 1, 0, 2);

		// Creamos FC Girona(equipo 11)
		jugador1 = new Jugador("Juan Carlos Martin", 1, 7, 1, 0);
		jugador2 = new Jugador("Enric Franquesa", 3, 9, 0, 0);
		jugador3 = new Jugador("Aday Benitez", 11, 7, 0, 2);
		jugador4 = new Jugador("Jordi Calavera", 17, 9, 0, 0);
		jugador5 = new Jugador("Antonio Luna", 21, 8, 0, 1);
		jugador6 = new Jugador("Eric Monjonell", 31, 6, 2, 1);
		jugador7 = new Jugador("Yoel Barcenas", 23, 5, 2, 2);
		jugador8 = new Jugador("Gerard Gumbau", 24, 4, 3, 1);
		jugador9 = new Jugador("Ramon Terrats", 27, 5, 2, 3);
		jugador10 = new Jugador("Pablo Moreno", 19, 4, 3, 3);
		jugador11 = new Jugador("Adrian Turmo", 32, 6, 1, 2);
		Jugador[] jugadoresEquipo11 = { jugador1, jugador2, jugador3,
				jugador4, jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo11 = new Equipo("FC Girona", "Estadi Municipal Montilivi",
				1930, jugadoresEquipo11, 32, 1, 2, 3);

		// Creamos FC Sabadell(equipo 12)
		jugador1 = new Jugador("Ian Mackay", 1, 7, 1, 1);
		jugador2 = new Jugador("Diego Fuoli", 13, 9, 0, 0);
		jugador3 = new Jugador("Josu Ozloidi", 3, 6, 0, 2);
		jugador4 = new Jugador("Jaime Sanchez", 5, 9, 1, 0);
		jugador5 = new Jugador("Oscar Rubio", 12, 8, 1, 1);
		jugador6 = new Jugador("Juan Ibiza", 15, 7, 0, 1);
		jugador7 = new Jugador("Pedro Capo", 18, 6, 0, 2);
		jugador8 = new Jugador("Grego Sierra", 20, 5, 0, 1);
		jugador9 = new Jugador("Jesus Olmo", 24, 5, 0, 3);
		jugador10 = new Jugador("Juan Hernandez", 9, 2, 4, 3);
		jugador11 = new Jugador("Gorka Guruzeta", 19, 5, 1, 1);
		Jugador[] jugadoresEquipo12 = { jugador1, jugador2, jugador3,
				
				jugador4, jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo12 = new Equipo("FC Sabadell", "Nova Creu Alta", 
				1903, jugadoresEquipo12, 23, 0, 1, 3);

		// Creamos Hercules Alicante FC(equipo 13)
		jugador1 = new Jugador("Ismael Falcon", 1, 6, 0, 1);
		jugador2 = new Jugador("Adri Lopez", 13, 8, 1, 0);
		jugador3 = new Jugador("Raul Ruiz", 2, 6, 1, 2);
		jugador4 = new Jugador("Tano Bonnin", 17, 9, 0, 0);
		jugador5 = new Jugador("Pablo Iñiguez", 19, 7, 1, 1);
		jugador6 = new Jugador("Javi Perez", 20, 7, 0, 1);
		jugador7 = new Jugador("Jon Erice", 6, 5, 1, 2);
		jugador8 = new Jugador("Diego Benito", 8, 5, 0, 1);
		jugador9 = new Jugador("Jesus Alafaro", 11, 6, 0, 3);
		jugador10 = new Jugador("Sergio Buenacasa", 9, 3, 2, 3);
		jugador11 = new Jugador("Manu Garrido", 12, 5, 2, 1);
		Jugador[] jugadoresEquipo13 = { jugador1, jugador2, jugador3,
				jugador4, jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo13 = new Equipo("FC Alicante", "Estadio Alicante CF", 
				1922, jugadoresEquipo13, 37, 0, 3, 3);

		// Creamos Sevilla FC(equipo 14)
		jugador1 = new Jugador("Sergio Agüero", 1, 6, 1, 1);
		jugador2 = new Jugador("Kevin de Bryune", 31, 8, 1, 0);
		jugador3 = new Jugador("Ferran Torres", 3, 7, 0, 2);
		jugador4 = new Jugador("Rodri Hernández", 18, 9, 1, 0);
		jugador5 = new Jugador("Gabriel Jesús", 12, 7, 1, 2);
		jugador6 = new Jugador("Cole Palmer", 19, 6, 1, 1);
		jugador7 = new Jugador("Benjamin Mendy", 8, 7, 0, 2);
		jugador8 = new Jugador("Bernardo Silva", 21, 6, 0, 1);
		jugador9 = new Jugador("Ederson Morales", 24, 4, 1, 3);
		jugador10 = new Jugador("Félix Nmecha", 9, 2, 3, 3);
		jugador11 = new Jugador("John Stones", 5, 5, 0, 1);
		Jugador[] jugadoresEquipo14 = { jugador1, jugador2, jugador3,
				jugador4, jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo14 = new Equipo("Manchester City", "Etihad Stadium", 1890,
				jugadoresEquipo14, 85, 10, 3, 2);

		// Creamos Real Zaragoza(equipo 15)
		jugador1 = new Jugador("Cristian Alavarez", 1, 7, 1, 1);
		jugador2 = new Jugador("Alavaro Raton", 13, 8, 1, 1);
		jugador3 = new Jugador("Alberto Guitian", 6, 8, 0, 2);
		jugador4 = new Jugador("Carlos Nieto", 17, 8, 2, 0);
		jugador5 = new Jugador("Pichu Atienza", 18, 7, 2, 2);
		jugador6 = new Jugador("Antonio Sola", 33, 6, 1, 1);
		jugador7 = new Jugador("Javi Hernandez", 39, 7, 0, 2);
		jugador8 = new Jugador("Jazi Ros", 10, 5, 2, 1);
		jugador9 = new Jugador("Sergio Bermejo", 22, 5, 1, 3);
		jugador10 = new Jugador("Luis Carbonell", 32, 1, 0, 3);
		jugador11 = new Jugador("Ivan Azon", 31, 5, 3, 1);
		Jugador[] jugadoresEquipo15 = { jugador1, jugador2, jugador3,
				jugador4, jugador5, jugador6, jugador7, jugador8,
				jugador9, jugador10, jugador11 };
		Equipo equipo15 = new Equipo("Real Zaragoza", "Juan Ignacio Martinez", 
				1957, jugadoresEquipo15, 25, 4, 2, 3);
		// Creamos la Liga
		Equipo[] equiposLiga = { equipo1, equipo2, equipo3, equipo4, equipo5, 
				equipo6, equipo7, equipo8, equipo9, equipo10, equipo11, equipo12,
				equipo13, equipo14, equipo15 };
		Liga ligaSantander = new Liga("Liga Santander", equiposLiga);

		// Creamos el Menú
		int respuesta = 0;
		String respuestaPrograma = "y";
		while (!respuestaPrograma.equals("n")) {
			System.out.println("Bienvenido al programa de gestión de la " + ligaSantander.getNombre()
					+ "\n************************************" + "*********************");
			System.out.println("Introduce 1 para mostrar la Tabla de Clasificacion");
			System.out.println("Introduce 2 para mostrar Top 5 Pichichis");
			System.out.println("Introduce 3 para mostrar los 5 jugadores con más " + "expulsiones");
			System.out.println("Introduce 4 para mostrar los 5 equipos mas goleadores");
			while (respuesta < 1 || respuesta > 4) {
				respuesta = entrada.nextInt();
				if (respuesta < 1 || respuesta > 4) {
					System.out.print("Introduce un Número entre 1 y 4!!!!!");
				}
			}
			System.out.println();
			if (respuesta == 1) {
				ligaSantander.mostrarOrdeadaPorPuntos();
			} else if (respuesta == 2) {
				ligaSantander.mostrar5Goleadores();
			} else if (respuesta == 3) {
				ligaSantander.mostrar5Expulsiones();
			} else {
				ligaSantander.mostrar3EquiposGoleadores();
			}
			System.out.println("¿Quieres continuar? y/n");
			respuestaPrograma = entrada.next();
			respuesta = 0;
			if (respuestaPrograma.equals("y")) {
				System.out.println("-------------------------------------");
			}
		}
		entrada.close();
	}
}