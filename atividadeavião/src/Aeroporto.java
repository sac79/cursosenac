import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    String nomme;
    String localidade;
    List<Voo> voos = new ArrayList<>(1000);

    public Aeroporto(String nomme, String localidade, List<Voo> voos) {
        this.nomme = nomme;
        this.localidade = localidade;
        this.voos = voos;
    }

    public Aeroporto() {

    }

    public void adicionaVoo(Voo voo) {
        voos.add(voo);
    }

    public void removeVoo(Voo voo) {
        voos.remove(voo);

    }
}
