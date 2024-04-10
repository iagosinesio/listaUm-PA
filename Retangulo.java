public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double b, double a) {
		this.base = b;
		this.altura = a;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double b) {
		this.base = b;
	}
	
	public void setAltura(double a) {
		this.altura = a;
	}
	
	public double calcularArea(double base, double altura) {
		return base * altura;
	}
	
	public double calcularPerimetro(double base, double altura) {
		return (2 * base) + (2 * altura);
	}
}
