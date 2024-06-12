import java.util.ArrayList;

public class Voo {

    String nomeVoo, origem, destino, dataHora;
    int totalAssento = 200;
    ArrayList<Integer> assentosReservados = new ArrayList<>();

    

    public Voo(String nomeVoo, String origem, String destino, String dataHora) {
        this.nomeVoo = nomeVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataHora = dataHora;
    }



    public Voo(){}

    public String getNomeVoo() {
        return nomeVoo;
    }

    public void setNomeVoo(String nomeVoo) {
        this.nomeVoo = nomeVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTotalAssento() {
        return totalAssento;
    }

    public void setTotalAssento(int totalAssento) {
        this.totalAssento = totalAssento;
    }

    public ArrayList<Integer> getAssentosReservados() {
        return assentosReservados;
    }



    

    public void setAssentosReservados(ArrayList<Integer> assentosReservados) {
        this.assentosReservados = assentosReservados;
    }

    public void reservarAssentos(int numeroAssento) {
        if (verificarAssentos(numeroAssento)) {
            assentosReservados.add(numeroAssento);
            System.out.println("O assento foi reservado com Sucesso");
        } else {
            System.out.println("O assento informado ja esta Ocupado");
        }
        
    }

    public void cancelarAssentos(int numeroAssento) {
        if (verificarAssentos(numeroAssento)) {
            assentosReservados.remove(numeroAssento);
            System.out.println("O assento foi removido com Sucesso");
        } else {
            System.out.println("O assento não pode ser removido pois não esta ocupado");
        }
    }

    public boolean verificarAssentos(int numeroAssento) {
        boolean vazio = true;
        for (Integer assento : assentosReservados) {
            if (assento == numeroAssento) {
                vazio = false;
            } else {
                vazio = true;
            }
        }
        
        return vazio;
    }

    public int assentosDisponiveis() { 
        return totalAssento - assentosReservados.size();
    }

    public double taxaOcupacao() {
        double taxa = (assentosReservados.size()/totalAssento)*100;
        return taxa;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

}
