package co.com.bancolombia.certificacion.murexqa.userinterfaces;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.java.Editor;
import com.hp.lft.sdk.java.EditorDescription;
import com.hp.lft.sdk.java.Window;
import com.hp.lft.sdk.java.WindowDescription;

public class MenuMurexPage {

	public static Editor TXT_BUSCAR_OPCION_MENU;

	public static final Editor getInputBuscadorField() throws GeneralLeanFtException {
		TXT_BUSCAR_OPCION_MENU = Desktop
				.describe(Window.class, new WindowDescription.Builder()
				.title(new RegExpProperty("MX.*")).build()).describe(Editor.class, new EditorDescription.Builder()
				.attachedText("Ctrl-F").build());
		
		return TXT_BUSCAR_OPCION_MENU;
	}

}
