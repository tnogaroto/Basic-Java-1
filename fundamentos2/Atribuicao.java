package fundamentos2;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		System.out.println(c);
		
		//c = c +b;
		c += b; // igual a funcao acima;
		System.out.println(c);
		
		c-= a;
		System.out.println(c);
		c*=b;
		System.out.println(c);
		c/=a;
		System.out.println(c);
		c%=2; // modulo 2
		System.out.println(c);
		c++; // acrescenta valor 1;
		System.out.println(c);
		c--;
		System.out.println(c);
		
	}

}
