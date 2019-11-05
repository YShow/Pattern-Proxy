package proxy;
import java.util.logging.Logger;

public class TorreDoMagoProxy implements TorreDoMago {

	private static final Logger LOGGER = Logger.getLogger(TorreDoMagoProxy.class.getName());

	private static final int MAX_MAGOS = 3;

	private int numMagos;

	private final TorreDoMago torre;

	public TorreDoMagoProxy(final TorreDoMago torre) {
		this.torre = torre;
	}

	@Override
	public void entra(final Mago wizard) {
		if (numMagos < MAX_MAGOS) {
			torre.entra(wizard);
			numMagos++;
		} else {
			LOGGER.info(() -> wizard + " não pode entrar na torre");
		}
	}
}
