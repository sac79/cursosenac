import java.util.Scanner;

public class trocavalores {

    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);

        int A, B, C;

        System.out.println("Digite um numero para A");

        A = leitura.nextInt();

        System.out.println("Digite um numero para B");

        B = leitura.nextInt();
        C = A;
        A = B;
        B = C;

        System.out.println("O valor de A agora é " + A);

        System.out.println("O valor de B agora é " + B);

    }
}
