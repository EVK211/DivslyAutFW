package webpages.pageelements;

import org.openqa.selenium.By;

public class SignUpPageElements {
	private final By inputEmail = By.xpath("//input[@placeholder='Enter your email']");
	private final By inputPassword = By.xpath("//input[@placeholder='Enter your password']");
	private final By inputConfirmPassword = By.xpath("//input[@placeholder='Confirm your password']");
	private final By buttonSignUp = By.xpath("//button[text()='Submit']");
	private final By linkSignIn = By.xpath("//a[text()='Log in']");
	
	public By getLinkSignIn() {
		return linkSignIn;
	}

	public By getInputEmail() {
		return inputEmail;
	}

	public By getInputPassword() {
		return inputPassword;
	}

	public By getInputConfirmPassword() {
		return inputConfirmPassword;
	}

	public By getButtonSignUp() {
		return buttonSignUp;
	}

}
