package co.com.bancolombia.certificacion.murexqa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/consultatransaccion.feature"},
				glue = {"co.com.bancolombia.certificacion.murexqa.stepdefinitions"},
				snippets = SnippetType.CAMELCASE
)

public class ConsultaTransaccionRunners {

}
