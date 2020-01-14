package endava;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resources1.GlobalSystemSetPropetie;

public class listeners implements ITestListener {
	// trebalo je da se sve metode same uvuku kada se predje misem preko listeners

	GlobalSystemSetPropetie gssp = new GlobalSystemSetPropetie();

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
try {
	gssp.getScreenshot(result.getName());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
