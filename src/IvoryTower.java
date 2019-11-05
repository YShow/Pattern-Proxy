import java.util.logging.Logger;
public class IvoryTower implements TorreDoMago {

  private static final Logger LOGGER = Logger.getLogger(IvoryTower.class.getName());

  public void entra(Mago wizard) {
    LOGGER.info(() -> wizard + " entrou na torre");
  }

}
