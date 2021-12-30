package estudo;
import java.util.Iterator;

public class Exercicios3_lacos {
	static ExibeUtil util = new ExibeUtil();
	static String res = "";

	public static void main(String[] args) {
		while(true)
		{
			String opcao = util.lerConsole("SELECIONE O EXERCICIO:");
			switch (opcao) {
			case "1":
				System.out.print(exibirSequenciasNumeros());
				break;

			case "2":
				System.out.println(encontraNumerosPares());
				break;

			case "3":
				System.out.println(lerValorInteiro());
				break;

			case "4":
				System.out.println(lerIdades());
				break;

			case "5":
				System.out.println(ler10Numeros());
				break;

			case "6":
				System.out.println(buscaIntervalo());
				break;

			case "7":
				System.out.println(exiberHelloWorld());
				break;

			case "8":
				System.out.println(ler3Notas());
				break;

			case "9":
				System.out.println(exibeTabuada());
				break;

			case "10":
				System.out.println(lerNumero12a20());
				break;
				
				default:
					System.out.println(" NUMERO INCORRETO \n DIGITE UM NUMERO ENTRE 1 E 10");
			}
			int tipo = Integer.parseInt(util.lerConsole("\n\n(1-SIM 2-NÃO)\nFAZER NOVO EXERCICIO?"));
			if (tipo == 2) {
				break;
			}
			
		}
	}
//PERGUNTA 1
	private static String exibirSequenciasNumeros() {
		res = "";
		for (int i = 1; i <= 50; i++) {
			res += " "+i;
		}
		return res;
	}
//PERGUNTA 2
	private static String encontraNumerosPares() {
		res = "";
		for (int i = 1; i <= 100; i++) {
			if ((i % 2 ) == 0) {
				res+= " "+i;
			}
		}
		return res;
	}
//PERGUNTA 3
	private static String lerValorInteiro() {
		res = "";
		int valor = Integer.parseInt(util.lerConsole("DIGITE UM VALOR INTEIRO: "));
		for (int i = 1; i <= 10; i++) {
			res += "\n "+valor+" X "+i+" = "+(valor*i);
		}
		return res;
	}
//PERGUNTA 4
	private static String lerIdades() {
		res = "";
		int valor = Integer.parseInt(util.lerConsole("DIGITE A QUANTIDADE DE IDADES QUE DESEJA MAPEAR: "));
		double media = 0.0;
		
		for (int i = 1; i <= valor; i++) {
			 media += Double.parseDouble(util.lerConsole("DIGITE A "+i+"ª IDADE: "));
		}
		

		return "a media de "+valor+" idades é "+(media)/valor;
	}
// PERGUNTA 5
	private static String ler10Numeros() {
		String pares = "",impares = "";
		
		for (int i = 1; i <= 10; i++) {
			 int numero = Integer.parseInt(util.lerConsole("DIGITE O "+i+"º NÚMERO: "));
			 if((numero % 2) == 0)
			 {
				 pares += " "+numero;
			 }else {
				 impares += " "+numero;
			 }
		}
		return " NUMEROS PARES: "+pares+"\n NUMEROS IMPARES: "+impares;
	}
//PERGUNTA 6
	private static String buscaIntervalo() {
		String dentroIntervalo = "[",foraIntervalo = "[";
		for (int i = 1; i < 10; i++) {
			int numero = Integer.parseInt(util.lerConsole("DIGITE O "+i+"º NÚMERO: "));
			if(numero <= 20 && numero >= 10 )
			 {
				 dentroIntervalo += " "+numero;
			 }else {
				 foraIntervalo += " "+numero;
			 }
		}
		return " DENTRO DO INTERVALO: "+dentroIntervalo+" ]\n FORA DO INTERVALO: "+foraIntervalo+" ]";
	}
//PERGUNTA 7
	private static String exiberHelloWorld() {
		String helloWorldFor = "",helloWorldWhile = "";
		int cont = 1;
		for (int i = 1; i <= 10; i++) {
			helloWorldFor += "\n "+i;
		}
		while(cont <= 10)
		{
			helloWorldWhile += "\n "+cont;
			cont++;
		}
		return " HELLO WORLD COM FOR "+helloWorldFor+"\n HELLO WORLD COM WHILE"+helloWorldWhile;
	}
//PERGUNTA 8
	private static String ler3Notas() {
		double somaNotas = 0.0;
		
		for (int i = 1; i <= 3; i++) {
			somaNotas += Double.parseDouble(util.lerConsole("DIGITE A "+i+"ª NOTA: "));
		}
		if ((somaNotas / 3) < 6.0) {
			return "REPROVADO("+(somaNotas / 3)+")";
		}else return "APROVADO("+(somaNotas / 3)+")";
	}
//PERGUNTA 9
	private static String exibeTabuada() {
		res = "";
		int valor = Integer.parseInt(util.lerConsole("DIGITE UM VALOR INTEIRO: "));
		for (int i = 1; i <= 10; i++) {
			res += "\n "+valor+" X "+i+" = "+(valor*i);
		}
		return res;
	}
//PERGUNTA 10
	private static String lerNumero12a20() {
		int numero = 0;
		while(true) {
			numero = Integer.parseInt(util.lerConsole("DIGITE UM NUMERO(12 E 20): "));
			if (numero >= 12 && numero <= 20) {
				break;
			}else System.err.println("ENTRADA INVALIDA, DIGITE NOVAMENTE!");
		}
		
		return "DIGITOU "+numero;
	}
	
	
}
