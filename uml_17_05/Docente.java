package uml_17_05;
import java.time.LocalDate;

public class Docente extends Usuario {
	private LocalDate fechaIngreso;
	private Materia materia;
	public Docente(String Nombre, int ci, LocalDate fechDate) {
		super(Nombre, ci);
		this.fechaIngreso=fechaIngreso;
		
		
	}
}
