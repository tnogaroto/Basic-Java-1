package fundamentos2;

import java.util.Scanner;
import java.math.*;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner e = new Scanner (System.in);
		System.out.println("Digite a base: ");
		float a = e.nextFloat();
		System.out.println("Digite a altura: ");
		float b = e.nextFloat();
		
		System.out.println("A area é : " + (a*b)/2 + " cm2");
		
		
		
		e.close();
	}
	
	
	

}
