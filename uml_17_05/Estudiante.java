package uml_17_05;

public class Estudiante extends Usuario {
	private String direccion;
	private Curso curso;
	
	public Estudiante(String nombre, int ci, String direccion) {
		super(nombre, ci);
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
