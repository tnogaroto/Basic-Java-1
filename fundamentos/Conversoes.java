package fundamentos;

public class Conversoes {
    public static void main(String[] args) {
        double a = 1;
        System.out.println(a);

        float b = (float) 1.12345; // ou assim ou 1.12345F. // conversao explicita pelo cast.
        System.out.println(b);

        int c = 130; // java analisa tipos e nao valores.
        byte d = (byte) c; // somente pos conversão explicita ele aceita, dentro dos limites de
        // cada um.

        System.out.println(d);

        double e = 1;
        int f = (int) e; // para menores para maiores ok.
        System.out.println(f);
    }
}
