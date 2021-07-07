package romero.agustin.pb2.p2.test;

public class NoPuedeJugarPartido extends Exception {
	public NoPuedeJugarPartido() {
		super("No se puede jugar partido");
	}
}
