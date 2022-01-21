package fundamentos2;

import java.util.Scanner;
import java.util.Locale;

public class DesafioResolucao {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o Primeiro Salario: ");
		String valor1 = entrada.next().replace(",", ".");
		System.out.println("Informe o Segundo Salario: ");
		String valor2 = entrada.next().replace(",", ".");
		System.out.println("Informe o Teceiro Salario: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		System.out.println("A média de salários é : " + (salario1+salario2+salario3)/3);
		
		
		
		
		entrada.close();
	}

}
