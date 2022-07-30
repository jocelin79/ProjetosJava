public class Paixe extends Animal{
  // Atributos
  private String corEscama;

  // Métdos Especiais
  public String getCorEscama() {
    return corEscama;
  }

  public void setCorEscama(String corEscama) {
    this.corEscama = corEscama;
  }

  // Métodos Públicos
  public void soltarBolha() {
    System.out.println("Soltou bolha");
  };

  @Override
  public void alimentar() {
    System.out.println("Comeu substâncias.");
  }

  @Override
  public void emitirSom() {
    System.out.println("Peixe não faz som.");
  }

  @Override
  public void locomover() {
    System.out.println("Nadou.");
  }
}