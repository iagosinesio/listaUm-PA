public class DataHora {
	private Data d;
	private Hora h;
	
	public DataHora(Data d, Hora h) {
		this.d = d;
		this.h = h;
	}
	
	public void setData(Data d) {
		this.d = d;
	}
	
	public void setHora(Hora h) {
		this.h = h;
	}
	
	public String imprimirDataHora() {
		return d.imprimirData() + "\n" + h.imprimirHora();
	}
}
