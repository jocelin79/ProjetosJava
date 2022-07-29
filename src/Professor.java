public class Professor extends Pessoa{

  //Atributos
  private String especialidade;
  private Double salario;
  
  //Métodos Especiais

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  };
  
  //Métodos Públicos
  public void ReceberAum(float aum){
    this.salario += aum;
  }
};
