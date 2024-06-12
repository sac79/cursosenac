import java.util.ArrayList;
import java.util.List;

public class Voo {
    String nrVoo;
    String origem;
    String destino;
    String dataHora;
    int totalAssentos;
    List<Integer> assentosReservados = new ArrayList<>(500);
    

    public Voo(String nrVoo, String origem, String destino, String dataHora, int totalAssentos,
            List<Integer> assentosReservados) {
        this.nrVoo = nrVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataHora = dataHora;
        this.totalAssentos = totalAssentos;
        this.assentosReservados = assentosReservados;
    }

    public Voo() {

    }

    public void reservaAssento(int nrAssento) {
        assentosReservados.add(nrAssento);

    }

    public void cancelaAssento(int nrAssento) {
        for (int i = 0; i < assentosReservados.size(); i++) {
            if (assentosReservados.get(i) == nrAssento) {
                assentosReservados.remove(i);
            }

        }
    }

    public boolean verificaAssento(int nrAssento) {
        boolean retorno = false;
        for (Integer assento : assentosReservados) {
            if (assento == nrAssento) {
                retorno = true;
            }
        }

        return retorno;
    }

    public int assentosDisponiveis(Voo voo) {
        return voo.totalAssentos - voo.assentosReservados.size();
    }

    public double taxaOcupacao(Voo voo) {
        return (voo.assentosReservados.size() * 100) / voo.totalAssentos;

    }
    
}

