package romero.agustin.pb2.p2.test;

public abstract class Persona {
	Integer dni;
	String nombre;
	Integer edad;
	
	public Persona (Integer dni, String nombre, Integer edad) {
		this.dni = dni;
		this.nombre= nombre;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	
}
