package logic;

public class Usuario {
	
	String nombre;
	String mail;
	String contraseña;
	int tipo;
	Usuario(String nombre,String mail,String contraseña,int tipo){
		this.nombre = nombre;
		this.mail = mail;
		this.contraseña = contraseña;
		this.tipo = tipo;
	}

	public void setNombre(String Nombre){
		this.nombre = Nombre;
	}
	
	public void setMail(String Mail){
		this.mail = Mail;
	}
	
	public void setContraseña(String Contraseña){
		this.contraseña = Contraseña;
	}
	
	public void setTipo(int Tipo){
		this.tipo = Tipo;
	}
	
	String getNombre(){
		return this.nombre;
		
	}
	String getMail() {
		return this.mail;
	}
	String getContraseña() {
		return this.contraseña;
	}
	int getTipo() {
		return this.tipo;
	}
}

