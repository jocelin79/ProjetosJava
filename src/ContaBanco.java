public class ContaBanco {

  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  public ContaBanco() {
    this.setStatus(false);
    this.setSaldo(0);
  }

  public int getNumConta() {
    return this.numConta;
  }

  public String getTipo() {
    return this.tipo;
  }

  public String getDono() {
    return this.dono;
  }

  public float getSaldo() {
    return this.saldo;
  }

  public boolean getStatus() {
    return this.status;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public void abrirConta(String tipo) {
    this.setTipo(tipo);
    this.setStatus(true);
    if (this.getTipo() == "CC") {
      this.setSaldo(50);
    } else {
      this.setSaldo(150);
    }
    ;
    System.out.println("Conta aberta com sucesso!");
  }

  public void fecharConta() {
    if (this.getSaldo() > 0) {
      System.out.println("Não é possível fechar a conta pois contém Saldo!");
    } else if (this.getSaldo() < 0) {
      System.out.println("Não é possível fechar a conta pois contém Saldo Negativo!");
    } else {
      this.setStatus(false);
      System.out.println("Conta fechada com sucesso!");
    }
  }

  public void depositar(float deposito) {
    if (this.getStatus()) {
      this.setSaldo(this.getSaldo() + deposito);
      System.out.println("Depósito realizado!");
    } else {
      System.out.println("Não é possível depositar pois a conta está fechada.");
    }
  }

  public void sacar(float saque) {
    if ((this.getStatus()) && (this.getSaldo() >= saque)) {
      this.setSaldo(this.getSaldo() - saque);
      System.out.println("Saque realizado!");
    } else {
      System.out.println("Não é possível sacar pois a Conta está fechada ou saldo insuficiente.");
    }
  }

  public void pagarMensal() {
    if (this.getTipo() == "CC") {
      this.setSaldo(this.getSaldo() - 12);
    } else {
      this.setSaldo(this.getSaldo() - 20);
    }
    System.out.println("Mensalidade paga com sucesso!");
  }

  public void estadoAutal() {
    System.out.println("-------------------------------------");
    System.out.println("Conta:" + this.getNumConta());
    System.out.println("Tipo:" + this.getTipo());
    System.out.println("Dono:" + this.getDono());
    System.out.println("Saldo:" + this.getSaldo());
    System.out.println("Status:" + this.getStatus());
  }
}
