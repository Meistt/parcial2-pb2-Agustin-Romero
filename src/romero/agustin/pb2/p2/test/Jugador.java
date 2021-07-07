package romero.agustin.pb2.p2.test;

public class Jugador extends Persona{
	private TipoDeRol tipo;
	private EquipoJugador equipo;
	private Integer numeroCamiseta;
	
	public Jugador(Integer dni, String nombre, Integer edad, Integer numeroCamiseta, TipoDeRol tipo, EquipoJugador equipo) {
		super(dni, nombre, edad);
		this.tipo = tipo;
		this.equipo = equipo;
		this.numeroCamiseta = numeroCamiseta;
	}

	
	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}


	public EquipoJugador getEquipo() {
		return equipo;
	}

	public void setEquipo(EquipoJugador equipo) {
		this.equipo = equipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((equipo == null) ? 0 : equipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (equipo != other.equipo)
			return false;
		return true;
	}

	

}
