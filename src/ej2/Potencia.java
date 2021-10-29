package ej2;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime tu base: ");
		int base = entrada.nextInt();
		
		System.out.print("Dime tu exponente: ");
		int exp = entrada.nextInt();
		entrada.close();
		
		int result = 1;
		for(int i = 0; i < exp; i++) result *= base;
		
		System.out.println(result);
	}

}
