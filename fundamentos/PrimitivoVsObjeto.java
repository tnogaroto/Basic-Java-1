package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {

        String s = new String("texto".toUpperCase());
        String s1 = s.toLowerCase();
        System.out.println(s + "  " + s1);


        int a = 123;
        System.out.println(a);

    }
}
