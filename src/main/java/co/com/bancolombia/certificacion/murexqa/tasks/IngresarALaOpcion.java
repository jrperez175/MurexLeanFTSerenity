package co.com.bancolombia.certificacion.murexqa.tasks;

import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.Keyboard;

import static co.com.bancolombia.certificacion.murexqa.userinterfaces.MenuMurexPage.*;
import net.serenitybdd.screenplay.Actor;

public class IngresarALaOpcion implements Task {
	private String menu;

	public IngresarALaOpcion(String menu) {
		this.menu = menu;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			
			getInputBuscadorField().setText(menu);
			Thread.sleep(1000);
            Keyboard.pressKey((byte) 28);
		} catch (GeneralLeanFtException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

	public static IngresarALaOpcion delmenu(String menu) {

		return instrumented(IngresarALaOpcion.class, menu);
	}

}
