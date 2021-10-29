package ej4;

import java.util.Scanner;

public class Maquina_moneda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime tu cantidad: ");
		double cantidad = entrada.nextDouble();
		
		System.out.println("Monedas de 2 euros: " + (int)Math.floor(cantidad / 2));
		cantidad = Math.round(cantidad % 2 * 100.0) / 100.0;

		System.out.println("Monedas de 1 euros: " + (int)Math.floor(cantidad / 1));
		cantidad = Math.round(cantidad % 1 * 100.0) / 100.0;

		System.out.println("Monedas de 50 céntimos: " + (int)Math.floor(cantidad / 0.5));
		cantidad = Math.round(cantidad % 0.5 * 100.0) / 100.0;

		System.out.println("Monedas de 20 céntimos: " + (int)Math.floor(cantidad / 0.2));
		cantidad = Math.round(cantidad % 0.2 * 100.0) / 100.0;
		
		System.out.println("Monedas de 10 céntimos: " + (int)Math.floor(cantidad / 0.1));
		cantidad = Math.round(cantidad % 0.1 * 100.0) / 100.0;
		
		System.out.println("Monedas de 5 céntimos: " + (int)Math.floor(cantidad / 0.05));
		cantidad = Math.round(cantidad % 0.05 * 100.0) / 100.0;
		
		System.out.println("Monedas de 1 céntimo: " + (int)Math.floor(cantidad / 0.01));
		cantidad = Math.round(cantidad % 0.01 * 100.0) / 100.0;
		
		entrada.close();
	}

}
