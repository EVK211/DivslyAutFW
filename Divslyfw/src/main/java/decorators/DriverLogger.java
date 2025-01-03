package decorators;

import org.openqa.selenium.By;

import logsetup.Log;

import java.io.File;
import java.util.List;

public class DriverLogger extends DriverDecorator {
	
	public DriverLogger(Driver driver, String headless ) {
        super(driver, headless);
    }

    @Override
    public void start(String browser, String headless) {
        driver.start(browser, headless);
        Log.info(String.format("Started browser: %s in %s mode", browser, headless));
    }

    @Override
    public void quit() {
        driver.quit();
        Log.info("Closed browser");
    }

    @Override
    public void goToUrl(String url) {
        driver.goToUrl(url);
        Log.info(String.format("Navigated to url: %s", url));
    }

    @Override
    public Element findElement(By locator) {
    	var element = driver.findElement(locator);
    	Log.info("Located element by locator "+locator);

        return element;
    }

    @Override
    public List<Element> findElements(By locator) {
        return driver.findElements(locator);
    }
    
    @Override
    public File takescreenshot() {
    	Log.info("Screenshot taken.");
		return driver.takescreenshot();		
	}
}
