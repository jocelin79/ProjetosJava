public class Aluno extends Pessoa {
  //Atributos
  private int matr;
  private String curso;
  
  //Métodos Especiais

  public int getMatr() {
    return matr;
  }

  public void setMatr(int matr) {
    this.matr = matr;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }
  
  //Métodos Publicos
  
  public void PagarMensalidade() {
    System.out.println("Mensalidade de Aluno " + this.nome + " foi paga!");
  };
  
  public void cancelarMatr() {
    System.out.println("Matrículo cancelada!");
  }
};
