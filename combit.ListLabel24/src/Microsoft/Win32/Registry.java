package Microsoft.Win32;

import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.api.NType;

import combit.ListLabel24.ListLabelActivation;

public class Registry {
	private static NType staticHandle;
	public static RegistryKey getCurrentUser() {
		try {
			return new RegistryKey(staticHandle.getRef("CurrentUser"));
		} catch (JavonetException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	static {
		try {
			ListLabelActivation.initializeJavonet();
			staticHandle=Javonet.getType("Registry");
		} catch (JavonetException e) {
			e.printStackTrace();
		}
	}
}
