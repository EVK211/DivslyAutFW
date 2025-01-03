package constants;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class GlobalConstants {
	
	private GlobalConstants() {}
	
	public static final String RUNSETUP = System.getProperty("user.dir")+"/src/test/resources/RunSetup.csv";
	public static final String CONFIG = System.getProperty("user.dir")+"/src/test/resources/Config.properties";
	public static final String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
	public static final String reportName = "DivslyTestReport-" + timestamp + ".html";
	public static final String EXTENTREPORT_HTML = System.getProperty("user.dir")+"/ExtentReports/"+reportName;
	public static final String EXTENTREPORT_CONFIG = System.getProperty("user.dir")+"/src/test/resources/ExtentReport.properties";

}
