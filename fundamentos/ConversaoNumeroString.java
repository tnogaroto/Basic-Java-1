package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 10_000;
        System.out.println(num1.toString().length()); // transforma o numeral em string,
        // para depois saber a quantidade de elementos

        int num2 = 100000; // se nao for integer tem que ser convertido para integer para depois string
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" +num2).length()); // outra forma nao usual.

        double x = 15.6;
        System.out.println(("" +x).length()); // dessa forma voce consegue converter
        // numeros com ponto flutuantes.


    }
}
