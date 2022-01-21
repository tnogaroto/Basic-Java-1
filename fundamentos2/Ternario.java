package fundamentos2;

public class Ternario {
    public static void main(String[] args) {

        double media = 9.6;

        String resultadoParcial = media >= 5.0 ? "Em recuperação" : "Reprovado";

        String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
        // modo de comparação de resultado
        // dentro da String = condicao ? "Verdadeiro" : "Falso".

        System.out.println("O Aluno esta: " + resultadoFinal);

        double nota = 6.7;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >=7;

        boolean temDesconto = bomComportamento && passouPorMedia;

        String resultado = temDesconto ? "sim" : "Não";

        System.out.println("Tem desconto? " + resultado);
    }
}
