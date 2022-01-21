package fundamentos2;

public class DesafiosLogicosResolucao{
    public static void main(String[] args) {
        boolean tra1 = false;
        boolean tra2 = false;

        boolean comprouTV50 = tra1 && tra2;
        boolean comprouTV32 = tra1 ^ tra2; // um o outro XOR
        boolean comprouSorvete = tra1 || tra2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete\"? " + comprouSorvete);
        System.out.println("Mais Saudavel\"? " + maisSaudavel);





    }




}
