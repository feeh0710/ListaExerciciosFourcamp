package estudo;

public class TestaSoma {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;

		while(contador <= 10)
		{
			total += contador;
			
			System.out.print(total+" ");
			contador++;
		}
	}

}
