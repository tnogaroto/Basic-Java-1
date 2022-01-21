package fundamentos2;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);
        String S2 = entrada.nextLine(); // next tira os espaços em branco, ja o nextline nao.
        System.out.println(S2);
        System.out.println("2" == S2.trim());//trim tira os espacos em branco
        System.out.println("2".equals(S2.trim())); // para string sempre use equals


        entrada.close();
    }
}
