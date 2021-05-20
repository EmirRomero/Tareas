package logic;
public class Main {
	public static void getBlogsByAutor(String mailAutor, Blog[] blogs) {
		
			for (int i = 0; i < blogs.length-1; i++) {
			if(blogs[i].getMailAutor().equalsIgnoreCase(mailAutor)) {
				System.out.println(blogs[i].getTitulo());
			}
			
		}
			getBlogsByAutor("juan@juan.com", blogs);
		}
		public static void main(String[] args) {
		
			
		String nombre;
		String mail;
		String contraseña;
		int tipo;
		
		Usuario[] usuarios = new Usuario[5];
		Blog[] blogs = new Blog[15];
		
		
		Usuario user1 = new Usuario("Juan", "juan@juan.com", "1234", 1);
		Usuario user2 = new Usuario("Carlos", "carlos@carlos.com", "1234", 2);
		Usuario user3 = new Usuario("Pedro", "pedro@pedro.com", "1234", 2);
		
		Blog blog1 = new Blog("Un dia mas en el universo","Es un libro muy bello, muy entretenido… o no...","juan@juan.com");
		Blog blog2 = new Blog("La divina comedia","Es un libro muy bello, habla del infierno segun Dante","carlos@carlos.com");
		Blog blog3 = new Blog("El hombre en busca de sentido","Es un libro muy bello, habla de que todos deberiamos tener un sentido de vida","carlos@carlos.com");
	
		}
		
		
		
		
}
	
	
	
	
	

