public class Circulo {
	private double raio;
	
	public Circulo(double r) {
		this.raio = r;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double r) {
		this.raio = r;
	}
	
	public double areaCirculo() {
		return 3.14 * (this.raio * this.raio);
	}
	
	public double perimetroCirculo(double r) {
		return 2 * 3.14 * this.raio;
	}
}
