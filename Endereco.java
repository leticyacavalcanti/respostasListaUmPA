package listaUm;

public class Endereco {
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	public Endereco (String r, int n, String c, String b, String i, String e, String p) {
		this.rua = r;
		this.numero = n;
		this.complemento = c;
		this.bairro = b;
		this.cidade = i;
		this.estado = e;
		this.cep = p;
	}
	
	public String getRua () {
		return rua;
	}
	
	public int getNumero () {
		return numero;
	}
	
	public String getComplemento () {
		return complemento;
	}
	
	public String getBairro () {
		return bairro;
	}
	
	public String getCidade () {
		return cidade;
	}
	
	public String getEstado () {
		return estado;
	}
	
	public String getCep () {
		return cep;
	}
	
	public void setRua (String r) {
		this.rua = r;
	}
	
	public void setNumero (int n) {
		this.numero = n;
	}
	
	public void setComplemento (String c) {
		this.complemento = c;
	}
	
	public void setBairro (String b) {
		this.bairro = b;
	}
	
	public void setCidade (String i) {
		this.cidade = i;
	}
	
	public void setEstado (String e) {
		this.estado = e;
	}
	
	public void setCep (String p) {
		this.cep = p;
	}
	
	public String toString () {
		return "Rua: " + rua + "\nNúmero: " + numero + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCidade: "  + cidade + "\nEstado: " + estado + "\nCEP: " + cep;
	}
}
