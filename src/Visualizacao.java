public class Visualizacao {
  //Atributos
  private Gafanhoto espectador;
  private Video filme;
  
  //Métodos Especiais
  public Visualizacao(Gafanhoto espectador, Video filme) {
    this.espectador = espectador;
    this.filme = filme;
  };
  
  public Gafanhoto getEspectador() {
  return this.espectador;
  };
  
  public void setEspectador(Gafanhoto espectador) {
  this.espectador = espectador;
  };
  
  public Video getFilme() {
  return this.filme;
  };
  
  public void setFilme(Video filme) {
  this.filme = filme;
  };
  
  //Métodos Públicos
  
}
