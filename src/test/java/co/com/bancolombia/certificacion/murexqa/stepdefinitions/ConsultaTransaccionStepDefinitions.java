package co.com.bancolombia.certificacion.murexqa.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.equalTo;

import java.net.URISyntaxException;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import co.com.bancolombia.certificacion.murexqa.interactions.AbrirElAplicativoMurex;
import co.com.bancolombia.certificacion.murexqa.questions.LosRegistrosEncontradoEnElTradeQuery;
import co.com.bancolombia.certificacion.murexqa.tasks.ConsultarEnElTradeQuery;
import co.com.bancolombia.certificacion.murexqa.tasks.IngresarALaOpcion;
import co.com.bancolombia.certificacion.murexqa.tasks.IngresarAlAplicativo;
import co.com.bancolombia.certificacion.murexqa.tasks.SeleccionarElGrupo;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.java.Editor;
import com.hp.lft.sdk.java.EditorDescription;
import com.hp.lft.sdk.java.Window;
import com.hp.lft.sdk.java.WindowDescription;

public class ConsultaTransaccionStepDefinitions {
	
	public static Editor TXT_USUARIO;		
	
	@Before
	public void preparaEscenario() throws Exception{
		OnStage.setTheStage(new OnlineCast());
		SDK.init(new ModifiableSDKConfiguration());
	}
	
	
	
	
	@Dado("^que el usuario se encuentra en el aplicatvo (.*) (.*) (.*) (.*)$")
	public void elUsuarioSeEncuentraEnElAplicatvo(String usuario, String contrasena, String grupo, String ruta) throws GeneralLeanFtException {
			
		theActorCalled("Usuario").wasAbleTo(//AbrirElAplicativoMurex.enLaRuta(ruta),
								IngresarAlAplicativo.conUsuarioYContrasena(usuario,contrasena),
								SeleccionarElGrupo.definido(grupo)
								
				); 
	}

	@Cuando("^el ingresa el identificador de la transaccion deseada  (.*) (.*)$")
	public void elIngresaConsultaLaTransaccionDeseada(String menu, String contract) throws GeneralLeanFtException {
		theActorInTheSpotlight().attemptsTo(IngresarALaOpcion.delmenu(menu),
											ConsultarEnElTradeQuery.elContractNumberDeLaOperacion(contract)
				); 
	}
	
	@Entonces("^se debe visualizar el detalle$")
	public void seDebeVisualizarElDetalleDeLaTransaccion() throws GeneralLeanFtException {
		theActorInTheSpotlight().should(seeThat(LosRegistrosEncontradoEnElTradeQuery.son(),greaterThanOrEqualTo(1)));
	}
	
	
	

}
