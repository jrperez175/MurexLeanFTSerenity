package co.com.bancolombia.certificacion.murexqa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.hp.lft.sdk.GeneralLeanFtException;

import net.serenitybdd.screenplay.Actor;

import static co.com.bancolombia.certificacion.murexqa.userinterfaces.EscogerGrupoMurex.*;

public class SeleccionarElGrupo implements Task {

	private String grupo;

	public SeleccionarElGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			getlabelGrupoField(grupo).doubleClick();
		} catch (GeneralLeanFtException e) {
			
			e.printStackTrace();
		}

	}

	public static SeleccionarElGrupo definido(String grupo) {

		return instrumented(SeleccionarElGrupo.class, grupo);
	}

}
