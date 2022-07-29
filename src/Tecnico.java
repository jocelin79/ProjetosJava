public class Tecnico extends Aluno{
  //Atributos
  public int registroPro;

  //Métodos Especiais
  public int getRegistroPro() {
    return registroPro;
  }

  public void setRegistroPro(int registroPro) {
    this.registroPro = registroPro;
  }
  
  //Métodos Públicos
  public void praticar() {
    System.out.println(this.nome + " praticou!");
  };
}
