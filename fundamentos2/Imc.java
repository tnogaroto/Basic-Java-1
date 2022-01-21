package fundamentos2;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner Entry = new Scanner (System.in);
		
		System.out.println("Entre com a Altura :");
		double a = Entry.nextDouble();
		System.out.println("Entre com o peso :");
		double b = Entry.nextDouble();
		
		double c = b /(a*a);
		
		System.out.println("O imc é :  "+ c);
		Entry.close();
		
	}

}
