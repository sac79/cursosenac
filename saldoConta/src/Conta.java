public class Conta {

  private int nr_conta;
  private double saldo = 1000;

  public Conta(int nr_conta, int saldo) {
    this.nr_conta = nr_conta;
    this.saldo = saldo;
  }

  public Conta() {

  }

  public int getNr_conta() {
    return nr_conta;
  }

  public void setNr_conta(int nr_conta) {
    this.nr_conta = nr_conta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double depositar(double valor) {
    return saldo += valor;
    // public void depositar (double valor)
    // saldo = saldo + valor;
  }

  public double sacar(double valor) {
    return saldo -= valor;
  }
  // public void saque (double valor)
  // if (valor > saldo)
  // Sytem.out
}
