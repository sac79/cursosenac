import java.util.ArrayList;

public class Aeroporto {

    String nomeAeroporto, localidadeAeroporto;
    ArrayList<Voo> listaVoo = new ArrayList<>();

    

    public Aeroporto(String nomeAeroporto, String localidadeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
        this.localidadeAeroporto = localidadeAeroporto;
    }

    public Aeroporto(){}

    
    public String getNomeAeroporto() {
        return nomeAeroporto;
    }


    public void setNomeAeroporto(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }


    public String getLocalidadeAeroporto() {
        return localidadeAeroporto;
    }


    public void setLocalidadeAeroporto(String localidadeAeroporto) {
        this.localidadeAeroporto = localidadeAeroporto;
    }


    public ArrayList<Voo> getListaVoo() {
        return listaVoo;
    }


    public void setListaVoo(ArrayList<Voo> listaVoo) {
        this.listaVoo = listaVoo;
    }


    public void removerVoo(Voo nomeVoo){
        for (Voo voo : listaVoo) {

            if (voo.getNomeVoo().equalsIgnoreCase(nomeVoo.getNomeVoo())) {
                listaVoo.remove(nomeVoo);
                System.out.println("Voo foi removido!");
            } else {
                System.out.println("Voo informado não existe!");
            }
            
        }
    }

    public void adicionarVoo(Voo nomeVoo){
        for (Voo voo : listaVoo) {
            if(!voo.getNomeVoo().equalsIgnoreCase(nomeVoo.getNomeVoo())) {
               listaVoo.add(nomeVoo);
               System.out.println("Voo Cadastrado com sucesso!");
            } else {
                System.out.println("Voo ja está cadastrado!");
            }
        }
    }


    
}
