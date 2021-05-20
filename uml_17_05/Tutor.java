package uml_17_05;

import java.util.ArrayList;

public class Tutor extends Usuario {
	
	private Usuario[] usuarios;
	
	public Tutor(String nombre, int ci) {
		super(nombre, ci);
		this.usuarios = new Usuario[200];
	}
}
