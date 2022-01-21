package fundamentos2;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		System.out.println(a!=b);// comparação booleana
		System.out.println(a==b);
		
		System.out.println(3>4);
		System.out.println(3<4);
		
		System.out.println("____________\n");
		double nota = 6.7;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
		
		
	}

}
