package webpages;

import drivermanager.DriverManager;
import logsetup.Log;
import webpages.pageelements.SignUpPageElements;

public class SignUpPage {

	public SignUpPageElements elements() {
		return new SignUpPageElements();
	}

	public String getPageTitle() {
		Log.info("Getting page title in Signup page.");
		return DriverManager.getDriver().getPageTitle();
	}

	public HomePage navigateBackToLoginPage() {
		DriverManager.getDriver().findElement(elements().getLinkSignIn()).click();
		Log.info("Clicked on Signin Hyper Link");
		return new HomePage();
	}

}
