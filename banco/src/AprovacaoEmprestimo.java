import java.util.Scanner;

public class AprovacaoEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o valor da casa: ");
            double valorCasa = scanner.nextDouble();

            System.out.print("Digite o salário do comprador: ");
            double salario = scanner.nextDouble();

            System.out.print("Digite em quantos anos ele vai pagar: ");
            int anosParaPagar = scanner.nextInt();

            int mesesParaPagar = anosParaPagar * 12;
            double prestacaoMensal = valorCasa / mesesParaPagar;

            double limitePrestacao = salario * 0.3; // 30% do salário

            if (prestacaoMensal <= limitePrestacao) {
                System.out.println("Empréstimo aprovado!");
                System.out.println("Valor da prestação mensal: " + prestacaoMensal);
            } else {
                System.out.println("Empréstimo negado. A prestação mensal excede 30% do salário.");
            }

            System.out.print("Deseja calcular outro empréstimo? (S/N): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}
