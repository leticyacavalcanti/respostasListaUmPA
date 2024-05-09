package listaUm;

public class Cliente {
	private String nome;
	private String cpf; 
	private Data dataNascimento;
	
	
	public Cliente (String n, String c, Data d) {
		this.nome = n;
		this.cpf = c;
		this.dataNascimento = d;
	}	
		
	public String getNome () {
		return nome;
	}
	
	public String getCpf () {
		return cpf;
	}
	
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setCpf (String c) {
		this.cpf = c;
	}

	public void setDataNascimento (Data d) {
		this.dataNascimento = d;
	}
	
	public String toString () {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nData de nascimento: " + dataNascimento;
	}
}
	
	
