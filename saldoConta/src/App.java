import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        Conta conta = new Conta();
        int opcao;

        do {
            System.out.println("O que você deseja fazer ?" + "\n" + "1 Sacar" + "\n" + "2 Depositar" + "\n" + "3 Sair");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Qual valor você deseja sacar?");
                conta.sacar(leitura.nextDouble());
                System.out.println("Saldo atual " + conta.getSaldo());

            } else if (opcao == 2) {
                System.out.println("Qual valor você deseja depositar?");
                conta.depositar(leitura.nextDouble());
                System.out.println("Saldo atual " + conta.getSaldo());

            }
        } while (opcao != 3);

        System.out.println("Obrigado por sair do nosso sistema");

    }
}
