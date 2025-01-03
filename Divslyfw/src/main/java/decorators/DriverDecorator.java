package decorators;

import org.openqa.selenium.By;
import java.util.List;

public class DriverDecorator implements Driver {
    protected Driver driver;

    public DriverDecorator(Driver driver, String headless) {
        this.driver = driver;
    }

    public void start(String browser, String headless) {
        driver.start(browser, headless);
    }

    public void quit() {
        driver.quit();
    }

    public void goToUrl(String url) {
        driver.goToUrl(url);
    }
    
	public String getPageTitle() {
		return driver.getPageTitle();
	}

    public Element findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<Element> findElements(By locator) {
        return driver.findElements(locator);
    }
    
    public void waitForAjax() {
        driver.waitForAjax();
    }
    
    public void waitUntilPageLoadsCompletely() {
        driver.waitUntilPageLoadsCompletely();
    }

	public String takescreenshot() {
		return driver.takescreenshot();		
	}

	
}