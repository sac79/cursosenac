import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            numeros.add(leitura.nextInt());
        }

        Collections.sort(numeros);

        for (int numero : numeros) {
            System.out.println("Numero: " + numero);
        }

    }
}
