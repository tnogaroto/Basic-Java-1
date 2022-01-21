package fundamentos2;

import java.util.Scanner;

public class DesafioCalculadoraProfessor {
		
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        double num1 = entry.nextDouble();
        System.out.println("Informe outro numero: ");
        double num2 = entry.nextDouble();
        System.out.println("Informe a Operação: ");
        String op = entry.next();

        double resultado = "+".equals(op)? num1 + num2 : 0;
        resultado = "-".equals(op)? num1 - num2 : resultado;
        resultado = "*".equals(op)? num1 * num2 : resultado;
        resultado = "/".equals(op)? num1 / num2 : resultado;
        resultado = "%".equals(op)? num1 % num2 : resultado;
        







        System.out.printf("O Resultado de :  %.2f %s %.2f = %.2f \n" , num1, op, num2, resultado);
        entry.close();
    }
}
