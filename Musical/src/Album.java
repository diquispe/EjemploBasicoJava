
public class Album {
	public String titulo;
	public String autor;
	public String elnombre;
	public String otravariable;
	public float  precio;
	public String getTitulo() {
		return titulo;
	}
	
	//Generar Constructor para inicializar las variables
	
	public Album(String titulo, String autor,float precio) {
		this.setAutor(autor);
		this.setTitulo(titulo);
		this.setPrecio(precio);
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void imprimirAlbum() {
		System.out.println("El titulo del album es: " + this.titulo);
		System.out.println("El composito del album es: " + this.autor);
		System.out.println("El precio es: " + this.precio);
	}
	
}
