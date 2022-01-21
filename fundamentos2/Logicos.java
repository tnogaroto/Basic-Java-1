package fundamentos2;

public class Logicos {
    public static void main(String[] args) {
            boolean condicao1 = true;
            boolean condicao2 = 3 > 7;

            System.out.println(condicao1 && condicao2);
            System.out.println(condicao1 || condicao2);
            System.out.println(condicao1^condicao2); // ou exclusivo.
            System.out.println(!condicao1);
            System.out.println(!condicao2);


        System.out.println("\nTabela Verdade E");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("\nTabela Verdade OU");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("\nTabela Verdade OU Exclusivo XOR");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);


        System.out.println("\nTabela Verdade Negação");
        System.out.println(!true);
        System.out.println(!false);

    }
}
