package co.com.bancolombia.certificacion.murexqa.userinterfaces;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.RegExpProperty;
import com.hp.lft.sdk.java.Button;
import com.hp.lft.sdk.java.ButtonDescription;
import com.hp.lft.sdk.java.Editor;
import com.hp.lft.sdk.java.EditorDescription;
import com.hp.lft.sdk.java.InternalFrame;
import com.hp.lft.sdk.java.InternalFrameDescription;
import com.hp.lft.sdk.java.Window;
import com.hp.lft.sdk.java.WindowDescription;

public class TradeQueryPage {
	public static Editor TXT_CONTRACT_NUMBER;
	public static Button BTN_CONTRACT_SEARCH;

	public static final Editor getInputContractNumberField() throws GeneralLeanFtException {
		TXT_CONTRACT_NUMBER = Desktop
				.describe(Window.class, new WindowDescription.Builder()
				.title(new RegExpProperty("MX.*")).build()).describe(InternalFrame.class, new InternalFrameDescription.Builder()
				.title("Trade Query").build()).describe(Editor.class, new EditorDescription.Builder()
				.nativeClass("murex.gui.engine.GuiCellComponentTextFieldDecimal").build());
		
		return TXT_CONTRACT_NUMBER;
	}
		public static final Button getButtonContractSearchField() throws GeneralLeanFtException {
		
		BTN_CONTRACT_SEARCH = Desktop
				.describe(Window.class, new WindowDescription.Builder()
				.title(new RegExpProperty("MX.*")).build()).describe(InternalFrame.class, new InternalFrameDescription.Builder()
				.title("Trade Query").build()).describe(Button.class, new ButtonDescription.Builder()
				.label("Search").build());
		return BTN_CONTRACT_SEARCH;
		}
	
	
	
}
