public class App {

  public static void main(String[] args) {

    TorreDoMagoProxy proxy = new TorreDoMagoProxy(new IvoryTower());
    proxy.entra(new Mago("Mago Vermelho"));
    proxy.entra(new Mago("Mago Branco"));
    proxy.entra(new Mago("Mago Preto"));
    proxy.entra(new Mago("Mago Verde"));
    proxy.entra(new Mago("Mago marrom"));

  }
}
