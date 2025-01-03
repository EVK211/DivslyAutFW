package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeHeadlessDriverManager implements BrowserManager {

	WebDriver driver;

	public WebDriver initDriver() {

		// Create an object of Edge Options class
		EdgeOptions edgeOptions = new EdgeOptions();

		edgeOptions.addArguments("--start-maximized");
		edgeOptions.addArguments("--headless");

		// Create an object of WebDriver class and pass the Edge Options object as
		// an argument
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(edgeOptions);

		return driver;
	}

}
