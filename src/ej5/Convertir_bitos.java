package ej5;

import java.util.Scanner;

public class Convertir_bitos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final int b = 1000;

		System.out.print("Cantidad de origen: ");
		double cantidad_origen = entrada.nextDouble();

		entrada.nextLine();

		System.out.print("Unidad de origen (b/Byte/KB/MB/GB): ");
		String unidad_origen = entrada.nextLine();

		System.out.print("Unidad final (b/Byte/KB/MB/GB): ");
		String unidad_final = entrada.nextLine();
		entrada.close();

		double cantidad_final = 1;
		double multiplicador = b / 8;
		double divisor = b / 8;

		switch (unidad_origen) {
		case "Byte":multiplicador = b;break;
		case "KB":multiplicador = Math.pow(b, 2);break;
		case "MB":multiplicador = Math.pow(b, 3);break;
		case "GB":multiplicador = Math.pow(b, 4);break;
		}

		switch (unidad_final) {
		case "Byte":divisor = b;break;
		case "KB":divisor = Math.pow(b, 2);break;
		case "MB":divisor = Math.pow(b, 3);break;
		case "GB":divisor = Math.pow(b, 4);break;
		}

		cantidad_final = Math.floor(cantidad_origen * (multiplicador / divisor) * 1000000000.0) / 1000000000.0;

		System.out.println(cantidad_origen + " " + unidad_origen + " = " + cantidad_final + " " + unidad_final);

		}
	}