package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.eclipse.jetty.util.HttpCookieStore.Empty;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import properties.SharedObjects;
import properties.Data;
import properties.Kembledev_Data;
import properties.TestURL;
import Page_Objects.KembledevPage;
import properties.Configuration;
public class Test_Kembledev extends Configuration {

@Test()	
public static void RoomSearchWithoutPromoCode() throws InterruptedException{
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			Reporter.log("URL:"+TestURL.kembledev_url);
			SharedObjects.DatePicker(Kembledev_Data.CheckInDate, Kembledev_Data.CheckOutDate);
			staticWait10();
			SharedObjects.OtherFields(0,Kembledev_Data.Adult,Kembledev_Data.Children,Kembledev_Data.Promocode);
			staticWait35();
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
public static void RoomSearchWithPromoCode() throws InterruptedException{
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			Reporter.log("URL:"+TestURL.kembledev_url);
			SharedObjects.DatePicker(Kembledev_Data.CheckInDate, Kembledev_Data.CheckOutDate);
			SharedObjects.OtherFields(1,Kembledev_Data.Adult,Kembledev_Data.Children,Kembledev_Data.Promocode);
			staticWait35();
			String checkInDate= KembledevPage.checkInDatePicker(driver).getAttribute("value");
			Reporter.log("Check In: "+checkInDate);
			String checkOutDate= KembledevPage.checkOutDatePicker(driver).getAttribute("value");;
			Reporter.log("Check Out: "+checkOutDate);
			String adult= KembledevPage.adultField(driver).getAttribute("value");
			Reporter.log("Adult: "+adult);
			assertEquals(Kembledev_Data.Adult, adult ,"Adult value does not display");
			String ChildrenValue= KembledevPage.childrenField(driver).getAttribute("value");
			Reporter.log("Children: "+ChildrenValue);
			assertEquals(Kembledev_Data.Children, ChildrenValue ,"Children value does not display");
			String PromoCodeValue= KembledevPage.promoCodeField(driver).getAttribute("value");
			Reporter.log("Promo Code: "+PromoCodeValue);
			assertEquals(Kembledev_Data.Promocode, PromoCodeValue ,"Promo code value does not display");
		}
@Test()	
public static void RoomSearchResultAfterRefreshingResult() throws InterruptedException{
			driver.navigate().refresh();
			staticWait35();
			String checkInDate= KembledevPage.checkInDatePicker(driver).getAttribute("value");
			Reporter.log("Check In: "+checkInDate);
			String checkOutDate= KembledevPage.checkOutDatePicker(driver).getAttribute("value");;
			Reporter.log("Check Out: "+checkOutDate);
			String adult= KembledevPage.adultField(driver).getAttribute("value");
			Reporter.log("Adult: "+adult);
			assertEquals(Kembledev_Data.Adult, adult ,"Adult value does not display");
			String ChildrenValue= KembledevPage.childrenField(driver).getAttribute("value");
			Reporter.log("Children: "+ChildrenValue);
			assertEquals(Kembledev_Data.Children, ChildrenValue ,"Children value does not display");
			String PromoCodeValue= KembledevPage.promoCodeField(driver).getAttribute("value");
			Reporter.log("Promo Code: "+PromoCodeValue);
			assertEquals(Kembledev_Data.Promocode, PromoCodeValue ,"Promo code value does not display");
			driver.navigate().refresh();
			staticWait35();
			assertEquals(checkInDate, KembledevPage.checkInDatePicker(driver).getAttribute("value")
					,"Check in date does not same order before refresh page");
		    assertEquals(checkOutDate, KembledevPage.checkOutDatePicker(driver).getAttribute("value")
					,"Check out date does not same order before refresh page");
			assertEquals(adult, KembledevPage.adultField(driver).getAttribute("value") ,
					"Adult does not same order before refresh page");
			assertEquals(ChildrenValue,KembledevPage.childrenField(driver).getAttribute("value")
					,"Children value does not same order before refresh page");
			assertEquals(PromoCodeValue,KembledevPage.promoCodeField(driver).getAttribute("value")
					,"Promo code value does not same order before refresh page");
			afterTest();
		}
@Test()	
public static void RoomSearchWithoutPromoCodeChangeDate() throws InterruptedException{
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			Reporter.log("URL:"+TestURL.kembledev_url);
			SharedObjects.DatePicker(Kembledev_Data.CheckInChangeDate, Kembledev_Data.CheckOutChangeDate);
			SharedObjects.OtherFields(0,Kembledev_Data.Adult,Kembledev_Data.Children,Kembledev_Data.Promocode);
			staticWait35();
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
public static void RoomSearchWithPromoCodeChangeDate() throws InterruptedException{
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			Reporter.log("URL:"+TestURL.kembledev_url);
			SharedObjects.DatePicker(Kembledev_Data.CheckInChangeDate, Kembledev_Data.CheckOutChangeDate);
			SharedObjects.OtherFields(1,Kembledev_Data.Adult,Kembledev_Data.Children,Kembledev_Data.Promocode);
			staticWait35();
			String checkInDate= KembledevPage.checkInDatePicker(driver).getAttribute("value");
			Reporter.log("Check In: "+checkInDate);
			String checkOutDate= KembledevPage.checkOutDatePicker(driver).getAttribute("value");;
			Reporter.log("Check Out: "+checkOutDate);
			String adult= KembledevPage.adultField(driver).getAttribute("value");
			Reporter.log("Adult: "+adult);
			assertEquals(Kembledev_Data.Adult, adult ,"Adult value does not display");
			String ChildrenValue= KembledevPage.childrenField(driver).getAttribute("value");
			Reporter.log("Children: "+ChildrenValue);
			assertEquals(Kembledev_Data.Children, ChildrenValue ,"Children value does not display");
			String PromoCodeValue= KembledevPage.promoCodeField(driver).getAttribute("value");
			Reporter.log("Promo Code: "+PromoCodeValue);
			assertEquals(Kembledev_Data.Promocode, PromoCodeValue ,"Promo code value does not display");
		}
@Test()	
public static void ViewRoomDetails(){
	        driver.navigate().refresh();
			staticWait35();
			KembledevPage.viewMoreInfoButton(driver, 1).click();;
			staticWait60();
			Reporter.log("Guest Limit:"+KembledevPage.roomDescriptions(driver, 2).getText());
			Reporter.log("Description:"+KembledevPage.roomDescriptions(driver, 4).getText());
			Reporter.log("Amenities:");
			for (int i = 0; i < KembledevPage.totalAmenities(driver); i++) {
				Reporter.log(""+KembledevPage.amenities(driver, i).getText());
			}
			Reporter.log("Reservation Details:");
			Reporter.log("Check in: "+KembledevPage.checekInRoomView(driver, 0).getText());
			Reporter.log("Check out: "+KembledevPage.checekOutRoomView(driver, 1).getText());
			Reporter.log("Guest: "+KembledevPage.guestInRoomView(driver, 0).getText());
			Reporter.log("Promo code: "+KembledevPage.promoCodeInRoomView(driver, 1).getText());
			Reporter.log("Room Title: "+KembledevPage.roomTitleInRoomView(driver, 0).getText());
			Reporter.log("Rate plan:");
			Reporter.log("One night stay rate: "+KembledevPage.oneNightStayRate(driver, 0).getText());
			Reporter.log("Taxes and service fees: "+KembledevPage.taxesAndServiceFee(driver, 1).getText());
			Reporter.log("Toatal cost: "+KembledevPage.totalCost(driver, 2).getText());
			afterTest();
		}
@Test()	
public static void EditReservationDeatils() throws InterruptedException{
	driver.navigate().refresh();
	staticWait35();
	Reporter.log("Before edit reservation details:");
	Reporter.log("Check In: "+KembledevPage.checkInDatePicker(driver).getAttribute("value"));
	Reporter.log("Check Out: "+KembledevPage.checkOutDatePicker(driver).getAttribute("value"));
	Reporter.log("Adult: "+KembledevPage.adultField(driver).getAttribute("value"));
	Reporter.log("Children: "+KembledevPage.childrenField(driver).getAttribute("value"));
	
	KembledevPage.viewMoreInfoButton(driver, 1).click();;
	staticWait60();
	KembledevPage.editReservationDetailsButton(driver).click();
	SharedObjects.DatePicker(Kembledev_Data.CheckInDate,Kembledev_Data.CheckOutDate);
	staticWait10();
	KembledevPage.adultField(driver).clear();
	KembledevPage.adultField(driver).sendKeys(Kembledev_Data.EditAdult);
	KembledevPage.childrenField(driver).clear();
	KembledevPage.childrenField(driver).sendKeys(Kembledev_Data.EditChildren);
	KembledevPage.checkAvailabilityButton(driver).click();
	
	staticWait35();
	KembledevPage.backBuuton(driver).click();
	staticWait35();
	Reporter.log("After edit reservation details");
	Reporter.log("Check In: "+KembledevPage.checkInDatePicker(driver).getAttribute("value"));
	Reporter.log("Check Out: "+KembledevPage.checkOutDatePicker(driver).getAttribute("value"));
	Reporter.log("Adult: "+KembledevPage.adultField(driver).getAttribute("value"));
	Reporter.log("Children: "+KembledevPage.childrenField(driver).getAttribute("value"));
	afterTest();
}
@Test()	
public static void RoomPolicy(){
	        driver.navigate().refresh();
			staticWait35();
			Reporter.log("Check In: "+KembledevPage.checkInDatePicker(driver).getAttribute("value"));
			Reporter.log("Check Out: "+KembledevPage.checkOutDatePicker(driver).getAttribute("value"));
			Reporter.log("Adult: "+KembledevPage.adultField(driver).getAttribute("value"));
			Reporter.log("Children: "+KembledevPage.childrenField(driver).getAttribute("value"));
			KembledevPage.viewMoreInfoButton(driver, 1).click();;
			staticWait60();
			Reporter.log("One night stay rate: "+KembledevPage.oneNightStayRate(driver, 0).getText());
			Reporter.log("Taxes and service fees: "+KembledevPage.taxesAndServiceFee(driver, 1).getText());
			Reporter.log("Toatal cost: "+KembledevPage.totalCost(driver, 2).getText());
			
		}
@Test()	
public static void BackNavigation(){
	        driver.navigate().refresh();
			staticWait35();
			Reporter.log("Check In: "+KembledevPage.checkInDatePicker(driver).getAttribute("value"));
			Reporter.log("Check Out: "+KembledevPage.checkOutDatePicker(driver).getAttribute("value"));
			Reporter.log("Adult: "+KembledevPage.adultField(driver).getAttribute("value"));
			Reporter.log("Children: "+KembledevPage.childrenField(driver).getAttribute("value"));
			KembledevPage.viewMoreInfoButton(driver, 1).click();
			staticWait60();
			KembledevPage.backBuuton(driver).click();
			staticWait35();
			Reporter.log("After click on back button");
			Reporter.log("Check In: "+KembledevPage.checkInDatePicker(driver).getAttribute("value"));
			Reporter.log("Check Out: "+KembledevPage.checkOutDatePicker(driver).getAttribute("value"));
			Reporter.log("Adult: "+KembledevPage.adultField(driver).getAttribute("value"));
			Reporter.log("Children: "+KembledevPage.childrenField(driver).getAttribute("value"));
			afterTest();
		}
static boolean is_present = false;
@Test()	
public static void bookRoomWithExtras() throws InterruptedException{
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			SharedObjects.DatePicker(Kembledev_Data.CheckInDate, Kembledev_Data.CheckOutDate);
			staticWait10();
			SharedObjects.OtherFields(0,Kembledev_Data.Adult,Kembledev_Data.Children,Kembledev_Data.Promocode);
			staticWait35();
			KembledevPage.viewMoreInfoButton(driver, 1).click();;
			staticWait60();
			KembledevPage.bookRoomButton(driver, 0).click();
			staticWait60();
			KembledevPage.addOrRemoveExtraThing(driver, 1).click();
			KembledevPage.addOrRemoveExtraThing(driver, 3).click();
			KembledevPage.addOrRemoveExtraThing(driver, 5).click();
			KembledevPage.addOrRemoveExtraThing(driver, 7).click();
			KembledevPage.addOrRemoveExtraThing(driver, 9).click();
			KembledevPage.addOrRemoveExtraThing(driver, 11).click();
			KembledevPage.addOrRemoveExtraThing(driver, 13).click();
			KembledevPage.addOrRemoveExtraThing(driver, 15).click();
			KembledevPage.addOrRemoveExtraThing(driver, 17).click();
			KembledevPage.addOrRemoveExtraThing(driver, 19).click();
			KembledevPage.addOrRemoveExtraThing(driver, 21).click();
			Reporter.log("Extras Bill:"+KembledevPage.checkOutMeLink(driver).getText());
			KembledevPage.checkOutMeLink(driver).click();
			staticWait60();
			afterTest();
		}

@Test()	
public static void bookRoomWithoutExtras() throws InterruptedException{
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			SharedObjects.DatePicker(Kembledev_Data.CheckInDate, Kembledev_Data.CheckOutDate);
			staticWait10();
			SharedObjects.OtherFields(0,Kembledev_Data.Adult,Kembledev_Data.Children,Kembledev_Data.Promocode);
			staticWait35();
			KembledevPage.viewMoreInfoButton(driver, 1).click();;
			staticWait60();
			KembledevPage.bookRoomButton(driver, 0).click();
			staticWait60();
			Reporter.log("CheckOut Button:"+KembledevPage.checkOutMeLink(driver).getText());
			KembledevPage.checkOutMeLink(driver).click();
			staticWait60();
			afterTest();
		}

@Test()	
public static void GuestInfoFields() throws InterruptedException{
			beforeTest(TestURL.kembledev_url);
			staticWait35();
			SharedObjects.DatePicker(Kembledev_Data.CheckInDate, Kembledev_Data.CheckOutDate);
			staticWait10();
			SharedObjects.OtherFields(0,Kembledev_Data.Adult,Kembledev_Data.Children,Kembledev_Data.Promocode);
			staticWait35();
			KembledevPage.viewMoreInfoButton(driver, 1).click();;
			staticWait35();
			KembledevPage.bookRoomButton(driver, 0).click();
			staticWait35();
			Reporter.log("size"+KembledevPage.firstNameFieldIsPresent(driver));
			 if (KembledevPage.firstNameFieldIsPresent(driver)) {
					Reporter.log("First name field does not display");
				}
			/* if (!KembledevPage.lastNameFieldIsPresent(driver)) {
					Reporter.log("Last name field does not display");
				}
			 if (!KembledevPage.emailAddressFieldIsPresnt(driver)) {
					Reporter.log("Email address field does not display");
				}
			 if (!KembledevPage.phoneNumberFieldIsPresnt(driver)) {
					Reporter.log("Phone field does not display");
				}
			 if (!KembledevPage.homeAddressFieldIsPresnt(driver)) {
					Reporter.log("Home address field does not display");
				}
			 if (!KembledevPage.zipcodeFieldIsPresnt(driver)) {
					Reporter.log("Zipcode field does not display");
				}
			 if (!KembledevPage.cityFieldIsPresnt(driver)) {
					Reporter.log("City field does not display");
				}
			 if (!KembledevPage.ccNumberFieldIsPresnt(driver)) {
					Reporter.log("Card number field does not display");
				}
			 if (!KembledevPage.ccExpDateFieldIsPresnt(driver)) {
					Reporter.log("Card expire field does not display");
				}
			 if (!KembledevPage.cardFullNameFieldIsPresent(driver)) {
					Reporter.log("Card holder name field does not display");
				}
			 if (!KembledevPage.cvvFieldIsPresnt(driver)) {
					Reporter.log("CVV field does not display");
				}*/
			afterTest();
		}

/*
@Test()	
public static void AddAndRemoveExtraCharagerForServices(){
			KembledevPage.searchForRoomButton(driver).click();
			staticWait35();
			KembledevPage.viewMoreInfoButton(driver, 1).click();;
			staticWait60();
			KembledevPage.bookRoomButton(driver, 0).click();
			staticWait60();
			KembledevPage.addOrRemoveExtraThing(driver, 1).click();
			assertEquals(Kembledev_Data.ExtraThingNameAndPrice, KembledevPage.checkExtraThingAdded(driver).getText() ,
					"Extra thing dos not added at time of check out");
			KembledevPage.addOrRemoveExtraThing(driver, 0).click();
			assertEquals(Kembledev_Data.CheckMeOutText, KembledevPage.checkExtraThingAdded(driver).getText() ,
					"Check me out button dos not display after remove extra thing");
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
			//afterTest();
		}


@Test()	
public static void TotalRoomsInSearch(){
			beforeTest(TestURL.kembledev_url);
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			Reporter.log("URL:"+TestURL.kembledev_url);
			KembledevPage.checkInDatePicker(driver).click();
			KembledevPage.pickDateForCheckIN(driver,1).click();
			KembledevPage.checkOutDatePicker(driver).click();
			KembledevPage.pickDateForCheckOut(driver,1).click();
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

*/

}
