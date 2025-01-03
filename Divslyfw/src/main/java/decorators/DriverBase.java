package decorators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserfactory.BrowserFactory;

public class DriverBase implements Driver {
	private WebDriver driver;
	private WebDriverWait wait;

	public void start(String browser, String headless) {
		driver = BrowserFactory.getDriverManager(browser, headless).initDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void quit() {
		driver.quit();
	}

	public void goToUrl(String url) {
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public Element findElement(By locator) {
		WebElement nativeWebElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Element element = new ElementBase(nativeWebElement, locator);
		// use decorated element
		Element logElement = new ElementLogger(element);

		return logElement;
	}

	public List<Element> findElements(By locator) {
		List<WebElement> nativeWebElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		ArrayList<Element> elements = new ArrayList<Element>();
		for (WebElement nativeWebElement : nativeWebElements) {
			Element element = new ElementBase(nativeWebElement, locator);
			Element logElement = new ElementLogger(element);
			elements.add(logElement);
		}

		return elements;
	}

	public void waitForAjax() {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		wait.until(d -> (Boolean) javascriptExecutor
				.executeScript("return window.jQuery != undefined && jQuery.active == 0"));
	}

	public void waitUntilPageLoadsCompletely() {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		wait.until(d -> javascriptExecutor.executeScript("return document.readyState").toString().equals("complete"));
	}

	public String takescreenshot() {

		return "data:image/png;base64," + ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

}
