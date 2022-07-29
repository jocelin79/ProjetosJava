public class Bolsista extends Aluno {
  //Atributos
  private int bolsa;
  
  //Métodos Especiais
  public int getBolsa() {
    return bolsa;
  };

  public void setBolsa(int bolsa) {
    this.bolsa = bolsa;
  };
  
  //Métodos Públicos
  public void renovarBolsa() {
    System.out.println("A Bolsa de " + this.getNome() + " foi renovada!");
  }

  @Override
  public void pagarMensalidade(){
    System.out.println(this.nome + " é bolsista! Pagamento facilitado e realizado!");
  };
};
