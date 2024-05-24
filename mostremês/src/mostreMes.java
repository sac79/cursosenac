import java.util.Scanner;

public class mostreMes {

    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);

        int numeronomes;

        System.out.println("Escolha um numero de 1 a 12 !");

        numeronomes = leitura.nextInt();

        switch (numeronomes) {
            case 1:
                System.out.println("O numero escolhido corresponde ao mês de Janeiro.");
                break;

            case 2:
                System.out.println("O numero escolhido corresponde ao mês de fevereiro.");
                break;

            case 3:

                System.out.println("O numero escolhido corresponde ao mês de Março.");

                break;

            case 4:

                System.out.println("O numero escolhido corresponde ao mês de Abril.");

                break;

            case 5:

                System.out.println("O numero escolhido corresponde ao mês de Maio.");

                break;

            case 6:

                System.out.println("O numero escolhido corresponde ao mês de Junho.");

                break;

            case 7:

                System.out.println("O numero escolhido corresponde ao mês de Julho.");

                break;

            case 8:

                System.out.println("O numero escolhido corresponde ao mês de Agosto.");

                break;

            case 9:

                System.out.println("O numero escolhido corresponde ao mês de Setembro.");

                break;

            case 10:

                System.out.println("O numero escolhido corresponde ao mês de Outubro.");

                break;

            case 11:

                System.out.println("O numero escolhido corresponde ao mês de Novembro.");

                break;

            case 12:

                System.out.println("O numero escolhido corresponde ao mês de Dezembro.");

                break;

            default:

                System.out.println("O numero escolhido corresponde é inválido .");

                break;
        }

    }
}
