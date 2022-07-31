public abstract class Pessoa {
  // Atributos
  protected String nome;
  protected int idade;
  protected String sexo;
  protected float experiencia;

  // Métodos Especiais

  public String getNome() {
    return nome;
  };

  public void setNome(String nome) {
    this.nome = nome;
  };

  public int getIdade() {
    return idade;
  };

  public void setIdade(int idade) {
    this.idade = idade;
  };

  public String getSexo() {
    return sexo;
  };

  public void setSexo(String sexo) {
    this.sexo = sexo;
  };

  @Override
  public String toString() {
    return "Dados: [idade=" + idade + ",\n nome=" + nome + ",\n sexo=" + sexo + "]";
  };

  // Métodos Publicos

  public void fazerAniver() {
    this.idade++;
  };

  public void ganharExp() {
    this.experiencia++;
  };
};
