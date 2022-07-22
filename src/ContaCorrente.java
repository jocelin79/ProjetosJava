public class ContaCorrente {

  Integer numConta;
  String tipo;
  String dono;
  Double saldo;
  Boolean status;

  public Integer getNumConta() {
    return numConta;
  }

  public String getTipo() {
    return tipo;
  }

  public String getDono() {
    return dono;
  }

  public Double getSaldo() {
    return saldo;
  }

  public Boolean getStatus() {
    return status;
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

  void abrirConta() {
    System.out.println("Se deseja abrir Conta Conrente, digite CC. Se deseja abrir Conta Poupança, digite CP.");
    //this.setTipo();
    this.setStatus(true);
    if (this.getTipo() == "10") {this.setSaldo(50.00);} else {this.setSaldo(150.00);};
  }

  void fecharConta() {
    if (this.getSaldo() > 0) {this.sacar(this.getSaldo());} else if (this.getSaldo() < 0) {this.depositar(this.getSaldo());};
    this.setStatus(false);
  }

  void depositar(Double deposito) {
    if (this.getStatus() == true);
  }

  void sacar(Double seque) {

  }

  void pagarMensal() {

  }
}
