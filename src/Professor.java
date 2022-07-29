public class Professor extends Pessoa{

  //Atributos
  private String especialidade;
  private float salario;
  
  //Métodos Especiais
  public Professor(String nome, int idade, String sexo) {
    super(nome, idade, sexo);
  };

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  };
  
  //Métodos Públicos
  public void ReceberAum(float aum){
    this.salario += aum;
  }
};
