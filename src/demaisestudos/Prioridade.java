package demaisestudos;

public enum Prioridade {
	MIN(10),NORMAL(5),MAX(1);
	
	private int valor;
	
	Prioridade(int valor){
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
