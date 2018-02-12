package Page_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
	
	private static WebElement element = null;
	public static WebElement inventoryLink(WebDriver driver,int index) {
		List<WebElement>account = driver.findElements(By.cssSelector(".nav_des li a"));
		return element = account.get(index);
	}
	public static WebElement ruleLink(WebDriver driver,int index) {
		List<WebElement>account = driver.findElements(By.cssSelector("#tblNavMain > ul > li"));
		return element = account.get(index);
	}
	public static WebElement saveAndRuleButton(WebDriver driver,int index) {
		List<WebElement>account = driver.findElements(By.cssSelector(".footer_buttons button"));
		return element = account.get(index);
	}
	public static WebElement ruleFields(WebDriver driver,int index) {
		List<WebElement>account = driver.findElements(By.cssSelector(".form div div div div div div div div input"));
		return element = account.get(index);
	}
	public static WebElement descriptionTextarea(WebDriver driver) {
		return element = driver.findElement(By.cssSelector(".form div div div div div div div div textarea"));
	}
}
