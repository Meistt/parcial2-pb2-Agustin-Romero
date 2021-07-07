package romero.agustin.pb2.p2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

public class TestParcial {

	@Test
	public void queSeExistaUnPlantelDeFutbol() {
		Club nuevo = new Club ("Argentina");
		
		Jugador jugador1 = new Jugador(41716163, "Lionel Messi", 34,10, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador2 = new Jugador(1, "Gonzalo Montiel", 22, 4, TipoDeRol.Defensor, EquipoJugador.Argentina);
		Jugador jugador3 = new Jugador(2, "Leandro Paredes", 34, 5, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador4 = new Jugador(3, "Lucas Quarta", 34, 2, TipoDeRol.MedioCampista, EquipoJugador.Argentina);
		Jugador jugador5 = new Jugador(4, "Sergio Agüero", 34, 9, TipoDeRol.Defensor, EquipoJugador.Argentina);
		Jugador jugador6 = new Jugador(5, "Rodrigo de Paul", 27, 7, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador7 = new Jugador(6, "Nicolas Tagliafico", 30 , 3, TipoDeRol.MedioCampista, EquipoJugador.Argentina);
		Jugador jugador8 = new Jugador(7, "Marcos Acuña", 28 , 8, TipoDeRol.Defensor, EquipoJugador.Argentina);
		Jugador jugador9 = new Jugador(8, "Paulo Dybala", 24 , 30, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador10 = new Jugador(9, "Lautaro Martinez" ,25,31, TipoDeRol.MedioCampista, EquipoJugador.Argentina);
		Jugador jugador11 = new Jugador(10, "Angel Di Maria" ,33 ,34, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador12 = new Jugador(11, "Lionel Scaloni", 50, 34, TipoDeRol.DT, EquipoJugador.Argentina);
		
		nuevo.crearPlantel(jugador1);
		nuevo.crearPlantel(jugador2);
		nuevo.crearPlantel(jugador3);
		nuevo.crearPlantel(jugador4);
		nuevo.crearPlantel(jugador5);
		nuevo.crearPlantel(jugador6);
		nuevo.crearPlantel(jugador7);
		nuevo.crearPlantel(jugador8);
		nuevo.crearPlantel(jugador9);
		nuevo.crearPlantel(jugador10);
		nuevo.crearPlantel(jugador11);
		nuevo.crearPlantel(jugador12);
		
		Integer cantidadEsperada = 12;
		
		assertEquals(cantidadEsperada, nuevo.getCantidadJugadores());
		
	}
	
	@Test
	public void queSePuedaJugarYRegistrarUnPartido() throws NoPuedeJugarPartido {
		Club nuevo = new Club ("Argentina");
		Club nuevo2 = new Club ("Colombia");
		
		Jugador jugador1 = new Jugador(41716163, "Lionel Messi", 34,10, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador2 = new Jugador(1, "Gonzalo Montiel", 22, 4, TipoDeRol.Defensor, EquipoJugador.Argentina);
		Jugador jugador3 = new Jugador(2, "Leandro Paredes", 34, 5, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador4 = new Jugador(3, "Lucas Quarta", 34, 2, TipoDeRol.MedioCampista, EquipoJugador.Argentina);
		
		Jugador jugador5 = new Jugador(6, "Nicolas Tagliafico", 30 , 3, TipoDeRol.MedioCampista, EquipoJugador.Colombia);
		Jugador jugador6 = new Jugador(7, "Marcos Acuña", 28 , 8, TipoDeRol.Defensor, EquipoJugador.Argentina);
		Jugador jugador7 = new Jugador(8, "Paulo Dybala", 24 , 30, TipoDeRol.Delantero, EquipoJugador.Argentina);
		Jugador jugador8 = new Jugador(9, "Lautaro Martinez" ,25,31, TipoDeRol.MedioCampista, EquipoJugador.Argentina);
		
		
		Boolean ve = true;
		Boolean vo= nuevo.jugarPartido(1, jugador1, jugador5);
		
		assertEquals(ve,vo);
		
	}
	
	@Test
	public void queSePuedaJugarUnTorneo() throws JugadorNoEncontradoException {
		
		Torneo nuevoTorneo = new Torneo ("Copa America");
		Club nuevo = new Club("Argentina");
		Club nuevo2 = new Club ("Colombia");
		Jugador jugador1 = new Jugador(41716163, "Lionel Messi", 34,10, TipoDeRol.Delantero, EquipoJugador.Argentina);
		nuevo.registrarGoles(25, jugador1, "Local");
	}
	
	

}
