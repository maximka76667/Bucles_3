package ej1;

import java.util.Scanner;

public class Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime tu numero: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		String result = "";
		
		// Calculacion binario
		while(numero != 0) {
			result = Math.abs(numero % 2) + result;
			numero /= 2;
		}
		
		System.out.println(result.length() + " bits");
	}

}
