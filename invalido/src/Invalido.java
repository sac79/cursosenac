import java.util.Scanner;

public class Invalido {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        int numero;

        System.out.println("Escolha um número de 1 a 10.");
        numero = leitura.nextInt();

        switch (numero) {
            case 1:
                System.out.println("O número escolhido foi: 1.");
                break;

            case 2:
                System.out.println("O número escolhido foi: 2.");
                break;

            case 3:
                System.out.println("O número escolhido foi: 3.");
                break;

            case 4:
                System.out.println("O número escolhido foi: 4.");
                break;

            case 5:
                System.out.println("O número escolhido foi: 5.");
                break;

            case 6:
                System.out.println("O número escolhido foi: 6.");
                break;

            case 7:
                System.out.println("O número escolhido foi: 7.");
                break;

            case 8:
                System.out.println("O número escolhido foi: 8.");
                break;

            case 9:
                System.out.println("O número escolhido foi: 9.");
                break;

            case 10:
                System.out.println("O número escolhido foi: 10.");
                break;

            default:
                System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
                break;

        }
    }
}
