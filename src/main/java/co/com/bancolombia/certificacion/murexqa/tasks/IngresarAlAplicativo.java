package co.com.bancolombia.certificacion.murexqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.hp.lft.sdk.GeneralLeanFtException;

import static co.com.bancolombia.certificacion.murexqa.userinterfaces.LoginMurexPage.*;


public class IngresarAlAplicativo implements Task {

	private String usuario;
	private String contrasena;
	
	public IngresarAlAplicativo(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
			try {
				getInputUserField().sendKeys(usuario);
				getInputContrasenaField().sendKeys(contrasena);
				getBtnSignInField().click();
			} catch (GeneralLeanFtException e) {
				
				e.printStackTrace();
			}
		
		
	}

	public static IngresarAlAplicativo conUsuarioYContrasena(String usuario, String contrasena) {
		
		return instrumented(IngresarAlAplicativo.class, usuario, contrasena);
	}
	
}
