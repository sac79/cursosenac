import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        Aeroporto aeroporto = new Aeroporto();
        ;

        // CADASTRO PASSAGEIRO

        System.out.println("Informe o nome do Passageiro: ");
        String passageiro2Nome = leitor.nextLine();
        leitor.nextLine();

        System.out.println("Informe o CPF do Passageiro: ");
        String passageiro2cpf = leitor.nextLine();

        Passageiro passageiro2 = new Passageiro(passageiro2Nome, passageiro2cpf);
        System.out.println(
                "Passageiro Cadastrado nome: " + passageiro2.getNome() + " | CPF: " + passageiro2.getCpf());

        // CADASTRO VOO
        System.out.println("Informe o número do VOO: ");
        String voo1nome = leitor.nextLine();
        System.out.println("Informe a ORIGEM: ");
        String voo1origem = leitor.nextLine();
        System.out.println("Informe o DESTINO do VOO: ");
        String voo1destino = leitor.nextLine();
        System.out.println("Informe a data e hora do VOO: ");
        String voo1dataHora = leitor.nextLine();

        Voo voo1 = new Voo(voo1nome, voo1origem, voo1destino, voo1dataHora);
        System.out.println("Novo Voo cadastrado: \n Nome do Voo: " + voo1.getNomeVoo() + "\n Data e Hora: "
                + voo1.getDataHora() + " \n Origem: " + voo1.getOrigem() + " \n Destino: " + voo1.getDestino());

        int controlador;
        int numeroAssento;
        System.out.println(
                "Selecione a opção para o Assento: \n 1 - Reservar Assento \n 2 - Verificar disponibilidade \n 3 - Cancelar Assento \n 4 - Ver taxa de Ocupção \n 5 - sair");
        controlador = leitor.nextInt();
        switch (controlador) {
            case 1:
                System.out.println("Informe o número do assento: ");
                numeroAssento = leitor.nextInt();
                voo1.reservarAssentos(numeroAssento);
                break;
            case 2:
                System.out.println("Verificar disponibilidade do assento: ");
                numeroAssento = leitor.nextInt();
                if (voo1.verificarAssentos(numeroAssento)) {
                    System.out.println("Assento disponivel");
                } else {
                    System.out.println("Assento Ocupado");
                }

                break;
            case 3:
                System.out.println("Informe o número do assento a ser cancelado");
                numeroAssento = leitor.nextInt();
                voo1.cancelarAssentos(numeroAssento);
                break;
            case 4:
                System.out.println(voo1.taxaOcupacao());
                break;
            default:
                break;
        }

        // AEROPORTO
        System.out.println("Deseja adicionar ou remover o voo [Add = 1 | Remover = 2]");
        int opcao = leitor.nextInt();
        if (opcao == 1) {
            aeroporto.adicionarVoo(voo1);
            System.out.println("Voo adicionado");
        } else if (opcao == 2) {
            aeroporto.removerVoo(voo1);
            System.out.println("voo removido");
        } else {
            System.out.println("Comando invalido");
        }

        for (Voo string : aeroporto.getListaVoo()) {
            System.out.println(string.nomeVoo);
        }
        leitor.close();

    }

}
