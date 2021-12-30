package estudo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vetores2 {
	private static ExibeUtil util = new ExibeUtil();

	public static void main(String[] args) {
		String opcao = util.lerConsole("SELECIONE O EXERCICIO DE VETORES:");
		switch (opcao) {
		case "1":
			System.out.println(exercicio1());
			break;

		case "2":
			System.out.println(exercicio2());
			break;

		case "3":
			System.out.println(exercicio3());
			break;

		case "4":
			System.out.println(exercicio4());
			break;
		case "5":
			System.out.println(exercicio5());
			break;

		case "6":
			System.out.println(exercicio6());
			break;

		case "7":
			System.out.println(exercicio7());
			break;

		case "8":
			System.out.println(exercicio8());
			break;
		}
	}

	private static String exercicio8() {
		int[] idade = new int[5];
		double[] altura = new double[5];
		String retornoInverso = "";
		
		for (int i = 0; i < 5; i++) {
			idade[i] = Integer.parseInt(util.lerConsole("DIGITE A IDADE DA "+(i+1)+"ª PESSOA: "));
			altura[i] = Double.parseDouble(util.lerConsole("DIGITE A ALTURA DA "+(i+1)+"ª PESSOA: "));
		}
		for (int i = 4; i >= 0; i--) {
			retornoInverso += i+"ª IDADE:"+idade[i]+"\n"+i+"ª ALTURA"+altura[i];
		}
		
		return "IDADE:"+Arrays.toString(idade)+"| ALTURA:"+Arrays.toString(altura)+"\n IDADE E ALTURA INVERTIDAS"+retornoInverso;
	}

	private static String exercicio7() {
		int[] numeros = new int[5];
		int soma = 0, multiplicacao = 1;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(util.lerConsole("DIGITE O " + (i + 1) + "º NUMERO: "));
			soma += numeros[i];
			multiplicacao *= numeros[i];
		}
		return " NUMEROS: " + Arrays.toString(numeros) + "\n SOMA: " + soma + "\n MULTIPLICAÇAO: " + multiplicacao;
	}

	private static String exercicio6() {
		int contMedias = 0;
		for (int contAluno = 0; contAluno < 2; contAluno++) {
			Aluno aluno = new Aluno();
			for (int contNota = 0; contNota < 4; contNota++) {
				aluno.notas[contNota] = Integer.parseInt(
						util.lerConsole("DIGITE A " + (contNota + 1) + "ª NOTA DO " + (contAluno + 1) + "º ALUNO: "));
				if (contNota == 3) {
					if (aluno.calculaMedia() >= 7.0) {
						contMedias++;
					}
				}
			}
			System.out.println("\n");
		}

		return " QUANTIDADE DE ALUNOS COM MEDIA SUPERIOR OU IGUAL A 7.0: " + contMedias;
	}

	private static String exercicio5() {
		List<Integer> numeros = new ArrayList<>();
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			numeros.add(Integer.parseInt(util.lerConsole("DIGITE O " + (i + 1) + "º NUMERO: ")));
			if (numeros.get(i) % 2 == 0) {
				pares.add(numeros.get(i));
			} else
				impares.add(numeros.get(i));
		}
		return " TODOS OS NUMEROS: " + numeros + "\n NUMEROS PARES: " + pares + "\n NUMEROS IMPARES: " + impares;
	}

	// EXERCICIO 4
	private static String exercicio4() {
		char[] caracteres = new char[10];
		String consoantes = "";
		for (int i = 0; i < caracteres.length; i++) {
			char caracter = util.lerConsole("DIGITE O " + (i + 1) + "º CARACTER: ").toUpperCase().charAt(0);
			if (caracter != 'A' && caracter != 'E' && caracter != 'I' && caracter != 'O' && caracter != 'U') {
				consoantes += " " + caracter;
			}
		}
		return consoantes;
	}

// EXERCICIO 3
	private static String exercicio3() {
		int[] notas = new int[4];
		double media = 0.0;

		for (int i = 0; i < notas.length; i++) {
			notas[i] = Integer.parseInt(util.lerConsole("DIGITE A " + i + "ª NOTA: "));
			media += notas[i];
		}
		media = media / 4;

		return "A MÉDIA É " + media;
	}

// EXERCICIO 2
	private static String exercicio2() {
		int[] numeros = new int[10];
		String inverso = "";

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(util.lerConsole("DIGITE O " + (i + 1) + " NUMERO: "));
		}
		for (int i = 9; i >= 0; i--) {
			inverso += numeros[i] + ", ";
		}
		return " NUMEROS DIGITADOS: " + Arrays.toString(numeros) + "\n NUMEROS INVERSOS: " + inverso;
	}

// EXERCICIO 1
	private static String exercicio1() {
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(util.lerConsole("DIGITE O " + (i + 1) + " NUMERO: "));
		}

		return "NUMEROS DIGITADOS: " + Arrays.toString(numeros);
	}

}

//CLASSE DO EXERCICIO 5
class Aluno {
	int notas[] = new int[4];
	double media = 0;

	// COMPLEMENTO EXERCICIO 5
	public double calculaMedia() {
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		media = media / 4;
		return media;
	}
}

