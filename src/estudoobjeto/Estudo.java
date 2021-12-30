package estudoobjeto;

import java.util.Arrays;
import java.util.Scanner;

public class Estudo {
	public static void main(String[] args) {
		Util util = new Util();
		int ordena[] = {9,1,2,5,8,10,3,4,6,7};
		util.ordenarValores(ordena);
		System.out.println(Arrays.toString(ordena));
		System.out.println("HASH "+ordena);
		
		
	}
	
}
