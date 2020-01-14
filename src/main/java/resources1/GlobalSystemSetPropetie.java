package resources1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GlobalSystemSetPropetie {

	public static WebDriver driver;
	public Properties prop;// da bismo mogli da pozivamo u drugim klasama

	public WebDriver initialiseDriver() throws IOException {// metoda za inicijalizaciju drivera
		prop = new Properties();

		// System.getProperty("user.dir")
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources1\\data.properties");
		prop.load(fis);
		// Ako hocemo da kroz Maven odredjujemo koji ce biti browswr otkucamo donju
		// liniju i u cmd-u otkucamo:
		// mvn test -Dbrowser=chrome-mora ovako da se kuca sa ovom opcijom izbora u
		// mavenu
		String browserName = System.getProperty("browser");
		// String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {
			// driver za browser treba da bude u projektu u resources, kako bi bilo ko kada
			// svuce fajlove, mogao da pokrene kod sebe
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sanja\\MavenProject\\src\\main\\java\\resources1\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless")) {
				options.addArguments("headless");// komanda za maven je mvn test -Dbrowser=chromeheadless
			}
			driver = new ChromeDriver(options);

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sanja\\MavenProject\\src\\main\\java\\resources1\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\KURS\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\KURS\\Screenshots\\" + result + "Screenshot.png"));
	}

}
