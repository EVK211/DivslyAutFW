package webpages.pageelements;

import org.openqa.selenium.By;

public class SideNavMenuSectionElements {

	private final By buttonDashboard = By.id("//span[text()='Dashboard']/parent::span/i");
	private final By buttonLinks = By.id("//span[text()=' links']/parent::span/i");
	private final By buttonQRCodes = By.id("//span[text()='QR Codes']/parent::span/i");
	private final By buttonLinkInBio = By.id("//span[text()='Link in Bio']/parent::span/i");
	private final By buttonCustomLinks = By.id("//span[text()='Custom Links']/parent::span/i");
	private final By buttonContacts = By.id("//span[text()='Contacts']/parent::span/i");
	private final By buttonFolderTree = By.id("//i[contains(@class,'fa-folder-tree')]");
	private final By buttonEmail = By.id("//span[text()='Email']/parent::span/i");
	private final By buttonSMS = By.id("//span[text()='SMS']/parent::span/i");
	private final By buttonWhatsApp = By.id("//span[text()='WhatsApp']/parent::span/i");
	private final By buttonIntegrations = By.id("//span[text()='Integrations']/parent::span/i");
	private final By buttonNotifications = By.id("//span[text()='Notifications']/parent::span/i");
	private final By buttonSubscription = By.id("//span[text()='Subscription']/parent::span/i");
	private final By buttonSettings = By.id("//span[text()='Settings']/parent::span/i");
	private final By buttonLogOut = By.id("//span[text()='Log out']/parent::span/i");
	public By getButtonDashboard() {
		return buttonDashboard;
	}
	public By getButtonLinks() {
		return buttonLinks;
	}
	public By getButtonQRCodes() {
		return buttonQRCodes;
	}
	public By getButtonLinkInBio() {
		return buttonLinkInBio;
	}
	public By getButtonCustomLinks() {
		return buttonCustomLinks;
	}
	public By getButtonContacts() {
		return buttonContacts;
	}
	public By getButtonFolderTree() {
		return buttonFolderTree;
	}
	public By getButtonEmail() {
		return buttonEmail;
	}
	public By getButtonSMS() {
		return buttonSMS;
	}
	public By getButtonWhatsApp() {
		return buttonWhatsApp;
	}
	public By getButtonIntegrations() {
		return buttonIntegrations;
	}
	public By getButtonNotifications() {
		return buttonNotifications;
	}
	public By getButtonSubscription() {
		return buttonSubscription;
	}
	public By getButtonSettings() {
		return buttonSettings;
	}
	public By getButtonLogOut() {
		return buttonLogOut;
	}

	
	
}
