package co.com.bancolombia.certificacion.murexqa.questions;

import com.hp.lft.sdk.GeneralLeanFtException;

import static co.com.bancolombia.certificacion.murexqa.userinterfaces.ResultadosTradeQueryPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LosRegistrosEncontradoEnElTradeQuery implements Question<Integer> {

	private int numeroRegistros;
	
	@Override
	public Integer answeredBy(Actor actor) {
	
		try {
			numeroRegistros = getTableNumeroRegistrosField().getRows().size();
		} catch (GeneralLeanFtException e) {
			
			e.printStackTrace();
		}
		return numeroRegistros;
	}

	public static LosRegistrosEncontradoEnElTradeQuery son() {

		return new LosRegistrosEncontradoEnElTradeQuery();
	}

}
