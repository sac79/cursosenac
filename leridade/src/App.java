import java.util.Scanner;

// A pessoa digita a idade, e ele converte para os dias que a pessoa já viveu.

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int idade;
        int dias;
    
        System.out.println("Digite a sua idade que lhe direi quantos dias você já viveu: ");
        idade = leitura.nextInt();

        dias = (idade * 365);
        System.out.println("Você já viveu: " + dias + " dias.");

        leitura.close();
    }
}
