package ej7;

import java.util.Scanner;

public class Notas_alumnos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double suma_sistemas = 0;
		double suma_program = 0;
		double suma_bd = 0;
		double nota_max = -1;
		double nota_min = -1;
		
		System.out.print("Dime numero de alumnos: ");
		int alumnos = entrada.nextInt();
		
		for(int i = 1; i <= alumnos; i++) {
			
			System.out.println("\nAlumno nº" + i + ":\n");
			
			for(int j = 1; j <= 3; j++) {
				System.out.print("Sistemas nota " + j + ": ");
				double nota = entrada.nextDouble();
				suma_sistemas += nota;
				if(nota > nota_max) nota_max = nota;
				if(nota_min == -1 || nota < nota_min) nota_min = nota;
			}
			
			for(int j = 1; j <= 3; j++) {
				System.out.print("Program nota " + j + ": ");
				double nota = entrada.nextDouble();
				suma_program += nota;
				if(nota > nota_max) nota_max = nota;
				if(nota_min == -1 || nota < nota_min) nota_min = nota;
			}
			
			for(int j = 1; j <= 3; j++) {
				System.out.print("BD nota " + j + ": ");
				double nota = entrada.nextDouble();
				suma_bd += nota;
				if(nota > nota_max) nota_max = nota;
				if(nota_min == -1 || nota < nota_min) nota_min = nota;
			}
		}
		
		System.out.println("Media de todas notas: " + ((suma_sistemas + suma_program + suma_bd) / (alumnos * 9)));
		System.out.println("Media de sistemas: " + (suma_sistemas) / (alumnos * 3));
		System.out.println("Media de program: " + (suma_program) / (alumnos * 3));
		System.out.println("Media de bd: " + (suma_bd) / (alumnos * 3));
		System.out.println("La mejor nota: " + nota_max);
		System.out.println("La peor nota: " + nota_min);
		
		entrada.close();
	}

}
