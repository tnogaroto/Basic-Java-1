package fundamentos2;

import java.util.Objects;
import java.util.Scanner;

public class DesafiosLogicos {
    public static void main(String[] args) {
        
    	

        @SuppressWarnings("resource")
		Scanner entry = new Scanner(System.in);

        System.out.println("Responda com V para Verdadeiro e F para Falso: \n");
        System.out.println("Trabalhou na Terça?: ");
        String x = entry.nextLine();
       // System.out.println(x);
        System.out.println("\nTrabalhou na Quinta?: ");
        String y = entry.nextLine();
      //  System.out.println(y);

        if(Objects.equals(x, "V") && Objects.equals(y, "V")){
            System.out.println("Comprar TV 50 polegadas ");
        }if(Objects.equals(x, "F") && Objects.equals(y, "V")){
            System.out.println("Comprar TV 32 polegadas ");
        }if(Objects.equals(x, "V") && Objects.equals(y, "F")) {
            System.out.println("Comprar TV 32 polegadas ");

        }if(Objects.equals(x, "F") && Objects.equals(y, "F")) {
            System.out.println("Ficar em casa e Viver saudável");
        }else {
        	System.out.println("Opção invalida, responda novamente, com V ou F...");
        }
        
       




    }
}

