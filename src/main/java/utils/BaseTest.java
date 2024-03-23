package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	   public WebDriver driver;
	    public final static int TIMEOUT = 10;
	 
	    public WebDriver WebDriverManager ()  {
	 
	    
	        if (driver == null) {
	         
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	            driver.manage().window().maximize();
	 
	        }
	        return driver;
	    }
	
//	 private static WebDriver driver;
//	    private static final int TIMEOUT = 10;
//
//	    public static WebDriver WebDriverManager() {
//	        if (driver == null) {
//	            initializeDriver();
//	        }
//	        return driver;
//	    }
//
//	    private static void initializeDriver() {
//	        try {
//	            WebDriverManager.chromedriver().setup();
//	            driver = new ChromeDriver();
//	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
//	            driver.manage().window().maximize();
//	        } catch (Exception e) {
//	            System.out.println("Failed to initialize WebDriver: " + e.getMessage());
//	        }
//	    }
//
//	    public static void closeDriver() {
//	        if (driver != null) {
//	            driver.quit();
//	            driver = null;
//	        }
//	    }
}
