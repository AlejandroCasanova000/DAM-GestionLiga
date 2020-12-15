package Practica1GestionLiga;

/**
 * Esta clase se encarga de definir todos los jugadores y los 15 equios de la liga, as�
 * como de crearla y de inicializar el men�
 */

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Creaamos RealMadrid (Equipo 1) 57
		Jugador jugador1 = new Jugador("Eden Hazard" , 7 , 40 , 2 , 3);
		Jugador jugador2 = new Jugador("Karim Benzema" , 9 , 25 , 2 , 4);
		Jugador jugador3 = new Jugador("Courtois" , 1 , 75 , 0 , 1);
		Jugador jugador4 = new Jugador("Daniel Carvajal" , 2 , 0 , 0 , 3);
		Jugador jugador5 = new Jugador("Marcelo" , 12 , 0 , 3 , 5);
		Jugador jugador6 = new Jugador("Raphael Varane" , 5 , 20 , 2 , 3);
		Jugador jugador7 = new Jugador("Casemiro" , 14 , 10 , 5 , 5);
		Jugador jugador8 = new Jugador("Sergio Ramos" , 4 , 69 , 0 , 2);
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
		jugador4 = new Jugador("Marc-Andr� ter Stegen" , 1 , 5 , 0 , 0);
		jugador5 = new Jugador("Gerard Piqu�" , 3 , 31 , 3 , 5);
		jugador6 = new Jugador("Miralem Pjanic" , 8 , 3 , 0 , 2);
		jugador7 = new Jugador("Jordi Alba" , 18 , 2 , 1 , 2);
		jugador8 = new Jugador("Philippe Coutinho" , 14 , 0 , 1 , 2);
		jugador9 = new Jugador("Francisco Trincao" , 17 , 0 , 0 , 3);
		jugador10 = new Jugador("Cl�ment Lenglet" , 15 , 0 , 2 , 3);
		jugador11 = new Jugador("Pedri Gonz�lez" , 16 , 5 , 0 , 3);
		Jugador[] jugadoresEquipo2 = {jugador1 , jugador2, jugador3 , jugador4 ,
				jugador5 , jugador6 , jugador7 , jugador8 , jugador9
				, jugador10 , jugador11};
		Equipo equipo2 = new Equipo("FC Barcelona" , "Camp Nou" , 1899 , jugadoresEquipo2 , 82 ,
				25 , 6 , 7);
		
		//Creamos Atl�tico Madrid (Equipo 3) 22
		jugador1 = new Jugador("Luis Su�rez" , 9 , 5 , 1 , 2);
		jugador2 = new Jugador("Joao Felix" , 7 , 3 , 0 , 3);
		jugador3 = new Jugador("Diego Costa" , 19 , 1 , 0 , 2);
		jugador4 = new Jugador("Marcos Llorente" , 14 , 3 , 1 , 5);
		jugador5 = new Jugador("H�ctor Herrera" , 16 , 0 , 1 , 3);
		jugador6 = new Jugador("Lucas Torreira" , 5 , 3 , 0 , 2);
		jugador7 = new Jugador("Yannick Carrasco" , 21 , 1 , 0 , 2);
		jugador8 = new Jugador("Geoffrey Kondogbia" , 4 , 3 , 1 , 2);
		jugador9 = new Jugador("Jos� Mar�a Gim�nez" , 2 , 1 , 0 , 3);
		jugador10 = new Jugador("Jan Oblak" , 13 , 0 , 0 , 1);
		jugador11 = new Jugador("Koke Resurrecci�n" , 6 , 2 , 1 , 3);
		Jugador[] jugadoresEquipo3 = {jugador1 , jugador2, jugador3 , jugador4 ,
				jugador5 , jugador6 , jugador7 , jugador8 , jugador9
				, jugador10 , jugador11};
		Equipo equipo3 = new Equipo("Atl Madrid" , "Wanda Metropolitano" , 1903 
				, jugadoresEquipo3 , 70 , 18 , 4 , 16);
		
		//Creamos Sevilla FC (Equipo4)
		jugador1 = new Jugador("Ivan Rakitic" , 10 , 5 , 0 , 2);
		jugador2 = new Jugador("Luuk de Jong" , 9 , 3 , 0 , 3);
		jugador3 = new Jugador("Jules Cound�" , 12 , 1 , 0 , 2);
		jugador4 = new Jugador("Jes�s Navas" , 16 , 20 , 1 , 5);
		jugador5 = new Jugador("Ciro Immobile" , 17 , 5 , 1 , 3);
		jugador6 = new Jugador("Suso" , 7 , 3 , 0 , 2);
		jugador7 = new Jugador("Sergio Escudero" , 18 , 6 , 0 , 2);
		jugador8 = new Jugador("Joaqu�n Correa" , 29 , 3 , 1 , 2);
		jugador9 = new Jugador("Steven N�Zonzi" , 15 , 1 , 0 , 3);
		jugador10 = new Jugador("Yassine Bounou" , 1 , 0 , 0 , 1);
		jugador11 = new Jugador("Diego Carlos" , 20 , 2 , 3 , 3);
		Jugador[] jugadoresEquipo4 = {jugador1 , jugador2, jugador3 , jugador4 ,
				jugador5 , jugador6 , jugador7 , jugador8 , jugador9
				, jugador10 , jugador11};
		Equipo equipo4 = new Equipo("Sevilla FC" , "Ram�n Sanchez-Piju�n" , 1890 
				, jugadoresEquipo4 , 70 , 19 , 6 , 13);
		
		//Creamos Real Betis(Equipo4)
		jugador1 = new Jugador("Claudio Bravo" , 25 , 1 , 0 , 0);
		jugador2 = new Jugador("Joaqu�n" , 17 , 25 , 0 , 3);
		jugador3 = new Jugador("Nabil Fekir" , 8 , 1 , 0 , 2);
		jugador4 = new Jugador("Emerson Royal" , 22 , 20 , 1 , 5);
		jugador5 = new Jugador("Cristian Tello" , 11 , 5 , 1 , 3);
		jugador6 = new Jugador("Marc Bartra" , 5 , 3 , 0 , 2);
		jugador7 = new Jugador("Aissa Mandi" , 23 , 6 , 0 , 2);
		jugador8 = new Jugador("Juanmi Jim�nez" , 7 , 3 , 1 , 2);
		jugador9 = new Jugador("Sergio Canales" , 10 , 1 , 0 , 3);
		jugador10 = new Jugador("William Carvalho" , 14 , 34 , 0 , 1);
		jugador11 = new Jugador("Victor Ruiz Torre" , 6 , 2 , 1 , 3);
		Jugador[] jugadoresEquipo5 = {jugador1 , jugador2, jugador3 , jugador4 ,
				jugador5 , jugador6 , jugador7 , jugador8 , jugador9
				, jugador10 , jugador11};
		Equipo equipo5 = new Equipo("Real Betis" , "Benito Villamar�n" , 1907 
				, jugadoresEquipo5 , 89 , 5 , 7 , 1);
		
		//Creamos la Liga
		Equipo[] equiposLiga = {equipo1 , equipo2 , equipo3 , equipo4 , equipo5};
		Liga ligaSantander = new Liga ("Liga Santander" , equiposLiga);
		
		//Creamos el Men�
		int respuesta = 0;
		System.out.println("Bienvenido al programa de gesti�n de la " +
				ligaSantander.getNombre());
		System.out.println("Introduce 1 para mostrar la Tabla de Clasificacion");
		System.out.println("Introduce 2 para mostrar Top 5 Pichichis");
		System.out.println("Introduce 3 para mostrar los 5 jugadores con m�s expulsiones");
		System.out.println("Introduce 4 para mostrar los 5 equipos mas goleadores");
		while (respuesta < 1 || respuesta > 4) {
			respuesta = entrada.nextInt();
			if (respuesta < 1 || respuesta > 4) {
				System.out.print("Introduce un N�mero entre 1 y 4!!!!!");
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
		entrada.close();
		
	}

}
