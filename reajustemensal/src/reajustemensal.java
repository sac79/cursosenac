import java.util.Scanner;

public class reajustemensal {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        double salarioatual;
        double aumento;
        double reajuste;

        System.out.println("Digite seu salario atual");
        salarioatual = leitura.nextDouble();

        System.out.println("Digite o valor do aumento");
        aumento = leitura.nextDouble();

        reajuste = salarioatual + (salarioatual * aumento);

        System.out.println("Seu salario novo é " + reajuste);

    }
}
