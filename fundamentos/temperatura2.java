package fundamentos;

public class temperatura2 {
	public static void main(String[] args) {
		
		final double FATOR = 5.0/9.0, AJUSTE = 32;
		double f, c;
		
		f= 45;
		c = (f-AJUSTE)*FATOR;
		System.out.println("O Resultado é: " + c);
		
		f= 0;
		c = (f-AJUSTE)*FATOR;
		System.out.println("O Resultado é: " + c);
	}

}
