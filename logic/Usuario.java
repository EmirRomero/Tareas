package logic;

public class Usuario {
	
	String nombre;
	String mail;
	String contrase�a;
	int tipo;
	Usuario(String nombre,String mail,String contrase�a,int tipo){
		this.nombre = nombre;
		this.mail = mail;
		this.contrase�a = contrase�a;
		this.tipo = tipo;
	}

	public void setNombre(String Nombre){
		this.nombre = Nombre;
	}
	
	public void setMail(String Mail){
		this.mail = Mail;
	}
	
	public void setContrase�a(String Contrase�a){
		this.contrase�a = Contrase�a;
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
	String getContrase�a() {
		return this.contrase�a;
	}
	int getTipo() {
		return this.tipo;
	}
}

