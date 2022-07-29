public class Funcionario extends Pessoa{

  //Atributos
  private String setor;
  private boolean trabalhando;
  
  //Métodos Especiais
  public Funcionario(String nome, int idade, String sexo) {
    super(nome, idade, sexo);
  }
  
  public String getSetor() {
    return setor;
  }


  public void setSetor(String setor) {
    this.setor = setor;
  }


  public boolean isTrabalhando() {
    return trabalhando;
  }


  public void setTrabalhando(boolean trabalhando) {
    this.trabalhando = trabalhando;
  };


  //Métodos Públicos
  public void mudarTrabalho(){
    this.trabalhando = !this.trabalhando;
  }
}; 
