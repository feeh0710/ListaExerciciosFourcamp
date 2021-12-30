package estudo;

public class TestaLaco {
	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println("TABUADA DO "+multiplicador);
			for (int contador = 1; contador <= 10; contador++) {
				System.out.print(multiplicador+" X "+contador+" = "+(multiplicador * contador));
			}
			System.out.println(" ########################### ");
			
		}
	}
}
