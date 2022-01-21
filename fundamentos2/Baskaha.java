package fundamentos2;

import java.util.Scanner;

public class Baskaha {
	public static void main(String[] args) {
		Scanner e = new Scanner (System.in);
		
		System.out.println("Digite o valor de a : ");
		int a = e.nextInt();
		System.out.println("Digite o valor de b : ");
		int b = e.nextInt();
		System.out.println("Digite o valor de c : ");
		int c = e.nextInt();
		
		int d = (int) ((Math.pow(b, 2)) - 4*a*c);
		System.out.println(d);
		int e1 = (int) Math.sqrt(d);
		System.out.println(e1);
		
		// valor
		
		int x = (-b + e1)/2*a;
		int x1 = (-b - e1)/2*a;
		
		System.out.println(x);
		System.out.println(x1);
		
		e.close();
		
	}

}
