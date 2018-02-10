package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import properties.Data;
import properties.TestURL;
import Page_Objects.LoginPage;
import properties.Configuration;
public class Test_Login extends Configuration {

@Test()	
public static void clickLoginWithAllEmptyFields(){
			beforeTest(TestURL.site_url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Reporter.log("URL:"+TestURL.site_url);
			LoginPage.loginButton(driver).click();
           
			String ClientIdError= LoginPage.lableError(driver,0).getText();
			Reporter.log("ClientID: "+ClientIdError);
			assertEquals(Data.ErrorMessageClientId, ClientIdError ,"Client ID error does not display");	
			
			String UserIdError= LoginPage.lableError(driver,1).getText();
			Reporter.log("UserID: "+UserIdError);
			assertEquals(Data.ErrorMessageUserId, UserIdError ,"User ID error does not display");	
			
			String passwordError= LoginPage.lableError(driver,2).getText();
			Reporter.log("Password: "+passwordError);
			assertEquals(Data.ErrorMessageUserpassword, passwordError ,"Password error does not display");
			afterTest();
		}

@Test()	
public static void ClickLoginButtonWhenClientFieldEmpty(){
			beforeTest(TestURL.site_url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Reporter.log("URL:"+TestURL.site_url);
			LoginPage.userIdField(driver).sendKeys(Data.UserId);
			LoginPage.passwordField(driver).sendKeys(Data.UserPassword);
			LoginPage.loginButton(driver).click();
           
			String ClientIdError= LoginPage.lableError(driver,0).getText();
			Reporter.log("ClientID: "+ClientIdError);
			assertEquals(Data.ErrorMessageClientId, ClientIdError ,"Client ID error does not display");	
			afterTest();
		}

@Test()	
public static void ClickLoginButtonWhenUserFieldEmpty(){
			beforeTest(TestURL.site_url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Reporter.log("URL:"+TestURL.site_url);
			LoginPage.clientIdField(driver).sendKeys(Data.ClientId);
			LoginPage.passwordField(driver).sendKeys(Data.UserPassword);
			LoginPage.loginButton(driver).click();
           
			String UserIdError= LoginPage.lableError(driver,1).getText();
			Reporter.log("UserID: "+UserIdError);
			assertEquals(Data.ErrorMessageUserId, UserIdError ,"User ID error does not display");		
		
			afterTest();
		}

@Test()	
public static void ClickLoginButtonWhenPasswordFieldEmpty(){
			beforeTest(TestURL.site_url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Reporter.log("URL:"+TestURL.site_url);
			LoginPage.clientIdField(driver).sendKeys(Data.ClientId);
			LoginPage.userIdField(driver).sendKeys(Data.UserId);
			LoginPage.loginButton(driver).click();
           
			String passwordError= LoginPage.lableError(driver,2).getText();
			Reporter.log("Password: "+passwordError);
			assertEquals(Data.ErrorMessageUserpassword, passwordError ,"Password error does not display");
			
			afterTest();
		}
@Test()
public static void ShouldnotExecuteJSInAllFields(){
			beforeTest(TestURL.site_url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Reporter.log("URL:"+TestURL.site_url);
			LoginPage.clientIdField(driver).sendKeys(Data.InvalidData);
			LoginPage.userIdField(driver).sendKeys(Data.InvalidData);
			LoginPage.passwordField(driver).sendKeys(Data.InvalidData);
			LoginPage.loginButton(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String login_error= LoginPage.loginError(driver,1).getText();
			Reporter.log("Error Message: "+login_error);
			assertEquals("Invalid login. Please try again.", login_error ,"login error does not display when entering js into inputs");
			
			//afterTest();
		}

}
