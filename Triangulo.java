package listaUm;

public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;

	public Triangulo (double a, double b, double c) {
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}
	
	
	public double getLadoA () {
		return ladoA;
	}
	
	public double getLadoB () {
		return ladoB;
	}
	
	public double getLadoC () {
		return ladoC;
	}
	
	public void setLadoA (double a) {
		this.ladoA = a;
	}
	
	public void setLadoB (double b) {
		this.ladoB = b;
	}
	
	public void setLadoC (double c) {
		this.ladoC = c;
	}
	
	
	public double calcularArea (double a, double b, double c) {
		return ( this.ladoA * this.ladoB ) / 2;
	}
	
	public double calcularPerimetro () {
		return ( this.ladoA + this.ladoB + this.ladoC );
	}
}
	
	

	
