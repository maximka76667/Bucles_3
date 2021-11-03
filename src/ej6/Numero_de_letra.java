package ej6;

import java.util.Scanner;

public class Numero_de_letra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Tu número: ");
		int numero = entrada.nextInt();

		int diecimil = numero / 10000;
		numero -= diecimil * 10000;

		int mil = numero / 1000;
		numero -= mil* 1000;

		int ciento = numero / 100;
		numero -= ciento * 100;

		int diez = numero / 10;
		numero -= diez * 10;

		int unidad = numero;

		System.out.println(
			convertToLetters(Integer.toString(diecimil), true) + (convertToLetters(Integer.toString(diecimil), true) != "" ? " y " : "") + 
			convertToLetters(Integer.toString(mil), false) + " mil " + 
			convertToLetters(Integer.toString(ciento), false) + "cientos " +
			convertToLetters(Integer.toString(diez), true) + (convertToLetters(Integer.toString(diez), true) != "" ? " y " : "") +
			convertToLetters(Integer.toString(unidad), false)
		);

		entrada.close();
	}

	public static String convertToLetters(String i, boolean esDiez) {
		if(!esDiez) {
			switch (i) {
			case "1": return "uno";
			case "2": return "dos";
			case "3": return "tres";
			case "4": return "cuatro";
			case "5": return "cinco";
			case "6": return "seis";
			case "7": return "siete";
			case "8": return "ocho";
			case "9": return "nueve";
			default: return "";
			}
		} else {
			switch (i) {
			case "1": return "diez";
			case "2": return "veinte";
			case "3": return "treinta";
			case "4": return "cuarenta";
			case "5": return "cincuenta";
			case "6": return "sesenta";
			case "7": return "setenta";
			case "8": return "ochenta";
			case "9": return "noventa";
			default: return "";
		}
	}
}
}