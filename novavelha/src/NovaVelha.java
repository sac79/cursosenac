import java.util.Scanner;

public class NovaVelha {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ":");
            String nome = leitura.nextLine();

            System.out.print("Digite a idade da pessoa " + i + ":");
            int idade = leitura.nextInt();
            leitura.nextLine();

            if (idade < idadeMaisNova) {
                nomeMaisNova = nome;
                idadeMaisNova = idade;

            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNova);
    }
}
