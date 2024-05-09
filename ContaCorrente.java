package listaUm;

public class ContaCorrente {
	private int numeroDaConta;
	private double saldo;

	
	public ContaCorrente (int n, double s) {
		this.numeroDaConta = n;
		this.saldo = s;
	}
	
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
		
	public void setNumeroDaConta(int n) {
		this.numeroDaConta = n;
	}
	
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	
	public void depositar(double quantidade) {
		this.saldo += quantidade;
	}
	
	public void sacar(double quantidade) {
		this.saldo -= quantidade;
	}
	
	public String toString() {
		return "Número da conta: " + numeroDaConta + "\nSaldo: " + saldo; 
	}
}
	
	
