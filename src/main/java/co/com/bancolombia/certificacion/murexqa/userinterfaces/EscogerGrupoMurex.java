package co.com.bancolombia.certificacion.murexqa.userinterfaces;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.java.Label;
import com.hp.lft.sdk.java.LabelDescription;
import com.hp.lft.sdk.java.Window;
import com.hp.lft.sdk.java.WindowDescription;

public class EscogerGrupoMurex {

	public static Label CMB_GRUPO;
	public static String grupo;
	
	public static final Label getlabelGrupoField(String grupo) throws GeneralLeanFtException {
		CMB_GRUPO = Desktop.describe(Window.class, new WindowDescription.Builder()
                .title(new RegExpProperty("MX.*")).build()).describe(Label.class, new LabelDescription.Builder()
                .label(grupo).build());

		return CMB_GRUPO;
	}



}
