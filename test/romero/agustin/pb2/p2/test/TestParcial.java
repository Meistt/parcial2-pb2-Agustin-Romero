package romero.agustin.pb2.p2.test;

import org.junit.Test;

public class TestParcial {

	@Test
	public void queSeExistaUnPlantelDeFutbol() {
		Club nuevo = new Club ("Argentina");
		Jugador jugador1 = new Jugador(41716163, "Lionel Messi", 34,10, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador2 = new Jugador(1, "Gonzalo Montiel", 22, 4, TipoDeRol.Defensor, EquipoJugador.Argentina);
		Jugador jugador3 = new Jugador(2, "Leandro Paredes", 34, 5, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador4 = new Jugador(3, "Lucas Quarta", 34, 2, TipoDeRol.MedioCampista, EquipoJugador.Argentina);
		Jugador jugador5 = new Jugador(4, "Sergio Ag�ero", 34, 9, TipoDeRol.Defensor, EquipoJugador.Argentina);
		Jugador jugador6 = new Jugador(5, "Rodrigo de Paul", 27, 7, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador7 = new Jugador(6, "Nicolas Tagliafico", 30 , 3, TipoDeRol.MedioCampista, EquipoJugador.Argentina);
		Jugador jugador8 = new Jugador(7, "Marcos Acu�a", 28 , 8, TipoDeRol.Defensor, EquipoJugador.Argentina);
		Jugador jugador9 = new Jugador(8, "Paulo Dybala", 24 , 30, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador10 = new Jugador(9, "Lautaro Martinez" ,25,31, TipoDeRol.MedioCampista, EquipoJugador.Argentina);
		Jugador jugador11 = new Jugador(10, "Angel Di Maria" ,33 ,34, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador12 = new Jugador(11, "Lionel Scaloni", 50, 34, TipoDeRol.DT, EquipoJugador.Argentina);
		
	}
}
