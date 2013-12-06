package com.test.util;

import java.io.IOException;

public class ShellCommand {
	
	
	public static final String adb_conn="adb connect ";
	
	/**
	 * 通过ip连接设备
	 */
	public static void connectDevice(String ip){
		try {
			Runtime.getRuntime().exec(adb_conn+ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
