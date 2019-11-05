import java.util.logging.Logger;

public class TorreDoMagoProxy implements TorreDoMago {

  private static final Logger LOGGER =  Logger.getLogger(TorreDoMagoProxy.class.getName());

  private static final int MAX_MAGOS = 3;

  private int numMagos;

  private final TorreDoMago torre;

  public TorreDoMagoProxy(TorreDoMago tower) {
    this.torre = tower;
  }

  @Override
  public void entra(Mago wizard) {
    if (numMagos < MAX_MAGOS) {
      torre.entra(wizard);
      numMagos++;
    } else {
      LOGGER.info(() -> wizard + " não pode entrar na torre");
    }
  }
}
