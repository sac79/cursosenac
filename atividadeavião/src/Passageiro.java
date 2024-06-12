public class Passageiro {
   String nome;
   String cpf;

   public Passageiro(String nome, String cpf) {
      this.nome = nome;
      this.cpf = cpf;
   }

   public Passageiro() {
   }

   public Passageiro cadastro(String nome, String cpf) {
      Passageiro p = new Passageiro(nome, cpf);
      return p;

   }

}