package listaUm;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	
	public Livro (String t, String a, String e, int p) {
		this.titulo = t;
		this.autor = a;
		this.editora = e;
		this.anoPublicacao = p;
	}
		
	public String getTitulo () {
		return titulo;
	}
	
	public String getAutor () {
		return autor;
	}
	
	public String getEditora () {
		return editora;
	}
	
	public int getAnoPublicacao () {
		return anoPublicacao;
	}
	
	public void setTitulo (String t) {
		this.titulo = t;
	}
	
	public void setAutor (String a) {
		this.autor = a;
	}

	
	public void setEditora (String e) {
		this.editora = e;
	}

	
	public void setAnoPublicacao (int p) {
		this.anoPublicacao = p;
	}

	
	public String toString () {
		return "Título: " + titulo + "\nAutor: " + autor + "\nEditora: " + "\nAno de publicação: " + anoPublicacao;
	}
}
