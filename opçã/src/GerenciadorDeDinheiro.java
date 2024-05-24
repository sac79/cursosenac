import java.util.Scanner;

public class GerenciadorDeDinheiro {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a quantidade em dinheiro: ");
        double saldo = leitura.nextDouble();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nOpções:");
            System.out.println("1 - Comprar");
            System.out.println("2 - Apenas Olhar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o preço do produto: ");
                    double preco = leitura.nextDouble();
                    if (saldo >= preco) {
                        saldo -= preco;
                        System.out.println("Compra realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para realizar a compra.");
                    }
                    break;
                case 2:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        }

        leitura.close();
    }
}
