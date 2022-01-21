package fundamentos2;

import java.util.Scanner;
import java.math.BigDecimal;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler2 numeros e operacao

		Scanner entry = new Scanner(System.in);

		System.out.println("Digite o Primeiro Número : ");
		Double a = entry.nextDouble();
		System.out.println("Digite o Segundo Número : ");
		Double b = entry.nextDouble();
		System.out.println("Digite a operacao (+ ; -; *; / : ");
		String c = entry.next();

		switch (c){
			case "+" :
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*" :
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
			case "%":
				System.out.println(a%b);
				break;


		}
		entry.close();
	}

}
