package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
public class TestRunner {
	public static void main(String[] args) {
		TestNG runner=new TestNG();
		List<String> suitesList=new ArrayList<String>();
		suitesList.add("C:\\Users\\user\\git\\PractiseRepository\\Rudra_Project\\test-output\\SmokeTestScenario\\testng-failed.xml");
		runner.setTestSuites(suitesList);
		runner.run();
	}
}
