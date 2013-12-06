package com.test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import com.android.chimpchat.adb.AdbBackend;
import com.android.chimpchat.adb.AdbChimpDevice;

public class TestMonkeyrunner {

	private static AdbChimpDevice device;
	private static AdbBackend adb;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		int i=0;
		while(i < 5){
			
			
			

//			if (adb == null) {
				
				Runtime.getRuntime().exec("taskkill /f /im adb.exe");
				Thread.sleep(3000);
				Runtime.getRuntime().exec("adb connect 192.168.1.100");
				Thread.sleep(5000);
				
				
				if(adb == null){
					
					adb = new AdbBackend();
				}
				device = (AdbChimpDevice) adb.waitForConnection(8000,
						"192.168.1.100:5555");

				String action = "android.intent.action.MAIN";
				Collection<String> categories = new ArrayList<String>();

				categories.add("android.intent.category.LAUNCHER");

				device.startActivity(null, action, null, null, categories,
						new HashMap<String, Object>(),
						"com.estrongs.android.pop/.view.FileExplorerActivity", 0);

				Thread.sleep(3000);

				device.press("KEYCODE_BACK",
						com.android.chimpchat.core.TouchPressType.DOWN_AND_UP);

				Thread.sleep(1000);

				device.press("KEYCODE_BACK",
						com.android.chimpchat.core.TouchPressType.DOWN_AND_UP);

				Thread.sleep(2000);

				Runtime.getRuntime().exec("taskkill /f /im adb.exe");
				Thread.sleep(2000);
//			}
			
			
			i++;
			
			
			
		}
		
		
	}

}
