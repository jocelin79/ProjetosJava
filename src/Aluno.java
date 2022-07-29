public class Aluno extends Pessoa {
  //Atributos
  private int matr;
  private String curso;
  
  //Métodos Especiais
  public Aluno(String nome, int idade, String sexo) {
    super(nome, idade, sexo);
  }

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
  
  public void cancelarMatr() {
    System.out.println("Matrículo cancelada!");
  }
};
