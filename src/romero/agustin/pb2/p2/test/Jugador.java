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


}
