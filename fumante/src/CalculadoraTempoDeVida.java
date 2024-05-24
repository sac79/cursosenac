import java.util.Scanner;

public class CalculadoraTempoDeVida {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = leitura.nextInt();

        System.out.print("Digite quantos anos você já fumou: ");
        int anosFumados = leitura.nextInt();

        int totalCigarrosFumados = cigarrosPorDia * anosFumados * 365;
        int tempoPerdidoMinutos = totalCigarrosFumados * 10; // Cada cigarro reduz 10 minutos de vida
        int tempoPerdidoDias = tempoPerdidoMinutos / (24 * 60); // Convertendo minutos para dias

        System.out.println(
                "Você perdeu aproximadamente " + tempoPerdidoDias + " dias de vida devido ao hábito de fumar.");

        leitura.close();
    }
}
