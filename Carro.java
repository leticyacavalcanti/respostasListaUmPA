package listaUm;

public class Carro {
	private String modelo;
	private String marca;
	private int ano; 
	private String placa;
	
	public Carro ( String m, String r, int a, String p) {
		this.modelo = m;
		this.marca = r;
		this.ano = a;
		this.placa = p;
	}
	
	public String getModelo () {
		return modelo;
	}
	
	public String getMarca () {
		return marca;
	}
	
	public int getAno () {
		return ano;
	}
	
	public String getPlaca () {
		return placa;
	}
	
	public void setModelo (String m) {
		this.modelo = m;
	}
	
	public void setMarca (String r) {
		this.marca = r;
	}
	
	public void setAno (int a) {
		this.ano = a;
	}
	
	public void setPlaca (String p) {
		this.placa = p;
	}
	
	public String toString () {
		return "Modelo: " + modelo + "\nMarca: " + marca + "\nAno: " + ano + "\nPlaca: " + placa;
	}
}


