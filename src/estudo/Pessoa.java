package estudo;

public class Pessoa {
	
	double altura;
	int sexo;
	
	
	public Pessoa(double altura, int sexo) {
		this.altura = altura;
		this.sexo = sexo;
	}
	public Pessoa(int sexo) {
		this.sexo = sexo;
	}
	public String tipo() {
		if (sexo == 2) {
			return "é homem";
		} else {
			return "é mulher";
		}
		
	}
	
}
