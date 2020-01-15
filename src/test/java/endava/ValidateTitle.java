package endava;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import resources1.GlobalSystemSetPropetie;

public class ValidateTitle extends resources1.GlobalSystemSetPropetie {
	private static Logger log = LogManager.getLogger(resources1.GlobalSystemSetPropetie.class.getName());
	HomePageObjects hpo;// ovaj objekat tj varijabla ce kupiti osobine iz inicijalizacije u prvom testu,
						// a posto je public, moci ce da se koristi u svakom sledecem

	@BeforeTest
	public void initialize() throws IOException {
		driver = initialiseDriver();
		log.info("Driver is initialised in ValidateTitle class.");
		driver.get(prop.getProperty("url"));
		log.info("Navigated url in ValidateTitle.");

	}

	@Test

	public void testTitleValidationHeader() throws IOException, InterruptedException {

		hpo = new HomePageObjects(driver);
		Assert.assertEquals(hpo.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated title.");
		

		// Ako imamo vise srodnih testova koji propadaju ovoj otvorenoj stranici treba
		// pisati u nastaku ovog testa izmedju @BeforeTest and @AfterTest

	}
	public void testTitleValidationHeader1() throws IOException, InterruptedException {

		hpo = new HomePageObjects(driver);
		Assert.assertEquals(hpo.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated title.");
		

		// Ako imamo vise srodnih testova koji propadaju ovoj otvorenoj stranici treba
		// pisati u nastaku ovog testa izmedju @BeforeTest and @AfterTest

	}
	public void testTitleValidationHeader2() throws IOException, InterruptedException {

		hpo = new HomePageObjects(driver);
		Assert.assertEquals(hpo.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated title.");
		

		// Ako imamo vise srodnih testova koji propadaju ovoj otvorenoj stranici treba
		// pisati u nastaku ovog testa izmedju @BeforeTest and @AfterTest

	}

	@Test

	public void testValidateHeader() {
		Assert.assertEquals(hpo.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("Successfully validated header.");

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
