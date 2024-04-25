import java.util.Scanner;

public class BisSexto {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Digite o ano do seu nascimento e descubra se ele é Bissexto");

        a = leitura.nextDouble();

        if (a % 4 == 0 && a % 100 != 0) {

            System.out.println("O ano informado é Bissexto");

        } else {
            System.out.println("O ano informado não é Bissexto");

        }
    }
}
