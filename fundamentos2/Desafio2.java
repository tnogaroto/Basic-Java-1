package fundamentos2;

public class Desafio2 {

	public static void main(String[] args) {
		int a = 2 +3 *4;
		int b = (int) Math.pow(a, 3); // para elevar um resultado (numero a ser elevado, potencia). pode ser double.
		System.out.println(b);
		
		
		
		double y = (Math.pow(6*(3+2), 2))/(3*2);
		System.out.println(y); // feito
		
		
		double x = (Math.pow((((1-5)*(2-7))/2),2));
		System.out.println(x);
		
		
		double z = Math.pow(y-x, 3);
		System.out.println(z);
		
		double w = (z)/Math.pow(10, 3);
		System.out.println(w);
		
		
		double x1 = Math.pow((Math.pow(6*(3+2), 2))/(3*2) - (Math.pow((((1-5)*(2-7))/2),2)), 3)/Math.pow(10, 3);
		System.out.println(x1);
		
	
				

	}

}
