package estudo;

import java.util.Arrays;

public class Vetores {
	static ExibeUtil util = new ExibeUtil();
	static String texto = "";

	public static void main(String[] args) {
		String opcao = util.lerConsole("SELECIONE O EXERCICIO DE VETORES:");
		switch (opcao) {
		case "1":
			System.out.println(calculaSoma5Num());
			break;

		case "2":
			System.out.println(exibeLista());
			break;

		case "3":
			System.out.println(calcula10Numeros());
			break;

		case "4":
			System.out.println(exibeParesImpares());
			break;
		}

	}
// EXERCICIOS 4,5 E 6
	private static String exibeParesImpares() {
		int[] pares = new int[10];
		int[] impares = new int[10];
		int contPar = 0, contImpar = 0;
		String textPar = "", textImpar = "";
		int res = 0;
		texto = "";
		for (int i = 0; i < 10; i++) {
			res = Integer.parseInt(util.lerConsole("DIGITE O " + (i + 1) + "º NUMERO: "));
			while (res == 0) {
				if (res == 0) {
					System.out.println("VOCE NÃO PODE DIGITAR 0, POR FAVOR ESCOLHA OUTRO NUMERO");
				}
				res = Integer.parseInt(util.lerConsole("DIGITE O " + (i + 1) + "º NUMERO: "));
			}
			if (res % 2 == 0) {
				pares[contPar] = res;
				textPar += " " + pares[contPar];
				contPar++;
			} else {
				impares[contImpar] = res;
				textImpar += " " + impares[contImpar];
				contImpar++;
			}
		}

		return " VETOR PARES: " + textPar + "\n VETOR IMPARES: " + textImpar;
	}

//EXERCICIO 3
	private static String calcula10Numeros() {
		int[] num = new int[10];
		int[] multiplicacao = new int[10];
		texto = "";
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(util.lerConsole("DIGITE O " + (i + 1) + "º NUMERO: "));
			multiplicacao[i] = num[i] * 5;
			texto += "\n " + num[i] + "  " + multiplicacao[i];
		}
		return texto;
	}

// EXERCICIO 2
	private static String exibeLista() {
		String[] nomes = new String[5];
		texto = "";
		for (int i = 0; i < 5; i++) {
			nomes[i] = util.lerConsole("DIGITE O " + (i + 1) + "º NOME: ");
		}
		for (int i = 4; i >= 0; i--) {
			texto += "\n" + (i + 1) + "º NOME DIGITADO FOI " + nomes[i];
		}
		return "OS NOMES DIGITADOS FORAM " + Arrays.toString(nomes) + "\n E A ORDEM INVERSA DOS NOMES SÃO..." + texto;
	}

//EXERCICIO 1
	private static String calculaSoma5Num() {
		int[] num = new int[5];
		int soma = 0;
		texto = "";
		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(util.lerConsole("DIGITE O " + (i + 1) + "º NUMERO: "));
			soma += num[i];
			texto += "\n" + (i + 1) + "º NUMERO DIGITADO FOI " + num[i];
		}
		return "A SOMA É " + soma + "\n E NUMEROS DIGITADOS..." + texto;
	}
}
