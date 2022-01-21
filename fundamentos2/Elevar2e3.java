package fundamentos2;

import java.util.Scanner;


public class Elevar2e3 {
	public static void main(String[] args) {
		Scanner entry = new Scanner (System.in);
		System.out.println("Digite um número :");
		double a = entry.nextDouble();
		
		
		System.out.printf("O Quadrado do numero digitado é " + Math.pow(a,2));
		System.out.printf("\nO Cubo do numero digitado é " + Math.pow(a,3));
		
		
		
		entry.close();
	}
	
	
	

	

}
