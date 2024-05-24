import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        Double salarioatual, porcentagem, salarionovo;

        System.out.println("Qual o salario atual do funcionario ?");
        salarioatual = leitura.nextDouble();

        porcentagem = salarioatual * 0.25;

        salarionovo = salarioatual + porcentagem;

        System.out.println("");
        leitura.close();
    }
}
