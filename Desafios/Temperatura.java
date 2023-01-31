package Desafios;

import java.util.Scanner;

public class Temperatura {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Infoeme a temperatura em faherenheit\n");
		Scanner entrada = new Scanner(System.in);
		double faherenheit = entrada.nextDouble();
		double C = (faherenheit - 32) * (5.0 / 9);
		System.out.println("\nA temperatura em °F convertida para °C é igual a: " + C);

		System.out.println("\nInforme a temperatura em °C\n");
		Scanner entrada2 = new Scanner(System.in);
		double Celcius = entrada2.nextDouble();
		double F = Celcius * 1.8 + 32;
		System.out.println("\nA temperatura em °C convertida para °F é de: " + F);
		System.out.println("");
	}
}
