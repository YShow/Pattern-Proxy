package proxy;

import java.util.Scanner;

public class App {

	public static void main(final String[] args) {

		final var proxy = new TorreDoMagoProxy(new TorreDeBronze());
		final var scan = new Scanner(System.in);
		String nomeMago = "";
		System.out.println("Digite \"sair\" para sair");
		while(!"sair".equals(nomeMago))
		{
			System.out.println("Digite o nome do mago: ");
			nomeMago = scan.nextLine();
			if("sair".equals(nomeMago))
			{
				System.out.println("Saindo do programa");
				break;
			}
			var mago = new Mago(nomeMago);
			proxy.entra(mago);
		}
		
		
	}
}
