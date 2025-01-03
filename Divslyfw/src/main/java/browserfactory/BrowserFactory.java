package browserfactory;

public class BrowserFactory  {
	
	public static BrowserManager getDriverManager(String browser, String headless) {
        BrowserManager driverManager; 
             
        if(headless.equalsIgnoreCase("TRUE"))
        {
        switch (browser) {
		case "chrome":
        	driverManager = new ChromeHeadlessDriverManager();
			break;
		case "edge":
        	driverManager = new EdgeHeadlessDriverManager();
        	break;
		default:
			throw new IllegalArgumentException(browser);
		}
        }
        else
        {
        	 switch (browser) {
     		case "chrome":
             	driverManager = new ChromeDriverManager();
     			break;
     		case "edge":
             	driverManager = new EdgeDriverManager();
             	break;
     		default:
     			throw new IllegalArgumentException(browser);
     		}
        }
        
        return driverManager;
    }
    
}
