package estudo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicios1 {
	static ExibeUtil util = new ExibeUtil();
	
	public static void main(String[] args) {
		String opcao = util.lerConsole("SELECIONE O EXERCICIO:");
		switch (opcao) {
		case "1":
			System.out.println(calculaTemperatura());
			break;

		case "2":
			System.out.println(calcularPessoas());
			break;
			
		case "3":
			System.out.println(calculaMediaSalario());
			break;

		case "4":
			System.out.println(calculaMedidasParede());
			break;
			
		case "5":
			System.out.println(calculaVolumeLataOleo());
			break;

		case "6":
			System.out.println(calculaQtdCavalos());
			break;
		}
		
		
	}
	public static String calculaTemperatura() {
		
		util.exibeTexto("Escreva um programa que, com base em uma temperatura em graus celsius,"
				+ " a converta e exiba em Kelvin (K),"
				+ " Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: "
				+ "F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67");
		
		double celsius = 25.0,kelvin = 0.0,reamur = 0.0, rankine = 0.0, fahrenheit = 0.0;
		
		kelvin = celsius * 273.15;
		reamur = celsius * 0.8;
		rankine = celsius * 1.8+32+459.67;
		fahrenheit = celsius * 1.8;
		
		return " C "+celsius+"\n F "+fahrenheit+"\n K "+kelvin+"\n Re "+reamur+" \n Ra "+rankine;
	}
	private static String calcularPessoas() {
		util.exibeTexto("Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 5 pessoas."
				+ " Fazer um algoritmo que calcule e escreva:\r\n"
				+ "a. a maior e a menor altura do grupo;\r\n"
				+ "b. média de altura dos homens;\r\n"
				+ "c. o número de mulheres.\r\n"
				+ "");
		
		double somaAlturaHomens = 0.0;
		double mediaAlturaHomens = 0.0;
		int contadorMasculino = 0, contadorFeminino = 0;
		double alturaMaior = 0.0, alturaMenor = 0.0;
		
		// sexo 1=m 2=f
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(1));
		pessoas.add(new Pessoa(1.80,1));
		pessoas.add(new Pessoa(1.50,2));
		pessoas.add(new Pessoa(1.60,2));
		pessoas.add(new Pessoa(1.70,1));
		pessoas.add(new Pessoa(1.98,1));
		
	
		
		for (int i = 0; i < pessoas.size(); i++) {
			if(alturaMaior < pessoas.get(i).altura) alturaMaior = pessoas.get(i).altura;
			else if (alturaMenor == 0.0) alturaMenor = pessoas.get(i).altura;
			else if	(alturaMenor > pessoas.get(i).altura) alturaMenor = pessoas.get(i).altura;
			
			// IDENTIFICA O SEXO
			if (pessoas.get(i).sexo == 1) {
				somaAlturaHomens += pessoas.get(i).altura;
				contadorMasculino++;
			}
			else contadorFeminino++;
		}
		mediaAlturaHomens = somaAlturaHomens/contadorMasculino;
		return " MEDIA "+mediaAlturaHomens+"\n QTD MULHERES "+contadorFeminino+"\n ALTURA MAIOR "+alturaMaior+"\n ALTURA MENOR "+alturaMenor;
	}
	private static String calculaMediaSalario() {
		util.exibeTexto("Criar um programa que calcule a média de salários de uma empresa, "
				+ "pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.");
		
		double mediaSalarios = 0.0,somaSalarios = 0.0;
		ArrayList<Double> salarios = new ArrayList<Double>();
		salarios.add(1500.00);
		salarios.add(1000.00);
		salarios.add(4500.00);
		salarios.add(5500.00);
		salarios.add(900.00);
		
		for (int i = 0; i < salarios.size(); i++) {
			somaSalarios += salarios.get(i);
		}
		mediaSalarios = somaSalarios / salarios.size();
		
		return " QUANTIDADE DE SALARIOS "+salarios.size()+"\n A MEDIA SALARIAL É "+mediaSalarios;
	}
	private static String calculaMedidasParede() {
		util.exibeTexto("Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) "
				+ "precisa ser coberta por azulejos também retangulares."
				+ " O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). "
				+ "Escreva um programa que leia as quatro medidas hp, lp, ha e la, "
				+ "calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.");
		
		double hp = 8.5, lp = 12.5, ha = 1.1, la = 0.8;
		
		
		
		
		return "QUANTIDADE DE AZULEJOS "+((hp * lp) / (ha * la));
	}
	
	private static String calculaQtdCavalos() {
		util.exibeTexto("Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A,"
				+ " em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.\r\n"
				+ "Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis "
				+ "de altura e de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, "
				+ "exibir na tela uma mensagem contendo o resultado do volume encontrado.\r\n"
				+ "");
		
		double raio = 3.2,volume = 0.0,area = 4.5;
		volume = 3.14159 * raio * raio * area;
		return "O VOLUME É "+volume;
	}
	private static String calculaVolumeLataOleo() {
		util.exibeTexto("Escreva um programa para determinar a quantidade de cavalos necessários "
				+ "para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos. "
				+ "Considere cavalos = (m * h / t) / 745,6999");
		double m = 25.0, h = 2.2, t = 1.4, cavalos = 0.0;		
		cavalos = (m * h / t) / 745.6999;
		return "QUANTIDADE DE CAVALOS NECESSARIOS É "+cavalos;
	}
	
	
	
	
}
