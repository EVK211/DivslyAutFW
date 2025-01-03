package utilities;

import drivermanager.DriverManager;

public final class ScreenshotUtility {
	
	//Method to get the screenshots. Instance of the threadlocal is used to prevent the thread related issue
	public static String getscreenshot() {	
		return DriverManager.getDriver().takescreenshot();
	}
}
