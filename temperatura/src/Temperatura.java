import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Qual a temperatura da sua cidade?");

        a = leitura.nextDouble();

        if (a > 0) {
            b = a * 2;

            System.out.println("O dobro da temperatura da sua cidade é " + b);

        } else {

            c = a * 3;
            System.out.println("O triplo da temperatura da sua cidade é " + c);

        }
    }

}
