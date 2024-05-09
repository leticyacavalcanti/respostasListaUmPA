package listaUm;

public class Disciplina {
	private String nome;
	private String codigo;

	public Disciplina (String n, String c) {
		this.nome = n;
		this.codigo = c;
	}
	
	public String getNome () {
		return nome;
	}

	public String getCodigo () {
		return codigo;
	}
	
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setCodigo (String c) {
		this.codigo = c;
	}
	
	public String toString () {
		return "Nome: " + nome + "\nCódigo: " + codigo;
	}
}
