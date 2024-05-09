package listaUm;

public class Animal {
	private String nome;
	private String tipo;
	private boolean som;
	
	public Animal (String n, String t) {
		this.nome = n;
		this.tipo = t;
	}
		
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
		
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setTipo (String t) {
		this.tipo = t;
	}
	
	
	public void emitirSom() {
		this.som = true;
	}
	
	
}
