package proxy;
import java.util.logging.Logger;

public class TorreDeBronze implements TorreDoMago {

	private static final Logger LOGGER = Logger.getLogger(TorreDeBronze.class.getName());

	@Override
	public void entra(final Mago mago) {
		LOGGER.info(() -> mago + " entrou na torre de bronze");
	}

}
