package metodos;

public class Calculadora {
	double resultado;
	
	
	public void soma(double num1, double num2) {
		resultado = num1 + num2;
		
		System.out.println(resultado);
	}
	public void subtracao(double num1, double num2) {
		resultado = num1 - num2;
		
		System.out.println(resultado);
	}
	public void divisao(double num1, double num2) {
		resultado = num1 / num2;
		
		System.out.println(resultado);
	}
	public void multiplicacao(double num1, double num2) {
		resultado = num1 * num2;
		
		System.out.println(resultado);
	}
}
