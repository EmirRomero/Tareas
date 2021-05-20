package uml_17_05;

public class Curso {
	
	private String nombre;
	private Materia[] materias;
	
	Curso(String nombre){
		this.nombre = nombre;
		this.materias = new Materia[17];
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
