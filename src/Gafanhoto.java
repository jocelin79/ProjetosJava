public class Gafanhoto extends Pessoa{
  //Atributos
  private String login;
  private int totAssistido;

  //Métodos Especiais
  public Gafanhoto(String nome, int idade, String sexo, String login) {
    this.nome = nome;
    this. idade = idade;
    this.sexo = sexo;
    this.login = login;
    this.totAssistido = 0;
  }

  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }
  public int getTotAssistido() {
    return totAssistido;
  }
  public void setTotAssistido(int totAssistido) {
    this.totAssistido = totAssistido;
  }

  //Métodos Públicos
  public void viuMaisUm() {
    
  }

  @Override
  public String toString() {
    return "Gafanhoto [" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + "]";
  };
}
