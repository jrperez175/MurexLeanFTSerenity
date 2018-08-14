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
import com.hp.lft.sdk.java.Table;
import com.hp.lft.sdk.java.TableDescription;
import com.hp.lft.sdk.java.Window;
import com.hp.lft.sdk.java.WindowDescription;

public class ResultadosTradeQueryPage {
	public static Table TBL_NUMERO_REGISTROS;
	

	public static final Table getTableNumeroRegistrosField() throws GeneralLeanFtException {
		TBL_NUMERO_REGISTROS = Desktop.describe(Window.class, new WindowDescription.Builder()
				.title(new RegExpProperty("MX.*")).build()).describe(InternalFrame.class, new InternalFrameDescription.Builder()
				.title("Transaction header").build()).describe(Table.class, new TableDescription.Builder()
				.nativeClass("murex.gui.jfcutil.jfcmatrix.JfcSimpleTable").build());
		
		return TBL_NUMERO_REGISTROS;
	}
		
	
	
	
}
