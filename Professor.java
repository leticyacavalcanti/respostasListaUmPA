package listaUm;

public class Professor {
	private String nome;
	private String departamento;
	private String titulacao;

	public Professor (String n, String d, String t) {
		this.nome = n;
		this.departamento = d;
		this.titulacao = t;
	}
	
	public String getNome () {
		return nome;
	}
	
	public String getDepartamento () {
		return departamento;
	}
	
	public String getTitulacao () {
		return titulacao;
	}
	
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setDepartamento (String d) {
		this.departamento = d;
	}
	
	public void setTitulacao (String t) {
		this.titulacao = t;
	}
	
	public String toString () {
		return "Nome: " + nome + "\nDepartamento: " + departamento + "\nTitulação: " + titulacao;
	}
}
