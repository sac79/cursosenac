import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);
        Double n1, n2, n3, media;

        System.out.println("Digite a Primeira nota");
        n1 = leitura.nextDouble();

        System.out.println("Digite a Segunda nota");
        n2 = leitura.nextDouble();

        System.out.println("Digite a Terceira nota");
        n3 = leitura.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("A media do Aluno é " + media);

        if (media >= 7) {
            System.out.println("Aluno Aprovado");

        } else {
            System.out.println("Aluno Reprovado");

        }
    }
}
