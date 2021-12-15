package parallel;

import java.io.IOException;
import java.util.Properties;
import com.qa.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * @author mlokare
 * In this class we define any prerequisites we want to perform before and after execution of scenarios
 * useful for data cleaning or data loading
 */
public class ApplicationHooks {

	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_properties();
	}

	@Before(order = 1)
	public void launchBrowser() throws IOException, InterruptedException {
		System.out.println("Execution Completed");
		

	}

	@After(order = 0)
	public void quitBrowser() {
		
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			
		}
	}
	

}


