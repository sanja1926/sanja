package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	public WebDriver driver;

	private By signIn = By.cssSelector("a[href*='sign_in']");
	private By title=By.cssSelector("#content div div h2");
	private By navigation=By.xpath("//nav[@class='navbar-collapse collapse']");
	private By header = By.cssSelector("div[class*='video-banner'] h3");

public HomePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}


public WebElement getLogIn(){//ako nema return type onda je void, ali posto ima mora da ima naziv WebElement
	return driver.findElement(signIn);
}
public WebElement getTitle(){
	return driver.findElement(title);
	}

public WebElement getNavBar(){
	return driver.findElement(navigation);
	}
//Uspesno je kreiran jedan PAGE OBJECT

public WebElement getHeader(){
	return driver.findElement(header);
	}
 
}
