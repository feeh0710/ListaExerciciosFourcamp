package estudoobjeto;

public class Util {
	public void ordenarValores(int[] vetor) {
	    int organizador;
	    int i;
	    for (i = 0; i < vetor.length; i++) {
	        for (int j = 0; j < vetor.length - 1; j++) {
	            if (vetor[j] > vetor[j + 1]) {
	                organizador = vetor[j];
	                vetor[j] = vetor[j + 1];
	                vetor[j + 1] = organizador;
	            }
	        }
	      
	    }
	    System.out.println(somaVetor(vetor));
	}
	private int somaVetor(int[] numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma+= numeros[i];
		}
		return soma;
	}

}
