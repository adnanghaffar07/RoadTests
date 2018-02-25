package Page_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element = null;
	public static WebElement clientIdField(WebDriver driver) {
		element = driver.findElement(By.id("txtclientCode"));
		return element;		
	}
	public static WebElement userIdField(WebDriver driver) {
		element = driver.findElement(By.id("txtLoginID"));
		return element;
		
	}
	public static WebElement passwordField(WebDriver driver) {
		element = driver.findElement(By.id("txtUserPassword"));
		return element;
		
	}
	public static WebElement lableError(WebDriver driver, int index) {
		List<WebElement> error_message=driver.findElements(By.className("ng-login-field-error"));
		element = error_message.get(index);
		return element;
	}
	public static WebElement loginError(WebDriver driver, int index) {
		element =driver.findElement(By.xpath("//*[@id='lblLoginErrorMsg']/div"));
		return element;
	}
	
	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.id("btnLogon"));
		return element;
	}

}
