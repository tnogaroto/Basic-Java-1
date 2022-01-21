package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		double a = 4.5d;
		System.out.println(a);
		
		var b = 4.5; // pelo tipo de valor  ele vai inferir o tipo, ou interpretar
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		c = "outro texto";
		System.out.println(c);
		
		double d; // variavel
		d=123.65; // instanciou ou inicializada.
		System.out.println(d); // printada.
		
		var f = 12;
		//f = 12.0001;
		System.out.println(f);
		
	}

}
