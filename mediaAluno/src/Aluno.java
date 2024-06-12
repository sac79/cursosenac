import java.util.ArrayList;
import java.util.List;

public class Aluno {
    int matricula;
    String nome;
    String curso;
    List<Double> notas = new ArrayList<>();

    public Aluno(int matricula, String nome, String curso, List<Double> notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    public Aluno() {

    }

    public void calcularMedia(List<Double> notas, int qntNotas) {
        double somaNotas = 0.0;
        for (int i = 0; i < qntNotas; i++) {
            somaNotas = somaNotas + notas.get(i);
        }

        double media = somaNotas / qntNotas;
        System.out.println("A média do aluno é: " + media);
    }

    public void mostrarDados(Aluno aluno) {
        System.out.println("O nome do aluno é: " + aluno.nome + "\n" + "A matrícula do aluno é: " + aluno.matricula
                + "\n" + "O curso do aluno é : " + aluno.curso);

    }

}
