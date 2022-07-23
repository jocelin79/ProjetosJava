public class ContaBanco {

  public Integer numConta;
  protected String tipo;
  private String dono;
  private Double saldo;
  private Boolean status;

  public ContaBanco() {
    this.setStatus(false);
    this.setSaldo(0.0);
  };

  public Integer getNumConta() {
    return this.numConta;
  }

  public String getTipo() {
    return this.tipo;
  }

  public String getDono() {
    return this.dono;
  }

  public Double getSaldo() {
    return this.saldo;
  }

  public Boolean getStatus() {
    return this.status;
  }

  public void setNumConta(Integer numConta) {
    this.numConta = numConta;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public void abrirConta(String tipo) {
    this.setTipo(tipo);
    this.setStatus(true);
    if (this.getTipo() == "CC") {
      this.setSaldo(50.00);
    } else {
      this.setSaldo(150.00);
    }
    ;
  }

  public void fecharConta() {
    if (this.getSaldo() > 0) {
      System.out.println("Conta com Saldo");
    } else if (this.getSaldo() < 0) {
      System.out.println("Conta com Saldo Negativo");
    } else {
      this.setStatus(false);
    }
  }

  public void depositar(Double deposito) {
    if (this.getStatus()) {
      this.setSaldo(this.getSaldo() + deposito);
    } else {
      System.out.println("Não é possível depositar pois a Conta está fechada.");
    }
  }

  public void sacar(Double saque) {
    if ((this.getStatus()) && (this.getSaldo() >= saque)) {
      this.setSaldo(this.getSaldo() - saque);
    } else {
      System.out.println("Não é possível sacar pois a Conta está fechada ou saldo insuficiente.");
    }
  }

  public void pagarMensal() {
    if (this.getTipo() == "CC") {
      this.setSaldo(this.getSaldo() - 12.00);
    } else {
      this.setSaldo(this.getSaldo() - 20.00);
    }
  }
}
