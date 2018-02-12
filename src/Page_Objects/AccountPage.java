package Page_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import properties.SharedObjects;

public class AccountPage {
	
	private static WebElement element = null;
	 
	public static WebElement accountLink(WebDriver driver,int index) {
	//	SharedObjects.ElementVisiable(".nav_des li a", driver, "css");
		List<WebElement>account = driver.findElements(By.cssSelector(".nav_des li a"));
		return element = account.get(index);
		
	}
	public static void selectAccounts(WebDriver driver, int index) {
		//SharedObjects.ElementVisiable("//div[1]/div[1]/div/div/select", driver, "xpath");
		List<WebElement> selectAccount = driver.findElements(By.xpath("//div[1]/div[1]/div/div/select"));
		Select dropdown= new Select(selectAccount.get(7));
		dropdown.selectByIndex(index);
	}
	public static WebElement createAccountButton(WebDriver driver,int index) {
		List<WebElement> createAccountButton = driver.findElements(By.cssSelector(".footer_buttons button"));
		return element = createAccountButton.get(index);
	}
	public static WebElement userInfoFields(WebDriver driver,int index) {
	//	SharedObjects.ElementVisiable(".tab-content div div div div div div div div div div div div div div input", driver, "css");
		List<WebElement> userFiels = driver.findElements(By.cssSelector(".tab-content div div div div div div div div div div div div div div input"));
		return element = userFiels.get(index);
	}
	public static void selectState(WebDriver driver,int index) {
		List<WebElement> selectState = driver.findElements(By.cssSelector(".tab-content div div div div div div div div div div div div div div select"));
		Select dropdown= new Select(selectState.get(index));
		dropdown.selectByVisibleText("Alaska");
	}
	public static WebElement saveButton(WebDriver driver,int index) {
		List<WebElement> saveButton = driver.findElements(By.cssSelector(".footer_buttons button"));
		return element = saveButton.get(index);
	}
	public static WebElement tabReservationAndFolio(WebDriver driver,int index) {
		List<WebElement> tabReservationAndFolio = driver.findElements(By.cssSelector(".tab-content div div div ul li"));
		return element = tabReservationAndFolio.get(index);
	}
	public static void ReservationDropdown(WebDriver driver,int index,int dropdon_value) {
		List<WebElement> dropdown = driver.findElements(By.cssSelector(".form-body div div div div div select"));
		Select options= new Select(dropdown.get(index));
		options.selectByIndex(dropdon_value);
	}
	public static WebElement ReservationsFields(WebDriver driver,int index) {
		List<WebElement> userFiels = driver.findElements(By.cssSelector(".form-body div div div div div input"));
		return element = userFiels.get(index);
	}
	public static WebElement SelectRoomButton(WebDriver driver,int index) {
		List<WebElement> selectRoomButton= driver.findElements(By.cssSelector(".blue"));
		return element = selectRoomButton.get(index);
	}
	public static WebElement DatePicker(WebDriver driver,int index) {
		List<WebElement> select_date= driver.findElements(By.className("inputwd98"));
		return element = select_date.get(index);
	}
	public static void DialogDropdown(WebDriver driver, int index, int option) {
		List<WebElement> selectAccount = driver.findElements(By.cssSelector("#divPickRoomGrid  div div table tbody tr td select"));
		Select dropdown= new Select(selectAccount.get(index));
		dropdown.selectByIndex(option);
	}
	public static WebElement DialogButton(WebDriver driver, int index,String buttonText) {
		List<WebElement> buttonList = driver.findElements(By.xpath("//button[text() = '...']"));
		return element = buttonList.get(index);
		
	}
	public static WebElement SearchButton(WebDriver driver, int index,String buttonText) {
		List<WebElement> buttonList = driver.findElements(By.xpath("//button[text() = 'Search']"));
		return element = buttonList.get(index);
		
	}
	public static void SelectRoomButton(WebDriver driver, int index,String buttonText) {
	//	return element = driver.findElement(By.cssSelector("#modalRoomPickerReservation div div button:nth-child(4)"));
		WebElement button = driver.findElement(By.cssSelector("#modalRoomPickerReservation div div button:nth-child(4)"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", button);
	}
	public static void ContinueButton(WebDriver driver, int index,String buttonText) {
//		SharedObjects.ElementVisiable("#ruleMessageForInnroad > div.modal-footer > button:nth-child(4)", driver, "css");
		WebElement button = driver.findElement(By.cssSelector("#ruleMessageForInnroad > div.modal-footer > button:nth-child(4)"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", button);
		}
	public static WebElement SelectDate(WebDriver driver, int index) {
		List<WebElement> selectDate = driver.findElements(By.className("calendarDateDiv"));
		return element = selectDate.get(18);
		
	}
	public static WebElement DataPicker(WebDriver driver, int index,String buttonText) {
		List<WebElement> selectDate = driver.findElements(By.className("//td[text()= '8']"));
		return element = selectDate.get(index);	
	}
	public static WebElement AssignRoom(WebDriver driver, int index) {
		List<WebElement> checkbox = driver.findElements(By.cssSelector(".row div label input"));
		return element = checkbox.get(index);	
	}
	public static WebElement AddFolioButton(WebDriver driver, int index) {
		List<WebElement> checkbox = driver.findElements(By.xpath("//button[text() = 'Add']"));
		return element = checkbox.get(index);	
	}
	public static void SelectFolioCategory(WebDriver driver,int index,int dropdon_value) {
		List<WebElement> dropdown = driver.findElements(By.cssSelector(".trHeight25 tbody tr td select"));
		Select options= new Select(dropdown.get(index));
		options.selectByIndex(dropdon_value);
	}
	public static WebElement FolioAmountField(WebDriver driver,int index) {
		List<WebElement> amountfield = driver.findElements(By.cssSelector(".trHeight25 tbody tr td input"));
	    return element = amountfield.get(index);	
	}
	public static WebElement CommitButton(WebDriver driver,int index) {
		List<WebElement> amountfield = driver.findElements(By.xpath("//button[text() = 'Commit']"));
	    return element = amountfield.get(index);	
	}
	public static WebElement AccountName(WebDriver driver,int index,String  acount_name) {
		List<WebElement> account_name = driver.findElements(By.cssSelector(".sn_span3"));
		return element = account_name.get(index);
	}
	public static WebElement FolioTab(WebDriver driver,int index) {
		List<WebElement> folio_tab  = driver.findElements(By.xpath("//a[text() = 'Folio']"));
		return element = folio_tab.get(index);
	}
	public static WebElement DistibuteButton(WebDriver driver, int index) {
		List<WebElement> distribute_button	 = driver.findElements(By.cssSelector("div.row.addMT8 > div > ul > li:nth-child(3) > button"));
			 return element = distribute_button.get(index);
	}
	public static WebElement DistributeDetailsFields(WebDriver driver,int index) {
		List<WebElement> distribute_fields = driver.findElements(By.cssSelector(".col-md-7 input"));
		return element = distribute_fields.get(index);
	}
	public static void DistributeDetailsSelect(WebDriver driver,int index,String option) {
		List<WebElement> dropdown = driver.findElements(By.cssSelector(".col-md-7 select"));
		Select options= new Select(dropdown.get(index));
		options.selectByVisibleText(option);
	}
	public static WebElement DistributeDetailsAddButton(WebDriver driver,int index) {
		List<WebElement> add_button = driver.findElements(By.xpath("//button[text() = 'Add']"));
		return element = add_button.get(index);
	}
	public static WebElement ContinueButton(WebDriver driver,int index) {
		List<WebElement> continue_button = driver.findElements(By.xpath("//button[text() = 'Continue']"));
		return element = continue_button.get(index);
	}
	public static WebElement DialogDistributeDetailsAmount(WebDriver driver,int index) {
		List<WebElement> continue_button = driver.findElements(By.cssSelector(".col-md-7 span"));
		return element = continue_button.get(index);
	}
	public static WebElement DistributeDetailsAmount(WebDriver driver,int index) {
		List<WebElement> continue_button = driver.findElements(By.cssSelector(".marginFx div div span span"));
		return element = continue_button.get(index);
	}
	public static WebElement PrintButton(WebDriver driver,int index) {
		List<WebElement> print_button = driver.findElements(By.id("acctPrint"));
		return element = print_button.get(index);
	}
	public static void SelectPrintType(WebDriver driver,int index,String option) {
		List<WebElement> dropdown = driver.findElements(By.cssSelector(".table-responsive table tbody tr td select"));
		Select options= new Select(dropdown.get(index));
		options.selectByVisibleText(option);
	}
	public static WebElement ExportButton(WebDriver driver,int index) {
		List<WebElement> export_button = driver.findElements(By.className("innroad-btn-submit"));
		return element = export_button.get(index);
	}
	public static WebElement GuestInfoLink(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[text() = 'Distribute']"));
		
	}
	
}
