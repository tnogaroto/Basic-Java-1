package fundamentos;



public class NotacaoPonto {
    public static void main(String[] args) {

       String s = "bom dia X";
       s=  s.toUpperCase();
       System.out.println(s);
       s = s.replace("X", "Senhora");
       System.out.println(s);
       s= s.concat(" !!!");
        System.out.println(s);

        System.out.println("leo".toUpperCase());

        String Y = "Bom dia X"
                .replace("X", "Gustavo").toUpperCase()
                .concat(" !!!");

        // tipos primitivos nao tem operador "."
        System.out.println(Y);
        var a = 3;
        System.out.println(a*7.5);



    }
}
