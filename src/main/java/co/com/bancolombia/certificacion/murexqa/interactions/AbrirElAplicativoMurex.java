package co.com.bancolombia.certificacion.murexqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class AbrirElAplicativoMurex implements Interaction {

	private String ruta;
	Process murexClient = null;
	Runtime rt = Runtime.getRuntime();

	public AbrirElAplicativoMurex(String ruta) {
		this.ruta = ruta + "openmurex.cmd";
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			murexClient = rt.exec("cmd /C " + ruta);

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (murexClient != null) {
				murexClient.destroy();
			}
		}

	}

	public static AbrirElAplicativoMurex enLaRuta(String ruta) {
		return new AbrirElAplicativoMurex(ruta);
	}

}
