import java.util.Scanner;

public class SomaMultipla {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);

        double a;
        double b;
        double c;
        double d;

        System.out.println("Digite um numero para A");

        a = leitura.nextDouble();

        System.out.println("Digite um numero para B");

        b = leitura.nextDouble();

        if (a == b) {
            c = a + b;

            System.out.println("A soma de A + B é " + c);
        }

        else {
            d = a * b;

            System.out.println("A multiplicação  de A X B é " + d);

        }

    }
}
