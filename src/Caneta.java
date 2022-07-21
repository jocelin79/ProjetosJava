public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  protected boolean tampada;

  public String getModelo(){
    return this.modelo;
  }
  
  public float getPonta(){
    return this.ponta;
  }
  
  public void setModelo(String m){
    this.modelo = m;
  }
  
  public void setPonta(float p){
    this.ponta = p;
  }
  
  public void status() {
    System.out.println("Modelo:" + this.modelo);
    System.out.println("Uma caneta" + this.cor);
    System.out.println("Ponta:" + this.ponta);
    System.out.println("Carga:" + this.carga);
    System.out.println("Está tampada?" + this.tampada);
  }

  public void rabiscar() {

  };

  private void tampar() {
    this.tampada = true;
  };

  private void destampar() {
    this.tampada = false;
  };
}
