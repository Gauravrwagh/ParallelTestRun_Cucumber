package definations;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestSetUp;

public class ApplicationHooks {

	public TestSetUp setUp;
	 
    public ApplicationHooks(TestSetUp setUp) {
        this.setUp = setUp;
    }
 
    @After
    public void tearDown( ) throws IOException {
        setUp.baseTest.WebDriverManager().quit();
    }
}
