package endava;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import resources1.GlobalSystemSetPropetie;

public class HomePage extends resources1.GlobalSystemSetPropetie {
	private static Logger log = LogManager.getLogger(resources1.GlobalSystemSetPropetie.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initialiseDriver();
		log.info("Driver is initialised in HomePage class.");

		driver.get(prop.getProperty("url"));
		log.info("Navigated desired url.");
		log.info("Person X push the code.");

	}

	@Test(dataProvider="getData")

	public void testHomePage(String username,String password,String text) throws IOException, InterruptedException {
		
		driver.get(prop.getProperty("url"));
		// Thread.sleep(2000);
		// da bismo koristili metode iz klase HomePage objects mozemo omoguciti na 2
		// nacina:
		// 1.inheritance
		// 2. create object to that class and invoke methods of it
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.getLogIn().click();
		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.getEmail().sendKeys(username);// getEmail je metoda napravljena u lpo klasi isto je kao
																// da je napisanodriver.findElement(By.id(""))
		lpo.getPassword().sendKeys(password);
		lpo.submit().click();
		System.out.println(text);
		System.out.println("Sanja sa gita kod");
		System.out.println("Promena lica X 1.");
		System.out.println("Promena lica X 2.");
		System.out.println("Promena lica X 3.");
		System.out.println("Napravljen novi develop branch.");
		System.out.println("Napravljen novi develop branch.");
		System.out.println("Napravljen novi develop branch.");
		log.info(text+"Setovi podataka ");
	}
	
	@DataProvider
	//Row is how meny different data types test should run
	public Object[][] getData() throws InterruptedException {
		Object[][] data=new Object[2][3];
		data[0][0]="nonresricteduser@qw.com";
		data[0][1]="1234";
		data[0][2]="Nonrestricted user. ";
		
		//Thread.sleep(3000);

		data [1][0]="resricteduser@qw.com";
		data [1][1]="45678";
		data [1][2]="Restricted user.";
		return data;

	}
	
	@AfterTest
	   public void teardown() 
	   {
		   driver.close();
		   driver=null;

	   }
			
}
