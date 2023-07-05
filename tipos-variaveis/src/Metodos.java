public class Metodos {
  // Criar uma SmartTV

  /*
  1. Ela tenha as características: ligada (boolean), canal (int) e volume (int);
  2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada; 
  */

  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  void ligar() {
    ligada = true;
  }

  void desligar() {
    ligada = false;
  }

  public static void main(String[] args) {

    Metodos tv = new Metodos();

    System.out.println(tv.ligada);
    System.out.println(tv.canal);
    System.out.println(tv.volume);

    tv.ligar();
    System.out.println(tv.ligada);

    tv.desligar();
    System.out.println(tv.ligada);
  }
}
