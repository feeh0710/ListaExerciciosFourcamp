package estudo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicios2 {
	static ExibeUtil util = new ExibeUtil();

	public static void main(String[] args) {

		String opcao = util.lerConsole("SELECIONE O EXERCICIO:");
		switch (opcao) {
		case "1":
			System.out.println(lerDoisValoresMedia());
			break;

		case "2":
			System.out.println(calculaIdadeVotacao());
			break;

		case "3":
			System.out.println(validaSenha());
			break;

		case "4":
			System.out.println(calculaMaças());
			break;

		case "5":
			System.out.println(calculaValInteiros());
			break;

		case "6":
			System.out.println(calculaPesoIdeal());
			break;

		case "7":
			System.out.println(identificaPoligono());
			break;

		case "8":
			System.out.println(identificaMaiorValor());
			break;

		case "9":
			System.out.println(identificaTriangulo());
			break;

		case "10":
			System.out.println(lerValorTriangulo());
			break;
		}
	}

	private static String lerValorTriangulo() {
		System.out.println(" Escreva um programa que leia o valor de 3 ângulos de um triângulo"
				+ " e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que: \r\n"
				+ "− Triângulo Retângulo: possui um ângulo reto. (igual a 90º) \r\n"
				+ "− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º) \r\n"
				+ "− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)\r\n"
				+ "");
		int[] valores = new int[3];
		valores[0] = Integer.parseInt(util.lerConsole("DIGITE O PRIMEIRO ANGULO: "));
		valores[1] = Integer.parseInt(util.lerConsole("DIGITE O SEGUNDO ANGULO: "));
		valores[2] = Integer.parseInt(util.lerConsole("DIGITE O TERCEIRO ANGULO: "));
		
		if (valores[0] == valores[1] && valores[0] == valores[2]) {
			return "É UM TRIANGULO RETANGULO";
		}else if (valores[0] > 90 || valores[1] > 90 || valores[2] > 90)
		{
			return "É UM TRIANGULO OBTUSANGULO  ";
		}else if(valores[0] < 90 && valores[1] < 90 && valores[2] < 90)
		{
			return "É UM TRIANGULO ACUTANGULO";
		}
		return "";
	}

	private static String identificaTriangulo() {
		util.exibeTexto(". Escreva um programa que leia as medidas dos lados"
				+ " de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que: \r\n"
				+ "− Triângulo Equilátero: possui os 3 lados iguais. \r\n"
				+ "− Triângulo Isóscele: possui 2 lados iguais. \r\n"
				+ "− Triângulo Escaleno: possui 3 lados diferentes. \r\n"
				+ "");
		int[] valores = new int[3];
		valores[0] = Integer.parseInt(util.lerConsole("DIGITE O PRIMEIRO LADO: "));
		valores[1] = Integer.parseInt(util.lerConsole("DIGITE O SEGUNDO LADO: "));
		valores[2] = Integer.parseInt(util.lerConsole("DIGITE O TERCEIRO NUMERO: "));
		
		if (valores[0] == valores[1] && valores[0] == valores[2]) {
			return "É UM TRIANGULO EQUILATERO";
		}else if ((valores[0] == valores[1] && valores[0] != valores[2]) || 
				(valores[1] == valores[2] && valores[1] != valores[2]) || (valores[2] == valores[0] && valores[2] != valores[1]))
		{
			
			return "É UM TRIANGULO ISOSCELES  ";
		}else if(valores[0] != valores[1] && valores[1] != valores[2] && valores[2] != valores[0])
		{
			return "É UM TRIANGULO ESCALENO";
		}
		return "";
		    
	}

	private static String identificaMaiorValor() {
		util.exibeTexto("Escreva um programa para ler 3 valores inteiros e escrever o maior deles."
				+ " Considere que o usuário não informará valores iguais");
		int[] valores = new int[3];
		valores[0] = Integer.parseInt(util.lerConsole("DIGITE O PRIMEIRO NUMERO: "));
		valores[1] = Integer.parseInt(util.lerConsole("DIGITE O SEGUNDO NUMERO: "));
		valores[2] = Integer.parseInt(util.lerConsole("DIGITE O TERCEIRO NUMERO: "));
		
		return "LISTA ORDENADA: "+util.bubbleSort(valores)[2];
	}

	private static String identificaPoligono() {
		util.exibeTexto("Escreva um programa para ler o número de lados de um polígono regular "
				+ "e a medida do lado (em cm). Calcular e imprimir o seguinte: \n"
				+ "− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área\r\n"
				+ "− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. \r\n"
				+ "− Se o número de lados for igual a 5 escrever PENTÁGONO. \r\n"
				+ "#####################################################################################"
				+ "Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso. \r\n"
				+ "− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. \r\n"
				+ "− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. \r\n"
				+ "");
		
		int ladosPoligono = Integer.parseInt(util.lerConsole("DIGITE A QTD DE LADOS DO POLIGONO: "));
		int centimetros = Integer.parseInt(util.lerConsole("DIGITE EM CM A MEDIDA: "));
		
		if (ladosPoligono == 3) {
			return "É UM TRIANGULO E A AREA É "+((centimetros*centimetros)/2);
		}else if (ladosPoligono == 4)
		{
			return "É UM QUADRADO E A AREA É "+(centimetros*centimetros);
		}else if (ladosPoligono == 5 & ladosPoligono == 3)
		{
			return "É UM PENTAGONO ";
		}else if(ladosPoligono < 3)
		{
			return "NÃO É POLIGONO";
		}else if(ladosPoligono > 5)
		{
			return "POLIGONO NÃO IDENTIFICADO";
		}
		return "";
	}

	private static String calculaPesoIdeal() {
		util.exibeTexto("Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1 :feminino, 2: masculino, "
				+ "construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas: - para homens:"
				+ " (72.7 * Altura) – 58 - para mulheres: (62.1 * Altura) – 44.7 ");
		double altura = Double.parseDouble(util.lerConsole("DIGITE A ALTURA: "));
		int sexo = Integer.parseInt(util.lerConsole("(1-MASCULINO|2-FEMININO) DIGITE E O SEXO: "));
		
		if (sexo == 2) {
			return "O PESO IDEAL DESTA MULHER É "+((72.7 * altura) - 58.0);
		} else {
			return "O PESO IDEAL DESTE HOMEM É "+((62.1 * altura) - 44.7);
		}
	}

	private static String calculaValInteiros() {
		util.exibeTexto("Escreva um programa para ler 3 valores inteiros (considere que não "
				+ "serão lidos valores iguais) e escrevê-los em ordem crescente");
		int[] valores = new int[3];
		valores[0] = Integer.parseInt(util.lerConsole("DIGITE O PRIMEIRO NUMERO: "));
		valores[1] = Integer.parseInt(util.lerConsole("DIGITE O SEGUNDO NUMERO: "));
		valores[2] = Integer.parseInt(util.lerConsole("DIGITE O TERCEIRO NUMERO: "));

		return "LISTA ORDENADA: "+Arrays.toString(util.bubbleSort(valores));
	}

	private static String calculaMaças() {
		util.exibeTexto("As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,"
				+ " e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o "
				+ "número de maçãs compradas, calcule e escreva o valor total da compra");
		String qtdMaças = util.lerConsole(" DIGITE A QTD DE MAÇAS: ");
		return "";
	}

	private static String validaSenha() {
		util.exibeTexto("Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. "
				+ "A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: "
				+ "ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida");

		String senha = util.lerConsole(" DIGITE SUA SENHA: ");
		if (senha == "1234") {
			return "ACESSO PERMITIDO";
		} else
			return "ACESSO NEGADO";
	}

	private static String calculaIdadeVotacao() {
		util.exibeTexto("Escreva um programa para ler"
				+ " o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano "
				+ "(não é necessário considerar o mês em que ela nasceu)");

		String anoNascimento = util.lerConsole(" DIGITE O ANO DE NASCIMENTO: ");
		if (Integer.parseInt(anoNascimento) <= 2003) {
			return "VOCE PODE VOTAR EM 2021";
		} else
			return "VOCE NÃO PODE VOTAR ESTE ANO";
	}

	private static String lerDoisValoresMedia() {
		util.exibeTexto(
				" Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles. ");

		String valor1 = util.lerConsole(" DIGITE O VALOR 1: ");
		String valor2 = util.lerConsole(" DIGITE O VALOR 2: ");

		if (Integer.parseInt(valor1) > Integer.parseInt(valor2)) {
			return "VALOR 1 É MAIOR (" + valor1 + ")";
		} else
			return "VALOR 2 É MAIOR (" + valor2 + ")";
	}

}
