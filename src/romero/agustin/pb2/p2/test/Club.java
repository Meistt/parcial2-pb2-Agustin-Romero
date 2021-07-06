package romero.agustin.pb2.p2.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Club {
	
	private String nombre;
	private Set <Persona> equipo;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.equipo = new HashSet<>();
	}

	public void crearPlantel(Jugador jugadorNuevo) {
		equipo.add(jugadorNuevo);
	}

	public Integer getCantidadJugadores() {
		
		return equipo.size();
	}
	
	
}
