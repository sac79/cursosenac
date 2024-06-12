public class App {
    public static void main(String[] args) throws Exception {

        Voo AF447 = new Voo();

        AF447.nrVoo = "447";
        AF447.origem = "Rio de Janeiro";
        AF447.destino = "Paris";
        AF447.dataHora = "31-05-09 20:00hs";
        AF447.totalAssentos = 220;

        AF447.reservaAssento(45);
        AF447.reservaAssento(30);
        AF447.reservaAssento(199);
        AF447.reservaAssento(20);

        System.out.println("Reservados: " + AF447.assentosDisponiveis(AF447));

        AF447.cancelaAssento(30);

        System.out.println("Disponivéis: " + AF447.assentosDisponiveis(AF447));

    }
}
