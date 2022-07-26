public class Reptil extends Animal {
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
  @Override
  public void alimentar() {
    System.out.println("Comeu Vegetais.");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de Reptil.");
  }

  @Override
  public void locomover() {
    System.out.println("Rastejou.");
  }

}
