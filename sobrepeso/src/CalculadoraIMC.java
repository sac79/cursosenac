import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = leitura.nextLine();

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = leitura.nextDouble();

        System.out.print("Digite o peso da pessoa (em quilogramas): ");
        double peso = leitura.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("O IMC de " + nome + " é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso Normal");
        } else {
            System.out.println("Acima do peso");
        }

        leitura.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
