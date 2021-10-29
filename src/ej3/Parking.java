package ej3;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Menu menu = new Menu(7, 10, 25, 30, 2, 8);

		int decision = -1;

		while(decision != 0) {
			menu.print();
			decision = entrada.nextInt();

			switch (decision) {
			case 1:
				menu.addMoto();
				break;

			case 2:
				menu.addTurismo();
				break;

			case 3:
				menu.addCamion();
				break;

			case 4:
				menu.removeMoto();
				break;

			case 5:
				menu.removeTurismo();
				break;

			case 6:
				menu.removeCamion();
				break;

			default:
				break;
			}
		}

		entrada.close();
	}

	static class Menu {
		// Motos
		int motos_ocupados;
		int motos_max;
		int motos_libres;

		// Turismos
		int turismos_ocupados;
		int turismos_max;
		int turismos_libres;

		// Camiones
		int camiones_ocupados;
		int camiones_max;
		int camiones_libres;

		public Menu(
				int motos_ocupados, int motos_max,
				int turismos_ocupados, int turismos_max,
				int camiones_ocupados, int camiones_max
				) {
			this.motos_ocupados = motos_ocupados;
			this.motos_max = motos_max;
			this.motos_libres = motos_max - motos_ocupados;

			this.turismos_ocupados = turismos_ocupados;
			this.turismos_max = turismos_max;
			this.turismos_libres = turismos_max - turismos_ocupados;

			this.camiones_ocupados = camiones_ocupados;
			this.camiones_max = camiones_max;
			this.camiones_libres = camiones_max - camiones_ocupados;
		}

		public void addMoto() {
			if(this.motos_ocupados + 1 <= this.motos_max) {
				++this.motos_ocupados;
				--this.motos_libres;
			}
			else System.out.println("\n\nNo hay más despacio\n\n");
		}

		public void addTurismo() {
			if(this.turismos_ocupados + 1 <= this.turismos_max) {
				++this.turismos_ocupados;
				--this.turismos_libres;
			}
			else System.out.println("\n\nNo hay más despacio\n\n");
		}

		public void addCamion() {
			if(this.camiones_ocupados + 1 <= this.camiones_max) {
				++this.camiones_ocupados;
				--this.camiones_libres;
			}
			else System.out.println("\n\nNo hay más despacio\n\n");
		}

		public void removeMoto() {
			if(this.motos_ocupados - 1 >= 0) {
				--this.motos_ocupados;
				++this.motos_libres;
			}
			else System.out.println("\n\nNo hay transporte\n\n");
		}

		public void removeTurismo() {
			if(this.turismos_ocupados - 1 >= 0) {
				--this.turismos_ocupados;
				++this.turismos_libres;
			}
			else System.out.println("\n\nNo hay transporte\n\n");
		}

		public void removeCamion() {
			if(this.camiones_ocupados - 1 >= 0) {
				--this.camiones_ocupados;
				++this.camiones_libres;
			}
			else System.out.println("\n\nNo hay transporte\n\n");
		}

		public void print() {
			System.out.println("PARKING ");
			System.out.println("=======");
			System.out.println();

			System.out.println("Vehículo    Ocupadas    Max    Libres");
			System.out.println("-------------------------------------");
			System.out.println("Moto           " + motos_ocupados + "         " + motos_max + "      " + motos_libres);
			System.out.println("Turismo        " + turismos_ocupados + "        " + turismos_max + "      " + turismos_libres);
			System.out.println("Camión         " + camiones_ocupados + "          " + camiones_max + "      " + camiones_libres);
			System.out.println("-------------------------------------");

			System.out.println();
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("-Entrada: Moto(1), Turismo(2), Camión(3)");
			System.out.println("-Salida: Moto(4), Turismo(5), Camión(6)");
			System.out.println("-Salir(0)");
		}
	}

}
