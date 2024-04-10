public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setDia(int d) {
		this.dia = d;
	}
	
	public void setMes(int m) {
		this.mes = m;
	}
	
	public void setAno(int a) {
		this.ano = a;
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}
