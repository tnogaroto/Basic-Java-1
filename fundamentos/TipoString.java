package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola Pessoal".charAt(4)); // o espaco ele conta como indice, começando pelo 0.
		
		String s = "Boa tarde";
		System.out.println(s.concat(" !!!"));
		System.out.println(s.startsWith("boa")); // para verificar se a string 
		//inicia com a sequencia marcada retornando um valor boleano.
		System.out.println(s.toLowerCase().startsWith("boa"));// aqui ele altera o valor de s de maiuscula 
		//para minuscula para depois fazer a comparação boleana.
		System.out.println(s.length()); // retorna o valor inteiro da quantidade de caracteres com espacos no meio.
		System.out.println(s.endsWith("dia")); // compara ultima frase.
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa TarDe")); // ignora a diferença das letras, maiusculas ou minusculas
		// mas nao o conteudo.
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.45F;
		
		
		System.out.println("Nome: " + nome + " " + sobrenome +
				"\nSalario: " + salario + "\nIdade: " + idade);
		
		System.out.printf("O senhor: %s %s tem %d e ganha R$ %.2f \n", 
				nome, sobrenome, idade, salario); // outro jeito de fazer o exemplo acima.
		
		String frase = String.format("O senhor: %s %s tem %d e ganha R$ %.2f", 
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		System.out.println("frase ".repeat(4)); // repetir
		System.out.println("Tiago".substring(2));
		
		
		
		
	}

}
