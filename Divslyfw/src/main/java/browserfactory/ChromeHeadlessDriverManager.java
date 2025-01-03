package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessDriverManager implements BrowserManager{
	WebDriver driver;

	public WebDriver initDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--headless");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		
		return driver;
	}

}
