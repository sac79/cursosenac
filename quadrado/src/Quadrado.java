import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        double comprimento;
        double altura;
        double largura;
        double volume;

        System.out.println("Digite o comprimento ");
        comprimento = leitura.nextDouble();

        System.out.println("Digite a altuta ");
        altura = leitura.nextDouble();

        System.out.println("Digite a largura ");

        largura = leitura.nextDouble();

        volume = altura * comprimento * largura;

        System.out.println("O volume da caixa é " + volume);

    }
}
