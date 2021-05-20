package logic;

public class Blog {
	
	public String Titulo;
	public String Cuerpo;
	public String MailAutor;
		
	Blog(String Titulo,String Cuerpo,String MailAutor){
		this.Cuerpo = Cuerpo;
		this.MailAutor = MailAutor;
		this.Titulo = Titulo;
	}
		
	void setTitulo(String Titulo){
		this.Titulo = Titulo;
	}
	void setCuerpo(String Cuerpo){
		this.Cuerpo = Cuerpo;
	}
	void setMailAutor(String MailAutor){
		this.MailAutor = MailAutor;
	}
	String getTitulo() {
		return this.Titulo;
	}
		
	String getCuerpo() {
		return this.Cuerpo;
	}
		
	String getMailAutor() {
		return this.MailAutor;
	}
	String getBlogsByAutor() {
		return this.MailAutor;
	}
}
