package romero.agustin.pb2.p2.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Club {
	
	private String nombre;
	private Set <Persona> equipo;
	private Map <Integer,Persona> partido;
	private Map <Persona, Integer> goles;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.equipo = new HashSet<>();
		this.partido = new HashMap <>();
		this.goles = new HashMap <>();
	}

	public String getNombre() {
		return nombre;
	}


	public void crearPlantel(Jugador jugadorNuevo) {
		equipo.add(jugadorNuevo);
	}

	public Integer getCantidadJugadores() {
		
		return equipo.size();
	}

	public Boolean jugarPartido(Integer numeroPartido, Persona jugadorArg, Persona jugadorCol) throws NoPuedeJugarPartido {
		EquipoJugador equipo1 = jugadorArg.getEquipo();
		EquipoJugador equipo2 = jugadorCol.getEquipo();
		Boolean seJuegaPartido= false;
		
		if(jugadorArg.getEquipo().equals(equipo1) && jugadorCol.getEquipo().equals(equipo2) ) {
			seJuegaPartido = true;
			this.partido.put(numeroPartido, jugadorArg);
			this.partido.put(numeroPartido, jugadorCol);
			return seJuegaPartido;
		}
		throw new NoPuedeJugarPartido();	
	}

	
	public void registrarGoles(Integer numeroPartido, Jugador jugadorGol, String dondeJuega, Integer minutoGol) throws JugadorNoEncontradoException {
		
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Club other = (Club) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	

	
	
	
}
