package fundamentos2;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		a ++; // incremento pos fixado.  a= a +1;
		a --;

		++b;
		--b; // decremento pre fixado, resultado so depois da operação.

		System.out.println(a);
		System.out.println(b);
		System.out.println("\nMini desafio");
		System.out.println(++a == b--); // no caso do b ele faz a comparacao para
		// depois o decremento
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}

}
