package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.GlobalConstants;
import decorators.Driver;
import decorators.DriverBase;
import decorators.DriverLogger;
import drivermanager.DriverManager;
import logsetup.Log;
import utilities.PropertyFileReader;
import webpages.HomePage;
import webpages.MyAccountPage;
import webpages.SignUpPage;
import webpages.UserRegistrationPage;
import webpages.pagesections.MainMenuSection;

public class BaseTest {
	public Driver driver;

	protected MyAccountPage myaccountsPage;
	protected SignUpPage signUpPage;
	protected HomePage homePage;
	protected MainMenuSection mainMenuSection;

	String url = PropertyFileReader.readFile(GlobalConstants.CONFIG).get("url").toString();

	@Parameters({ "browser", "headless" })
	@BeforeMethod
	public void testInit(String browser, String headless) throws Exception {

		// Setup the driver of type Driver
		driver = new DriverLogger(new DriverBase(), headless);

		// Add the Driver to Threadlocalmap from DriverManager
		DriverManager.setDriver(driver);
		Log.info("Driver set up Successfull.");

		// Getting the driver from the Threadlocal internal hashmap
		DriverManager.getDriver().start(browser, headless);
		Log.info("Browser " + browser + " started.");

		homePage = new HomePage();
		myaccountsPage = new MyAccountPage();
		signUpPage = new SignUpPage();

	}

	@AfterMethod
	public void testCleanup() {
		if (DriverManager.getDriver() != null) {
			DriverManager.removeDriver();
		}
		Log.info("Driver quit successfully.");

	}
}
