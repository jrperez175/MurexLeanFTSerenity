package co.com.bancolombia.certificacion.murexqa.userinterfaces;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.ModifiableSDKConfiguration;
import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.java.Button;
import com.hp.lft.sdk.java.ButtonDescription;
import com.hp.lft.sdk.java.Editor;
import com.hp.lft.sdk.java.EditorDescription;
import com.hp.lft.sdk.java.Window;
import com.hp.lft.sdk.java.WindowDescription;

public class LoginMurexPage {

	public static Editor TXT_USUARIO;
	public static Editor TXT_CONTRASENA;
	public static Button BTN_SIGN_IN;

	public static final Editor getInputUserField() throws GeneralLeanFtException {
		TXT_USUARIO = Desktop
				.describe(Window.class, new WindowDescription.Builder().title(new RegExpProperty("MX.*")).build())
				.describe(Editor.class, new EditorDescription.Builder().nativeClass("javax.swing.JTextField").build());

		return TXT_USUARIO;
	}

	public static final Editor getInputContrasenaField() throws GeneralLeanFtException {
		TXT_CONTRASENA = Desktop
				.describe(Window.class, new WindowDescription.Builder().title(new RegExpProperty("MX.*")).build())
				.describe(Editor.class, new EditorDescription.Builder()
						.nativeClass("murex.ui.components.fields.text.MSecretField").build());
		return TXT_CONTRASENA;
	}

	public static final Button getBtnSignInField() throws GeneralLeanFtException {
		BTN_SIGN_IN = Desktop
				.describe(Window.class, new WindowDescription.Builder().title(new RegExpProperty("MX.*")).build())
				.describe(Button.class, new ButtonDescription.Builder().label("Sign in").build());

		return BTN_SIGN_IN;
	}

}
