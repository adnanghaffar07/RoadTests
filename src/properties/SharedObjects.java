package properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Page_Objects.KembledevPage;
import Page_Objects.LoginPage;

public class SharedObjects {
	
	public static void DatePicker(int checkInDate,int checkOutDate) throws InterruptedException {
		KembledevPage.checkInDatePicker(Configuration.driver).click();
		KembledevPage.staticDatePickerCheckIn(Configuration.driver,2,checkInDate).click();
		Thread.sleep(1000);
		KembledevPage.checkOutDatePicker(Configuration.driver).click();
		KembledevPage.staticDatePickerCheckOut(Configuration.driver,2,checkOutDate).click();
		Thread.sleep(1000);
	}
	public static void OtherFields(int promocode, String adult, String chilren, String promo_code) throws InterruptedException {
		KembledevPage.adultField(Configuration.driver).clear();
		KembledevPage.adultField(Configuration.driver).sendKeys(adult);
		KembledevPage.childrenField(Configuration.driver).clear();
		KembledevPage.childrenField(Configuration.driver).sendKeys(chilren);
		if (promocode == 1) {
			KembledevPage.promoCodeField(Configuration.driver).sendKeys(promo_code);		
		}
		Thread.sleep(1000);
		KembledevPage.searchForRoomButton(Configuration.driver).click();
	}
	public static void GuestInfo() {
		KembledevPage.firstNameField(Configuration.driver).sendKeys(Kembledev_Data.FirstName);
		KembledevPage.lastNameField(Configuration.driver).sendKeys(Kembledev_Data.LastName);
		KembledevPage.emailAddressField(Configuration.driver).sendKeys(Kembledev_Data.EmailId);
		KembledevPage.phoneNumberField(Configuration.driver).sendKeys(Kembledev_Data.phoneNumber);
		KembledevPage.homeAddressField(Configuration.driver).sendKeys(Kembledev_Data.HomeAddress);
		KembledevPage.cityField(Configuration.driver).sendKeys(Kembledev_Data.City);
		KembledevPage.stateButton(Configuration.driver).click();
		KembledevPage.selectSate(Configuration.driver, 1).click();
		KembledevPage.ccNumberField(Configuration.driver).sendKeys(Kembledev_Data.CardNumber);
		KembledevPage.ccExpDateField(Configuration.driver).sendKeys(Kembledev_Data.CardExpirationDate);
		KembledevPage.cardFullNameField(Configuration.driver).sendKeys(Kembledev_Data.CardFullname);
		KembledevPage.cvvField(Configuration.driver).sendKeys(Kembledev_Data.CVV);
		KembledevPage.agreeCheckBox(Configuration.driver).click();
		KembledevPage.bookStayButton(Configuration.driver).click();
	}

	public static void  login() {
		Configuration.beforeTest(TestURL.site_url);
        Configuration.staticWait5();
		LoginPage.clientIdField(Configuration.driver).sendKeys(Data.ClientId);
		LoginPage.userIdField(Configuration.driver).sendKeys(Data.UserId);
		LoginPage.passwordField(Configuration.driver).sendKeys(Data.UserPassword);
		LoginPage.loginButton(Configuration.driver).click();
	}
	public static WebElement ElementVisiable(String selector,WebDriver driver,String selector_type) {
		WebElement isVisiable	=  null;
		 WebDriverWait wait = new WebDriverWait(driver, 60);
		 if (selector_type.equals("id")) {
			 System.out.println("in id");
			 isVisiable	=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(selector)));	
		}
		 else if (selector_type.equals("cls")) {
			 System.out.println("in cls");
			 isVisiable	=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(selector)));	
		}
		 else  if (selector_type.equals("xpath")) {
			 System.out.println("in x");
			 isVisiable	=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selector)));	
		}
		 else  if (selector_type.equals("css")) {
			 System.out.println("in css");
			 isVisiable	=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));	
		}
		return isVisiable;
	}
	
}
