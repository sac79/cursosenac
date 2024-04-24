import java.util.Scanner;

public class AppDiferença {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        int A;
        int b;
        int diferença;

        System.out.println("Digite um valor para A");

        A = leitura.nextInt();

        System.out.println("Digite um valor para B");
        b = leitura.nextInt();

        diferença = A - b;

        System.out.println("Digite a diferença " + diferença);

    }
}
