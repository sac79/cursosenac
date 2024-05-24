import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);

        ArrayList<String> aulas = new ArrayList<>();

        String aula1 = "Programação";
        String aula2 = "Testes de Software";
        String aula3 = "Banco de Dados";

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        Collections.sort(aulas);

        for (String aula : aulas)

        {
            System.out.println("Aula " + aula);
        }

    }
}
