public class Mamifero extends Animal {
  // Atributo
  protected String corPelo;

  // Métodos Especiais
  public String getCorPelo() {
    return corPelo;
  }

  public void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
  }

  // Métodos Públicos

  @Override
  public void locomover() {
    System.out.println("Correu.");
  };

  @Override
  public void alimentar() {
    System.out.println("Mamou.");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de Mamifero.");
  }
}
