public class Livro implements Publicacao {
  // Atributos
  private String titulo;
  private String autor;
  private int totPaginas;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  // Métodos Especiais
  public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totPaginas = totPaginas;
    this.leitor = leitor;
    this.aberto = false;
    this.pagAtual = 0;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotPaginas() {
    return totPaginas;
  }

  public void setTotPaginas(int totPaginas) {
    this.totPaginas = totPaginas;
  }

  public int getPagAtual() {
    return pagAtual;
  }

  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  public boolean isAberto() {
    return aberto;
  }

  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  // Métodos Público
  public String detalhes() {
    return "Livro [aberto=" + aberto + ",\n autor=" + autor + ",\n leitor=" + leitor.getNome() + ",\n idade="
        + leitor.getIdade() + ",\n sexo=" + leitor.getSexo() + ",\n pagAtual=" + pagAtual
        + ",\n titulo=" + titulo + ",\n totPaginas=" + totPaginas + "]";
  }

  @Override
  public void abrir() {
    this.setAberto(true);
  }

  @Override
  public void fechar() {
    this.setAberto(false);
  }

  @Override
  public void folhear(int pagina) {
    if (pagina > this.getTotPaginas()) {
      this.setPagAtual(0);
    } else {
      this.setPagAtual(pagina);
    }
  }

  @Override
  public void avancarPag() {
    this.setPagAtual(getPagAtual() + 1);
  }

  @Override
  public void voltarPag() {
    this.setPagAtual(getPagAtual() - 1);
  };
};
