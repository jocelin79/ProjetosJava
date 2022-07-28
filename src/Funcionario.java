public class Funcionario extends Pessoa{
  //Atributos
  private String setor;
  private boolean trabalhando;
  
  //Métodos Especiais
  
  //Métodos Públicos
  public void mudarTrabalho(){
    this.trabalhando = !this.trabalhando;
  };
}; 
