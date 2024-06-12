import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private List<Double> notas = new ArrayList<>();

    public Aluno(int matricula, String nome, String curso, List<Double> notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    public Aluno() {

    }

    // public double calcularMedia( List<Double> notas, int quantidade)
    // for (Double nota : notas )
    // somaNota = somaNota + nota;
    // return somaNota / quantidade ;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public void calcularMedia(List<Double> notas, int qntNotas) {
        double somaNotas = 0.0;

        for (int i = 0; i < qntNotas; i++)

        {
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
