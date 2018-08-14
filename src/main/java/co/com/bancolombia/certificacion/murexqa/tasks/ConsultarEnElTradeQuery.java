package co.com.bancolombia.certificacion.murexqa.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.java.InternalFrame;
import com.hp.lft.sdk.java.InternalFrameDescription;
import com.hp.lft.sdk.java.Window;
import com.hp.lft.sdk.java.WindowDescription;

import static co.com.bancolombia.certificacion.murexqa.userinterfaces.TradeQueryPage.*;
import net.serenitybdd.screenplay.Actor;

public class ConsultarEnElTradeQuery implements Task{

	private String contract;
	
	
	
	public ConsultarEnElTradeQuery(String contract) {
		this.contract = contract;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			
			while (!Desktop.describe(Window.class, new WindowDescription.Builder()
					.title(new RegExpProperty("MX.*")).build()).describe(InternalFrame.class, new InternalFrameDescription.Builder()
					.title("Trade Query").build()).exists()) {
				Thread.sleep(1);
				
			}
			getInputContractNumberField().setText(contract);
			getButtonContractSearchField().click();
			
		} catch (GeneralLeanFtException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	


	public static ConsultarEnElTradeQuery elContractNumberDeLaOperacion(String contract) {
		
		return instrumented(ConsultarEnElTradeQuery.class, contract);
	}



	

}
