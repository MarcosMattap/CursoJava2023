package Fundamentos;

import java.util.Scanner;

public class AreaCircunferencia 
{
	public static void main(String[] args) 
	{
		double raio, area;
		final double PI;
		
		//PI*raio*raio
		PI= 3.14159;
		System.out.println("Informe o raio");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		raio = entrada.nextDouble();
		area = PI * raio * raio;
		System.out.println("A area é de: " + area);
	}
}
