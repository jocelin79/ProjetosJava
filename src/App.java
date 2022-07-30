public class App {
    public static void main(String[] args) {
       Mamifero m1 = new Mamifero();
       Reptil r1 = new Reptil();
       Peixe p1 = new Peixe();
       Ave a1 = new Ave();

       m1.setPeso(35.3f);
       m1.getPeso();
       m1.alimentar();
       m1.locomover();
       m1.emitirSom();

       r1.setPeso(25.3f);
       r1.getPeso();
       r1.alimentar();
       r1.locomover();
       r1.emitirSom();

       p1.setPeso(15.3f);
       p1.getPeso();
       p1.alimentar();
       p1.locomover();
       p1.emitirSom();

       a1.setPeso(5.3f);
       a1.getPeso();
       a1.alimentar();
       a1.locomover();
       a1.emitirSom();
    };
}
