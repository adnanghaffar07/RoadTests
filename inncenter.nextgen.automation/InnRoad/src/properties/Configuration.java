package properties;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.DoubleStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Configuration {
	public static WebDriver driver = null;
	public static WebDriverWait wait;
	public static String getValue = "";
	public static  void beforeTest(String Url){
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory",  System.getProperty("user.dir")+ "\\assets");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
			System.setProperty("webdriver.chrome.driver", ".//webdriver//chromedriver.exe");
		//	ChromeOptions options = new ChromeOptions();
		  
			options.addArguments("start-fullscreen");
		    // options.addArguments("--headless");
			 driver = new ChromeDriver(options);  
	         driver.get(Url);	
	}

public static void  DeleteFile() {
		  String SRC_FOLDER = System.getProperty("user.dir")+ "\\assets";
		  File directory = new File(SRC_FOLDER);
	    	//make sure directory exists
	    	if(!directory.exists()){
	       
	        }else{
	        	if(directory.isDirectory()){
	        		if(directory.list().length==0){
	        			directory.delete();
	         		}
	        		else{
	        		String files[] = directory.list();

		        	   for (String temp : files) {
		        	      //construct the file structure
		        	      File fileDelete = new File(directory, temp);
		        	      //recursive delete
		        	      fileDelete.delete();
	        	}
		        	 //check the directory again, if empty then delete it
		        	   if(directory.list().length==0){
		        		   directory.delete();
		        	   }
	        	}
	        	}
	        }	
	}

public static void  FileExist() {
		  String SRC_FOLDER = System.getProperty("user.dir")+ "\\assets";
		  File directory = new File(SRC_FOLDER);
	    	//make sure directory exists
	    	if(!directory.exists()){
	       Reporter.log("File does not download");
	        }else{
	        	Reporter.log("File has been downloaded");
	        }	
	}

protected static long GenerateAcountNumber() {
	long number = (long) Math.floor(Math.random() * 999999999999999L) + 100000000000000L;
	return number;	
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
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	public static WebElement Waitelemet(By by) {

		return wait.until(ExpectedConditions.presenceOfElementLocated((by)));

	}

	public static String getText(By by) {
		String value = driver.findElement(by).getText();
		return value;
	}

	public static boolean Wait(By by) {
		boolean value = false;
		for (int i = 0; i < 20 && driver.findElements(by).size() > 0; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			value = true;
		}
		return value;
	}
}
