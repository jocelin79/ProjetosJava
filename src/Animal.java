public abstract class Animal {
  // Atributos
  protected float peso;
  protected int idade;
  protected int membros;

  // Métodos Especiais
  public float getPeso() {
    System.out.println(this.peso);
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getMembros() {
    return membros;
  }

  public void setMembros(int membros) {
    this.membros = membros;
  }

  // Métodos Públicos
  public abstract void locomover();
  public abstract void alimentar();
  public abstract void emitirSom();
}
