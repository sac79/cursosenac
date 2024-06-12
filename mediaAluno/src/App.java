import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        Aluno aluno = new Aluno();
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Qual o nome do aluno?");
        aluno.setNome(leitura.nextLine());

        System.out.println("Qual o curso do aluno?");
        aluno.setCurso(leitura.nextLine());

        System.out.println("Qual a matrícula do aluno?");
        aluno.setMatricula(leitura.nextInt());

        System.out.println("Quantas notas o aluno tem?");
        int qntNotas = leitura.nextInt();

        for (int i = 1; i <= qntNotas; i++) {
            System.out.println("Qual a " + i + " nota?");
            notas.add(leitura.nextDouble());
        }
        aluno.setNotas(notas);
        aluno.mostrarDados(aluno);

        aluno.calcularMedia(notas, qntNotas);
    }

}
