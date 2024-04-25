import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("Digite um numero");

        a = leitura.nextDouble();

        b = a - 1;
        c = a + 1;

        System.out.println("Este é o sucessor " + c);

        System.out.println("Este é o antecessor " + b);
    }
}
