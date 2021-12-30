package estudo;
import java.text.DecimalFormat;
import java.util.Arrays;

public class DesafioExtra {
	static ExibeUtil util = new ExibeUtil();
	static DecimalFormat formatado = new DecimalFormat("0.00");



	public static void main(String[] args) {
		//1.	Três candidatos concorreram a uma eleição (A, B, C). O usuário deve informar quantos votos cada candidato recebeu,
		//quantos foram os votos brancos e quantos foram os votos nulos. O algoritmo deve calcular e informar: o número total de eleitores,
		//o percentual de votos que cada candidato recebeu (em relação ao número total de eleitores), 
		//o percentual de brancos e o percentual de nulos
		
		while(true)
		{
			String opcao = util.lerConsole("SELECIONE O EXERCICIO:");
			switch (opcao) {
			case "1":
				System.out.print(calculaEleitores());
				break;

			case "2":
				System.out.println(calculaTentativas());
				break;

				default:
					System.out.println(" NUMERO INCORRETO \n DIGITE UM NUMERO ENTRE 1 E 2");
			}
			int tipo = Integer.parseInt(util.lerConsole("\n\n(1-SIM 2-NÃO)\nFAZER NOVO EXERCICIO?"));
			if (tipo == 2) {
				break;
			}
			
		}
	}
	//EXERCICIO 1
	private static String calculaEleitores() {
		String[] descricoes = {" DE VOTOS DO A: "," DE VOTOS DO B: ",
				" DE VOTOS DO C: "," DE VOTOS BRANCOS: "," DE VOTOS DO NULOS: "};
		
		double[] percentuais = new double[descricoes.length];
		double[] votos = new double[descricoes.length];
		
		int totalEleitores = 0;
		
		for (int i = 0; i < descricoes.length; i++) {
			votos[i] = Integer.parseInt(util.lerConsole(" DIGITE A QUANTIDADE"+descricoes[i]));
			totalEleitores+= votos[i];
		}
		for (int i = 0; i < descricoes.length; i++) {
			percentuais[i] = ((votos[i]*100)/totalEleitores);
			descricoes[i] = "PERCENTUAL"+descricoes[i]+formatado.format(percentuais[i])+"%";
			System.out.println(descricoes[i]);
		}
		//+Arrays.toString(descricoes)
		return "TOTAL VOTOS "+totalEleitores+"\n";
	}
//EXERCICIO 2
	private static String calculaTentativas() {
		String res = "";
		int numero = Integer.parseInt(util.lerConsole("DIGITE UM NUMERO: "));
		int cont = 1;
		
		while(true) {
			int chute = Integer.parseInt(util.lerConsole("CHUTE O NUMERO: "));
			if (chute < numero) {
				System.out.println("** CHUTOU BAIXO ***");
				cont++;
			}else if(chute > numero) {
				System.out.println("*** CHUTOU ALTO ***");
				cont++;
			}else {
				res = "\n*** ACERTOU!PARABENS! VOCÊ PRECISOU DE 2"+cont+" CHANCES***";
				break;
			}
			
		}
		return res;
	}
}
