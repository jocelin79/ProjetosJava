public class Ave extends Animal{
  //Atributo
  private String corPena;
  
  //Métodos Especiais
  public String getCorPena() {
    return corPena;
  }

  public void setCorPena(String corPena) {
    this.corPena = corPena;
  }

  //Métodos Públicos
  public void fazerNinho() {
    System.out.println("Ninho construído.");
  };

  @Override
  public void alimentar() {
    System.out.println("Comeu Frutas");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de Ave.");
  }

  @Override
  public void locomover() {
    System.out.println("Voou.");
  }
}
