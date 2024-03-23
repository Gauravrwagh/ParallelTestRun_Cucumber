package definations;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "", 
		features = "src/main/resources/Features", 
		glue = "definations",
		dryRun = false,
		plugin = { "pretty", "html:target/cucumber-reports.html" }
		)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests  {

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
