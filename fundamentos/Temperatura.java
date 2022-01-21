package fundamentos;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		
		Scanner N = new Scanner(System.in);

		double F, C;
		final double X = 32.0, Y = 5.0 / 9.0;

		System.out.println("Digite o valor da temperatura em Fahrenheit:  ");
		F = N.nextDouble();

		System.out.println("A temperatura em Célcius é : " + (C =(F-X)*Y));

	}

}
