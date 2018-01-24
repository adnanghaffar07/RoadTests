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
import properties.Kembledev_Data;
import properties.TestURL;
import Page_Objects.KembledevPage;
import properties.Configuration;
public class Test_Kembledev extends Configuration {

@Test()	
public static void searchForRoom(){
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			Reporter.log("URL:"+TestURL.kembledev_url);
			KembledevPage.checkInDatePicker(driver).click();
			KembledevPage.pickDateForCheckIN(driver).click();
			KembledevPage.checkOutDatePicker(driver).click();
			KembledevPage.pickDateForCheckOut(driver).click();
			staticWait10();
			KembledevPage.adultField(driver).clear();
			KembledevPage.adultField(driver).sendKeys(Kembledev_Data.Adult);
			KembledevPage.childrenField(driver).clear();
			KembledevPage.childrenField(driver).sendKeys(Kembledev_Data.Children);
			staticWait5();
			KembledevPage.searchForRoomButton(driver).click();
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			String checkInDate= KembledevPage.checkInDatePicker(driver).getAttribute("value");
			Reporter.log("CheckIn: "+checkInDate);
			String checkOutDate= KembledevPage.checkOutDatePicker(driver).getAttribute("value");;
			Reporter.log("CheckOut: "+checkOutDate);
			String adult= KembledevPage.adultField(driver).getAttribute("value");
			Reporter.log("Adult field: "+adult);
			assertEquals(Kembledev_Data.Adult, adult ,"Adult value does not display");
			String ChildrenValue= KembledevPage.childrenField(driver).getAttribute("value");
			Reporter.log("Children field: "+ChildrenValue);
			assertEquals(Kembledev_Data.Children, ChildrenValue ,"Children value does not display");

			afterTest();
		}


@Test()	
public static void toatalRoomsInSearch(){
			beforeTest(TestURL.kembledev_url);
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			Reporter.log("URL:"+TestURL.kembledev_url);
			KembledevPage.checkInDatePicker(driver).click();
			KembledevPage.pickDateForCheckIN(driver).click();
			KembledevPage.checkOutDatePicker(driver).click();
			KembledevPage.pickDateForCheckOut(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			KembledevPage.adultField(driver).clear();
			KembledevPage.adultField(driver).sendKeys(Kembledev_Data.Adult);
			KembledevPage.childrenField(driver).clear();
			KembledevPage.childrenField(driver).sendKeys(Kembledev_Data.Children);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			KembledevPage.searchForRoomButton(driver).click();
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			String TotalRoom= KembledevPage.totalRoom(driver).getText();
			Reporter.log("Toatal Room: "+TotalRoom);
			assertEquals(String.valueOf(KembledevPage.totalRoomsInSearch(driver)), TotalRoom ,"Toatal room does not match");
			afterTest();
		}


@Test()	
public static void viewRoomInfo(){
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			Reporter.log("URL:"+TestURL.kembledev_url);
			KembledevPage.checkInDatePicker(driver).click();
			KembledevPage.pickDateForCheckIN(driver).click();
			staticWait5();
			KembledevPage.checkOutDatePicker(driver).click();
			KembledevPage.pickDateForCheckOut(driver).click();
			staticWait10();
			KembledevPage.adultField(driver).clear();
			KembledevPage.adultField(driver).sendKeys(Kembledev_Data.Adult);
			KembledevPage.childrenField(driver).clear();
			KembledevPage.childrenField(driver).sendKeys(Kembledev_Data.Children);
			staticWait10();
			KembledevPage.searchForRoomButton(driver).click();
			staticWait35();
			KembledevPage.viewMoreInfoButton(driver, 1).click();;
			staticWait60();
			Reporter.log("Reservation Details");
			Reporter.log("Check in: "+KembledevPage.checekInRoomView(driver, 0).getText());
			Reporter.log("Check out: "+KembledevPage.checekOutRoomView(driver, 1).getText());
			Reporter.log("Guest: "+KembledevPage.guestInRoomView(driver, 0).getText());
			Reporter.log("Promo code: "+KembledevPage.promoCodeInRoomView(driver, 1).getText());
			Reporter.log("Room Title: "+KembledevPage.roomTitleInRoomView(driver, 0).getText());
			Reporter.log("One night stay rate: "+KembledevPage.oneNightStayRate(driver, 0).getText());
			Reporter.log("Taxes and service fees: "+KembledevPage.taxesAndServiceFee(driver, 1).getText());
			Reporter.log("Toatal cost: "+KembledevPage.totalCost(driver, 2).getText());
			afterTest();
		}


@Test()	
public static void editReservationDeatils(){
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			Reporter.log("URL:"+TestURL.kembledev_url);
			KembledevPage.checkInDatePicker(driver).click();
			staticWait5();
			KembledevPage.pickDateForCheckIN(driver).click();
			staticWait10();
			KembledevPage.checkOutDatePicker(driver).click();
			staticWait5();
			KembledevPage.pickDateForCheckOut(driver).click();
			staticWait10();
			KembledevPage.adultField(driver).clear();
			KembledevPage.adultField(driver).sendKeys(Kembledev_Data.Adult);
			KembledevPage.childrenField(driver).clear();
			KembledevPage.childrenField(driver).sendKeys(Kembledev_Data.Children);
			staticWait10();
			KembledevPage.searchForRoomButton(driver).click();
			staticWait35();
			KembledevPage.viewMoreInfoButton(driver, 1).click();;
			staticWait60();
			Reporter.log("Edit Reservation Details");
			KembledevPage.editReservationDetailsButton(driver).click();
			KembledevPage.adultField(driver).clear();
			KembledevPage.adultField(driver).sendKeys(Kembledev_Data.Edit_Adult);
			KembledevPage.checkAvailabilityButton(driver).click();
			staticWait35();
			String Adult_value = KembledevPage.guestInRoomView(driver, 0).getText();
			Reporter.log("After editing adult value: "+Adult_value);
			afterTest();
		}


@Test()	
public static void bookRoom(){
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			Reporter.log("URL:"+TestURL.kembledev_url);
			KembledevPage.checkInDatePicker(driver).click();
			staticWait5();
			KembledevPage.pickDateForCheckIN(driver).click();
			staticWait10();
			KembledevPage.checkOutDatePicker(driver).click();
			staticWait5();
			KembledevPage.pickDateForCheckOut(driver).click();
			staticWait10();
			KembledevPage.adultField(driver).clear();
			KembledevPage.adultField(driver).sendKeys(Kembledev_Data.Adult);
			KembledevPage.childrenField(driver).clear();
			KembledevPage.childrenField(driver).sendKeys(Kembledev_Data.Children);
			staticWait10();
			KembledevPage.searchForRoomButton(driver).click();
			staticWait35();
			KembledevPage.viewMoreInfoButton(driver, 1).click();;
			staticWait60();
			KembledevPage.bookRoomButton(driver, 0).click();
			staticWait60();
			KembledevPage.checkOutMeLink(driver).click();
			staticWait60();
			KembledevPage.firstNameField(driver).sendKeys(Kembledev_Data.FirstName);
			KembledevPage.lastNameField(driver).sendKeys(Kembledev_Data.LastName);
			KembledevPage.emailAddressField(driver).sendKeys(Kembledev_Data.EmailId);
			KembledevPage.phoneNumberField(driver).sendKeys(Kembledev_Data.phoneNumber);
			KembledevPage.homeAddressField(driver).sendKeys(Kembledev_Data.HomeAddress);
			KembledevPage.cityField(driver).sendKeys(Kembledev_Data.City);
			staticWait5();
			KembledevPage.stateButton(driver).click();
			staticWait10();
			KembledevPage.selectSate(driver, 1).click();
			KembledevPage.ccNumberField(driver).sendKeys(Kembledev_Data.CardNumber);
			KembledevPage.ccExpDateField(driver).sendKeys(Kembledev_Data.CardExpirationDate);
			KembledevPage.cardFullNameField(driver).sendKeys(Kembledev_Data.CardFullname);
			KembledevPage.cvvField(driver).sendKeys(Kembledev_Data.CVV);
			KembledevPage.agreeCheckBox(driver).click();
			KembledevPage.bookStayButton(driver).click();
			staticWait60();
			afterTest();
		}

}
