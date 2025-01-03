package webpages.pageelements;

import org.openqa.selenium.By;

public class HomePageElements {

	private final By inputUserEmail = By.xpath("//input[@type='email']");
	private final By inputUserPassword = By.xpath("//input[@type='password']");
	private final By buttonContinue = By.xpath("//button[text()='Continue']");
	private final By linkSignUp = By.xpath("//a[text()='Create an account']");
	private final By linkForgotPassword = By.xpath("//a[text()='Forgot password?']");
	private final By buttonSignInWithGoogle = By.xpath("//span[text()='Sign in with Google']");
	private final By textenteraValidEmail = By.xpath("//span[text()='Please enter a valid email']");
	private final By textAccountNotFound = By.xpath("//span[text()='Account not found.']");
	public By getInputUserEmail() {
		return inputUserEmail;
	}
	public By getInputUserPassword() {
		return inputUserPassword;
	}
	public By getButtonContinue() {
		return buttonContinue;
	}
	public By getLinkSignUp() {
		return linkSignUp;
	}
	public By getLinkForgotPassword() {
		return linkForgotPassword;
	}
	public By getButtonSignInWithGoogle() {
		return buttonSignInWithGoogle;
	}
	public By getTextenteraValidEmail() {
		return textenteraValidEmail;
	}
	public By getTextAccountNotFound() {
		return textAccountNotFound;
	}

}
