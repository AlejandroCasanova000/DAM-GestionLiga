package Practica1GestionLiga;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Creaamos RealMadrid (Equipo 1) 57
		Jugador jugador1 = new Jugador("Eden Hazard" , 7 , 10 , 2 , 3);
		Jugador jugador2 = new Jugador("Karim Benzema" , 9 , 25 , 2 , 4);
		Jugador jugador3 = new Jugador("Courtois" , 1 , 75 , 0 , 1);
		Jugador jugador4 = new Jugador("Daniel Carvajal" , 2 , 0 , 0 , 3);
		Jugador jugador5 = new Jugador("Marcelo" , 12 , 0 , 3 , 5);
		Jugador jugador6 = new Jugador("Raphael Varane" , 5 , 20 , 2 , 3);
		Jugador jugador7 = new Jugador("Casemiro" , 14 , 2 , 3 , 4);
		Jugador jugador8 = new Jugador("Sergio Ramos" , 4 , 74 , 0 , 2);
		Jugador jugador9 = new Jugador("Luka Modric" , 10 , 5 , 0 , 3);
		Jugador jugador10 = new Jugador("Ferland Mendy" , 23 , 0 , 2 , 3);
		Jugador jugador11 = new Jugador("Isco" , 22 , 3 , 0 , 3);
		Jugador[] jugadoresEquipo1 = {jugador1 , jugador2, jugador3 , jugador4 ,
				jugador5 , jugador6 , jugador7 , jugador8 , jugador9
				, jugador10 , jugador11};
		Equipo equipo1 = new Equipo("Real Madrid" , "Santiago Bernabeu" , 1902 , jugadoresEquipo1 , 87 ,
				26 , 9 , 3);
		
		//Creamos Barsa (Equipo 2) 86
		jugador1 = new Jugador("Lionel Messi" , 10 , 30 , 0 , 4);
		jugador2 = new Jugador("Antoine Griezmann" , 7 , 10 , 0 , 3);
		jugador3 = new Jugador("Ansu Fati" , 22 , 15 , 0 , 2);
		jugador4 = new Jugador("Marc-André ter Stegen" , 1 , 0 , 0 , 0);
		jugador5 = new Jugador("Gerard Piqué" , 3 , 31 , 3 , 5);
		jugador6 = new Jugador("Miralem Pjanic" , 8 , 3 , 0 , 2);
		jugador7 = new Jugador("Jordi Alba" , 18 , 2 , 1 , 2);
		jugador8 = new Jugador("Philippe Coutinho" , 14 , 0 , 1 , 2);
		jugador9 = new Jugador("Francisco Trincao" , 17 , 0 , 0 , 3);
		jugador10 = new Jugador("Clément Lenglet" , 15 , 0 , 2 , 3);
		jugador11 = new Jugador("Pedri González" , 16 , 5 , 0 , 3);
		Jugador[] jugadoresEquipo2 = {jugador1 , jugador2, jugador3 , jugador4 ,
				jugador5 , jugador6 , jugador7 , jugador8 , jugador9
				, jugador10 , jugador11};
		Equipo equipo2 = new Equipo("FC Barcelona" , "Camp Nou" , 1899 , jugadoresEquipo2 , 82 ,
				25 , 6 , 7);
		
		//Creamos Atlético Madrid (Equipo 3) 22
		jugador1 = new Jugador("Luis Suárez" , 9 , 5 , 1 , 2);
		jugador2 = new Jugador("Joao Felix" , 7 , 3 , 0 , 3);
		jugador3 = new Jugador("Diego Costa" , 19 , 1 , 0 , 2);
		jugador4 = new Jugador("Marcos Llorente" , 14 , 3 , 1 , 5);
		jugador5 = new Jugador("Héctor Herrera" , 16 , 0 , 1 , 3);
		jugador6 = new Jugador("Lucas Torreira" , 5 , 3 , 0 , 2);
		jugador7 = new Jugador("Yannick Carrasco" , 21 , 1 , 0 , 2);
		jugador8 = new Jugador("Geoffrey Kondogbia" , 4 , 3 , 1 , 2);
		jugador9 = new Jugador("José María Giménez" , 2 , 1 , 0 , 3);
		jugador10 = new Jugador("Jan Oblak" , 13 , 0 , 0 , 1);
		jugador11 = new Jugador("Koke Resurrección" , 6 , 2 , 1 , 3);
		Jugador[] jugadoresEquipo3 = {jugador1 , jugador2, jugador3 , jugador4 ,
				jugador5 , jugador6 , jugador7 , jugador8 , jugador9
				, jugador10 , jugador11};
		Equipo equipo3 = new Equipo("Atl Madrid" , "Wanda Metropolitano" , 1903 
				, jugadoresEquipo3 , 70 ,18 , 4 , 16);
		
		//Creamos la Liga
		Equipo[] equiposLiga = {equipo1 , equipo2 , equipo3};
		Liga ligaSantander = new Liga ("Liga Santander" , equiposLiga);
		
		//Creamos el Menú
		int respuesta = 0;
		System.out.println("Bienvenido al programa de gestión de la " +
				ligaSantander.getNombre());
		System.out.println("Introduce 1 para mostrar la Tabla de Clasificacion");
		System.out.println("Introduce 2 para mostrar Top 5 Pichichis");
		System.out.println("Introduce 3 para mostrar los 5 jugadores con más expulsiones");
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
			ligaSantander.mostrar5EquiposGoleadores();
		}
		entrada.close();
		
	}

}
