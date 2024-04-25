import java.util.Scanner;

public class SomaQuadrado {
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

        System.out.println("Digite um numero para C");

        c = leitura.nextDouble();

        d = Math.pow((a + b + c), 2);

        System.out.println("O quadrado da soma é " + d);

    }
}
