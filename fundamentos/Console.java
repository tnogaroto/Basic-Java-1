package fundamentos;

import java.util.Scanner;


public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom ");
		System.out.print("Dia ! \n"); // neste caso ele nao cria uma nova linha

		System.out.println("Bom");
		System.out.println("dia");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6); // %n serve como quebra
		// de linha

		System.out.printf("Salário: %.2f", 1_234.5678); //ele vai pegar somente uma casa decimal
		// e arredondar;
		System.out.printf("\nNome: %s ", "João");
		


		Scanner entrada = new Scanner(System.in); // in de entrada de dados via teclado.

		System.out.println("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("\n" + nome);

		System.out.println("Digite seu sobrenome: ");
		String snome = entrada.nextLine();

		System.out.println("Digite sua idade : "); // control d para duplicar
		int idade = entrada.nextInt();



		System.out.println("\nO Nome completo é: " + nome + " "+ snome + " e tem "
				+ idade + " anos");

		System.out.printf("\n %s %s tem %d anos.",
				nome, snome,idade); // outra forma mais bonita...

		entrada.close();






		
	}

}
