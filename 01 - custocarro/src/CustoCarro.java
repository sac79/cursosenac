import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        Double precofabrica, precovenda, imposto;

        System.out.println("Digite o preço de fábrica do veículo: ");
        precofabrica = leitura.nextDouble();

        imposto = precofabrica * 0.45;

        precovenda = precofabrica + imposto;
        System.out.println("O preço final do veículo é R$ " + precovenda);

        leitura.close();
    }
}
