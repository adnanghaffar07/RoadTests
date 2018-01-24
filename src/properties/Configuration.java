package properties;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Configuration {
	public static WebDriver driver = null;
	public static String getValue = "";
	public static  void beforeTest(String Url){
		
			System.setProperty("webdriver.chrome.driver", ".//webdriver//chromedriver.exe");
		//	ChromeOptions options = new ChromeOptions();
		  //   options.addArguments("start-fullscreen");
		    // options.addArguments("--headless");
			 driver = new ChromeDriver();  
	         driver.get(Url);	
	}
	
	public static void afterTest() {
		driver.quit();
	}
	
	public static void staticWait35() {
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);	
	}
	public static void staticWait10() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void staticWait5() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public static void staticWait60() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
