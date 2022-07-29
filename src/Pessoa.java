public abstract class Pessoa {
  //Atributos
  private String nome;
  private int idade;
  private String sexo;
  
  //Métodos Especiais
  
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
  
  
  public void setIdade(String sexo) {
    this.sexo = sexo;
  };

  @Override
  public String toString() {
    return "Dados [idade=" + idade + ",\n nome=" + nome + ",\n sexo=" + sexo + "]";
  };
  
  //Métodos Publicos

  public void fazerAniver() {
    this.idade++;
  };
};
