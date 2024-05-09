package listaUm;

public class Empresa {
	private String nome;
	private String cnpj;

	public Empresa (String n, String c) {
		this.nome = n;
		this.cnpj = c;
	}
	
	public String getNome () {
		return nome;
	}
	
	public String getCnpj () {
		return cnpj;
	}

	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setCnpj (String c) {
		this.cnpj = c;
	}
	
	public String toString () {
		return "Nome: " + nome + "\nCNPJ: " + cnpj;
	}
}
