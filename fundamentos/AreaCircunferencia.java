package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		//System.out.println(2+3);
		double raio = 3.4;
		final double PI = 3.14159; // quando coloca final o valor nao pode ser sobre escrito
		// na memoria
		
		
		
		
		double area = PI * (raio*raio);
		
		System.out.println(area);
		
		raio = 9; // ele sobrepoe o valor do raio e area pois nao esta em final
		area = PI * raio * raio;
		System.out.println(" A area é igual =  " + area + " m2");
		
		
	}

}
