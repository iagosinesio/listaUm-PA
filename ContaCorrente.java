public class ContaCorrente {
	private int numConta;
	private double saldo;
	
	public ContaCorrente(int n, double s) {
		this.numConta = n;
		this.saldo = s;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	public void sacar(double saque) {
		this.saldo -= saque;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public String toString() {
		return "Número da Conta: " + numConta + "\nSaldo: R$ " + saldo;
	}
}
