package endava;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import resources1.GlobalSystemSetPropetie;

public class ValidateNavigatonBar extends GlobalSystemSetPropetie {
	private static Logger log = LogManager.getLogger(GlobalSystemSetPropetie.class.getName());

	@BeforeTest
	public void initialize() throws IOException  {
		driver = initialiseDriver();
		driver.get(prop.getProperty("url"));
		log.info("Driver is initialized in Navigation class.");
	}

	@Test

	public void testValidateNavigatonBar() throws IOException, InterruptedException {
	
		HomePageObjects hpo = new HomePageObjects(driver);
		Assert.assertTrue(hpo.getNavBar().isDisplayed());
		log.info("Successfully validated massagess.");
		log.info("Git X lica");
		log.info("Bas dosta radi.");
		log.info("Vredan je.");
		log.info("Super je.");
		log.info("Napravljen novi branch develop za razvoj.");
		log.info("Napravljen novi branch develop za razvoj.");
		log.info("Napravljen novi branch develop za razvoj.");
		

	
	}
	@Test

	public void testGitPersonX() throws IOException, InterruptedException {
	
		HomePageObjects hpo = new HomePageObjects(driver);
		Assert.assertTrue(hpo.getNavBar().isDisplayed());
		log.info("Successfully validated massagess.");
		log.info("Git X lica");
		log.info("Bas dosta radi.");
		log.info("Vredan je.");
		log.info("Super je.");
		log.info("Napravljen novi branch develop za razvoj.");
		log.info("Napravljen novi branch develop za razvoj.");
		log.info("Napravljen novi branch develop za razvoj.");
		

	
	}
	 @AfterTest
	   public void teardown() 
	   {
		   driver.close();
		   driver=null;

	   }
	

}
