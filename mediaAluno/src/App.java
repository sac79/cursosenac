import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Qual o nome do aluno?");
        aluno.nome = leitura.nextLine();

        System.out.println("Qual o curso do aluno?");
        aluno.curso = leitura.nextLine();

        System.out.println("Qual a matrícula do aluno?");
        aluno.matricula = leitura.nextInt();

        System.out.println("Quantas notas o aluno tem?");
        int qntNotas = leitura.nextInt();

        for (int i = 1; i <= qntNotas; i++) {
            System.out.println("Qual a " + i + " nota?");
            aluno.notas.add(leitura.nextDouble());
        }

        aluno.mostrarDados(aluno);

        aluno.calcularMedia(aluno.notas, qntNotas);
    }
}
