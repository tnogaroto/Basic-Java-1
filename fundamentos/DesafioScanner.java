package fundamentos;

import java.util.Scanner;
import java.util.Locale;


public class DesafioScanner {
	public static void main(String[] args) {
		
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Digite o anti-penultimo salário : ");
		String x = entrada.nextLine();
		
		
		
		System.out.println("Digite o penultimo salário : ");
		String y = entrada.nextLine();

		System.out.println("Digite o ultimo salário : ");
		String z = entrada.nextLine();
		
		
		
		
		

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		double a = Double.parseDouble(x);
		double b = Double.parseDouble(y);
		double c = Double.parseDouble(z);
		
	
		
		System.out.println("A média de salários é: " + (a+b+c)/3);
		
		
		
		
		
		entrada.close();
		
	}


	}


