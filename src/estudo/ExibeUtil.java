package estudo;
import java.util.Scanner;
public class ExibeUtil {
	// METODO QUE LÊ O CONSOLE E RETORNA UMA STRING(TEXTO)
	public String lerConsole(String texto) {
		Scanner ler = new Scanner(System.in);
		System.out.print(texto);
		String textoDigitado = ler.next();
		
		return textoDigitado;
		
	}

	// EXIBE TEXTO
	public void exibeTexto(String texto) {
		System.out.println(texto);
	}

	// METODO DE ORDENAÇÃO(BUBBLE SORT)
	public int[] bubbleSort(int vetor[]) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}
		return vetor;
	}
	
}
