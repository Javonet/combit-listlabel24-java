//
// Java Declaration File
// constants and function definitions for combit List & Label 23
// Copyright (c) combit Software GmbH, Konstanz, Germany
//

package combit;

import Microsoft.Win32.Registry;
import Microsoft.Win32.RegistryKey;

public final class WinHelper
  {
	/**
	* Retrieves a window handle.
	* <br>Hint: It have to be a visible window/component!
	*/
	public static native int getWindowHandle
	  (
	  java.awt.Component		component	
	  );
	
	static
	  {
		

		String vmArch = System.getProperty("sun.arch.data.model");
		if(vmArch.compareTo("32") == 0)
		  System.loadLibrary("ListLabel24JNI_x86"); // use List & Label JNI x86
		else if(vmArch.compareTo("64") == 0)
		  System.loadLibrary("ListLabel24JNI_x64"); // use List & Label JNI x64
		else
		  System.loadLibrary("ListLabel24JNI_x86"); // fallback to x86
	  }
  };