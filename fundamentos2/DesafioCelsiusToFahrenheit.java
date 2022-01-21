package fundamentos2;

import java.util.Scanner;
import java.util.Locale;

public class DesafioCelsiusToFahrenheit {


    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite o valor em Celsius : ");
        double c = entry.nextDouble();

       double f = (c*9/5)+32;
       System.out.println(f);



    }
}
