package listaUm;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;

	
	public Aluno (String n, String m, String c) {
		this.nome = n;
		this.matricula = m;
		this.curso = c;
	}
	
	public String getNome () {
		return nome;
	}
	
	public String getMatricula () {
		return matricula;
	}
	
	public String getCurso () {
		return curso;
	}
	
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setMatricula (String m) {
		this.matricula = m;
	}
	
	public void setCurso (String c) {
		this.curso = c;
	}
	
	public String toString () {
		return "Nome: " + nome + "\nMatrícula: " + matricula + "\nCurso: " + curso;a
	}
}
		
