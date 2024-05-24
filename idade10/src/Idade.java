import java.util.Scanner;

public class Idade {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);
        int maioridade = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a idade da pessoa");
            int idade = leitura.nextInt();

            if (idade >= 18) {
                maioridade++;
            }
            System.out.println("O numero de pessoas maiores de idade é:" + maioridade);

        }

    }
}