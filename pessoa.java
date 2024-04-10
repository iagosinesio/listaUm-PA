public class Pessoa {
	private String nome;
	private double altura;
	
	public Pessoa(String n, double a) {
		this.nome = n;
		this.altura = a;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setAltura(double a) {
		this.altura = a;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nAltura: " + altura;
	}
}
