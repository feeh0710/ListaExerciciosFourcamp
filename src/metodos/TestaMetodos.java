package metodos;

import java.util.Scanner;

public class TestaMetodos {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Scanner ler = new Scanner(System.in);
		
		
		calculadora.soma(10,8);
		calculadora.subtracao(5,7);
		calculadora.divisao(6,5);
		calculadora.multiplicacao(5,6);
		
		
	}
}
