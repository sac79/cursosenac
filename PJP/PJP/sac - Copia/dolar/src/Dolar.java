import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);

        double real;
        double dolar;
        double valor;

        System.out.print("Digite o valor em reais R$");

        real = leitura.nextDouble();

        System.out.print("Digite o valor o valor do dolar $");

        dolar = leitura.nextDouble();

        valor = real * dolar;

        System.out.println("Esse é o valor convertido em Reais R$" + valor);

    }

}
