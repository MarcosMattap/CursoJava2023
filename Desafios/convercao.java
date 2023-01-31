package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class convercao
{
	public static void main(String[] args) 
	{
		Locale.setDefault(new Locale("en", "US"));
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nInforme o Primeiro salário:\n ");
		String valor1 = entrada.next();	
		System.out.println("\nInforme o segundo salário: \n");
		String valor2 = entrada.next();
		System.out.println("\nInforme o terceiro salário: \n");
		String valor3 = entrada.next();
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("\nA média de salário é " + media);
		
		
		
		
		entrada.close();
	}
}
