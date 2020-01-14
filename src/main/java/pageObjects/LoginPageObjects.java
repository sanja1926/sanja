package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;

	By getEmail = By.cssSelector("#user_email");
	By getPassword = By.cssSelector("#user_password");
	By submit=By.cssSelector("[type='submit']");

	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail() {
		return driver.findElement(getEmail);
	}

	public WebElement getPassword() {
		return driver.findElement(getPassword);

	}
	public WebElement submit() {
		return driver.findElement(submit);

	}
	
}
