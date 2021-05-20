package uml_17_05;

public class Usuario {
	private String nombre;
	private int ci;
	
	Usuario(String nombre,int ci){
		this.nombre=nombre;
		this.ci=ci;
		}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setCi(int ci){
		this.ci = ci;
	}
	public String getNombre(String nombre) {
		return nombre;
	}
	public int getCi(int ci) {
		return ci;
	}
}
